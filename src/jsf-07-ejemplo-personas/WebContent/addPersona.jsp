<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />

<f:loadBundle basename="i18n.Mensajes" var="msg"/>
<title>${msg.titulo}</title>
</head>
<body>
<f:view>
<h3><h:messages id="msg" showDetail="true" showSummary="true" infoStyle="color:blue"/></h3>
	<h:form id="pantalla">
		<h:panelGrid columns="3">
			<f:facet name="header">
				<h:outputFormat value="datos de las {0}">
					<f:param value="personas" />
				</h:outputFormat>
			</f:facet>
			<h:outputLabel for="nombre" value="#{msg.nombre}"/>
			<h:inputText id="nombre" value="#{gestionPersonas.PEdicion.nombre}"
				 required="true" valueChangeListener="#{gestionPersonas.oyenteValor}"
				 onchange="javascript:submit();" immediate="true"/>
			<h:message for="nombre"/>
			<h:outputLabel for="edad" value="#{msg['Pantalla.edad']}"/>
			<h:inputText id="edad" value="#{gestionPersonas.PEdicion.edad}" required="true">
				<f:validateLongRange minimum="18"/>
			</h:inputText>
			<h:message for="edad"/>
			<h:outputLabel for="altura" value="Altura :"/>
			<h:inputText id="altura" value="#{gestionPersonas.PEdicion.altura}" required="true"/>
			<h:message for="altura"/>
			
		</h:panelGrid>
		<h:commandLink action="#{gestionPersonas.guardar}" value="add"/>		
	</h:form>
</f:view>
</body>
</html>