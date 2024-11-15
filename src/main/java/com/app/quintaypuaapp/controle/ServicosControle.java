package com.app.quintaypuaapp.controle;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.app.quintaypuaapp.modelo.Servicos;
import com.app.quintaypuaapp.repositorio.ServicosRepositorio;


@RestController
public class ServicosControle {

 @Autowired
    private ServicosRepositorio gerenciar;

    @PostMapping("cadastrarServicos")
    public Servicos cadastrar(@RequestBody Servicos servicos){
        return gerenciar.save(servicos);
    }


}
