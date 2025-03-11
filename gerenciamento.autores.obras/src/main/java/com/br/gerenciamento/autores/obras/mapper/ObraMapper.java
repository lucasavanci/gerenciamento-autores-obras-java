package com.br.gerenciamento.autores.obras.mapper;

import org.springframework.stereotype.Component;

import com.br.gerenciamento.autores.obras.dto.ObraCreateDTO;
import com.br.gerenciamento.autores.obras.dto.ObraDTO;
import com.br.gerenciamento.autores.obras.model.ObraModel;



@Component
public class ObraMapper {

    public ObraDTO toDTO(ObraModel obra) {
        return new ObraDTO(obra.getIdObra(), obra.getNomeObra(), obra.getDescricao(), obra.getDataPublicacao(), obra.getDataExposicao());
    }

    public ObraModel toEntity(ObraCreateDTO dto) {
        ObraModel obra = new ObraModel();
        obra.setNomeObra(dto.nomeObra());
        obra.setDescricao(dto.descricao());
        obra.setDataPublicacao(dto.dataPublicacao());
        obra.setDataExposicao(dto.dataExposicao());
        
        return obra;
    }

}
