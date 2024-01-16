package sdj3.cuttingservice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface ProductRepo extends JpaRepository<Product, Long> {
}
