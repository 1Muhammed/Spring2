package com.korucu.controllers;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@EnableAutoConfiguration
public class SpringControl {

	@RequestMapping("/spring")
	public String sayfa () {
		
		return "<h1> İkinci Spring Uygulaması </h1>";
		
	}
	
	@RequestMapping("/indexsayfasi")
	public ModelAndView ensar () {
		ModelAndView mdl = new ModelAndView();
		mdl.addObject("mesja", "Yeni mvc Sayfasını Yazdım");
		mdl.setViewName("indexsayfasi");
		return mdl;
	}
	
}
