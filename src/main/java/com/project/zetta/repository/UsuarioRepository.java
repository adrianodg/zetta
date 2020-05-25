package com.project.zetta.repository;

import com.project.zetta.models.Usuario;

import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<Usuario, String>{
    
}