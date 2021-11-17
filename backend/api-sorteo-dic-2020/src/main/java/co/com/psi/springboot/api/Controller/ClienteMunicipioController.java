package co.com.psi.springboot.api.Controller;
/**
 * Autor: Edwin Egue
 * Version: 1
 * Fecha-Actualización: 01-Enero-2021
 * */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.psi.springboot.api.Entity.ClienteMunicipio;
import co.com.psi.springboot.api.Service.IClienteMunicipioService;

@RestController
@RequestMapping(value = "/municipios")
@CrossOrigin("*")
public class ClienteMunicipioController {
	
	@Autowired
	private IClienteMunicipioService clienteMunicipioService;
	
	@GetMapping("/random")
	public ClienteMunicipio ramdonClienteMunicipio() {
		return clienteMunicipioService.ramdonClienteMunicipio();
	}
}
