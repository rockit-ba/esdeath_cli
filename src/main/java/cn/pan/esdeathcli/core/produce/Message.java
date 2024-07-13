package cn.pan.esdeathcli.core.produce;

import com.google.common.base.Strings;

import java.util.Objects;

public class Message {
        public final Long delayTime;
        public final String payload;

        public Message(long delayTime, String payload) {
            if (delayTime <= 0) {
                throw new RuntimeException("delayTime 必须大于0");
            }
            if (Strings.isNullOrEmpty(payload)) {
                throw new RuntimeException("payload 不能为空");
            }
            this.delayTime = delayTime;
            this.payload = payload;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Message message = (Message) o;
            return Objects.equals(delayTime, message.delayTime) && Objects.equals(payload, message.payload);
        }

        @Override
        public int hashCode() {
            return Objects.hash(delayTime, payload);
        }

        @Override
        public String toString() {
            return "Message{" +
                    "delayTime=" + delayTime +
                    ", payload='" + payload + '\'' +
                    '}';
        }
    }