package com.projetojpa.semImport;

public class Raca {

    private String nome;
    private String origem;

    public Raca(String nome, String origem) {
        this.nome = nome;
        this.origem = origem;
    }

    public String getNome() {
        return nome;
    }

    public String getOrigem() {
        return origem;
    }
}
