package cl.awakelab.mod5.evaFinal.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import cl.awakelab.mod5.evaFinal.entities.ContactoModelo;



@Controller
@RequestMapping("/")
public class ContactoControlador {
	
	private static final Logger log = LoggerFactory.getLogger("Log de contacto");
	
	@GetMapping("/contacto")
	public String contacto() {
		return "/contacto";
	}
	
	@PostMapping("/contacto")
	public String contactoPost(@ModelAttribute("formContacto")ContactoModelo contacto) {
		log.info("IFORMACION INGRESADA EN FORMULARIO DE CONTACTO");
		System.out.println("Nombre: "+contacto.getNombre());
		System.out.println("Email: "+contacto.getEmail());
		System.out.println("Telefono: "+contacto.getTelefono());
		System.out.println("Mensaje: "+contacto.getMensaje());
		System.out.println("Genero: "+contacto.getGenero());
		return "contacto";
	}

}
