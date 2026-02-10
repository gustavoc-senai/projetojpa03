package com.projetojpa.semImport;

public class Pet {

    private String nome;
    private String tamanho;
    private String dataNascimento;

    public Pet(String nome, String tamanho, String dataNascimento) {
        this.nome = nome;
        this.tamanho = tamanho;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public String getTamanho() {
        return tamanho;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }
}
