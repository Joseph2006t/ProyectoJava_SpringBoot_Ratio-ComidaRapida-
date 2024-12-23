package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;




@Controller
public class IndexController {
	
	
	@GetMapping("/")
	public String Inicio(Model model) {
		model.addAttribute("titulo","Inicio");
		return "Index";
	}
	
	@GetMapping("/Snacks")
	public String Snacks(Model model) {
		model.addAttribute("titulo2","Snacks");
		model.addAttribute("Snacks1","Aqui poner la descriccion del snack");
		model.addAttribute("Snacks1Precio","El precio del Snack");
		return "Snacks";
	}
	
	@GetMapping("/Bebidas")
	public String Bebidas(Model model) {
		model.addAttribute("titulo3","Bebidas");
		model.addAttribute("Bebidas1","Aqui poner la descriccion de la Bebida");
		model.addAttribute("Bebidas1Precio","El precio de la Bebida");
		return "Bebidas";
	}
	
	
	

}
