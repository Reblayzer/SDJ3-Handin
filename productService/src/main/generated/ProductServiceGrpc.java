import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: product.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ProductServiceGrpc {

  private ProductServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "ProductService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ProductOuterClass.Animal,
      ProductOuterClass.ProductList> getGetProductWithAnimalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProductWithAnimal",
      requestType = ProductOuterClass.Animal.class,
      responseType = ProductOuterClass.ProductList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ProductOuterClass.Animal,
      ProductOuterClass.ProductList> getGetProductWithAnimalMethod() {
    io.grpc.MethodDescriptor<ProductOuterClass.Animal, ProductOuterClass.ProductList> getGetProductWithAnimalMethod;
    if ((getGetProductWithAnimalMethod = ProductServiceGrpc.getGetProductWithAnimalMethod) == null) {
      synchronized (ProductServiceGrpc.class) {
        if ((getGetProductWithAnimalMethod = ProductServiceGrpc.getGetProductWithAnimalMethod) == null) {
          ProductServiceGrpc.getGetProductWithAnimalMethod = getGetProductWithAnimalMethod =
              io.grpc.MethodDescriptor.<ProductOuterClass.Animal, ProductOuterClass.ProductList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetProductWithAnimal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ProductOuterClass.Animal.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ProductOuterClass.ProductList.getDefaultInstance()))
              .setSchemaDescriptor(new ProductServiceMethodDescriptorSupplier("GetProductWithAnimal"))
              .build();
        }
      }
    }
    return getGetProductWithAnimalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ProductOuterClass.Product,
      ProductOuterClass.AnimalList> getGetAnimalsInProductMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAnimalsInProduct",
      requestType = ProductOuterClass.Product.class,
      responseType = ProductOuterClass.AnimalList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ProductOuterClass.Product,
      ProductOuterClass.AnimalList> getGetAnimalsInProductMethod() {
    io.grpc.MethodDescriptor<ProductOuterClass.Product, ProductOuterClass.AnimalList> getGetAnimalsInProductMethod;
    if ((getGetAnimalsInProductMethod = ProductServiceGrpc.getGetAnimalsInProductMethod) == null) {
      synchronized (ProductServiceGrpc.class) {
        if ((getGetAnimalsInProductMethod = ProductServiceGrpc.getGetAnimalsInProductMethod) == null) {
          ProductServiceGrpc.getGetAnimalsInProductMethod = getGetAnimalsInProductMethod =
              io.grpc.MethodDescriptor.<ProductOuterClass.Product, ProductOuterClass.AnimalList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAnimalsInProduct"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ProductOuterClass.Product.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ProductOuterClass.AnimalList.getDefaultInstance()))
              .setSchemaDescriptor(new ProductServiceMethodDescriptorSupplier("GetAnimalsInProduct"))
              .build();
        }
      }
    }
    return getGetAnimalsInProductMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ProductServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProductServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProductServiceStub>() {
        @java.lang.Override
        public ProductServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProductServiceStub(channel, callOptions);
        }
      };
    return ProductServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ProductServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProductServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProductServiceBlockingStub>() {
        @java.lang.Override
        public ProductServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProductServiceBlockingStub(channel, callOptions);
        }
      };
    return ProductServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ProductServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProductServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProductServiceFutureStub>() {
        @java.lang.Override
        public ProductServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProductServiceFutureStub(channel, callOptions);
        }
      };
    return ProductServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getProductWithAnimal(ProductOuterClass.Animal request,
        io.grpc.stub.StreamObserver<ProductOuterClass.ProductList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetProductWithAnimalMethod(), responseObserver);
    }

    /**
     */
    default void getAnimalsInProduct(ProductOuterClass.Product request,
        io.grpc.stub.StreamObserver<ProductOuterClass.AnimalList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAnimalsInProductMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ProductService.
   */
  public static abstract class ProductServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ProductServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ProductService.
   */
  public static final class ProductServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ProductServiceStub> {
    private ProductServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProductServiceStub(channel, callOptions);
    }

    /**
     */
    public void getProductWithAnimal(ProductOuterClass.Animal request,
        io.grpc.stub.StreamObserver<ProductOuterClass.ProductList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetProductWithAnimalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAnimalsInProduct(ProductOuterClass.Product request,
        io.grpc.stub.StreamObserver<ProductOuterClass.AnimalList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAnimalsInProductMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ProductService.
   */
  public static final class ProductServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ProductServiceBlockingStub> {
    private ProductServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProductServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public ProductOuterClass.ProductList getProductWithAnimal(ProductOuterClass.Animal request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetProductWithAnimalMethod(), getCallOptions(), request);
    }

    /**
     */
    public ProductOuterClass.AnimalList getAnimalsInProduct(ProductOuterClass.Product request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAnimalsInProductMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ProductService.
   */
  public static final class ProductServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ProductServiceFutureStub> {
    private ProductServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProductServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ProductOuterClass.ProductList> getProductWithAnimal(
        ProductOuterClass.Animal request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetProductWithAnimalMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ProductOuterClass.AnimalList> getAnimalsInProduct(
        ProductOuterClass.Product request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAnimalsInProductMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_PRODUCT_WITH_ANIMAL = 0;
  private static final int METHODID_GET_ANIMALS_IN_PRODUCT = 1;

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

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_PRODUCT_WITH_ANIMAL:
          serviceImpl.getProductWithAnimal((ProductOuterClass.Animal) request,
              (io.grpc.stub.StreamObserver<ProductOuterClass.ProductList>) responseObserver);
          break;
        case METHODID_GET_ANIMALS_IN_PRODUCT:
          serviceImpl.getAnimalsInProduct((ProductOuterClass.Product) request,
              (io.grpc.stub.StreamObserver<ProductOuterClass.AnimalList>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
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
          getGetProductWithAnimalMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ProductOuterClass.Animal,
              ProductOuterClass.ProductList>(
                service, METHODID_GET_PRODUCT_WITH_ANIMAL)))
        .addMethod(
          getGetAnimalsInProductMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ProductOuterClass.Product,
              ProductOuterClass.AnimalList>(
                service, METHODID_GET_ANIMALS_IN_PRODUCT)))
        .build();
  }

  private static abstract class ProductServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ProductServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ProductOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ProductService");
    }
  }

  private static final class ProductServiceFileDescriptorSupplier
      extends ProductServiceBaseDescriptorSupplier {
    ProductServiceFileDescriptorSupplier() {}
  }

  private static final class ProductServiceMethodDescriptorSupplier
      extends ProductServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ProductServiceMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ProductServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ProductServiceFileDescriptorSupplier())
              .addMethod(getGetProductWithAnimalMethod())
              .addMethod(getGetAnimalsInProductMethod())
              .build();
        }
      }
    }
    return result;
  }
}
