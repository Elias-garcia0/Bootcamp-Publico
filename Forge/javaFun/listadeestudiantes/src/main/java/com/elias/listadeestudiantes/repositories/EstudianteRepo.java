package com.elias.listadeestudiantes.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.elias.listadeestudiantes.models.Estudiante;

@Repository
public interface EstudianteRepo extends CrudRepository<Estudiante, Long> {
	
	List<Estudiante> findAll();
	
	List<Estudiante> findByContactmodelIsNull();
	
	Optional<Estudiante> findById(Long id);

}