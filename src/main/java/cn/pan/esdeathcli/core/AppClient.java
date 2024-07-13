package cn.pan.esdeathcli.core;

import cn.pan.esdeathcli.proto.ResultStatus;

import java.io.Closeable;


public abstract class AppClient implements Closeable {
    protected final String consumerGroup;
    protected final EsdeathClient client;

    public AppClient(Config config) {
        this.consumerGroup = config.consumerGroup;
        if (config instanceof StandaloneConfig) {
            client = new EsdeathSingleClient(((StandaloneConfig) config).serverAddr);
        } else if (config instanceof ClusterConfig) {
            client = new EsdeathClusterClient(((ClusterConfig) config).serverCluster);
        } else {
            throw new RuntimeException("未配置服务地址");
        }
    }

    protected boolean followerRefuseCheck(ResultStatus result) {
        if (ResultStatus.REFUSE_BY_FOLLOWER.equals(result)) {
            followerRefuseProcess();
            return true;
        }
        return false;
    }

    protected void followerRefuseProcess() {
        if (!(client instanceof EsdeathClusterClient)) {
            throw new RuntimeException("request refuse by follower, but client is not cluster client");
        }
        EsdeathClusterClient cluster = (EsdeathClusterClient) client;
        cluster.resetLeader();
    }
}
