package com.rpxIT.clientes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.rpxIT.clientes.model.Cliente;
import com.rpxIT.clientes.repository.Clientes;

@Controller
@RequestMapping("/clientes")
public class ClienteController {
	
	@Autowired
	private Clientes clientes;
	
	@RequestMapping("/novo")
	public ModelAndView novo() {
		ModelAndView mv = new ModelAndView("cadastro-cliente");
		return mv;
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView salvar(Cliente cliente){
		clientes.save(cliente);
		ModelAndView mv = new ModelAndView("cadastro-cliente");
		mv.addObject("mensagem", "Cliente salvo com sucesso!");
		return mv;
	}

}
