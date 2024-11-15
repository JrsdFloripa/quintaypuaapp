package com.app.quintaypuaapp.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.quintaypuaapp.SenhaEncriptar;
import com.app.quintaypuaapp.modelo.Hospede;
import com.app.quintaypuaapp.repositorio.HospedeRepositorio;

@RestController
public class HospedeControle {

    @Autowired
    private HospedeRepositorio gerenciar;

    public void salvarUsuario(Hospede cliente) {
    cliente.setSenha(SenhaEncriptar.encriptar(cliente.getSenha())); 
    gerenciar.save(cliente);
    }

    
    @PostMapping("cadastrarCliente")
    public Hospede hospede(@RequestBody Hospede cliente){
        return gerenciar.save(cliente);
    }
   
    
    
}
