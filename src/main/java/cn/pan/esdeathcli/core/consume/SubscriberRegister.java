package cn.pan.esdeathcli.core.consume;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 订阅者注册中心
 **/
public class SubscriberRegister {
    private final static Logger logger = LoggerFactory.getLogger(SubscriberRegister.class);

    /**
     * tag 订阅者集合
     * key: tag
     * value: 订阅者
     */
    private static final Map<String, AbstractSubscriber<?>> SUB_CONTAINER = new ConcurrentHashMap<>();

    /**
     * 注册消费者
     * @param subscribers 消费者
     */
    protected static void registrySub(List<AbstractSubscriber<?>> subscribers) {
        for (AbstractSubscriber<?> subscriber : subscribers) {
            Objects.requireNonNull(subscriber, "subscriber can not be null");
            String topic = subscriber.topic();
            String tag = subscriber.tag();
            logger.info("注册 {}:{} 订阅者", topic, tag);
            SUB_CONTAINER.put(topic+tag, subscriber);
        }
    }

    /**
     * 根据topic+tag获取订阅者
     * @param tag tag
     * @return 订阅者
     */
    protected static AbstractSubscriber<?> getSubscriber(String topic,String tag) {
        Objects.requireNonNull(topic, "topic cannot be null");
        if (topic.isEmpty()) {
            throw new IllegalArgumentException("topic can not empty");
        }
        Objects.requireNonNull(tag, "tag cannot be null");
        if (tag.isEmpty()) {
            throw new IllegalArgumentException("tag can not empty");
        }
        AbstractSubscriber<?> subscriber = SUB_CONTAINER.get(topic+tag);
        if (subscriber == null) {
            throw new RuntimeException(topic+tag+" not found");
        }
        return subscriber;
    }
}
