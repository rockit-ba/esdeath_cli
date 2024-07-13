package cn.pan.esdeathcli.core;

import java.util.List;

/**
 * @auther qiemengyan
 * @date 2024/6/12
 * @desc <p>
 *
 * </p>
 */
public class ClusterConfig extends Config {
    public final List<String> serverCluster;

    public ClusterConfig(List<String> serverCluster, String consumerGroup) {
        super(consumerGroup);
        if (serverCluster == null || serverCluster.isEmpty()) {
            throw new IllegalArgumentException("serverCluster can not be empty");
        }
        this.serverCluster = serverCluster;
    }
}
