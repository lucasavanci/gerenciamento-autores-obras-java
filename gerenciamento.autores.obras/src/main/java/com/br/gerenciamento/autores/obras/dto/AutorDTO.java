package com.br.gerenciamento.autores.obras.dto;

import java.time.LocalDate;

public record AutorDTO(String nomeAutor, String sexo, String email, LocalDate dataNascimento, String pais, String cpf) {

}
