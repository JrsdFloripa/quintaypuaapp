package com.app.quintaypuaapp.controle;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.app.quintaypuaapp.modelo.Quartos;
import com.app.quintaypuaapp.repositorio.QuartosRepositorio;

@RestController
public class QuartosControle {

    @Autowired
    private QuartosRepositorio gerenciar;

    @PostMapping("cadastrarQuartos")
    public Quartos quartos(@RequestBody Quartos quarto){
        return gerenciar.save(quarto);
    }
    @GetMapping("listarQuartos")
    public List <Quartos> listarQuartos(){
        return (List <Quartos>)gerenciar.findAll();
    }
    @GetMapping("QuartosPorNCamas")
    public List <Quartos> QuartosPorNCamas(int numeroCamas){
            return (List <Quartos>)gerenciar.findByNumeroCamas(numeroCamas);
    }

}
