package com.gestor.financeiro.repository;

import com.gestor.financeiro.model.Renda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface RendaRepository extends JpaRepository<Renda, Long> {

    List<Renda> findByUsuarioId(Integer usuarioId);

}
