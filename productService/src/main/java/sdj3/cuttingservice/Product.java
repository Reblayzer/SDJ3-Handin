package sdj3.cuttingservice;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Setter
@Getter
@Table
public class Product {

    @Id
    @GeneratedValue
    private Long id;

    @OneToMany(mappedBy = "product", fetch = FetchType.EAGER)
    private Set<AnimalProduct> animals;

}
