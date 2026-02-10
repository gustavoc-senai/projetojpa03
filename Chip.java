package com.projetojpa.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Chip {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String codigo;
    private String localColocacao;
    private String status;

    public Chip() {
    }

    public Chip(String codigo, String localColocacao, String status) {
        this.codigo = codigo;
        this.localColocacao = localColocacao;
        this.status = status;
    }

    public Long getId() {
        return id;
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

