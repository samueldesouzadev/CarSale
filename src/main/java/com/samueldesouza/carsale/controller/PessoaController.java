package com.samueldesouza.carsale.controller;

import com.samueldesouza.carsale.mapping.MessageMappingConstants;
import com.samueldesouza.carsale.mapping.UriMappingConstants;
import com.samueldesouza.carsale.models.Carro;
import com.samueldesouza.carsale.models.Pessoa;
import com.samueldesouza.carsale.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import java.util.List;

@RestController
@RequestMapping(value = UriMappingConstants.Controller.PESSOA)
@CrossOrigin(origins = "*")
public class PessoaController {

    @Inject
    private PessoaService service;

    @GetMapping(UriMappingConstants.Pessoa.FINDALL)
    public List<Pessoa> findAll() {
        return service.findAll();
    }

    @PostMapping(UriMappingConstants.Pessoa.SAVE)
    public void save(@RequestBody Pessoa pessoa) {
        service.save(pessoa);
    }

    @PutMapping(UriMappingConstants.Pessoa.UPDATE)
    public void alter(@RequestBody Pessoa pessoa) {
        service.save(pessoa);
    }

    public String validaFinanciamentoCarro(@RequestBody Long idPessoa, @RequestBody Carro carro) {
        if (service.validaFinanciamento(idPessoa, carro)) {
            return MessageMappingConstants.Pessoa.FINANCIAMENTOAPROVADO;
        } else {
            return MessageMappingConstants.Pessoa.FINANCIAMENTOREPROVADO;
        }

    }

}
