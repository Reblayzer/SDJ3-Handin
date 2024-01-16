package sdj3.cuttingservice;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class RepoTest {

    @Autowired
    ProductAnimalRepo productAnimalRepo;

    @Test
    public void getSomething(){
        System.out.println(productAnimalRepo.findAllByProductId(1L));
    }
}
