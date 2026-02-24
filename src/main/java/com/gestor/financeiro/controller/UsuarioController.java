package com.gestor.financeiro.controller;


import com.gestor.financeiro.dto.UsuarioResponseDTO;
import com.gestor.financeiro.model.Usuario;
import com.gestor.financeiro.service.UsuarioService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    private final UsuarioService service;

    public UsuarioController(UsuarioService service){
        this.service=service;

    }

    @PostMapping
    public Usuario criarUsuario(@RequestBody Usuario usuario){
        return service.criarUsuario(usuario);

    }
    @GetMapping
    public List<UsuarioResponseDTO> ListarUsuarios(){
        return  service.ListaUsuarios();

    }

    @DeleteMapping("/{id}")
    public void deletarUsuarioById(@PathVariable Long id){
        service.deletarUsuarioByid(id);
    }


}
