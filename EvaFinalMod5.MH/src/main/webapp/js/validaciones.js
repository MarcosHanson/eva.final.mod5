/**
 * 
 */
/** VALIDACION CONTACTO **/

$.validator.addMethod("valTelContacto", function(value, element) {
	var pattern = /([+]{1})([5]{1}[6]{1}[9]{1})([0-9]{8}$)/;
	return this.optional(element) || pattern.test(value);
}, "El formato del telefono es: +569XXXXXXXX");

$(document).ready(function() {
	$("#formContacto").validate({

		rules: {
			nomContacto: {
				required: true,
				minlength: 1,
				maxlength: 50
			},

			mailContacto: {
				required: true,
				email: true
			},

			telContacto: 'valTelContacto',




			menContacto: {
				required: true,
				minlength: 1,
				maxlength: 250
			},

			genContacto: {
				required: true,
			},
		},

		messages: {
			nomContacto: {
				required: "Obligatorio",
				minlength: "Se requiere al menos un caracter",
				maxlength: "Se requiere menos de 50 caracteres"
			},

			mailContacto: {
				required: "Obligatorio",
				email: "Se requiere email valido"
			},

			telContacto: {
				required: "Obligatorio",
				pattern: "Se requiere el siguienye formato: +569XXXXXXXX",
				number: "Formato incorrecto"
			},

			menContacto: {
				required: "Obligatorio",
				minlength: "Se requiere al menos un caracter",
				maxlength: "Se requiere menos de 250 caracteres"
			},

			genContacto: {
				required: "Obligatorio"
			},
		}

	});
});




/** CREAR CAPACITACION **/
$(document).ready(function() {


	$.validator.addMethod("valRutCapacitacion", function(value, element) {
		var pattern = /([0-9]{1,2})([.]{1})([0-9]{3})([.]{1})([0-9]{3})([-]{1})([0-9]{1})/;
		return this.optional(element) || pattern.test(value);
	}, "El formato del rut es XX.XXX.XXX-X (reemplaze K por 1)");


	$("#fechaCap").datetimepicker({
		timepicker: false,
		format: 'd.m.Y',
		maxDate: true,

	}),




		$("#formCap").validate({

			rules: {
				horaCap: {
					required: true
				},

				lugCap: {
					required: true,
					minlength: 1,
					maxlength: 100
				},

				durCap: {
					required: true,
					maxlength: 3
				},

				rutCap: 'valRutCapacitacion',

			},
			messages: {

				fechaCap: {
					required: "Obligatorio",
					elimiter: "Se requiere el siguiente formato: [DD/MM/YYYY]",
					datePattern: "Se requiere el siguiente formato: [DD/MM/YYYY]"
				},

				horaCap: {
					required: "Obligatorio"
				},

				lugCap: {
					required: "Obligatorio",
					minlength: "Se requiere al menos un caracter",
					maxlength: "Se requiere menos de 100 caracteres"
				},

				durCap: {
					required: "Obligatorio",
					maxlength: "Debe ingresar menos 1000 horas"
				},

				rutCap: {
					required: "Obligatorio",
					max: "Se requiere el siguiente formato: XX.XXX.XXX-X"
				},

			}

		});
});
