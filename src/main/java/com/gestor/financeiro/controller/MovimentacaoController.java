package com.gestor.financeiro.controller;


import com.gestor.financeiro.model.Movimentacao;
import com.gestor.financeiro.service.MovimentacaoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movimentacao")
public class MovimentacaoController {


    private final MovimentacaoService service;

    public  MovimentacaoController(MovimentacaoService service){
        this.service=service;

    }

    @PostMapping
    public Movimentacao criarMovimentacao(@RequestBody Movimentacao movimentacao){
        return service.criarMovimentacao(movimentacao);

    }

    @GetMapping("/usuario/{usuarioId}")
    public List<Movimentacao> listarMovimentacaoByUsuarioId(@PathVariable Long usuarioId){
        return service.listarMovimentacaoByUsuarioId(usuarioId);
    }


}
