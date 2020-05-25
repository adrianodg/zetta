package com.project.zetta.controllers;

import com.project.zetta.models.Cargo;
import com.project.zetta.repository.CargoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CargoController {

    @Autowired
    private CargoRepository cg;

    @GetMapping("/cadastrarCargo")
    public String form() {
        return "formCargo";
    }

    @PostMapping("/cadastrarCargo")
    public String form(Cargo cargo) {

        cg.save(cargo);

        return "redirect:/cadastrarCargo";
    }

}