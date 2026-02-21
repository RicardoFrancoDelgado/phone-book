package com.ricardo.agenda.service;

import com.ricardo.agenda.exception.ContatoExistente;
import com.ricardo.agenda.model.Contato;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private final Map<String, Contato> contatos = new HashMap<>();

    public void addContact(Contato novoContato) {
        if (novoContato == null) {
            throw new IllegalArgumentException("O contato deve ser informado.");
        }

        validarCampos(novoContato);

        // Extrair a string = que funciona como key
        String chave = novoContato.getNome().toLowerCase().trim();

        if (contatos.containsKey(chave)) {
            throw new ContatoExistente("Erro: Um contato com o nome '%s' já existe e não pode ser sobrescrito".formatted(novoContato.getNome()));
        }

        contatos.put(chave, novoContato);
        System.out.println("Contato adicionado com sucesso! " + novoContato.getNome());
    }

    // métodos privados que são validadores de funções usadas externamente
    private void validarCampos(Contato contato) {
        if (contato.getNome() == null || contato.getNome().isBlank()) {
            throw new IllegalArgumentException("O nome deve ser informado.");
        }

        if (contato.getEmail() == null || contato.getEmail().isBlank()) {
            throw new IllegalArgumentException("O email deve ser informado.");
        }

        if (contato.getTelefone() == null || contato.getTelefone().isBlank()) {
            throw new IllegalArgumentException("O telefone deve ser informado.");
        }
    }
}
