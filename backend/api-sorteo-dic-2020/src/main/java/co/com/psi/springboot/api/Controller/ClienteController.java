package co.com.psi.springboot.api.Controller;
/**
 * Autor: Edwin Egue
 * Version: 1
 * Fecha-Actualización: 29-dic-2020
 * */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.psi.springboot.api.Entity.Cliente;
import co.com.psi.springboot.api.Service.IClienteService;
 

@RestController
@RequestMapping(value="/clientes")
@CrossOrigin("*")
public class ClienteController {
	
	@Autowired
	private IClienteService clienteService;
	
	
	//cliente Yopal
	@GetMapping("/random")
	public Cliente randomCliente() {
		return clienteService.randomCliente();
	}
	
}
