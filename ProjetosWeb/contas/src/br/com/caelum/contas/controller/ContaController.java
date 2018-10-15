package br.com.caelum.contas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ContaController {
	
	@RequestMapping("/form")
	public String formulario() {
		return "formulario";
	}

}
