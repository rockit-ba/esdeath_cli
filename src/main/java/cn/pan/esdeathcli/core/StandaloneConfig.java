package cn.pan.esdeathcli.core;

/**
 * @auther qiemengyan
 * @date 2024/6/12
 * @desc <p>
 *
 * </p>
 */
public class StandaloneConfig extends Config {
    public final String serverAddr;

    public StandaloneConfig(String serverAddr, String consumerGroup) {
        super(consumerGroup);
        if (serverAddr == null || serverAddr.isEmpty()) {
            throw new IllegalArgumentException("server_addr can not be empty");
        }
        this.serverAddr = serverAddr;
    }
}
