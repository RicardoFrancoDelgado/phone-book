package com.ricardo.agenda.exception;

public class ContatoExistente extends RuntimeException {
    public ContatoExistente(String message) {
        super(message);
    }
}
