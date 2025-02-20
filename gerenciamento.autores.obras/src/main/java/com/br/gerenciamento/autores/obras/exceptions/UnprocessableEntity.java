package com.br.gerenciamento.autores.obras.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.UNPROCESSABLE_ENTITY)
public class UnprocessableEntity extends RuntimeException {

    private final String codigoErro;
    private final HttpStatus status;

    public UnprocessableEntity(String codigoErro, String mensagem) {
        super(mensagem);
        this.codigoErro = codigoErro;
        this.status = HttpStatus.UNPROCESSABLE_ENTITY;
    }

    public String getCodigoErro() {
        return codigoErro;
    }

    public HttpStatus getStatus() {
        return status;
    }
}
