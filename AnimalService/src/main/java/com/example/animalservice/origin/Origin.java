package com.example.animalservice.origin;

import com.example.animalservice.animal.Animal;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.Set;

@Entity
@Data
public class Origin {
    @Id
    @GeneratedValue
    private Long Id;
    private String name;
    @OneToMany(mappedBy = "origin")
    private Set<Animal> animals;

}
