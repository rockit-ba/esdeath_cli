package cn.pan.esdeathcli.core.produce;

import cn.pan.esdeathcli.core.Result;
import cn.pan.esdeathcli.proto.AddDelayMsgResult;

public class SendResult {
        public final Result result;
        public final String msgId;

        public SendResult(Result result, String msgId) {
            this.result = result;
            this.msgId = msgId;
        }

        public static SendResult from(AddDelayMsgResult result) {
            return new SendResult(Result.from(result.getBaseResult()), result.getMsgId());
        }

        @Override
        public String toString() {
            return "SendResult{" +
                    "result=" + result +
                    ", msgId='" + msgId + '\'' +
                    '}';
        }
    }