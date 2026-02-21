package com.gestor.financeiro.service;

import com.gestor.financeiro.model.Despesa;
import com.gestor.financeiro.model.Renda;
import com.gestor.financeiro.repository.DespesaRepository;
import com.gestor.financeiro.repository.RendaRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;


@Service
public class saldoMesService {

    private final DespesaRepository despesaRepository;
    private final RendaRepository rendaRepository;

    public saldoMesService(DespesaRepository despesaRepository, RendaRepository rendaRepository){
        this.despesaRepository=despesaRepository;

        this.rendaRepository=rendaRepository;


    }

    public BigDecimal getSaldoUsuario(Integer usuarioId) {

        List<Renda> rendas = rendaRepository.findByUsuarioId(usuarioId);
        List<Despesa> despesas = despesaRepository.findByUsuarioId(usuarioId);

        BigDecimal totalRendas = rendas.stream()
                .map(Renda::getValor)
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        BigDecimal totalDespesas = despesas.stream()
                .map(Despesa::getValor)
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        return totalRendas.subtract(totalDespesas);
    }


}
