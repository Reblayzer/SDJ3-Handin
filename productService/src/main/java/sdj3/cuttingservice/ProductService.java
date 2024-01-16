package sdj3.cuttingservice;

import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;
import net.devh.boot.grpc.server.service.GrpcService;

@RequiredArgsConstructor
@GrpcService
public class ProductService extends ProductServiceGrpc.ProductServiceImplBase {

    private final ProductAnimalRepo productAnimalRepo;
        @Override
        public void getAnimalsInProduct(ProductOuterClass.Product request,
                                        StreamObserver<ProductOuterClass.AnimalList> responseObserver) {
            ProductOuterClass.AnimalList.Builder builder = ProductOuterClass.AnimalList.newBuilder();
            productAnimalRepo.findAllByProductId(request.getId()).forEach(animalId -> builder.addAnimals
                    (ProductOuterClass.Animal.newBuilder().setId(animalId.getAnimalProductKey().getAnimalId()).build()));
            responseObserver.onNext(builder.build());
            responseObserver.onCompleted();
        }

    @Override
    public void getProductWithAnimal(ProductOuterClass.Animal request, StreamObserver<ProductOuterClass.ProductList> responseObserver) {
        ProductOuterClass.ProductList.Builder builder = ProductOuterClass.ProductList.newBuilder();
        productAnimalRepo.findAllByAnimalProductKey_AnimalId(request.getId()).forEach(productId -> builder.addProducts
                (ProductOuterClass.Product.newBuilder().setId(productId.getProduct().getId()).build()));
        responseObserver.onNext(builder.build());
        responseObserver.onCompleted();
    }
}
