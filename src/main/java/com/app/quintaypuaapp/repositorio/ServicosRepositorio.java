package com.app.quintaypuaapp.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.app.quintaypuaapp.modelo.Servicos;

@Repository
public interface ServicosRepositorio extends CrudRepository<Servicos, Integer>{

}
