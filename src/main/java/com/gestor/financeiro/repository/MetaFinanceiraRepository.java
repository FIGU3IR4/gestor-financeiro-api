package com.gestor.financeiro.repository;


import com.gestor.financeiro.model.MetaFinanceira;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Meta;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MetaFinanceiraRepository extends JpaRepository<MetaFinanceira, Integer> {

    List<MetaFinanceira> findByUsuarioId(Integer usuarioId);

}
