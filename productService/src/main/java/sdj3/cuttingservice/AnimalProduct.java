package sdj3.cuttingservice;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class AnimalProduct {

    @EmbeddedId
    private AnimalProductKey animalProductKey;

    @ManyToOne
    @MapsId("productId")
    @JoinColumn(name = "product_id")
    private Product product;

}
