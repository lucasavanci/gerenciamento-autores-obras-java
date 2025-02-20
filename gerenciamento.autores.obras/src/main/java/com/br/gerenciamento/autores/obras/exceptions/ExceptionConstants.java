package com.br.gerenciamento.autores.obras.exceptions;

public enum ExceptionConstants {

	NOME_INVALIDO_422("422-Fornecer um nome valido.");

    private final String message;

    ExceptionConstants(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}