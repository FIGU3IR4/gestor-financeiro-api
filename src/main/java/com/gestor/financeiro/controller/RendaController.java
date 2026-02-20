package com.gestor.financeiro.controller;


import com.gestor.financeiro.model.Renda;
import com.gestor.financeiro.service.RendaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/renda")


public class RendaController {

    private final RendaService service;

    public  RendaController(RendaService service){
        this.service=service;

    }


   @PostMapping
   public Renda criarRenda(@RequestBody Renda renda){
        return service.criarRenda(renda);

   }

   @GetMapping
   public List<Renda> listarRenda(){
        return service.listarRenda();

   }
}
