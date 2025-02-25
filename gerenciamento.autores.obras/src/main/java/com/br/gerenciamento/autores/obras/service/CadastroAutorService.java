package com.br.gerenciamento.autores.obras.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private final AutorRepository autorRepository;
    private final AutorMapper autorMapper;

    public AutorDTO cadastrarAutor(AutorCreateDTO dto) {

        validaNomeAutor(dto.nomeAutor());
        validaDataNascimento(dto.dataNascimento());

        AutorModel autor = autorMapper.toEntity(dto);
        AutorModel criado = autorRepository.save(autor);

        return autorMapper.toDTO(criado);

    }

    public void validaNomeAutor(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new UnprocessableEntity("ERRO-NOME-INVALIDO-0001", ExceptionConstants.NOME_INVALIDO_422.getMessage());
        }
    }

    public void validaDataNascimento(LocalDate dataNascimento) {
        if (dataNascimento == null || dataNascimento.toString().isEmpty()) {
            throw new UnprocessableEntity("ERRO-DATANASCIMENTO-INVALIDO-0002",
                    ExceptionConstants.DATANASCIMENTO_INVALIDO_422.getMessage());
        }
    }

}
