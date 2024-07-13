package cn.pan.esdeathcli.core.produce;

import cn.pan.esdeathcli.core.Result;
import cn.pan.esdeathcli.proto.CancelDelayMsgResult;

public class CancelResult {
        public final Result result;

        public CancelResult(Result result) {
            this.result = result;
        }

        public static CancelResult from(CancelDelayMsgResult result) {
            return new CancelResult(Result.from(result.getBaseResult()));
        }

        @Override
        public String toString() {
            return "CancelResult{" +
                    "result=" + result +
                    '}';
        }
    }