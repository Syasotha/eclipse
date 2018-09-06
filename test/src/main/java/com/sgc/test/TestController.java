package com.sgc.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	
	@RequestMapping("/")
	public String home(Model model) {
		model.addAttribute("message","hello");
		return "index";
	}
}

