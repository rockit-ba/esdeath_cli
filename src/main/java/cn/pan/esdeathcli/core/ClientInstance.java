package cn.pan.esdeathcli.core;

import cn.pan.esdeathcli.proto.EsdeathGrpc;
import cn.pan.esdeathcli.proto.ResultStatus;
import cn.pan.esdeathcli.proto.Role;
import cn.pan.esdeathcli.proto.RoleResult;
import com.google.protobuf.Empty;
import io.grpc.ConnectivityState;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class ClientInstance {
    private final static Logger logger = LoggerFactory.getLogger(ClientInstance.class);
    public final EsdeathGrpc.EsdeathBlockingStub blockingStub;
    private final ManagedChannel channel;
    public final Role role;

    /**
     * init client
     * @param target server address:port
     */
    public ClientInstance(String target) {
        if (target == null || target.isEmpty()) {
            throw new IllegalArgumentException("target can not be empty");
        }

        channel = ManagedChannelBuilder.forTarget(target)
                .usePlaintext()
                .build();
        blockingStub = EsdeathGrpc.newBlockingStub(channel);
        logger.debug("connect : {}", target);

        RoleResult stubRole = blockingStub.getRole(Empty.newBuilder().build());
        if (!ResultStatus.SUCCESS.equals(stubRole.getBaseResult().getStatus())) {
            throw new RuntimeException(stubRole.getBaseResult().getDesc());
        }
        role = stubRole.getRole();
        ConnectivityState connectivityState = channel.getState(true);
        channel.notifyWhenStateChanged(connectivityState, () -> {
            logger.warn("esdeath instance state {} changed to: {} ", connectivityState, channel.getState(true));
        });
        logger.debug("EsdeathClient init success");
    }

    public ConnectivityState getConnectivityState() {
        return channel.getState(true);
    }

    public void shutdown() {
        logger.debug("shutdown esdeath client: {}", channel.authority());
        channel.shutdown();
    }

}
