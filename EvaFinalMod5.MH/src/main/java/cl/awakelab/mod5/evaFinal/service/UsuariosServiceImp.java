package cl.awakelab.mod5.evaFinal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.awakelab.mod5.evaFinal.entities.UsuariosEntity;
import cl.awakelab.mod5.evaFinal.repository.UsuariosRepository;

@Service
public class UsuariosServiceImp implements CrudService<UsuariosEntity>{

	
	@Autowired
	UsuariosRepository usuarioRepository;
	
	@Override
	public List<UsuariosEntity> lista() {
		
		return usuarioRepository.findAll();
	}

	@Override
	public UsuariosEntity crear(UsuariosEntity usuario) {
		
		return usuarioRepository.save(usuario);
	}

	@Override
	public UsuariosEntity editar(UsuariosEntity dato) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
