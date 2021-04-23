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

import cl.awakelab.mod5.evaFinal.entities.CapacitacionEntity;
import cl.awakelab.mod5.evaFinal.service.CrudService;



@Controller
@RequestMapping("/")
public class CapacitacionControlador {
	
	@Autowired
	CrudService<CapacitacionEntity> crudCapacitacion;
	
	
	@GetMapping("/listarcapacitacion")
	public String listaCapacitacion(ModelMap modelcap) {
		List<CapacitacionEntity> listacap = crudCapacitacion.lista();
		modelcap.put("listaCapacitacion", listacap);
		return "listarCapacitacion";	
	}
	
	@GetMapping("/crearcapacitacion")
	public String crearCapacitacion() {
		return "crearCapacitacion";
	}
	
	@PostMapping("/crearcapacitacion")
	public RedirectView crearCapacitacionPost(@ModelAttribute("formCrearCapacitacion")CapacitacionEntity capacitacion) {
		crudCapacitacion.crear(capacitacion);
		
		return new RedirectView("listarcapacitacion");
	}
}
