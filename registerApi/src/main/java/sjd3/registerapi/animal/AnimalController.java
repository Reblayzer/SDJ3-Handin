package sjd3.registerapi.animal;


import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sjd3.registerapi.animal.Dtos.AnimalGetDTO;
import sjd3.registerapi.animal.Dtos.AnimalRegisterDTO;


import java.time.LocalDate;
import java.util.Collection;

@RestController
@RequiredArgsConstructor
public class AnimalController {

    private final AnimalService animalService;

    @PostMapping("/animal")
    public ResponseEntity<?> register(@RequestBody AnimalRegisterDTO dto) {
        try {
            animalService.register(dto);
            return new ResponseEntity<>(HttpStatus.CREATED);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.internalServerError().build();
        }
    }

    @GetMapping("/animal")
    public ResponseEntity<Collection<AnimalGetDTO>> getAllAnimals(@RequestParam(required = false) Long originId,
                                                                  @RequestParam(required = false) String date) {
        try {
            if (originId != null)
                return ResponseEntity.ok(animalService.getAllAnimalsByOrigin(originId));
            else if (date != null)
                return ResponseEntity.ok(animalService.getAllAnimalsByRegisterDate(LocalDate.parse(date)));
            else
                return ResponseEntity.ok(animalService.getAllAnimals());
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.internalServerError().build();
        }
    }

    @GetMapping("/animal/{id}")
    public ResponseEntity<AnimalGetDTO> getAnimalById(@PathVariable Long id) {
        try {
            return ResponseEntity.ok(animalService.getAnimalById(id));
        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();
        }
    }

    @GetMapping("/animald")
    public ResponseEntity<Collection<AnimalGetDTO>> getAllAnimalsByOrigin(@RequestParam Long originId) {
        try {
            return ResponseEntity.ok(animalService.getAllAnimalsByOrigin(originId));
        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();
        }
    }

    @GetMapping("/animals")
    public ResponseEntity<Collection<AnimalGetDTO>> getAllAnimalsByRegisterDate(@RequestParam String date) {
        try {
            return ResponseEntity.ok(animalService.getAllAnimalsByRegisterDate(LocalDate.parse(date)));
        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();
        }
    }

}
