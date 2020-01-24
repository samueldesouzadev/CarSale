package com.samueldesouza.carsale.service;

import com.samueldesouza.carsale.models.Carro;
import com.samueldesouza.carsale.models.Enum.EnumSituacaoPessoa;
import com.samueldesouza.carsale.models.Pessoa;
import com.samueldesouza.carsale.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sun.invoke.empty.Empty;

import javax.inject.Inject;
import java.util.List;
import java.util.Optional;

@Service
public class PessoaService {

    @Inject
    private PessoaRepository repository;

    public List<Pessoa> findAll() {
        return repository.findAll();
    }

    public void save(Pessoa pessoa){
        repository.save(pessoa);
    }

    public boolean validaFinanciamento(Long idPessoa, Carro carro){
        Optional<Pessoa> pessoa = repository.findById(idPessoa);
        if(pessoa.get() != null){
            if(pessoa.get().getSituacaoPessoa().equals(EnumSituacaoPessoa.AUTORIZADO)){
                if(pessoa.get().getVlrFinanciamento() >= carro.getPreco()){
                return true;
                }
            }
        }
        return false;
    }

}
