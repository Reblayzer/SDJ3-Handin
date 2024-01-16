package sjd3.registerapi.product;

import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @GrpcClient("product-service-grpc")
    ProductServiceGrpc.ProductServiceBlockingStub stub;

    public ProductOuterClass.ProductList getProductsByAnimal(Long id){
        return stub.getProductWithAnimal(ProductOuterClass.Animal.newBuilder().setId(id).build());
    }

    public ProductOuterClass.AnimalList getAnimalsInProduct(Long id){
        return stub.getAnimalsInProduct(ProductOuterClass.Product.newBuilder().setId(id).build());
    }
}
