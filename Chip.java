package com.projetojpa.semImport;

public class Chip {

    private String codigo;
    private String localColocacao;
    private String status;

    public Chip(String codigo, String localColocacao, String status) {
        this.codigo = codigo;
        this.localColocacao = localColocacao;
        this.status = status;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getLocalColocacao() {
        return localColocacao;
    }

    public String getStatus() {
        return status;
    }
}
