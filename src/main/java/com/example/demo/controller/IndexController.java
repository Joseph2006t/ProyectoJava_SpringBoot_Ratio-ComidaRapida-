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
	
	@GetMapping("/Menu")
	public String Snacks(Model model) {
		model.addAttribute("titulo2","Menu");
		model.addAttribute("Menu1","Aqui poner la descriccion del snack");
		model.addAttribute("Menu1Precio","El precio del Snack");
		return "Menu";
	}
	
	@GetMapping("/Bebidas")
	public String Bebidas(Model model) {
		model.addAttribute("titulo3","Bebidas");
		model.addAttribute("Bebidas1","Aqui poner la descriccion de la Bebida");
		model.addAttribute("Bebidas1Precio","El precio de la Bebida");
		return "Bebidas";
	}
	
	@GetMapping("/Promociones")
	public String Promociones(Model model) {
		model.addAttribute("titulo4","Promociones");
		return "Promociones";
	}
	
	
	@GetMapping("/ChatBot")
	public String ChatBot(Model model) {
		model.addAttribute("titulo5","ChatBot");
		return "ChatBot";
	}
	
	
	@GetMapping("/Inicio/Hamburguesas")
	public String Hamburguesas(Model model) {
		model.addAttribute("titulo6","Hamburguesas");
		return "Hamburguesas";
	}
	
	
	@GetMapping("/Inicio/Pizzas")
	public String Pizzas(Model model) {
		model.addAttribute("titulo7","Hamburguesas");
		return "Pizzas";
	}
	
	
	@GetMapping("/Inicio/JugosNaturales")
	public String JugosNaturales(Model model) {
		model.addAttribute("titulo8","Jugos Naturales");
		return "JugosNaturales";
	}
	
	
	
	
	
	
	
	
	
	

}
