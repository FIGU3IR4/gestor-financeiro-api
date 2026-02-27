package com.gestor.financeiro.dto;

import org.springframework.cglib.core.Local;

import java.math.BigDecimal;
import java.time.LocalDate;

public record MetaFinanceiraResponseDTO (String nome, BigDecimal valorGuardado, BigDecimal objetivoValor, LocalDate przoFinal){
}
