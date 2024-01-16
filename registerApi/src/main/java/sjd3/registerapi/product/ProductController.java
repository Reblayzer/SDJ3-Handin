package sjd3.registerapi.product;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping("/animal/{id}")
    public ResponseEntity<List<Long>> getAllProducts(@PathVariable Long id){
        ProductOuterClass.ProductList productList = productService.getProductsByAnimal(id);
        List<Long> products = productList.getProductsList().stream().map(ProductOuterClass.Product::getId).toList();
        return new ResponseEntity<>(products, HttpStatus.OK);
    }

    @GetMapping("/{id}/animals")
    public ResponseEntity<List<Long>> getAllAnimalsInProduct(@PathVariable Long id){
        ProductOuterClass.AnimalList animalList = productService.getAnimalsInProduct(id);
        List<Long> animals = animalList.getAnimalsList().stream().map(ProductOuterClass.Animal::getId).toList();
        return new ResponseEntity<>(animals, HttpStatus.OK);
    }
}
