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
				</h:panelGrid>
				<h:commandButton action="#{homeBean.enviar}" value="ok"/>
				</a4j:region>
			<h:panelGrid columns="2">
				<h:outputText value="Has introducido" />
				<h:outputText value=":" />
				<h:outputText value="Nombre:" />
				<h:outputText id="outputName" value="#{homeBean.name}" />
			</h:panelGrid>
		</h:panelGrid>
	</h:form>
</f:view>
