<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Engajamundo</title>
</head>
<body>
	<f:view>
		<h:form>
			<h:commandButton action="/ManterUsuario.jsp" value="Voltar"></h:commandButton>
			<br>
			<br>
		</h:form>
		<h1>Buscar Usuário</h1>
		<h:panelGrid columns="2">
			<h:form>
				<h:commandButton action="#{controllerEngajador.buscarPorNome}"
					value="Busca por nome"></h:commandButton>
				<h:commandButton action="#{controllerEngajador.buscarPorPais}"
					value="Busca por país"></h:commandButton>

			</h:form>
		</h:panelGrid>
	</f:view>
</body>
</html>