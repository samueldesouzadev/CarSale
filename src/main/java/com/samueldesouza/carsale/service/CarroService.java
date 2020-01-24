package com.samueldesouza.carsale.service;

import com.samueldesouza.carsale.models.Carro;
import com.samueldesouza.carsale.repository.CarroRepository;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

@Service
public class CarroService {

    @Inject
    private CarroRepository repository;

    public List<Carro> findAll(){
        return repository.findAll();
    }

    public void save(Carro carro){
        repository.save(carro);
    }

}
