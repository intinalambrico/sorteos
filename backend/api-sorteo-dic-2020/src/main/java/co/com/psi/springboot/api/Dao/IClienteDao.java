package co.com.psi.springboot.api.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import co.com.psi.springboot.api.Entity.Cliente;

public interface IClienteDao extends JpaRepository<Cliente , Integer>{

	@Query(value= "SELECT * FROM tamara_sabana ORDER BY RAND() LIMIT 1" , nativeQuery = true)
	public Cliente randomCliente();
	
}
