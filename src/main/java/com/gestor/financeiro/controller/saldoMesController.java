package com.gestor.financeiro.controller;


import com.gestor.financeiro.service.saldoMesService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@RequestMapping("/saldo")
public class saldoMesController {


    private final saldoMesService service;


    public saldoMesController(saldoMesService service){
        this.service=service;

    }

    @GetMapping("/{id}")
    public BigDecimal getSaldoUsuario(@PathVariable Integer id){
            return service.getSaldoUsuario(id);
    }
}
