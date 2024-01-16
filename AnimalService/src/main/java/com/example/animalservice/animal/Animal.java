package com.example.animalservice.animal;


import com.example.animalservice.origin.Origin;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
public class Animal {
    @Id
    @GeneratedValue
    private Long RegistrationNumber;
    private float weight;
    private LocalDate dateOfRegister;
    @ManyToOne
    @JoinColumn(name="origin_id", nullable=false)
    private Origin origin;
}
