package com.project.zetta.controllers;

import com.project.zetta.models.Cargo;
import com.project.zetta.repository.CargoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CargoController {

    @Autowired
    private CargoRepository cg;

    @RequestMapping("/cargos")
    public String red() {
        return "cargos";
    }

    @GetMapping("/cadastrarCargo")
    public String form() {
        return "formCargo";
    }

    @PostMapping("/cadastrarCargo")
    public String form(Cargo cargo) {

        cg.save(cargo);

        return "redirect:/cadastrarCargo";
    }

    @RequestMapping("/listarCargos")
    public String listarCargos(){

        ModelAndView mv = new ModelAndView("listarCargos");
        Iterable<Cargo> cargos = cg.findAll();
        mv.addObject("cargos", cargos);
        return mv;
    }

}