package com.banco.mv.banco.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ClientNotFoundException extends Exception {
    public ClientNotFoundException() {
        super("Cliente não encontrado!");
    }
}
