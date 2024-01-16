package com.example.animalservice.origin;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public interface OriginRepo extends JpaRepository<Origin, Long> {
}
