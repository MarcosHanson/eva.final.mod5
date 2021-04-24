package cl.awakelab.mod5.evaFinal.service;

import java.util.List;

import cl.awakelab.mod5.evaFinal.entities.CapacitacionEntity;

public interface CrudService <E>{
	
	public List<E> lista();
	
	public E crear(E dato);
	
	public E editar(E dato);
	
	
	

	

}
