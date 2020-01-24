package com.samueldesouza.carsale.models;

import com.samueldesouza.carsale.models.Enum.EnumSituacaoPessoa;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
public class Pessoa implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "carros_pessoa", joinColumns = {@JoinColumn(name = "pessoa_id", referencedColumnName = "id")}, inverseJoinColumns = {@JoinColumn(name = "carro_id", referencedColumnName = "id")})
    private List<Carro> carros;

    private String nome;

    private EnumSituacaoPessoa situacaoPessoa;

}
