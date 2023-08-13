package com.elias.listadeestudiantes.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.elias.listadeestudiantes.models.Contacto;
import com.elias.listadeestudiantes.models.Estudiante;
import com.elias.listadeestudiantes.services.MainService;

import jakarta.validation.Valid;

@Controller
public class MainController {
	
	// INYECCION DEPENDENCIAS 
		@Autowired
		private MainService mainService;
		
		@GetMapping("/")
		public String raiz() {
			return "redirect:/students";
			
		}
		
		@GetMapping("/students")
		public String root(Model viewModel) {
			
			List<Estudiante> todosEstudiantes = mainService.todosEstudiantes();
			viewModel.addAttribute("todos", todosEstudiantes);
			return "showinfo.jsp";
		}

		@GetMapping("/students/new")
		public String formularioEstudiante(@ModelAttribute("estudiante") Estudiante estudiante) {
			return "newstudent.jsp";
		}

		@PostMapping("/students/new")
		public String crearEstudiante(@Valid @ModelAttribute("estudiante") Estudiante estudiante, BindingResult resultado) {
			if (resultado.hasErrors()) {

				return "newstudent.jsp";
			}
			mainService.crearEstudiante(estudiante);
			return "redirect:/";

		}

		@GetMapping("/contact/new")
		public String formularioContact(@ModelAttribute("contact") Contacto contact, Model viewModel) {
			viewModel.addAttribute("estudiantes", mainService.obtenerEstudianteSinContacto());
			return "newcontact.jsp";
		}
		
		@PostMapping("/contact/new")
		public String crearContacto(@Valid @ModelAttribute("contact") Contacto contact, BindingResult resultado) {
			if (resultado.hasErrors()) {

				return "newcontact.jsp";
			}
			mainService.crearContacto(contact);
			return "redirect:/";

		}

//		@PostMapping("contact/new")
//		public String crearContacto(@Valid @ModelAttribute("contact") contactoModel contact, 
//				BindingResult resultado, Model viewModel) {
//			if (resultado.hasErrors()) {
//				viewModel.addAttribute("estudiantes", mainService.obtenerEstudianteSinContacto());
//				return "newcontact.jsp";
//			}
//			mainService.crearContacto(contact);
//
//			return "redirect:/";
//		}
		
		
//		@GetMapping("/contact/{id}")
//		public String mostrarEstudiante(@PathVariable("id") Long id, Model viewModel) {
//		    Estudiante estudianteBuscado = mainService.buscarEstudiantePorId(id);
//		    
//		    if (estudianteBuscado != null) {
//		        viewModel.addAttribute("estudianteBuscado", estudianteBuscado);
//		    } else {
//		        viewModel.addAttribute("mensajeError", "Estudiante no encontrado");
//		    }
//		    
//		    return "showinfo.jsp";
//		}

}