package sjd3.registerapi.animal;

import io.grpc.MethodDescriptor;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: animal.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AnimalServiceGrpc {

  private AnimalServiceGrpc() {}

  public static final String SERVICE_NAME = "AnimalService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<AnimalOuterClass.GetAnimalRequest,
      AnimalOuterClass.Animal> getGetAnimalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAnimal",
      requestType = AnimalOuterClass.GetAnimalRequest.class,
      responseType = AnimalOuterClass.Animal.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<AnimalOuterClass.GetAnimalRequest,
      AnimalOuterClass.Animal> getGetAnimalMethod() {
    io.grpc.MethodDescriptor<AnimalOuterClass.GetAnimalRequest, AnimalOuterClass.Animal> getGetAnimalMethod;
    if ((getGetAnimalMethod = AnimalServiceGrpc.getGetAnimalMethod) == null) {
      synchronized (AnimalServiceGrpc.class) {
        if ((getGetAnimalMethod = AnimalServiceGrpc.getGetAnimalMethod) == null) {
          AnimalServiceGrpc.getGetAnimalMethod = getGetAnimalMethod =
              io.grpc.MethodDescriptor.<AnimalOuterClass.GetAnimalRequest, AnimalOuterClass.Animal>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(MethodDescriptor.generateFullMethodName(SERVICE_NAME, "GetAnimal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  AnimalOuterClass.GetAnimalRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  AnimalOuterClass.Animal.getDefaultInstance()))
              .setSchemaDescriptor(new AnimalServiceMethodDescriptorSupplier("GetAnimal"))
              .build();
        }
      }
    }
    return getGetAnimalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<AnimalOuterClass.Empty,
      AnimalOuterClass.AnimalList> getGetAnimalsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAnimals",
      requestType = AnimalOuterClass.Empty.class,
      responseType = AnimalOuterClass.AnimalList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<AnimalOuterClass.Empty,
      AnimalOuterClass.AnimalList> getGetAnimalsMethod() {
    io.grpc.MethodDescriptor<AnimalOuterClass.Empty, AnimalOuterClass.AnimalList> getGetAnimalsMethod;
    if ((getGetAnimalsMethod = AnimalServiceGrpc.getGetAnimalsMethod) == null) {
      synchronized (AnimalServiceGrpc.class) {
        if ((getGetAnimalsMethod = AnimalServiceGrpc.getGetAnimalsMethod) == null) {
          AnimalServiceGrpc.getGetAnimalsMethod = getGetAnimalsMethod =
              io.grpc.MethodDescriptor.<AnimalOuterClass.Empty, AnimalOuterClass.AnimalList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(MethodDescriptor.generateFullMethodName(SERVICE_NAME, "GetAnimals"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  AnimalOuterClass.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  AnimalOuterClass.AnimalList.getDefaultInstance()))
              .setSchemaDescriptor(new AnimalServiceMethodDescriptorSupplier("GetAnimals"))
              .build();
        }
      }
    }
    return getGetAnimalsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<AnimalOuterClass.GetAnimalsByOriginRequest,
      AnimalOuterClass.AnimalList> getGetAnimalsByOriginMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAnimalsByOrigin",
      requestType = AnimalOuterClass.GetAnimalsByOriginRequest.class,
      responseType = AnimalOuterClass.AnimalList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<AnimalOuterClass.GetAnimalsByOriginRequest,
      AnimalOuterClass.AnimalList> getGetAnimalsByOriginMethod() {
    io.grpc.MethodDescriptor<AnimalOuterClass.GetAnimalsByOriginRequest, AnimalOuterClass.AnimalList> getGetAnimalsByOriginMethod;
    if ((getGetAnimalsByOriginMethod = AnimalServiceGrpc.getGetAnimalsByOriginMethod) == null) {
      synchronized (AnimalServiceGrpc.class) {
        if ((getGetAnimalsByOriginMethod = AnimalServiceGrpc.getGetAnimalsByOriginMethod) == null) {
          AnimalServiceGrpc.getGetAnimalsByOriginMethod = getGetAnimalsByOriginMethod =
              io.grpc.MethodDescriptor.<AnimalOuterClass.GetAnimalsByOriginRequest, AnimalOuterClass.AnimalList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(MethodDescriptor.generateFullMethodName(SERVICE_NAME, "GetAnimalsByOrigin"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  AnimalOuterClass.GetAnimalsByOriginRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  AnimalOuterClass.AnimalList.getDefaultInstance()))
              .setSchemaDescriptor(new AnimalServiceMethodDescriptorSupplier("GetAnimalsByOrigin"))
              .build();
        }
      }
    }
    return getGetAnimalsByOriginMethod;
  }

  private static volatile io.grpc.MethodDescriptor<AnimalOuterClass.AnimalCreate,
      AnimalOuterClass.Animal> getCreateAnimalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateAnimal",
      requestType = AnimalOuterClass.AnimalCreate.class,
      responseType = AnimalOuterClass.Animal.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<AnimalOuterClass.AnimalCreate,
      AnimalOuterClass.Animal> getCreateAnimalMethod() {
    io.grpc.MethodDescriptor<AnimalOuterClass.AnimalCreate, AnimalOuterClass.Animal> getCreateAnimalMethod;
    if ((getCreateAnimalMethod = AnimalServiceGrpc.getCreateAnimalMethod) == null) {
      synchronized (AnimalServiceGrpc.class) {
        if ((getCreateAnimalMethod = AnimalServiceGrpc.getCreateAnimalMethod) == null) {
          AnimalServiceGrpc.getCreateAnimalMethod = getCreateAnimalMethod =
              io.grpc.MethodDescriptor.<AnimalOuterClass.AnimalCreate, AnimalOuterClass.Animal>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(MethodDescriptor.generateFullMethodName(SERVICE_NAME, "CreateAnimal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  AnimalOuterClass.AnimalCreate.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  AnimalOuterClass.Animal.getDefaultInstance()))
              .setSchemaDescriptor(new AnimalServiceMethodDescriptorSupplier("CreateAnimal"))
              .build();
        }
      }
    }
    return getCreateAnimalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<AnimalOuterClass.Date,
      AnimalOuterClass.AnimalList> getGetAnimalsByDateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAnimalsByDate",
      requestType = AnimalOuterClass.Date.class,
      responseType = AnimalOuterClass.AnimalList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<AnimalOuterClass.Date,
      AnimalOuterClass.AnimalList> getGetAnimalsByDateMethod() {
    io.grpc.MethodDescriptor<AnimalOuterClass.Date, AnimalOuterClass.AnimalList> getGetAnimalsByDateMethod;
    if ((getGetAnimalsByDateMethod = AnimalServiceGrpc.getGetAnimalsByDateMethod) == null) {
      synchronized (AnimalServiceGrpc.class) {
        if ((getGetAnimalsByDateMethod = AnimalServiceGrpc.getGetAnimalsByDateMethod) == null) {
          AnimalServiceGrpc.getGetAnimalsByDateMethod = getGetAnimalsByDateMethod =
              io.grpc.MethodDescriptor.<AnimalOuterClass.Date, AnimalOuterClass.AnimalList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(MethodDescriptor.generateFullMethodName(SERVICE_NAME, "GetAnimalsByDate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  AnimalOuterClass.Date.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  AnimalOuterClass.AnimalList.getDefaultInstance()))
              .setSchemaDescriptor(new AnimalServiceMethodDescriptorSupplier("GetAnimalsByDate"))
              .build();
        }
      }
    }
    return getGetAnimalsByDateMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AnimalServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AnimalServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AnimalServiceStub>() {
        @Override
        public AnimalServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AnimalServiceStub(channel, callOptions);
        }
      };
    return AnimalServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AnimalServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AnimalServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AnimalServiceBlockingStub>() {
        @Override
        public AnimalServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AnimalServiceBlockingStub(channel, callOptions);
        }
      };
    return AnimalServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AnimalServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AnimalServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AnimalServiceFutureStub>() {
        @Override
        public AnimalServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AnimalServiceFutureStub(channel, callOptions);
        }
      };
    return AnimalServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getAnimal(AnimalOuterClass.GetAnimalRequest request,
        io.grpc.stub.StreamObserver<AnimalOuterClass.Animal> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAnimalMethod(), responseObserver);
    }

    /**
     */
    default void getAnimals(AnimalOuterClass.Empty request,
        io.grpc.stub.StreamObserver<AnimalOuterClass.AnimalList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAnimalsMethod(), responseObserver);
    }

    /**
     */
    default void getAnimalsByOrigin(AnimalOuterClass.GetAnimalsByOriginRequest request,
        io.grpc.stub.StreamObserver<AnimalOuterClass.AnimalList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAnimalsByOriginMethod(), responseObserver);
    }

    /**
     */
    default void createAnimal(AnimalOuterClass.AnimalCreate request,
        io.grpc.stub.StreamObserver<AnimalOuterClass.Animal> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateAnimalMethod(), responseObserver);
    }

    /**
     */
    default void getAnimalsByDate(AnimalOuterClass.Date request,
        io.grpc.stub.StreamObserver<AnimalOuterClass.AnimalList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAnimalsByDateMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service AnimalService.
   */
  public static abstract class AnimalServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return AnimalServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service AnimalService.
   */
  public static final class AnimalServiceStub
      extends io.grpc.stub.AbstractAsyncStub<AnimalServiceStub> {
    private AnimalServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected AnimalServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AnimalServiceStub(channel, callOptions);
    }

    /**
     */
    public void getAnimal(AnimalOuterClass.GetAnimalRequest request,
        io.grpc.stub.StreamObserver<AnimalOuterClass.Animal> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAnimalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAnimals(AnimalOuterClass.Empty request,
        io.grpc.stub.StreamObserver<AnimalOuterClass.AnimalList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAnimalsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAnimalsByOrigin(AnimalOuterClass.GetAnimalsByOriginRequest request,
        io.grpc.stub.StreamObserver<AnimalOuterClass.AnimalList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAnimalsByOriginMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createAnimal(AnimalOuterClass.AnimalCreate request,
        io.grpc.stub.StreamObserver<AnimalOuterClass.Animal> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateAnimalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAnimalsByDate(AnimalOuterClass.Date request,
        io.grpc.stub.StreamObserver<AnimalOuterClass.AnimalList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAnimalsByDateMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service AnimalService.
   */
  public static final class AnimalServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<AnimalServiceBlockingStub> {
    private AnimalServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected AnimalServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AnimalServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public AnimalOuterClass.Animal getAnimal(AnimalOuterClass.GetAnimalRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAnimalMethod(), getCallOptions(), request);
    }

    /**
     */
    public AnimalOuterClass.AnimalList getAnimals(AnimalOuterClass.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAnimalsMethod(), getCallOptions(), request);
    }

    /**
     */
    public AnimalOuterClass.AnimalList getAnimalsByOrigin(AnimalOuterClass.GetAnimalsByOriginRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAnimalsByOriginMethod(), getCallOptions(), request);
    }

    /**
     */
    public AnimalOuterClass.Animal createAnimal(AnimalOuterClass.AnimalCreate request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateAnimalMethod(), getCallOptions(), request);
    }

    /**
     */
    public AnimalOuterClass.AnimalList getAnimalsByDate(AnimalOuterClass.Date request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAnimalsByDateMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service AnimalService.
   */
  public static final class AnimalServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<AnimalServiceFutureStub> {
    private AnimalServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected AnimalServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AnimalServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<AnimalOuterClass.Animal> getAnimal(
        AnimalOuterClass.GetAnimalRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAnimalMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<AnimalOuterClass.AnimalList> getAnimals(
        AnimalOuterClass.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAnimalsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<AnimalOuterClass.AnimalList> getAnimalsByOrigin(
        AnimalOuterClass.GetAnimalsByOriginRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAnimalsByOriginMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<AnimalOuterClass.Animal> createAnimal(
        AnimalOuterClass.AnimalCreate request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateAnimalMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<AnimalOuterClass.AnimalList> getAnimalsByDate(
        AnimalOuterClass.Date request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAnimalsByDateMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ANIMAL = 0;
  private static final int METHODID_GET_ANIMALS = 1;
  private static final int METHODID_GET_ANIMALS_BY_ORIGIN = 2;
  private static final int METHODID_CREATE_ANIMAL = 3;
  private static final int METHODID_GET_ANIMALS_BY_DATE = 4;

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
        case METHODID_GET_ANIMAL:
          serviceImpl.getAnimal((AnimalOuterClass.GetAnimalRequest) request,
              (io.grpc.stub.StreamObserver<AnimalOuterClass.Animal>) responseObserver);
          break;
        case METHODID_GET_ANIMALS:
          serviceImpl.getAnimals((AnimalOuterClass.Empty) request,
              (io.grpc.stub.StreamObserver<AnimalOuterClass.AnimalList>) responseObserver);
          break;
        case METHODID_GET_ANIMALS_BY_ORIGIN:
          serviceImpl.getAnimalsByOrigin((AnimalOuterClass.GetAnimalsByOriginRequest) request,
              (io.grpc.stub.StreamObserver<AnimalOuterClass.AnimalList>) responseObserver);
          break;
        case METHODID_CREATE_ANIMAL:
          serviceImpl.createAnimal((AnimalOuterClass.AnimalCreate) request,
              (io.grpc.stub.StreamObserver<AnimalOuterClass.Animal>) responseObserver);
          break;
        case METHODID_GET_ANIMALS_BY_DATE:
          serviceImpl.getAnimalsByDate((AnimalOuterClass.Date) request,
              (io.grpc.stub.StreamObserver<AnimalOuterClass.AnimalList>) responseObserver);
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
          getGetAnimalMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              AnimalOuterClass.GetAnimalRequest,
              AnimalOuterClass.Animal>(
                service, METHODID_GET_ANIMAL)))
        .addMethod(
          getGetAnimalsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              AnimalOuterClass.Empty,
              AnimalOuterClass.AnimalList>(
                service, METHODID_GET_ANIMALS)))
        .addMethod(
          getGetAnimalsByOriginMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              AnimalOuterClass.GetAnimalsByOriginRequest,
              AnimalOuterClass.AnimalList>(
                service, METHODID_GET_ANIMALS_BY_ORIGIN)))
        .addMethod(
          getCreateAnimalMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              AnimalOuterClass.AnimalCreate,
              AnimalOuterClass.Animal>(
                service, METHODID_CREATE_ANIMAL)))
        .addMethod(
          getGetAnimalsByDateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              AnimalOuterClass.Date,
              AnimalOuterClass.AnimalList>(
                service, METHODID_GET_ANIMALS_BY_DATE)))
        .build();
  }

  private static abstract class AnimalServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AnimalServiceBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return AnimalOuterClass.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AnimalService");
    }
  }

  private static final class AnimalServiceFileDescriptorSupplier
      extends AnimalServiceBaseDescriptorSupplier {
    AnimalServiceFileDescriptorSupplier() {}
  }

  private static final class AnimalServiceMethodDescriptorSupplier
      extends AnimalServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AnimalServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AnimalServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AnimalServiceFileDescriptorSupplier())
              .addMethod(getGetAnimalMethod())
              .addMethod(getGetAnimalsMethod())
              .addMethod(getGetAnimalsByOriginMethod())
              .addMethod(getCreateAnimalMethod())
              .addMethod(getGetAnimalsByDateMethod())
              .build();
        }
      }
    }
    return result;
  }
}
