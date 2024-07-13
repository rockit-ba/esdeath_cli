package cn.pan.esdeathcli.core.produce;

import cn.pan.esdeathcli.commom.IdGenerator;
import cn.pan.esdeathcli.core.Config;
import cn.pan.esdeathcli.core.Tag;
import cn.pan.esdeathcli.core.Topic;
import cn.pan.esdeathcli.proto.AddDelayMsgResult;
import cn.pan.esdeathcli.proto.CancelDelayMsgResult;
import cn.pan.esdeathcli.proto.DelayMsgAdd;
import cn.pan.esdeathcli.proto.DelayMsgCancel;
import com.google.common.base.Strings;

public class EsdeathProducer extends Producer {
    public EsdeathProducer(Config config) {
        super(config);
    }

    public SendResult send(Message message, String topic, String tag) {
        Topic.check(topic);
        Tag.check(tag);
        DelayMsgAdd delayMsgAdd = DelayMsgAdd.newBuilder()
                .setDelayTime(message.delayTime)
                .setTopic(topic)
                .setTag(tag)
                .setMsgId(IdGenerator.generateID())
                .setPayload(message.payload)
                .build();
        AddDelayMsgResult result = super.send(delayMsgAdd);
        logger.debug("send result: {}", result);
        return SendResult.from(result);
    }

    public CancelResult cancel(String messageId) {
        if (Strings.isNullOrEmpty(messageId)) {
            throw new RuntimeException("messageId 不能为空");
        }
        DelayMsgCancel msgCancel = DelayMsgCancel.newBuilder()
                .setMsgId(messageId)
                .build();
        CancelDelayMsgResult result = super.cancel(msgCancel);
        logger.debug("cancel result: {}", result);
        return CancelResult.from(result);
    }

    @Override
    public void close() {
        super.shutdown();
        logger.info("producer closed");
    }
}