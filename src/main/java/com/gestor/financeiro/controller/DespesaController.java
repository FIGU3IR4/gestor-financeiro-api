package com.gestor.financeiro.controller;


import com.gestor.financeiro.model.Despesa;
import com.gestor.financeiro.service.DespesaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/despesas")
public class DespesaController {

    private final DespesaService service;

    public DespesaController(DespesaService service){
        this.service=service;

    }
    @PostMapping
    public Despesa criarDespesa(@RequestBody Despesa despesa){
        return service.criarDespesa(despesa);

    }
    @GetMapping
    public List<Despesa> listarDespesas(){
        return service.listarDespesas();

    }

}
