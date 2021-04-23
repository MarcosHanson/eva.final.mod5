package cl.awakelab.mod5.evaFinal.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ContactoModelo {

	private String nombre;
	private String email;
	private String telefono;
	private String mensaje;
	private String genero;

}
