package com.br.gerenciamento.autores.obras.dto;

import java.time.LocalDate;

public record ObraDTO(Long idObra, String nomeObra, String Descricao, LocalDate dataPublicacao, LocalDate dataExposicao) {

}
