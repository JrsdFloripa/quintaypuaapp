package com.app.quintaypuaapp.controle;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.quintaypuaapp.modelo.Hospedagem;

@RestController
public class HospedagemControle {

    @PostMapping("/hospedagem")
    public Hospedagem hospedagem(@RequestBody Hospedagem hospedagem){
        return hospedagem;
    }

}
