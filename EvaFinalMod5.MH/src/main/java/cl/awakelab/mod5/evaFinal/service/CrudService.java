package cl.awakelab.mod5.evaFinal.service;

import java.util.List;

import cl.awakelab.mod5.evaFinal.entities.CapacitacionEntity;

public interface CrudService <E>{
	
	List<E> lista();
	
	E crear(E dato);
	
	E editar(E dato);
	
	

	

}
