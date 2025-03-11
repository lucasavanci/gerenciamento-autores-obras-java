package com.br.gerenciamento.autores.obras.dto;

import java.time.LocalDate;

public record ObraCreateDTO(String nomeObra, String descricao, LocalDate dataPublicacao, LocalDate dataExposicao) {

}
