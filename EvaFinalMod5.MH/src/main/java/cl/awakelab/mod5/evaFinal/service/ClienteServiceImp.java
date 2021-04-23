package cl.awakelab.mod5.evaFinal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.awakelab.mod5.evaFinal.entities.ClienteEntity;
import cl.awakelab.mod5.evaFinal.repository.ClienteRepository;

@Service
public class ClienteServiceImp implements CrudService<ClienteEntity> {

	@Autowired
	ClienteRepository clienteRepositorio;
	
	@Override
	public List<ClienteEntity> lista() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ClienteEntity crear(ClienteEntity dato) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ClienteEntity editar(ClienteEntity dato) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	

}
