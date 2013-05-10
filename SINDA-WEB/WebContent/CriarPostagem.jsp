<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<f:view>
		<h:form>
			<h:commandButton action="/busca.jsp" value="Voltar"></h:commandButton>
			<br>
			<br>
		</h:form>
		<h1> Criar Postagem </h1>
		<h:form>
			<p>Título: </p><h:inputText value="#{controllerPostagem.post.titulo}"></h:inputText>
			<p>Texto: </p><h:inputTextarea  value="#{controllerPostagem.post.texto}" style="height: 119px; width: 384px; "></h:inputTextarea>
			<p>Tags (separadas por ponto e vírgula): </p><h:inputText  value="#{controllerPostagem.tagAux}" style="width: 384px; "></h:inputText><br><br>
			<h:commandButton action="#{controllerPostagem.postar}" value="Postar"></h:commandButton>
		</h:form>

	</f:view>
</body>
</html>