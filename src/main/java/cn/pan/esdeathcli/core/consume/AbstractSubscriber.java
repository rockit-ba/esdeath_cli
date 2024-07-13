package cn.pan.esdeathcli.core.consume;

import cn.pan.esdeathcli.commom.JsonUtil;
import cn.pan.esdeathcli.core.Tag;
import cn.pan.esdeathcli.core.Topic;
import cn.pan.esdeathcli.proto.AckStatus;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * <p>
 *     消费消息的订阅者，消息订阅者都需要实现此类
 * </p>
 **/
public abstract class AbstractSubscriber<T> {
    private final Class<T> type;
    private String tagStr;
    private String topic;

    public AbstractSubscriber() {
        Type t = getClass().getGenericSuperclass();
        ParameterizedType pt = (ParameterizedType) t;
        @SuppressWarnings("unchecked")
        Class<T> type = (Class<T>) pt.getActualTypeArguments()[0];
        this.type = type;
    }

    public AckStatus consume(byte[] message) {
        String json = new String(message);
        if (type == String.class) {
            @SuppressWarnings("unchecked")
            T str = (T) json;
            return consume(str);
        }
        return consume(JsonUtil.toBean(json, type));
    }

    public String tag() {
        if (this.tagStr != null) {
            return this.tagStr;
        }
        Tag subTag = subTag();
        if (subTag == null) {
            throw new IllegalArgumentException("tag can not empty");
        }
        this.tagStr = subTag.toString();
        return this.tagStr;
    }

    public String topic() {
        if (this.topic != null) {
            return this.topic;
        }
        Topic subTopic = subTopic();
        if (subTopic == null) {
            throw new IllegalArgumentException("tag can not empty");
        }
        this.topic = subTopic.toString();
        return this.topic;
    }

    /**
     * 订阅消息, 由子类实现
     * @param message 消息对象
     * @return 订阅结果 {@link AckStatus}，订阅成功或者失败，失败broker将会重发消息，成功broker将会删除消息
     */
    protected abstract AckStatus consume(T message);

    /**
     * 订阅的topic，topic不宜过多，建议一个服务使用一个topic，topic是一个比较占用资源的组件
     * 一个服务如需订阅多个topic，可以使用tag进行区分
     * @return topic
     */
    protected abstract Topic subTopic();
    /**
     * 订阅的tag
     * @return tag
     */
    protected abstract Tag subTag();

}
