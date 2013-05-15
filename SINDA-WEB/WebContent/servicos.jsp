<?xml version="1.0" encoding="UTF-8" ?>
<jsp:root xmlns:jsp="http://java.sun.com/JSP/Page"
	xmlns:f="http://java.sun.com/jsf/core"
	xmlns:h="http://java.sun.com/jsf/html" version="2.0">
	<jsp:directive.page language="java"
		contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" />
	<jsp:text>
		<![CDATA[ <?xml version="1.0" encoding="UTF-8" ?> ]]>
	</jsp:text>
	<jsp:text>
		<![CDATA[ <!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd"> ]]>
	</jsp:text>
	<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>SINDA - Sistema Nacional de Dados Ambientais</title>

<link rel="StyleSheet" type="text/css" href="css/estilos.css"
	media="screen"></link>
<link rel="shortcut icon"
	href="http://www.crn2.inpe.br/imagens/logo_mini.ico"></link>
<link rel="icon" type="image/png"
	href="http://www.crn2.inpe.br/imagens/logo_mini.png"></link>
<!-- <script type="text/javascript" src="/webapp/resources/js/functions.js?ln=js"></script>  -->

</head>
<body>
	<f:view>

		<div id="divbody">
			<div id="barra-brasil">
				<div class="barra">
					<ul>
						<li><a href="http://www.acessoainformacao.gov.br/" class="ai"
							title="Acesso a informaçao" rel="externo" target="_blank">www.sic.gov.br</a></li>
						<li><a href="http://www.brasil.gov.br/" class="brasilgov"
							title="Portal de Estado do Brasil" rel="externo" target="_blank">www.brasil.gov.br</a></li>
					</ul>
				</div>
			</div>
		</div>

		<h:form>
			<h:commandButton action="/ManterUsuario.jsp" value="Voltar"></h:commandButton>
			<br></br>
			<br></br>

		</h:form>
		<h1>Séries históricas completas de dados:</h1>
		<h4>São fornecidas séries de dados pré-validados.</h4>
		<h4>Instruções: Para solicitá-las, use o formulário abaixo.</h4>
		<h:form>
			<h:panelGrid columns="3">
				<h:outputLabel value="Nome: " for="nome_fisico" />
				<h:inputText label="NomeFisico" id="nome_fisico" required="true"
					value="#{controllerServicos.solicitacao.nome_fisico}">
					<f:validator validatorId="nomeValidator" />
				</h:inputText>
				<h:message for="nome_fisico" errorStyle="color:red; display:block" />

				<h:outputLabel value="Empresa ou instituição: " for="nome_juridico" />
				<h:inputText label="NomeJuridico" id="nome_juridico" required="true"
					value="#{controllerServicos.solicitacao.nome_juridico}">
					<f:validator validatorId="nomeValidator" />
				</h:inputText>
				<h:message for="nome_juridico" errorStyle="color:red; display:block" />


				<h:outputLabel value="Endereço: " for="endereco" />
				<h:inputText label="Endereço" id="endereco" required="true"
					value="#{controllerServicos.solicitacao.endereco}">
					<f:validator validatorId="nomeValidator" />
				</h:inputText>
				<h:message for="endereco" errorStyle="color:red; display:block" />

				<h:outputLabel value="Telefone: " for="telefone" />
				<h:inputText label="Telefone" id="telefone" required="true"
					value="#{controllerServicos.solicitacao.telefone}">
					<f:validator validatorId="telefoneValidator" />
				</h:inputText>
				<h:message for="telefone" errorStyle="color:red; display:block" />

				<h:outputLabel value="Email: " for="email" />
				<h:inputText label="Email" id="email" required="true"
					value="#{controllerServicos.solicitacao.email}">
					<f:validator validatorId="emailValidator" />
				</h:inputText>
				<h:message for="email" errorStyle="color:red; display:block" />

				<h:outputLabel value="Finalidade de uso: "></h:outputLabel>
				<h:inputTextarea
					value="#{controllerServicos.solicitacao.finalidade}"></h:inputTextarea>
				<br></br>

				<h:outputLabel value="ID da PCD: " for="id_pcd" />
				<h:inputText label="ID_PCD" id="id_pcd" required="true"
					value="#{controllerServicos.solicitacao.ID_PCD}">
					<f:validateLength minimum="4" maximum="6" />
				</h:inputText>
				<h:message for="id_pcd" errorStyle="color:red; display:block" />

				<h:outputLabel value="Nome do sensor: " for="nome_sensor" />
				<h:inputText label="NomeSensor" id="nome_sensor" required="true"
					value="#{controllerServicos.solicitacao.sensores}">
					<f:validator validatorId="nomeValidator" />
				</h:inputText>
				<h:message for="nome_fisico" errorStyle="color:red; display:block" />

				<h:outputLabel value="Período inicial: " for="periodo_inicial" />
				<h:inputText label="PeriodoInicial" id="periodo_inicial"
					required="true"
					value="#{controllerServicos.solicitacao.periodo_inicio}">
					<f:validator validatorId="dataValidator" />
				</h:inputText>
				<h:message for="periodo_inicial"
					errorStyle="color:red; display:block" />

				<h:outputLabel value="Período final: " for="periodo_final" />
				<h:inputText label="PeriodoFinal" id="periodo_final" required="true"
					value="#{controllerServicos.solicitacao.periodo_fim}">
					<f:validator validatorId="dataValidator" />
				</h:inputText>
				<h:message for="periodo_final" errorStyle="color:red; display:block" />

				<br></br>
				<br></br>
				<h:commandButton action="#{controllerServicos.cadastrarSolicitacao}"
					value="Cadastrar"></h:commandButton>
			</h:panelGrid>
		</h:form>

	</f:view>
</body>
	</html>
</jsp:root>