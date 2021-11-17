package co.com.psi.springboot.api.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.psi.springboot.api.Dao.IClienteMunicipioDao;
import co.com.psi.springboot.api.Entity.ClienteMunicipio;

@Service
public class ClienteMunicipioServiceImpl implements IClienteMunicipioService{

	@Autowired
	private IClienteMunicipioDao clienteMunicipioDao;
	
	@Override
	public ClienteMunicipio ramdonClienteMunicipio() {
		
		return clienteMunicipioDao.randomClienteMunicipio();
	}

}
