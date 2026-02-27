package com.gestor.financeiro.controller;


import com.gestor.financeiro.dto.MetaFinanceiraResponseDTO;
import com.gestor.financeiro.model.MetaFinanceira;
import com.gestor.financeiro.service.MetaFinanceiraService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/meta")
public class MetaFinanceiraController {

    private final MetaFinanceiraService service;

    public MetaFinanceiraController(MetaFinanceiraService service){
        this.service=service;

    }

    @PostMapping
    public MetaFinanceira criarMetaFinanceira(@RequestBody MetaFinanceira metaFinanceira){
        return service.criarMetaFinanceira(metaFinanceira);

    }

    @GetMapping("/{id}")
    public List<MetaFinanceiraResponseDTO> listarMetaFinanceira(@PathVariable Integer id){

        return service.listarMetaFinaceiraPorUsuarioId(id);
    }

}


