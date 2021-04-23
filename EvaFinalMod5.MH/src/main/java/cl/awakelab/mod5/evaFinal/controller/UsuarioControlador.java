package cl.awakelab.mod5.evaFinal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

import cl.awakelab.mod5.evaFinal.entities.UsuariosEntity;
import cl.awakelab.mod5.evaFinal.service.CrudService;
import cl.awakelab.mod5.evaFinal.service.IUsuarioService;

@Controller
@RequestMapping("/")
public class UsuarioControlador {

	@Autowired
	CrudService<UsuariosEntity> crudUsuario;
	
	@Autowired
	IUsuarioService iUsuarioService ;

	

	@GetMapping("/listausuarios")
	public String listausuarios(ModelMap modelMap) {
		List<UsuariosEntity> usuarios = crudUsuario.lista();
		modelMap.put("listaUsuarios", usuarios);
		return "listadoUsuario";
	}

	@GetMapping("/crearusuario")
	public String crearUsuario() {
		return "crearUsuario";

	}

	@PostMapping("/crearusuario")
	public RedirectView crearUsuario(@ModelAttribute("formCrearUsuario") UsuariosEntity usuarios) {
		crudUsuario.crear(usuarios);
		return new RedirectView("listausuarios");

	}
	
	@GetMapping("/buscar/{idUsuario}")
	public ResponseEntity<UsuariosEntity> buscarPorId(@PathVariable Integer idUsuario) {

		try {
			UsuariosEntity usuario = new UsuariosEntity();
			usuario = iUsuarioService.buscarPorid(idUsuario);

			return new ResponseEntity<UsuariosEntity>(usuario, HttpStatus.OK);

		} catch (Exception e) {

			return new ResponseEntity<UsuariosEntity>(HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}


}
