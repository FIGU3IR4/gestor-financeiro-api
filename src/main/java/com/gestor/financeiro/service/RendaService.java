package com.gestor.financeiro.service;


import com.gestor.financeiro.exceptions.IdInvalidoException;
import com.gestor.financeiro.exceptions.ValorInvalidoException;
import com.gestor.financeiro.model.Despesa;
import com.gestor.financeiro.model.Renda;
import com.gestor.financeiro.repository.RendaRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

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

    public List<Renda> listaRendaByUsuarioId(Integer id ){

        List<Renda> renda = repository.findByUsuarioId(id);


        if (renda.isEmpty()){
            throw  new IdInvalidoException("Nenhuma despesa encotrada pra esse id");
        }

        return listaRendaByUsuarioId(id);

    }


    public List<Renda> listarRendaByUsuarioId(Integer id ){
        return repository.findByUsuarioId(id);

    }



}
