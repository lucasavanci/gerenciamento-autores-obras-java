package com.br.gerenciamento.autores.obras.mapper;

import org.springframework.stereotype.Component;

import com.br.gerenciamento.autores.obras.dto.AutorCreateDTO;
import com.br.gerenciamento.autores.obras.dto.AutorDTO;
import com.br.gerenciamento.autores.obras.model.AutorModel;

@Component
public class AutorMapper {

    public AutorDTO toDTO(AutorModel autor) {
        return new AutorDTO(autor.getIdAutor(), autor.getNomeAutor(), autor.getEmail(), autor.getCpf(), autor.getDataNascimento(), autor.getPais(), autor.getSexo());
    }

    public AutorModel toEntity(AutorCreateDTO dto) {
        AutorModel autor = new AutorModel();
        autor.setNomeAutor(dto.nomeAutor());
        autor.setEmail(dto.email());
        autor.setCpf(dto.cpf());
        autor.setDataNascimento(dto.dataNascimento());
        autor.setPais(dto.pais());
        autor.setSexo(dto.sexo());
        return autor;
    }

}
