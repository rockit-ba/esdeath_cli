package cn.pan.esdeathcli.core.consume;

import cn.pan.esdeathcli.core.AppClient;
import cn.pan.esdeathcli.core.Config;
import cn.pan.esdeathcli.proto.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 抽象消息消费者
 */
abstract class Consumer extends AppClient {
    protected final static Logger logger = LoggerFactory.getLogger(Consumer.class);
    public final List<AbstractSubscriber<?>> subscribers;
    private final static int consumeBlockQueueSize = 100;
    private final ThreadPoolExecutor consumePool;

    protected Consumer(Config config, AbstractSubscriber<?>... subscribers) {
        super(config);
        if (subscribers == null || subscribers.length == 0) {
            throw new IllegalArgumentException("subscribers can not be empty");
        }
        this.subscribers = Arrays.asList(subscribers);
        SubscriberRegister.registrySub(this.subscribers );
        //int num = Runtime.getRuntime().availableProcessors() - 1;
        int num = 1;
        consumePool = consumePool(num);
    }

    protected void pull(String topic) {
        if (!canPull()) {
            return;
        }
        DelayMsgPull pollCommand = DelayMsgPull.newBuilder()
                .setConsumerGroup(this.consumerGroup)
                .setTopic(topic).build();
        logger.debug("{}:{} poll start", pollCommand.getConsumerGroup(), pollCommand.getTopic());
        EsdeathGrpc.EsdeathBlockingStub consumeStub = client.workStub();
        PullDelayMsgResult result = consumeStub.pullDelayMsg(pollCommand);
        logger.debug(" group {} poll end : {}",this.consumerGroup, result);
        pullResultProcess(result);
    }
    private void pullResultProcess(PullDelayMsgResult result) {
        BaseResult baseResult = result.getBaseResult();
        switch (baseResult.getStatus()) {
            case NO_MESSAGE:
                logger.debug("poll resp success, no can consumed message");
                break;
            case SUCCESS:
                consumePool.execute(() -> processMsg(result));
                break;

            case REFUSE_BY_FOLLOWER:
                followerRefuseProcess();
                logger.warn("poll resp refuse by follower");
                break;

            case FAIL:
                logger.error("poll resp fail:{}", result.getBaseResult().getDesc());
                break;

            case UNRECOGNIZED:
                throw new RuntimeException("消息发送响应状态未知");
        }
    }

    private void processMsg(PullDelayMsgResult result) {
        AbstractSubscriber<?> subscriber = SubscriberRegister.getSubscriber(result.getTopic(),result.getTag());
        AckStatus as = subscriber.consume(result.getPayload().getBytes(StandardCharsets.UTF_8));
        // 响应服务消费状态
        logger.debug("ack msg id: {}", result.getMsgId());

        DelayMsgAck ack = DelayMsgAck.newBuilder()
                .setMsgId(result.getMsgId())
                .setStatus(as)
                .setConsumerGroup(this.consumerGroup)
                .setTopic(result.getTopic())
                .build();

        while (true) {
            AckDelayMsgResult ackDelayMsg = client.workStub().ackDelayMsg(ack);
            if (followerRefuseCheck(ackDelayMsg.getBaseResult().getStatus())) {
                logger.warn("follower refuse ack msg:{}", ack);
                continue;
            }
            break;
        }
        logger.info("ack {} success", result.getMsgId());
    }

    protected void shutdown() {
        client.shutdown();
        consumePool.shutdown();
    }

    private boolean canPull() {
        if (this.consumePool.getQueue().remainingCapacity() <= 1) {
            logger.warn("consume pool queue will be full, skip pull");
            return false;
        }
        return true;
    }

    private static ThreadPoolExecutor consumePool(int threadNum) {
        return new ThreadPoolExecutor(
                threadNum,
                threadNum,
                60L,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(consumeBlockQueueSize),
                r -> {
                    Thread thread = new Thread(r, "consume-pool");
                    thread.setDaemon(true);
                    return thread;
                },
                new ThreadPoolExecutor.CallerRunsPolicy());
    }
}