package com.gestor.financeiro.model;


import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

@Table(name = "tb_movimentacao")
public class Movimentacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private BigDecimal valor;


    @Enumerated(EnumType.STRING)
    private TipoPagamento tipoPagamento;


    @Enumerated(EnumType.STRING)
    private TipoMovimentacao tipoMovimentacao;

    private LocalTime horaTrancacao;

    @ManyToOne
    @JoinColumn(name = "usuario_id", nullable = false)
    @JsonBackReference
    Usuario usuario;






}
