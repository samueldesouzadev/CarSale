package com.samueldesouza.carsale.controller;

import com.samueldesouza.carsale.models.Pessoa;
import com.samueldesouza.carsale.service.PessoaService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
@CrossOrigin(origins = "*")
public class PessoaController {

    PessoaService pessoaService;

    @GetMapping("/pessoa")
    public List<Pessoa> findAll() {
        return pessoaService.findAll();
    }


}
