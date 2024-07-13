package cn.pan.esdeathcli.core;

public class Config {
    public final String consumerGroup;
    protected Config(String consumerGroup) {
        if (consumerGroup == null || consumerGroup.isEmpty()) {
            this.consumerGroup = "default";
            return;
        }
        this.consumerGroup = consumerGroup;
    }
}
