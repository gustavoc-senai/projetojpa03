package com.projetojpa.semImport;

public class Vacinacao {

    private String codigo;
    private String validade;
    private String periodo;

    public Vacinacao(String codigo, String validade, String periodo) {
        this.codigo = codigo;
        this.validade = validade;
        this.periodo = periodo;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getValidade() {
        return validade;
    }

    public String getPeriodo() {
        return periodo;
    }
}
