package com.samueldesouza.carsale.service;

import com.samueldesouza.carsale.models.Pessoa;
import com.samueldesouza.carsale.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PessoaService {

    @Autowired
    PessoaRepository pessoaRepository;

    public List<Pessoa> findAll() {
        return pessoaRepository.findAll();
    }

}
