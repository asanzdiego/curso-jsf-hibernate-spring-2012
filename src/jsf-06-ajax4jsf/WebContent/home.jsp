<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="https://ajax4jsf.dev.java.net/ajax" prefix="a4j"%>
<f:view>
	<h:form>
		<h:panelGrid columns="2">
			<a4j:region id="inputData">
				<h:panelGrid columns="2">
					<h:outputText value="Nombre:" />
					<h:inputText id="name" value="#{homeBean.name}" required="true" >
						<a4j:support event="onkeyup" reRender="outputName" />
					</h:inputText>
					<h:outputText value="Apellidos:" />
					<h:inputText id="lastName" value="#{homeBean.lastName}"  required="true">
						<a4j:support event="onkeyup" reRender="outputLastname"  />
					</h:inputText>
					<h:outputText value="Aficiones:" />
					<h:selectManyListbox value="#{homeBean.hobbies}">
						<f:selectItems value="#{homeBean.hobbiesItems}" />
						<a4j:support event="onchange" reRender="outputHobbies" />
					</h:selectManyListbox>
				</h:panelGrid>
				<h:commandButton action="#{homeBean.enviar}" value="ok"/>
				<h:panelGrid columns="2">
					<h:outputText value="Estado de la petición: " />
					<a4j:status for="inputData">
						<f:facet name="start">
							<h:graphicImage value="/img/procesando.gif" />
						</f:facet>
						<f:facet name="stop">
							<h:graphicImage value="/img/ok.gif" />
						</f:facet>
					</a4j:status>
				</h:panelGrid>
			</a4j:region>
			<h:panelGrid columns="2">
				<h:outputText value="Has introducido" />
				<h:outputText value=":" />
				<h:outputText value="Nombre:" />
				<h:outputText id="outputName" value="#{homeBean.name}" />
				<h:outputText value="Apellidos:" />
				<h:outputText id="outputLastname" value="#{homeBean.lastName}" />
				<h:outputText value="Aficiones:" />
				<h:outputText id="outputHobbies" value="#{homeBean.hobbies}" />
			</h:panelGrid>
		</h:panelGrid>
		<br />
		<br />
		<a4j:log level="ALL" popup="false" width="1000" height="100" />
	</h:form>
</f:view>
