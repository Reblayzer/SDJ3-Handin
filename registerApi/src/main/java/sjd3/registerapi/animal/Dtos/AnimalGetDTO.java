package sjd3.registerapi.animal.Dtos;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class AnimalGetDTO {
    private float weight;
    private Long RegistrationNumber;
    private LocalDate dateOfRegister;

}
