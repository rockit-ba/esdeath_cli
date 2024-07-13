package cn.pan.esdeathcli.core;


import cn.pan.esdeathcli.proto.EsdeathGrpc;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class EsdeathSingleClient implements EsdeathClient {
    private final static Logger logger = LoggerFactory.getLogger(EsdeathSingleClient.class);
    private final ClientInstance instance;

    public EsdeathSingleClient(String target) {
        instance = new ClientInstance(target);
    }

    @Override
    public EsdeathGrpc.EsdeathBlockingStub workStub() {
        return instance.blockingStub;
    }

    @Override
    public void shutdown() {
        instance.shutdown();
    }

}
