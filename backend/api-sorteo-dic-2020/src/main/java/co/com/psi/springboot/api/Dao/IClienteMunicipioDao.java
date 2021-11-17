package co.com.psi.springboot.api.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import co.com.psi.springboot.api.Entity.ClienteMunicipio;

public interface IClienteMunicipioDao extends JpaRepository<ClienteMunicipio , Integer>{


	@Query(value ="SELECT * FROM monterrey ORDER BY RAND() LIMIT 1", nativeQuery = true )
	public ClienteMunicipio randomClienteMunicipio();
}
