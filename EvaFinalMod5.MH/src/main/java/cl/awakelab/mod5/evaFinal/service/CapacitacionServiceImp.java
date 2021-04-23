package cl.awakelab.mod5.evaFinal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.awakelab.mod5.evaFinal.entities.CapacitacionEntity;
import cl.awakelab.mod5.evaFinal.repository.CapacitacionRespository;

@Service
public class CapacitacionServiceImp implements CrudService<CapacitacionEntity> {

	@Autowired
	CapacitacionRespository capRepositorio;
	
	@Override
	public List<CapacitacionEntity> lista() {

		return capRepositorio.findAll();
	}

	
	@Override
	public CapacitacionEntity crear(CapacitacionEntity capacitacion) {
		
		return capRepositorio.save(capacitacion);
	}


	@Override
	public CapacitacionEntity editar(CapacitacionEntity dato) {
		// TODO Auto-generated method stub
		return null;
	}



}
