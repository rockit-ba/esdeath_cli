package cn.pan.esdeathcli.core;

import cn.pan.esdeathcli.proto.BaseResult;

/**
 *
 * @author jixiang
 */
public class Result {
    public final Status status;
    public final String desc;

    public Result(Status status, String desc) {
        this.status = status;
        this.desc = desc;
    }

    public static Result from(BaseResult baseResult) {
        return new Result(Status.valueOf(baseResult.getStatus().name()), baseResult.getDesc());
    }

    @Override
    public String toString() {
        return "Result{" +
                "status=" + status +
                ", desc='" + desc + '\'' +
                '}';
    }

    public enum Status {
        SUCCESS,
        FAIL,
        REFUSE_BY_FOLLOWER,
        ;
    }
}
