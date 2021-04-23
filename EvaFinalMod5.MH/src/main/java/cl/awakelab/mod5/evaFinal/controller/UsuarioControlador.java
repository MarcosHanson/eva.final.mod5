package cl.awakelab.mod5.evaFinal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

import cl.awakelab.mod5.evaFinal.entities.UsuariosEntity;
import cl.awakelab.mod5.evaFinal.service.CrudService;

@Controller
@RequestMapping("/")
public class UsuarioControlador {
	
	@Autowired
	CrudService<UsuariosEntity> crudUsuario;
	
	@GetMapping("/listausuarios")
	public String listausuarios(ModelMap modelMap){
		List<UsuariosEntity> usuarios = crudUsuario.lista();
		modelMap.put("claveLista", usuarios);
		return "listaUsuarios";
	}
	
	
	@GetMapping("/crearusuario")
	public String crearUsuario() {
		return "listaUsuarios";
		
	}
	
	@PostMapping("/crearusuario")
	public RedirectView crearUsuario(@ModelAttribute("formCrearUsuario")UsuariosEntity usuarios) {
		crudUsuario.crear(usuarios);
		return new RedirectView ("crearUsuario");
		
	}

}
