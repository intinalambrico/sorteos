package co.com.psi.springboot.api.Service;

import co.com.psi.springboot.api.Entity.Cliente;

public interface IClienteService {

	public Cliente findById(Integer id);
	
	public Cliente randomCliente();
	
}
