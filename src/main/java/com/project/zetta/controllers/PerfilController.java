package com.project.zetta.controllers;

import com.project.zetta.models.Perfil;
import com.project.zetta.repository.PerfilRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PerfilController {

    @Autowired
    private PerfilRepository pf;

    @RequestMapping("/perfis")
    public String red() {
        return "perfis";
    }

    @GetMapping("/cadastrarPerfil")
    public String form() {
        return "formPerfil";
    }

    @PostMapping("/cadastrarPerfil")
    public String form(Perfil perfil) {

        pf.save(perfil);

        return "redirect:/cadastrarPerfil";
    }

    @RequestMapping("/listarPerfis")
    public ModelAndView listarPerfis(){

        ModelAndView mv = new ModelAndView("listarPerfis");
        Iterable<Perfil> perfil = pf.findAll();
        mv.addObject("perfil", perfil);
        return mv;
    }

    

}