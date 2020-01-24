package com.samueldesouza.carsale.repository;

import com.samueldesouza.carsale.models.Carro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarroRepository extends JpaRepository<Carro, Long> {
}
