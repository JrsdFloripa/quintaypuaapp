package com.app.quintaypuaapp.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.app.quintaypuaapp.modelo.Hospedagem;



@Repository
public interface HospedagemRepositorio extends CrudRepository<Hospedagem, Integer>{

   

}
