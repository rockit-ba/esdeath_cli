package cn.pan.esdeathcli.core.consume;

import cn.pan.esdeathcli.core.Config;

/**
 * 消息消费者
 */
public class EsdeathConsumer extends Consumer{

    public EsdeathConsumer(Config config, AbstractSubscriber<?>... subscribers) {
        super(config, subscribers);
    }

    /**
     * 拉取消息
     */
    public void pullMessage(String topic) {
        super.pull(topic);
    }

    @Override
    public void close() {
        super.shutdown();
        logger.info("consumer closed");
    }
}