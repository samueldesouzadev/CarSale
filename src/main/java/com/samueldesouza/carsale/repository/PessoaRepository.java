package com.samueldesouza.carsale.repository;

import com.samueldesouza.carsale.models.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}
