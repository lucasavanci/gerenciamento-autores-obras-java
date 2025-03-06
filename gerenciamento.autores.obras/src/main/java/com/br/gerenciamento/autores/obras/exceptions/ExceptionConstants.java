package com.br.gerenciamento.autores.obras.exceptions;

public enum ExceptionConstants {

	NOME_INVALIDO_422("Fornecer um nome valido."),
    DATANASCIMENTO_INVALIDO_422("Fornecer uma data de nascimento valida."),
    CPF_JA_CADASTRADO_422("O CPF informado ja foi cadastrado anteriormente."),
    INFORMAR_CPF_BRASIL_422("Favor informar um CPF, devido o pais ser Brasil."),
    EMAIL_JA_CADASTRADO_422("Email ja cadastrado na base de dados."),
    PAIS_INVALIDO_422("Pais informado invalido.");

    private final String message;

    ExceptionConstants(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}