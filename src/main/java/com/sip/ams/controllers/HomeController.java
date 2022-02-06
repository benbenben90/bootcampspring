package com.sip.ams.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/info")
	public String info() {
		return "home/info"; // le nom de la vue sous template /home
	}
	
	@RequestMapping("/affichage")
	public String afficher() {
		return "home/affichage";
	}
}
