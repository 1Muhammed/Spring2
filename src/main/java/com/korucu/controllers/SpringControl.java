package com.korucu.controllers;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class SpringControl {

	@RequestMapping("/spring")
	public String sayfa () {
		
		return "<h1> İkinci Spring Uygulaması </h1>";
		
	}
	
	
	
}
