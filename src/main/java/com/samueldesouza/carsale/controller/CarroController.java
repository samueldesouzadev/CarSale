package com.samueldesouza.carsale.controller;

import com.samueldesouza.carsale.mapping.UriMappingConstants;
import com.samueldesouza.carsale.models.Carro;
import com.samueldesouza.carsale.service.CarroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import java.util.List;

@RestController
@RequestMapping(value = UriMappingConstants.Controller.CARRO)
public class CarroController {

    @Inject
    private CarroService service;

    @GetMapping(UriMappingConstants.Carro.FINDALL)
    public List<Carro> findAll(){
        return service.findAll();
    }

    @PostMapping(UriMappingConstants.Carro.SAVE)
    public void save(@RequestBody Carro carro){
        service.save(carro);
    }

    @PutMapping(UriMappingConstants.Carro.UPDATE)
    public void alter(@RequestBody Carro carro){
        service.save(carro);
    }
}
