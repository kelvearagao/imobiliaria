package br.com.imobiliaria.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.imobiliaria.model.Imovel;
import br.com.imobiliaria.model.TipoImovel;

@Controller
@RequestMapping("/imoveis")
public class ImoveisController {
	
	@RequestMapping("/novo")
	public ModelAndView novo() {
		ModelAndView mv = new ModelAndView("CadastroImovel");
		
		mv.addObject(new Imovel());
		mv.addObject(TipoImovel.values());
		
		return mv;
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView adicionar(Imovel imovel, RedirectAttributes attributes) {
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("redirect:/imoveis/novo");
		attributes.addFlashAttribute("memsagem", "Imóvel cadastrado com sucesso!");
		
		return mv;
	}
}
