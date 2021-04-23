package cl.awakelab.mod5.evaFinal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.awakelab.mod5.evaFinal.entities.ClienteEntity;

public interface ClienteRepository extends JpaRepository<ClienteEntity, Integer>{

	
	public ClienteEntity findByRutCliente(Integer rutCliente);
}
