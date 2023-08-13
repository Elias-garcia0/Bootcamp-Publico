package com.elias.listadeestudiantes.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elias.listadeestudiantes.models.Contacto;
import com.elias.listadeestudiantes.models.Estudiante;
import com.elias.listadeestudiantes.repositories.ContactoRepo;
import com.elias.listadeestudiantes.repositories.EstudianteRepo;


@Service
public class MainService {
	
		//INYECCIÓN DEPENDENCIAS
		@Autowired
		private EstudianteRepo estudianteRepo;
		
		@Autowired 
		private ContactoRepo contactRepo;
		
		
		//SERVICIOS PARA PERSONA
		public Estudiante crearEstudiante(Estudiante estudiante) {
			return estudianteRepo.save(estudiante);
		}
		
		public List<Estudiante> todosEstudiantes(){
			return estudianteRepo.findAll();
		}
		

		//SERVICIOS PARA LICENCIA
		public Contacto crearContacto(Contacto contact) {
			return contactRepo.save(contact);
		}
		
		public List<Estudiante> obtenerEstudianteSinContacto(){
			return estudianteRepo.findByContactmodelIsNull();
		}
		
	    public Estudiante buscarEstudiantePorId(Long id) {
	        Optional<Estudiante> optionalEstudiante = estudianteRepo.findById(id);
	        return optionalEstudiante.orElse(null);
	    }
}