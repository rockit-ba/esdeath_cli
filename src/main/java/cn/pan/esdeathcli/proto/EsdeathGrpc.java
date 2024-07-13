package cn.pan.esdeathcli.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * 定义一个服务， 指定其可以被远程调用的方法及其参数和返回类型
 * 在服务侧，服务端实现服务接口，运行一个 gRPC 服务器来处理客户端调用。
 * gRPC 底层架构会解码传入的请求，执行服务方法，编码服务应答。
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.64.0)",
    comments = "Source: client.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class EsdeathGrpc {

  private EsdeathGrpc() {}

  public static final String SERVICE_NAME = "esdeath.Esdeath";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<DelayMsgAdd,
      AddDelayMsgResult> getAddDelayMsgMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddDelayMsg",
      requestType = DelayMsgAdd.class,
      responseType = AddDelayMsgResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<DelayMsgAdd,
      AddDelayMsgResult> getAddDelayMsgMethod() {
    io.grpc.MethodDescriptor<DelayMsgAdd, AddDelayMsgResult> getAddDelayMsgMethod;
    if ((getAddDelayMsgMethod = EsdeathGrpc.getAddDelayMsgMethod) == null) {
      synchronized (EsdeathGrpc.class) {
        if ((getAddDelayMsgMethod = EsdeathGrpc.getAddDelayMsgMethod) == null) {
          EsdeathGrpc.getAddDelayMsgMethod = getAddDelayMsgMethod =
              io.grpc.MethodDescriptor.<DelayMsgAdd, AddDelayMsgResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddDelayMsg"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  DelayMsgAdd.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  AddDelayMsgResult.getDefaultInstance()))
              .setSchemaDescriptor(new EsdeathMethodDescriptorSupplier("AddDelayMsg"))
              .build();
        }
      }
    }
    return getAddDelayMsgMethod;
  }

  private static volatile io.grpc.MethodDescriptor<DelayMsgPull,
      PullDelayMsgResult> getPullDelayMsgMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PullDelayMsg",
      requestType = DelayMsgPull.class,
      responseType = PullDelayMsgResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<DelayMsgPull,
      PullDelayMsgResult> getPullDelayMsgMethod() {
    io.grpc.MethodDescriptor<DelayMsgPull, PullDelayMsgResult> getPullDelayMsgMethod;
    if ((getPullDelayMsgMethod = EsdeathGrpc.getPullDelayMsgMethod) == null) {
      synchronized (EsdeathGrpc.class) {
        if ((getPullDelayMsgMethod = EsdeathGrpc.getPullDelayMsgMethod) == null) {
          EsdeathGrpc.getPullDelayMsgMethod = getPullDelayMsgMethod =
              io.grpc.MethodDescriptor.<DelayMsgPull, PullDelayMsgResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PullDelayMsg"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  DelayMsgPull.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  PullDelayMsgResult.getDefaultInstance()))
              .setSchemaDescriptor(new EsdeathMethodDescriptorSupplier("PullDelayMsg"))
              .build();
        }
      }
    }
    return getPullDelayMsgMethod;
  }

  private static volatile io.grpc.MethodDescriptor<DelayMsgAck,
      AckDelayMsgResult> getAckDelayMsgMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AckDelayMsg",
      requestType = DelayMsgAck.class,
      responseType = AckDelayMsgResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<DelayMsgAck,
      AckDelayMsgResult> getAckDelayMsgMethod() {
    io.grpc.MethodDescriptor<DelayMsgAck, AckDelayMsgResult> getAckDelayMsgMethod;
    if ((getAckDelayMsgMethod = EsdeathGrpc.getAckDelayMsgMethod) == null) {
      synchronized (EsdeathGrpc.class) {
        if ((getAckDelayMsgMethod = EsdeathGrpc.getAckDelayMsgMethod) == null) {
          EsdeathGrpc.getAckDelayMsgMethod = getAckDelayMsgMethod =
              io.grpc.MethodDescriptor.<DelayMsgAck, AckDelayMsgResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AckDelayMsg"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  DelayMsgAck.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  AckDelayMsgResult.getDefaultInstance()))
              .setSchemaDescriptor(new EsdeathMethodDescriptorSupplier("AckDelayMsg"))
              .build();
        }
      }
    }
    return getAckDelayMsgMethod;
  }

  private static volatile io.grpc.MethodDescriptor<DelayMsgCancel,
      CancelDelayMsgResult> getCancelDelayMsgMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CancelDelayMsg",
      requestType = DelayMsgCancel.class,
      responseType = CancelDelayMsgResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<DelayMsgCancel,
      CancelDelayMsgResult> getCancelDelayMsgMethod() {
    io.grpc.MethodDescriptor<DelayMsgCancel, CancelDelayMsgResult> getCancelDelayMsgMethod;
    if ((getCancelDelayMsgMethod = EsdeathGrpc.getCancelDelayMsgMethod) == null) {
      synchronized (EsdeathGrpc.class) {
        if ((getCancelDelayMsgMethod = EsdeathGrpc.getCancelDelayMsgMethod) == null) {
          EsdeathGrpc.getCancelDelayMsgMethod = getCancelDelayMsgMethod =
              io.grpc.MethodDescriptor.<DelayMsgCancel, CancelDelayMsgResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CancelDelayMsg"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  DelayMsgCancel.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CancelDelayMsgResult.getDefaultInstance()))
              .setSchemaDescriptor(new EsdeathMethodDescriptorSupplier("CancelDelayMsg"))
              .build();
        }
      }
    }
    return getCancelDelayMsgMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      RoleResult> getGetRoleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRole",
      requestType = com.google.protobuf.Empty.class,
      responseType = RoleResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      RoleResult> getGetRoleMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, RoleResult> getGetRoleMethod;
    if ((getGetRoleMethod = EsdeathGrpc.getGetRoleMethod) == null) {
      synchronized (EsdeathGrpc.class) {
        if ((getGetRoleMethod = EsdeathGrpc.getGetRoleMethod) == null) {
          EsdeathGrpc.getGetRoleMethod = getGetRoleMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, RoleResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRole"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  RoleResult.getDefaultInstance()))
              .setSchemaDescriptor(new EsdeathMethodDescriptorSupplier("GetRole"))
              .build();
        }
      }
    }
    return getGetRoleMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EsdeathStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EsdeathStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EsdeathStub>() {
        @Override
        public EsdeathStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EsdeathStub(channel, callOptions);
        }
      };
    return EsdeathStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EsdeathBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EsdeathBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EsdeathBlockingStub>() {
        @Override
        public EsdeathBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EsdeathBlockingStub(channel, callOptions);
        }
      };
    return EsdeathBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EsdeathFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EsdeathFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EsdeathFutureStub>() {
        @Override
        public EsdeathFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EsdeathFutureStub(channel, callOptions);
        }
      };
    return EsdeathFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * 定义一个服务， 指定其可以被远程调用的方法及其参数和返回类型
   * 在服务侧，服务端实现服务接口，运行一个 gRPC 服务器来处理客户端调用。
   * gRPC 底层架构会解码传入的请求，执行服务方法，编码服务应答。
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * 新增延迟消息
     * </pre>
     */
    default void addDelayMsg(DelayMsgAdd request,
                             io.grpc.stub.StreamObserver<AddDelayMsgResult> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddDelayMsgMethod(), responseObserver);
    }

    /**
     * <pre>
     * 拉取延迟消息
     * </pre>
     */
    default void pullDelayMsg(DelayMsgPull request,
                              io.grpc.stub.StreamObserver<PullDelayMsgResult> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPullDelayMsgMethod(), responseObserver);
    }

    /**
     * <pre>
     * 消息消费响应
     * </pre>
     */
    default void ackDelayMsg(DelayMsgAck request,
                             io.grpc.stub.StreamObserver<AckDelayMsgResult> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAckDelayMsgMethod(), responseObserver);
    }

    /**
     * <pre>
     * 取消延迟消息
     * </pre>
     */
    default void cancelDelayMsg(DelayMsgCancel request,
                                io.grpc.stub.StreamObserver<CancelDelayMsgResult> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCancelDelayMsgMethod(), responseObserver);
    }

    /**
     * <pre>
     * 获取角色信息（leader or follower）
     * </pre>
     */
    default void getRole(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<RoleResult> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRoleMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Esdeath.
   * <pre>
   * 定义一个服务， 指定其可以被远程调用的方法及其参数和返回类型
   * 在服务侧，服务端实现服务接口，运行一个 gRPC 服务器来处理客户端调用。
   * gRPC 底层架构会解码传入的请求，执行服务方法，编码服务应答。
   * </pre>
   */
  public static abstract class EsdeathImplBase
      implements io.grpc.BindableService, AsyncService {

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return EsdeathGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Esdeath.
   * <pre>
   * 定义一个服务， 指定其可以被远程调用的方法及其参数和返回类型
   * 在服务侧，服务端实现服务接口，运行一个 gRPC 服务器来处理客户端调用。
   * gRPC 底层架构会解码传入的请求，执行服务方法，编码服务应答。
   * </pre>
   */
  public static final class EsdeathStub
      extends io.grpc.stub.AbstractAsyncStub<EsdeathStub> {
    private EsdeathStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected EsdeathStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EsdeathStub(channel, callOptions);
    }

    /**
     * <pre>
     * 新增延迟消息
     * </pre>
     */
    public void addDelayMsg(DelayMsgAdd request,
                            io.grpc.stub.StreamObserver<AddDelayMsgResult> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddDelayMsgMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 拉取延迟消息
     * </pre>
     */
    public void pullDelayMsg(DelayMsgPull request,
                             io.grpc.stub.StreamObserver<PullDelayMsgResult> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPullDelayMsgMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 消息消费响应
     * </pre>
     */
    public void ackDelayMsg(DelayMsgAck request,
                            io.grpc.stub.StreamObserver<AckDelayMsgResult> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAckDelayMsgMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 取消延迟消息
     * </pre>
     */
    public void cancelDelayMsg(DelayMsgCancel request,
                               io.grpc.stub.StreamObserver<CancelDelayMsgResult> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCancelDelayMsgMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 获取角色信息（leader or follower）
     * </pre>
     */
    public void getRole(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<RoleResult> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetRoleMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Esdeath.
   * <pre>
   * 定义一个服务， 指定其可以被远程调用的方法及其参数和返回类型
   * 在服务侧，服务端实现服务接口，运行一个 gRPC 服务器来处理客户端调用。
   * gRPC 底层架构会解码传入的请求，执行服务方法，编码服务应答。
   * </pre>
   */
  public static final class EsdeathBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<EsdeathBlockingStub> {
    private EsdeathBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected EsdeathBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EsdeathBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 新增延迟消息
     * </pre>
     */
    public AddDelayMsgResult addDelayMsg(DelayMsgAdd request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddDelayMsgMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 拉取延迟消息
     * </pre>
     */
    public PullDelayMsgResult pullDelayMsg(DelayMsgPull request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPullDelayMsgMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 消息消费响应
     * </pre>
     */
    public AckDelayMsgResult ackDelayMsg(DelayMsgAck request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAckDelayMsgMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 取消延迟消息
     * </pre>
     */
    public CancelDelayMsgResult cancelDelayMsg(DelayMsgCancel request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCancelDelayMsgMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 获取角色信息（leader or follower）
     * </pre>
     */
    public RoleResult getRole(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRoleMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Esdeath.
   * <pre>
   * 定义一个服务， 指定其可以被远程调用的方法及其参数和返回类型
   * 在服务侧，服务端实现服务接口，运行一个 gRPC 服务器来处理客户端调用。
   * gRPC 底层架构会解码传入的请求，执行服务方法，编码服务应答。
   * </pre>
   */
  public static final class EsdeathFutureStub
      extends io.grpc.stub.AbstractFutureStub<EsdeathFutureStub> {
    private EsdeathFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected EsdeathFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EsdeathFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 新增延迟消息
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<AddDelayMsgResult> addDelayMsg(
        DelayMsgAdd request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddDelayMsgMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 拉取延迟消息
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<PullDelayMsgResult> pullDelayMsg(
        DelayMsgPull request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPullDelayMsgMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 消息消费响应
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<AckDelayMsgResult> ackDelayMsg(
        DelayMsgAck request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAckDelayMsgMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 取消延迟消息
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<CancelDelayMsgResult> cancelDelayMsg(
        DelayMsgCancel request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCancelDelayMsgMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 获取角色信息（leader or follower）
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<RoleResult> getRole(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetRoleMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_DELAY_MSG = 0;
  private static final int METHODID_PULL_DELAY_MSG = 1;
  private static final int METHODID_ACK_DELAY_MSG = 2;
  private static final int METHODID_CANCEL_DELAY_MSG = 3;
  private static final int METHODID_GET_ROLE = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD_DELAY_MSG:
          serviceImpl.addDelayMsg((DelayMsgAdd) request,
              (io.grpc.stub.StreamObserver<AddDelayMsgResult>) responseObserver);
          break;
        case METHODID_PULL_DELAY_MSG:
          serviceImpl.pullDelayMsg((DelayMsgPull) request,
              (io.grpc.stub.StreamObserver<PullDelayMsgResult>) responseObserver);
          break;
        case METHODID_ACK_DELAY_MSG:
          serviceImpl.ackDelayMsg((DelayMsgAck) request,
              (io.grpc.stub.StreamObserver<AckDelayMsgResult>) responseObserver);
          break;
        case METHODID_CANCEL_DELAY_MSG:
          serviceImpl.cancelDelayMsg((DelayMsgCancel) request,
              (io.grpc.stub.StreamObserver<CancelDelayMsgResult>) responseObserver);
          break;
        case METHODID_GET_ROLE:
          serviceImpl.getRole((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<RoleResult>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @Override
    @SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getAddDelayMsgMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              DelayMsgAdd,
              AddDelayMsgResult>(
                service, METHODID_ADD_DELAY_MSG)))
        .addMethod(
          getPullDelayMsgMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              DelayMsgPull,
              PullDelayMsgResult>(
                service, METHODID_PULL_DELAY_MSG)))
        .addMethod(
          getAckDelayMsgMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              DelayMsgAck,
              AckDelayMsgResult>(
                service, METHODID_ACK_DELAY_MSG)))
        .addMethod(
          getCancelDelayMsgMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              DelayMsgCancel,
              CancelDelayMsgResult>(
                service, METHODID_CANCEL_DELAY_MSG)))
        .addMethod(
          getGetRoleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              RoleResult>(
                service, METHODID_GET_ROLE)))
        .build();
  }

  private static abstract class EsdeathBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EsdeathBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return EsdeathProto.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Esdeath");
    }
  }

  private static final class EsdeathFileDescriptorSupplier
      extends EsdeathBaseDescriptorSupplier {
    EsdeathFileDescriptorSupplier() {}
  }

  private static final class EsdeathMethodDescriptorSupplier
      extends EsdeathBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    EsdeathMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (EsdeathGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EsdeathFileDescriptorSupplier())
              .addMethod(getAddDelayMsgMethod())
              .addMethod(getPullDelayMsgMethod())
              .addMethod(getAckDelayMsgMethod())
              .addMethod(getCancelDelayMsgMethod())
              .addMethod(getGetRoleMethod())
              .build();
        }
      }
    }
    return result;
  }
}
