package com.app.quintaypuaapp.repositorio;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.app.quintaypuaapp.modelo.Servicos;

@Repository
public interface ServicosRepositorio extends CrudRepository<Servicos, Integer>{

    List<Servicos> findByID(int iD);
   
    @SuppressWarnings("null")
    List<Servicos> findAll();

}
