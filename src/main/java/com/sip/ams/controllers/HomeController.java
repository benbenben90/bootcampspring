package com.sip.ams.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/info")
	public String info(Model model) {
		String formation ="FullStack";
		List<String> names = new ArrayList<String>(
			      Arrays.asList("OCP", "OCP", "Spring", "Angular"));
		model.addAttribute("names", names);
		return "home/info"; // le nom de la vue sous template /home
	}
	
	@RequestMapping("/affichage")
	public String afficher() {
		return "home/affichage";
	}
}
