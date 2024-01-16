package com.example.animalservice.animal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface AnimalRepo extends JpaRepository<Animal, Long> {

    List<Animal> findAllByOriginId(Long origin_id);
    List<Animal> findAllByDateOfRegister(LocalDate dateOfRegister);
}
