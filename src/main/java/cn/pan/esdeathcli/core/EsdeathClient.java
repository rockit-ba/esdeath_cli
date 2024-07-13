package cn.pan.esdeathcli.core;

import cn.pan.esdeathcli.proto.EsdeathGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;


public interface EsdeathClient {
    EsdeathGrpc.EsdeathBlockingStub workStub();
    void shutdown();
}
