package com.projetojpa.semImport;

public class Tutor {

    private String nome;
    private String dataNascimento;

    public Tutor(String nome, String dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }
}
