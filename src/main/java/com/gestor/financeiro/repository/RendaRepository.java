package com.gestor.financeiro.repository;

import com.gestor.financeiro.model.Renda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RendaRepository extends JpaRepository<Renda, Long> {
}
