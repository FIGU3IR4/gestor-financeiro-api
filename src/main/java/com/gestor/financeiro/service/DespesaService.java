package com.gestor.financeiro.service;


import com.gestor.financeiro.model.Despesa;
import com.gestor.financeiro.repository.DespesaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DespesaService {

    private final DespesaRepository repository;

    public DespesaService(DespesaRepository repository){
        this.repository=repository;

    }

    public Despesa criarDespesa(Despesa despesa){
        return repository.save(despesa);

    }

    public void deletarDespesaById(Long id){

        repository.findById(id).orElseThrow(()->new RuntimeException("id nao existe"));

        repository.deleteById(id);

    }

    public List<Despesa> listarDespesas(){
        return repository.findAll();
    }

}
