package com.gestor.financeiro.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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

    private Double valor;


    @Enumerated(EnumType.STRING)
    private TipoPagamento tipoPagamento;


    @Enumerated(EnumType.STRING)
    private TipoMovimentacao tipoMovimentacao;

    private LocalTime horaTrancacao;

    @ManyToOne
    @JoinColumn(name = "usuario_id", nullable = false)
    Usuario usuario;






}
