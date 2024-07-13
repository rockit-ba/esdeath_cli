package cn.pan.esdeathcli.core;

import java.util.Objects;


public final class Topic {
    public final String topic;

    public Topic(String topic) {
        check(topic);
        this.topic = topic;
    }

    public static void check(String topic) {
        if (topic == null || topic.isEmpty()) {
            throw new IllegalArgumentException("topic can not empty");
        }
    }

    @Override
    public String toString() {
        return topic;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Topic topic1 = (Topic) o;
        return Objects.equals(topic, topic1.topic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(topic);
    }
}
