package com.elias.listadeestudiantes.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.elias.listadeestudiantes.models.Contacto;

@Repository
public interface ContactoRepo extends CrudRepository<Contacto, Long>{
	
	

}