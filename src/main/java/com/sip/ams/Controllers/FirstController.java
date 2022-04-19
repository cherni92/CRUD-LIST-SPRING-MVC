package com.sip.ams.Controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/first")
public class FirstController {
	@RequestMapping("/hello")
	//@ResponseBody
	public String greeting(Model model)
	{
		System.out.println("Hello Spring App");
		String nom="Firas";
		String fonction ="Etudiant";
		List <String> l1 = new ArrayList<>();
		l1.add("Java oca");
		l1.add("Java spring");
		l1.add("Java ocp");
		l1.add("Java oca");
		model.addAttribute("name", nom);
		model.addAttribute("fnt", fonction);
		model.addAttribute("cours", l1);
		return "pages/home";
	}

}
