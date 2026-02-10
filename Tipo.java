package com.projetojpa.semImport;

public class Tipo {

    private String nome;
    private String descricao;

    public Tipo(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }
}
