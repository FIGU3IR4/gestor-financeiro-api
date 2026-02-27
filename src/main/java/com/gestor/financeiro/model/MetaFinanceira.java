package com.gestor.financeiro.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor

@Table(name = "tb_metafinanceira")

public class MetaFinanceira {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id;

    private String nome;

    private BigDecimal valorguardado;
    private BigDecimal objtivoValor;
    private LocalDate prazoFinal;


    @ManyToOne
    @JoinColumn(name = "usuario_id", nullable = false)
    Usuario usuario;

}
