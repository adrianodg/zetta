package com.project.zetta.controllers;

import com.project.zetta.models.Usuario;
import com.project.zetta.repository.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UsuarioController {

    @Autowired
    private UsuarioRepository us;

    @GetMapping("/cadastrarUsuario")
    public String form() {
        return "formUsuario";
    }

    @PostMapping("/cadastrarUsuario")
    public String form(Usuario usuario) {

        us.save(usuario);

        return "redirect:/cadastrarUsuario";
    }

}