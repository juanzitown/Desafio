package br.com.desafio.application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class NavigationController {

	
	@RequestMapping(value="/autenticacao", method = RequestMethod.GET)
	public String testeSecurity(){
		return "autentificacao";
	}
	
	
}
