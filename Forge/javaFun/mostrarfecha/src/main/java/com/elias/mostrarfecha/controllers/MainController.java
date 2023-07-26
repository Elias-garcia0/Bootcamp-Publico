package com.elias.mostrarfecha.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MainController {
	
	@GetMapping("/")
	public String home() {
		return "index.jsp";
	}
	
	@GetMapping("/date")
		public String fecha(Model modelo) {
			SimpleDateFormat fecha = new SimpleDateFormat("EEEE, MMM, d, yyyy");
			Date date = new Date();
			
			modelo.addAttribute("fecha", fecha.format(date));
			return "fecha.jsp";
		}
	
	@GetMapping("/time")
	public String hora (Model modelo) {
		
		SimpleDateFormat hora = new SimpleDateFormat("HH:mm:ss:a");
		
		String times = hora.format(new Date());
		modelo.addAttribute("time", times);
		return "hora.jsp";
	}
		
	}

    
