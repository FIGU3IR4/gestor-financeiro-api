package com.gestor.financeiro.service;


import com.gestor.financeiro.exceptions.NomeVazioException;
import com.gestor.financeiro.model.Usuario;
import com.gestor.financeiro.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    private  final UsuarioRepository repository;

    public UsuarioService(UsuarioRepository repository){
        this.repository=repository;

    }

    public Usuario criarUsuario(Usuario usuario){
        if (usuario.getNome().isEmpty()){
            throw new NomeVazioException("Nome nao pode ser vazio");

        }

        return repository.save(usuario);

    }
    public void deletarUsuarioByid(Long id ) {

        if (!repository.existsById(id)){
            System.out.println("Não existe usuario com esse ID");
        }
        repository.deleteById(id);

    }

    public List<Usuario> ListaUsuarios(){
        return repository.findAll();

    }


}
