package com.gestor.financeiro.service;


import com.gestor.financeiro.dto.MetaFinanceiraResponseDTO;
import com.gestor.financeiro.exceptions.IdInvalidoException;
import com.gestor.financeiro.model.MetaFinanceira;
import com.gestor.financeiro.repository.MetaFinanceiraRepository;
import org.springframework.data.jpa.repository.Meta;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MetaFinanceiraService {

    private final MetaFinanceiraRepository repository;

    public MetaFinanceiraService(MetaFinanceiraRepository repository){
        this.repository=repository;

    }

    public List<MetaFinanceiraResponseDTO> listarMetaFinaceiraPorUsuarioId(Integer id){
        List<MetaFinanceiraResponseDTO> metaFinanceira = repository.findByUsuarioId(id).stream()
                .map(m->new MetaFinanceiraResponseDTO(m.getNome(), m.getValorguardado(), m.getObjtivoValor(), m.getPrazoFinal())).toList();


        if(metaFinanceira.isEmpty()){
            throw new IdInvalidoException("Não existe meta financeira pra esse usuario");
        }

        return metaFinanceira;

    }

    public MetaFinanceira criarMetaFinanceira(MetaFinanceira metaFinanceira){
        return repository.save(metaFinanceira);
    }

    public void deletarMetaFinanceiraById(Integer id){


        repository.deleteById(id);
    }

}
