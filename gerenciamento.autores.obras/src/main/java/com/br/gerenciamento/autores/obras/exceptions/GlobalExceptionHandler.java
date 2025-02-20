package com.br.gerenciamento.autores.obras.exceptions;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice

public class GlobalExceptionHandler {

    @ExceptionHandler(UnprocessableEntity.class)
    public ResponseEntity<ErroResposta> handleUnprocessableEntity(UnprocessableEntity ex) {
        ErroResposta erro = new ErroResposta(
            ex.getStatus().value(),
            ex.getCodigoErro(),
            ex.getMessage()
        );
        return new ResponseEntity<>(erro, ex.getStatus());
    }

    public record ErroResposta(int status, String codigoErro, String mensagem) {}
}