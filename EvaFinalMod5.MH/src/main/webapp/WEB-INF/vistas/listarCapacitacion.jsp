<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Listar Capacitacion</title>
<!-- BootStrap -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6"
	crossorigin="anonymous">
<!-- Librerï¿½as tabla -->
<link rel="stylesheet"
	href="https://code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<link rel="stylesheet"
	href="https://cdn.datatables.net/1.10.24/css/dataTables.jqueryui.min.css">
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

	<!-- tï¿½tulo pï¿½gina -->
	<div class="centrar">
		<h2>Listado de Capacitaciones</h2>
	</div>

	<!-- Tabla -->
	<div class="container">
		<table id="listarcapacitaciones"
			class="table table-striped table-bordered" style="width: 100%">
			<thead>
				<tr>
					<th scope="col">Id</th>
					<th scope="col">Fecha</th>
					<th scope="col">Hora</th>
					<th scope="col">Lugar</th>
					<th scope="col">Duracion </th>
					<th scope="col">Rut Cliente </th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${clavecaplista}" var="capacitacion">
					<tr>
						<td><c:out value="${capacitacion.getIdCapacitacion()}"></c:out></td>
						<td><c:out value="${capacitacion.getCapFecha()}"></c:out></td>
						<td><c:out value="${capacitacion.getCapHora()}"></c:out></td>
						<td><c:out value="${capacitacion.getCapLugar()}"></c:out></td>
						<td><c:out value="${capacitacion.getCapDuracion()}"></c:out></td>
						<td><c:out value="${capacitacion.getClienteRutCliente()}"></c:out></td>

					</tr>
				</c:forEach>
			</tbody>

		</table>

		<!-- Scrips data table  -->
		<script src="https://code.jquery.com/jquery-3.5.1.js"></script>
		<script
			src="https://cdn.datatables.net/1.10.24/js/jquery.dataTables.min.js"></script>
		<script
			src="https://cdn.datatables.net/1.10.24/js/dataTables.jqueryui.min.js"></script>

		<script>
			$(document)
					.ready(
							function() {
								$('#listarcapacitaciones')
										.DataTable(
												{
													language : {
														url : 'http://cdn.datatables.net/plug-ins/1.10.24/i18n/Spanish.json'
													}
												});
							});
		</script>
	</div>
	<footer>
		<h1> 2021 humanidea · Pivacidad · Terminos · Mapa del Sitios</h1>
	</footer>
</body>
</html>