package br.com.imobiliaria.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/imoveis")
public class ImoveisConroller {
	
	@RequestMapping("/novo")
	public String novo() {
		// Acessar o model ...
		return "CadastroImovel";
	}
}
