package com.app.quintaypuaapp.repositorio;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.app.quintaypuaapp.modelo.Estoque;

@Repository
public interface EstoqueRepositorio extends CrudRepository<Estoque, Integer>{

    @SuppressWarnings("null")
    List<Estoque> findAll();

    List<Estoque> findByProduto(String produto);
}
