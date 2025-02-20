package com.br.gerenciamento.autores.obras.dto;

import java.time.LocalDate;

public record AutorDTO(Long idAutor, String nomeAutor, String sexo, String email, LocalDate dataNascimento, String pais, String cpf) {

}
