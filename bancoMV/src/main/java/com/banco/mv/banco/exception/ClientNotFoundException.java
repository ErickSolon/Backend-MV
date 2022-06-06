package com.banco.mv.banco.exception;

public class ClientNotFoundException extends Exception {
    public ClientNotFoundException() {
        super("Cliente não encontrado!");
    }
}
