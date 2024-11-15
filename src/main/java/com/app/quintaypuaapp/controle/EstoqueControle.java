package com.app.quintaypuaapp.controle;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.app.quintaypuaapp.modelo.Estoque;
import com.app.quintaypuaapp.repositorio.EstoqueRepositorio;

@RestController
public class EstoqueControle {

    @Autowired
    private EstoqueRepositorio gerenciar;

    @PostMapping("cadastrarEstoque")
    public Estoque cadastrar(@RequestBody Estoque estoque){
        return gerenciar.save(estoque);
    }
    @PutMapping("alterarEstoque")
    public Estoque alterar(@RequestBody Estoque estoque){
        return gerenciar.save(estoque);
    }
    @GetMapping("buscarEstoque")
    public List<Estoque> selecionar(){
        return (List<Estoque>) gerenciar.findAll();
    }
    @GetMapping("buscarProduto")
    public List<Estoque> selecionarPorProduto(){
        return (List<Estoque>) gerenciar.findByProduto(null);
    }

}
