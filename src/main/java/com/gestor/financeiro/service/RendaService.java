package com.gestor.financeiro.service;


import com.gestor.financeiro.exceptions.ValorInvalidoException;
import com.gestor.financeiro.model.Renda;
import com.gestor.financeiro.repository.RendaRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class RendaService {


    private final RendaRepository repository;

    public RendaService(RendaRepository repository){



        this.repository=repository;

    }

    public Renda criarRenda(Renda renda){
        if(renda.getValor()==null ||renda.getValor().compareTo(BigDecimal.ZERO)<=0){
            throw  new ValorInvalidoException("Valor nao pode ser nulo ou menor que zero");
        }

        return repository.save(renda);
    }

    public List<Renda> listarRenda(){
        return repository.findAll();

    }

    public void deletarRendaById(Long id) {
        if (!repository.existsById(id)) {
            throw new ValorInvalidoException("Id nao existe");
        }
        repository.deleteById(id);
    }

}
