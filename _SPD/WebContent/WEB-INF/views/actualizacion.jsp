<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Actualizacion.jsp</h1>
	<sf:form action="${pageContext.request.contextPath}/actualizacion/save"
		method="post" modelAttribute="actualizacion">
		<table>
			<tr>
				<td>Id empleado</td>
				<td><sf:input path="id_emp"/></td>
			</tr>
			<tr>
				<td>Curp</td>
				<td><sf:input path="curp_spd" type="text" /></td>
			</tr>

			<tr>
				<td>Nombre</td>
				<td><sf:input path="nombre_spd" type="text" /></td>
			</tr>
			<tr>
				<td>Observaciones</td>
				<td><sf:input path="observaciones" type="text" /></td>
			</tr>

			<tr>
				<td></td>
				<td><input type="submit" value="Guardar cambios" />
			</tr>
		</table>
	</sf:form>

	<br />
	<c:out value="${resultado}"></c:out>
	
	
</body>
</html>