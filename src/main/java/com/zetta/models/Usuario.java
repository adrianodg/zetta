package com.zetta.models;


import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Usuario extends Pessoa{
    private String dataCadastro;
}