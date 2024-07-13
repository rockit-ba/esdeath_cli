package cn.pan.esdeathcli.core;


import cn.pan.esdeathcli.proto.EsdeathGrpc;
import cn.pan.esdeathcli.proto.Role;
import cn.pan.esdeathcli.proto.RoleResult;
import com.google.protobuf.Empty;
import io.grpc.ConnectivityState;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;


public class EsdeathClusterClient implements EsdeathClient {
    private final static Logger logger = LoggerFactory.getLogger(EsdeathClusterClient.class);
    private static final List<ClientInstance> blockingStubs = new ArrayList<>();
    private volatile ClientInstance leader;

    public EsdeathClusterClient(List<String> targets) {
        if (targets == null || targets.isEmpty()) {
            throw new IllegalArgumentException("server_cluster can not be empty");
        }
        initializeBlockStubs(targets);
        logger.info("EsdeathClusterClient init success");
    }
    private void initializeBlockStubs(List<String> targets) {
        targets.forEach(target -> {
            ClientInstance instance = new ClientInstance(target);
            blockingStubs.add(instance);
            if (Role.LEADER.equals(instance.role)) {
                leader = instance;
            }
        });
    }

    public synchronized void resetLeader() {
        leader = null;
    }


    @Override
    public EsdeathGrpc.EsdeathBlockingStub workStub() {
        if (leaderStatusCheck()) {
            findAndSetLeader();
        }
        if (leader == null) {
            throw new RuntimeException("no leader");
        }
        return leader.blockingStub;
    }

    private synchronized void findAndSetLeader() {
        if (leaderStatusCheck()) {
            logger.warn("Current leader is not available, resetting leader");
            for (ClientInstance instance : blockingStubs) {
                if (!ConnectivityState.READY.equals(instance.getConnectivityState())) {
                    logger.debug("Current node {} is not available", instance.blockingStub.getChannel().authority());
                    continue;
                }
                RoleResult stubRole = instance.blockingStub.getRole(Empty.newBuilder().build());
                if (Role.LEADER.equals(stubRole.getRole())) {
                    leader = instance;
                    break;
                }
            }
        }

    }

    // 判断leader是否可用
    private boolean leaderStatusCheck() {
        return leader == null || !ConnectivityState.READY.equals(leader.getConnectivityState());
    }

    @Override
    public void shutdown() {
        blockingStubs.forEach(ClientInstance::shutdown);
    }

}
