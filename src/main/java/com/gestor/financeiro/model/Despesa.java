package com.gestor.financeiro.model;


import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

@Table(name = "tb_despesas")
public class Despesa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private  String nome;
    private BigDecimal valor;
    private String Descricao;

    @Enumerated(EnumType.STRING)
    private  TipoDespesa tipoDespesa;

    private LocalDate dataInicio;
    private LocalDate dataFinal;

    private Double valorTotalDespesa;

    @ManyToOne
    @JoinColumn(name = "usuario_id", nullable = false)
    @JsonBackReference
    Usuario usuario;


}
