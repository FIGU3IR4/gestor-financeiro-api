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
        if( movimentacao.getValor()==null || movimentacao.getValor()<=0){
            throw new ValorMovimentacaoInvalidoException("O valor da movimentação nao pode ser igual ou menor que zero");
        }
        return repository.save(movimentacao);

    }

    public List<Movimentacao>listarMovimentacaoByUsuarioId(Long usuarioId){
        return repository.findByUsuarioId(usuarioId);
    }

}
