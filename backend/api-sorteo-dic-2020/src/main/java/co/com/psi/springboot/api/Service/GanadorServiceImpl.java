package co.com.psi.springboot.api.Service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.psi.springboot.api.Dao.IGanadorDao;
import co.com.psi.springboot.api.Entity.Ganador;

@Service
public class GanadorServiceImpl implements IGanadorService {

	@Autowired
	private IGanadorDao ganadorDao;
	
	@Override
	@Transactional
	public Ganador save(Ganador ganador) {
				
		return ganadorDao.save(ganador);
	}

}
