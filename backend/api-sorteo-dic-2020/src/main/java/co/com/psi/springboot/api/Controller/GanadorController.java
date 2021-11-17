package co.com.psi.springboot.api.Controller;

/**
 * Autor: Edwin Egue
 * Version: 1
 * Fecha-Actualización: 01-Ener-2021
 * */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import co.com.psi.springboot.api.Entity.Ganador;
import co.com.psi.springboot.api.Service.IGanadorService;

@RestController
@RequestMapping("/ganador")
@CrossOrigin("*")
public class GanadorController {

	@Autowired
	private IGanadorService ganadorService;
	
	@PostMapping("/save")
	@ResponseStatus(HttpStatus.CREATED)
	public Ganador save(@RequestBody Ganador ganador) {
		
		return ganadorService.save(ganador);
	}
}
