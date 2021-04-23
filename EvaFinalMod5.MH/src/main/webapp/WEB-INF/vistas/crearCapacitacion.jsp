<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">
<title>Crear Capacitacion</title>


<!-- jquery datetimepicker -->
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/jquery-datetimepicker/2.5.20/jquery.datetimepicker.min.css"
	integrity="sha512-f0tzWhCwVFS3WeYaofoLWkTP62ObhewQ1EZn65oSYDZUg1+CyywGKkWzm8BxaJj5HGKI72PnMH9jYyIFz+GH7g=="
	crossorigin="anonymous" />

<!-- BootStrap -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6"
	crossorigin="anonymous">
<!-- css-->
	<style type="text/css"> <%@include file="/css/style.css"%></style>
</style>
</head>


<body>

	<!--nav -->
	<div>
		<img
			src="https://evaluaciones.alineosoft.com/gentelella-master/production/images/logo-humanidea.png">
		<jsp:include page="menu.jsp"></jsp:include>

	</div>
	
	<h1 class="centrar">CREAR CAPACITACION</h1>
	<form:form action="/crearcapacitacion" method="post"
		modelAttribute="formCrearCapacitacion" class="formulario">
				
		
		<div class="">
			 <input type="text" placeholder="* Fecha DD/MM/AA" class="campos-form" id="fechaCap" name="capFecha"  required>
		</div>
		<div class="">
		
			<input type="text" placeholder="* Hora" class="campos-form" id="horaCap" name="capHora" onfocus="(this.type='time')">
		</div>

		<div class="">
			 <input type="text" class="campos-form" id="lugCap" name="capLugar" placeholder="* Lugar">
		</div>

		<div class="">
			<input type="number" class="campos-form" id="durCap" name="capDuracion" placeholder="* Duración">
		</div>

		<div class="">
			 <input type="text" class="campos-form" id="rutCap" name="clienteRutCliente" placeholder="* Rut Cliente">
		</div>
		<br>
		<div class="">
			<label for="" class="form-label"> (*) Campos obligatorios</label>
			<input class="submit" id="boton" type="submit" value="Enviar">
		</div>

	</form:form>
	<!-- BootStrap -->
	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.1/dist/umd/popper.min.js"
		integrity="sha384-SR1sx49pcuLnqZUnnPwx6FCym0wLsk5JZuNx2bPPENzswTNFaQU1RDvt3wT4gWFG"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.min.js"
		integrity="sha384-j0CNLUeiqtyaRmlzUHCPZ+Gy5fQu0dQ6eZ/xAww941Ai1SxSY+0EQqNXNE6DZiVc"
		crossorigin="anonymous"></script>

	<!-- jquery -->
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>

	<!-- jquery validate -->
	<script
		src="https://cdn.jsdelivr.net/npm/jquery-validation@1.19.3/dist/jquery.validate.min.js"></script>

	<!-- jquery datetimepicker -->
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/jquery-datetimepicker/2.5.20/jquery.datetimepicker.full.min.js"
		integrity="sha512-AIOTidJAcHBH2G/oZv9viEGXRqDNmfdPVPYOYKGy3fti0xIplnlgMHUGfuNRzC6FkzIo0iIxgFnr9RikFxK+sw=="
		crossorigin="anonymous"></script>


	<!-- archivo JavaScript -->
	<script type="text/javascript" src="/js/validaciones.js"></script>

	<footer>
		<h1>© 2021 humanidea · Pivacidad · Terminos · Mapa del Sitios</h1>
	</footer>
</body>
</html>