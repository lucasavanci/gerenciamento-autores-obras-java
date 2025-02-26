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

    String BRASIL = "Brasil";

    public AutorDTO cadastrarAutor(AutorCreateDTO dto) {

        log.info("Validando nome do autor...");
        validaNomeAutor(dto.nomeAutor());
        log.info("Validando data de nascimento...");
        validaDataNascimento(dto.dataNascimento());
        log.info("Validando CPF...");
        validaCpf(dto.cpf(), dto.pais());

        AutorModel autor = autorMapper.toEntity(dto);
        AutorModel criado = autorRepository.save(autor);

        return autorMapper.toDTO(criado);

    }

    public void validaNomeAutor(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            log.info("ERRO-NOME-INVALIDO-0001. Nome invalido.");
            throw new UnprocessableEntity("ERRO-NOME-INVALIDO-0001", ExceptionConstants.NOME_INVALIDO_422.getMessage());
        }
    }

    public void validaDataNascimento(LocalDate dataNascimento) {
        if (dataNascimento == null || dataNascimento.toString().isEmpty()) {
            log.info("ERRO-DATANASCIMENTO-INVALIDO-0002. Data de nascimento invalida");
            throw new UnprocessableEntity("ERRO-DATANASCIMENTO-INVALIDO-0002",
                    ExceptionConstants.DATANASCIMENTO_INVALIDO_422.getMessage());
        }
    }

    public void validaCpf(String cpf, String pais) {

        log.info("Verificando se o pais é Brasil...");
        if (pais.equals(BRASIL)) {

            log.info("Pais Brasil. Verificando se o cpf foi informado...");
            if (cpf == null || cpf.trim().isEmpty()) {
                log.info("ERRO-CPF-VAZIO-0004. CPF vazio. Deve informar devido o pais ser Brasil.");
                throw new UnprocessableEntity("ERRO-CPF-VAZIO-0004",
                        ExceptionConstants.INFORMAR_CPF_BRASIL_422.getMessage());

            }

            Long cpfExiste = autorRepository.consultarCpfExistente(cpf);

            if (cpfExiste > 0) {
                throw new UnprocessableEntity("ERRO-CPF-EXISTENTE-0003",
                        ExceptionConstants.CPF_JA_CADASTRADO_422.getMessage());
            }

        }

    }

}
