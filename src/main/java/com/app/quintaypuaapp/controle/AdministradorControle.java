package com.app.quintaypuaapp.controle;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdministradorControle {

    @GetMapping("admin")
    public String mensagem(){
        return "Bem vindo Administrador! ";
    }

}
