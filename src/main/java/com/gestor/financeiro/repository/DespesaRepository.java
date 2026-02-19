package com.gestor.financeiro.repository;

import com.gestor.financeiro.model.Despesa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


@Repository
public interface DespesaRepository extends JpaRepository<Despesa, Long> {
}
