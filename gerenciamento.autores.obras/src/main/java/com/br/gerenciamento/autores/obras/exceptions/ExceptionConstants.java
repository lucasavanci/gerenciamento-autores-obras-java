package com.br.gerenciamento.autores.obras.exceptions;

public enum ExceptionConstants {

	NOME_INVALIDO_422("Fornecer um nome valido."),
    DATANASCIMENTO_INVALIDO_422("Fornecer uma data de nascimento valida."),
    CPF_JA_CADASTRADO_422("O CPF informado ja foi cadastrado anteriormente."),
    INFORMAR_CPF_BRASIL_422("Favor informar um CPF, devido o pais ser Brasil.");

    private final String message;

    ExceptionConstants(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}