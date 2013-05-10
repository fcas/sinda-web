<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Busca por País</title>
</head>
<body>
	<f:view>
		<h:form>
			<h:commandButton action="/busca.jsp" value="Voltar"></h:commandButton><br><br>
		</h:form>
		<h1> Busca por País </h1>
		<h:form>
			<h:panelGrid columns="3">
				<h:outputLabel value="País: " for="nome" />
				<h:inputText label="Nome" id="nome" required="true"
					value="#{controllerEngajador.query}">
					<f:validator validatorId="nomeValidator" />
				</h:inputText>
				<h:message for="nome" errorStyle="color:red; display:block" />
				<h:commandButton action="#{controllerEngajador.buscarEngajadorPorPais}"
					value="Buscar"></h:commandButton>
			</h:panelGrid>
		</h:form>
			
		<h:panelGroup rendered="#{controllerEngajador.buscou==true}">
		<h:form>
			<table border="0" cellspacing="0" cellpadding="10">
				<tr><th></th><th>Nome</th><th>Sobrenome</th><th>Email</th></tr>
				<c:forEach items="#{controllerEngajador.usuarios}" var="usuario">
					<tr>
					<td><h:selectBooleanCheckbox value="#{usuario.selecionado}"/></td>
					<td><h:outputLabel value="#{usuario.nome}"></h:outputLabel></td>
					<td><h:outputLabel value="#{usuario.sobrenome}"></h:outputLabel></td>
					<td><h:outputLabel value="#{usuario.email}"></h:outputLabel></td>
					</tr>
				</c:forEach>
			</table>
			<h:commandButton action="#{controllerEngajador.deletar}"
					value="Deletar itens selecionados"></h:commandButton>
		</h:form>
	</h:panelGroup>
	</f:view>
</body>
</html>