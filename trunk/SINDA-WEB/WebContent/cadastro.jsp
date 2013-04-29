<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Cadastro Engajador</title>
</head>
<body>
<f:view>
 <h:form>
  <h:panelGrid columns="2">
  <h:outputLabel value="Nome: "></h:outputLabel>
  <h:inputText value="#{controllerEngajador.engajador.nome}"></h:inputText>
   <h:commandButton action="#{controllerEngajador.controllerEngajador}" value="Cadastrar"></h:commandButton>
 </h:panelGrid>
 </h:form>
</f:view>
</body>
</html>