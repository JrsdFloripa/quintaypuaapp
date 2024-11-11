package com.app.quintaypuaapp.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.app.quintaypuaapp.modelo.Hospede;
import com.app.quintaypuaapp.repositorio.HospedeRepositorio;

@RestController
public class HospedeControle {

    @Autowired
    private HospedeRepositorio novoCliente;
    
    @PostMapping("/cadastrarCliente")
    public Hospede hospede(@RequestBody Hospede cliente){
        return novoCliente.save(cliente);
    }
   
    
    
}
