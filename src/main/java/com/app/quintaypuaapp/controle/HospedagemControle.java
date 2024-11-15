package com.app.quintaypuaapp.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.app.quintaypuaapp.modelo.Hospedagem;
import com.app.quintaypuaapp.repositorio.HospedagemRepositorio;

@RestController
public class HospedagemControle {

    @Autowired
    private HospedagemRepositorio gerenciar;

    @PostMapping("/realizarReserva")
    public Hospedagem hospedagem(@RequestBody Hospedagem hospedagem){
        return gerenciar.save(hospedagem);
    }

}
