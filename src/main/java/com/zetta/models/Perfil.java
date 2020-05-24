package com.zetta.models;

import lombok.Data;

@Data
public class Perfil {

    private String nomePerfil;

    public Perfil(String nomePerfil) {
        this.setNomePerfil(nomePerfil);
    }

    public String getNomePerfil() {
        return nomePerfil;
    }

    public void setNomePerfil(String nomePerfil) {
        this.nomePerfil = nomePerfil;
    }
}