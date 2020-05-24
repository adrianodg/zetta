package com.zetta.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CargoController {
    @RequestMapping("cargo/cadastrarCargo")
    public String form(){
        return "cargo/formCargo";
    }
}