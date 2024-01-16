package sdj3.cuttingservice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface ProductAnimalRepo extends JpaRepository<AnimalProduct, Long> {

    Set<AnimalProduct> findAllByAnimalProductKey_AnimalId(Long animalId);
    Set<AnimalProduct> findAllByProductId(Long productId);
}
