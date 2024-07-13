package cn.pan.esdeathcli.core.produce;

import cn.pan.esdeathcli.core.AppClient;
import cn.pan.esdeathcli.core.Config;
import cn.pan.esdeathcli.proto.AddDelayMsgResult;
import cn.pan.esdeathcli.proto.CancelDelayMsgResult;
import cn.pan.esdeathcli.proto.DelayMsgAdd;
import cn.pan.esdeathcli.proto.DelayMsgCancel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

abstract class Producer extends AppClient {
    protected final static Logger logger = LoggerFactory.getLogger(Producer.class);

    protected Producer(Config config) {
        super(config);
    }

    protected AddDelayMsgResult send(DelayMsgAdd msg) {
        while (true) {
            AddDelayMsgResult result = client.workStub().addDelayMsg(msg);
            if (followerRefuseCheck(result.getBaseResult().getStatus())) {
                logger.warn("follower refuse add msg:{}", msg);
                continue;
            }
            logger.debug("新增延迟消息：{}", msg);
            return result;
        }
    }

    protected CancelDelayMsgResult cancel(DelayMsgCancel msg) {
        while (true) {
            CancelDelayMsgResult result = client.workStub().cancelDelayMsg(msg);
            if (followerRefuseCheck(result.getBaseResult().getStatus())) {
                logger.warn("follower refuse cancel msg:{}", msg);
                continue;
            }
            logger.debug("取消延迟消息：{}", msg);
            return result;
        }
    }

    protected void shutdown() {
        client.shutdown();
    }



}


