package com.korucu.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class SpringControl {

	@RequestMapping("/spring")
	public String sayfa () {
		
		return "<h1> İkinci Spring Uygulaması </h1>";
		
	}
	
	
	
}
