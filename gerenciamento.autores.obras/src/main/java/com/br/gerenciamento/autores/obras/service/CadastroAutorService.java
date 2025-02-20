package com.br.gerenciamento.autores.obras.service;

import org.springframework.stereotype.Service;

import com.br.gerenciamento.autores.obras.Repository.AutorRepository;
import com.br.gerenciamento.autores.obras.dto.AutorCreateDTO;
import com.br.gerenciamento.autores.obras.dto.AutorDTO;
import com.br.gerenciamento.autores.obras.exceptions.ExceptionConstants;
import com.br.gerenciamento.autores.obras.exceptions.UnprocessableEntity;
import com.br.gerenciamento.autores.obras.mapper.AutorMapper;
import com.br.gerenciamento.autores.obras.model.AutorModel;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
@RequiredArgsConstructor
public class CadastroAutorService {

    private final AutorRepository autorRepository;
    private final AutorMapper autorMapper;
 
    public AutorDTO cadastrarAutor(AutorCreateDTO dto){

        if(dto.nomeAutor() == null || dto.nomeAutor().isEmpty()){
            throw new UnprocessableEntity("ERRO-INVALID-NAME-0001", ExceptionConstants.NOME_INVALIDO_422.getMessage());
        }

        AutorModel autor = autorMapper.toEntity(dto);
        AutorModel criado = autorRepository.save(autor);

        return autorMapper.toDTO(criado);

    }
    
}
