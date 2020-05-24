package com.project.zetta.models;

import lombok.Data;

@Data
public abstract class Pessoa {
    private String nome;
    private String cpf;
    private String dataNascimento;
    private boolean sexo;
}