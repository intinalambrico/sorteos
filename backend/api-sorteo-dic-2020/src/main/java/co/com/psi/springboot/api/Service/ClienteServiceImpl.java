package co.com.psi.springboot.api.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.psi.springboot.api.Dao.IClienteDao;
import co.com.psi.springboot.api.Entity.Cliente;

@Service
public class ClienteServiceImpl implements IClienteService{
	
	@Autowired
	private IClienteDao clienteDao;
	
	@Override 
	public Cliente findById(Integer id) {
		 
		return clienteDao.findById(id).orElse(null);
	}

	@Override
	public Cliente randomCliente() {
		 
		return clienteDao.randomCliente();
	}


}
