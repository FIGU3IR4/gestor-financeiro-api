package com.gestor.financeiro.service;

import com.gestor.financeiro.exceptions.ValorMovimentacaoInvalidoException;
import com.gestor.financeiro.model.Movimentacao;
import com.gestor.financeiro.repository.MovimentacaoRepository;
import org.springframework.stereotype.Service;

import java.io.Serial;
import java.util.List;

@Service
public class MovimentacaoService {

    private final MovimentacaoRepository repository;

    public  MovimentacaoService(MovimentacaoRepository repository){
        this.repository=repository;

    }

    public Movimentacao criarMovimentacao(Movimentacao movimentacao){

        return repository.save(movimentacao);

    }

    public List<Movimentacao>listarMovimentacaoByUsuarioId(Long usuarioId){
        return repository.findByUsuarioId(usuarioId);
    }

}
