package com.project.zetta.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public class Usuario extends Pessoa implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idUsuario;

    @Column(nullable = false)
    private String nome;

    @Column(unique = true, nullable = false)
    private String cpf;

    private String dataNascimento;

    private boolean sexo;

    @Column(nullable = false)
    private String dataCadastro;

    @ManyToOne
    @JoinColumn(name = "idCargo", nullable = false)
    private Cargo cargo;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "usuario")
    private List<Perfil> perfis;

}