package cl.awakelab.mod5.evaFinal.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class UsuariosEntity {

	@Id
	@Column(name = "urun")
	private Integer uRun;
	@Column(name = "usunombre")
	private String usuNombre;
	@Column(name = "usuapellido")
	private String usuApellido;
	@Column(name = "usufechanacimiento")
	private String usuFechaNacimiento;
	@Column(name = "tipo_usuario")
	private String tipoUsuario;

}
