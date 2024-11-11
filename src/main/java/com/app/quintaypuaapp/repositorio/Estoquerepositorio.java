package com.app.quintaypuaapp.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.app.quintaypuaapp.modelo.Estoque;

@Repository
public interface Estoquerepositorio extends CrudRepository<Estoque, Integer>{

}
