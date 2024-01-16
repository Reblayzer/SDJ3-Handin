package sdj3.cuttingservice;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Embeddable
@Getter
@Setter
public class AnimalProductKey implements Serializable {

    @Column(name = "animal_id")
    private long animalId;
    @Column(name = "product_id")
    private long productId;
}
