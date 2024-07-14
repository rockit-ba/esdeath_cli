# 说明

若果使用的是springboot，建议直接使用starter引入：https://github.com/rockit-ba/esdeath_cli_boot_starter

当前client包课独立使用，不依赖spring框架，请引入maven依赖：

```xml
<dependency>
    <groupId>io.github.rockit-ba</groupId>
    <artifactId>esdeath_cli</artifactId>
    <version>1.0.1</version>
</dependency>
```



## 发送延迟消息

```java
public class ProduceTest {
    private final static Logger logger = LoggerFactory.getLogger(ProduceTest.class);
    public final static List<String> clusterServer = Arrays.asList("localhost:50051", "localhost:50052", "localhost:50053");
    public final static String serverAddr = "localhost:50051", consumerGroup = "";
    // 集群版
    Config orderC = new ClusterConfig(clusterServer, consumerGroup);
    // 单机版
    Config orderS = new StandaloneConfig(serverAddr, consumerGroup);
    @Test
    public void produce() throws InterruptedException {
        EsdeathProducer esdeathProducer = new EsdeathProducer(orderS);
        long delay = System.currentTimeMillis() + random();
        // 将毫秒转换为日期
        String currentTime = DateFormat.getDateTimeInstance().format(new Date(delay));
        Message message = new Message(delay,"test payload : " + currentTime);
        try {
          SendResult sendResult = esdeathProducer.send(message,OrderSubscriberExample.TOPIC, OrderSubscriberExample.TAG);
          logger.info("send result: {}", sendResult);
        } catch (Exception e) {
          logger.error("send error {}", e.getMessage());
        }
    }

    @Test
    public void timefmt() {
        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance();
        String currentTime = dateFormat.format(date);
        System.out.println(currentTime);
    }

    static int random() {
        int min = 1000*10;
        int max = 1000*60;
        return min + (int) (Math.random() * (max - min));
    }

}
```



## 消费延迟消息

```java
public class PollTest {
    public final static List<String> clusterServer = Arrays.asList("localhost:50051", "localhost:50052", "localhost:50053");
    public final static String serverAddr = "localhost:50051", consumerGroup = "";
    Config orderC = new ClusterConfig(clusterServer, consumerGroup);
    Config orderS = new StandaloneConfig(serverAddr, consumerGroup);

    @Test
    public void pollWhile() {
        EsdeathConsumer esdeathConsumer = new EsdeathConsumer(orderS, new OrderSubscriberExample());
        while (true) {
            try {
                esdeathConsumer.pullMessage(OrderSubscriberExample.TOPIC);
            } catch (Exception e) {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException ex) {
                    throw new RuntimeException(ex);
                }
            }
        }
    }
}

```



## OrderSubscriberExample

```java
public class OrderSubscriberExample extends AbstractSubscriber<String> {
    private final static Logger logger = LoggerFactory.getLogger(OrderSubscriberExample.class);
    public static final String TAG = "order_tag", TOPIC = "order_topic";

    @Override
    public AckStatus consume(String messageJson) {
        logger.info("{} topic 拉取的消息: \n{}", subTag(), messageJson);
        return AckStatus.ACK;
    }

    @Override
    public Tag subTag() {
        return new Tag(TAG);
    }

    @Override
    protected Topic subTopic() {
        return new Topic(TOPIC);
    }
}
```



## 取消延迟消息

```java
public class CancelTest {
    private final static Logger logger = LoggerFactory.getLogger(CancelTest.class);
    public final static List<String> clusterServer = Arrays.asList("localhost:50051", "localhost:50052", "localhost:50053");
    public final static String serverAddr = "localhost:50051", consumerGroup = "";


    @Test
    public void cancel() throws InterruptedException {
        Config order = new StandaloneConfig(serverAddr, consumerGroup);
        EsdeathProducer esdeathProducer = new EsdeathProducer(order);
        CancelResult cancelResult = esdeathProducer.cancel("发送成功之后返回的消息ID");
        logger.info("cancel result: {}", cancelResult);
    }
}
```

