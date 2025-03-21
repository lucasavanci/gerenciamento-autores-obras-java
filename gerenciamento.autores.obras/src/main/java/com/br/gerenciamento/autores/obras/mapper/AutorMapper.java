package com.br.gerenciamento.autores.obras.mapper;

import org.springframework.stereotype.Component;

import com.br.gerenciamento.autores.obras.dto.AutorCreateDTO;
import com.br.gerenciamento.autores.obras.dto.AutorDTO;
import com.br.gerenciamento.autores.obras.model.AutorModel;

@Component
public class AutorMapper {

    public AutorDTO toDTO(AutorModel autor) {
        return new AutorDTO(autor.getIdAutor(), autor.getNomeAutor(), autor.getSexo(), autor.getEmail(), autor.getDataNascimento(), autor.getPais(), autor.getCpf());
    }

    public AutorModel toEntity(AutorCreateDTO dto) {
        AutorModel autor = new AutorModel();
        autor.setNomeAutor(dto.nomeAutor());
        autor.setSexo(dto.sexo());
        autor.setEmail(dto.email());
        autor.setDataNascimento(dto.dataNascimento());
        autor.setPais(dto.pais());
        autor.setCpf(dto.cpf());
        
        return autor;
    }

}
