<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<html>
<f:view>
	<f:loadBundle basename="MessageResources" var="msg" />
	<head>
	<title>${msg.customize_title}</title>
	</head>
	<body>
	<center>
	<table BORDER=5>
		<tr>
			<th>${msg.customize_title}</th>
		</tr>
	</table>
	<p /><h:form>
		<h:outputLabel for="changeColorMode" value="#{msg.changeColorMode}" />
		<h:selectBooleanCheckbox id="changeColorMode"
						valueChangeListener="#{resumeBean.changeColorMode}" 
						disabled="#{!resumeBean.colorSupported}"
						immediate="true"
						onchange="submit()" />
		<br />
		<h:panelGrid columns="2">
			<h:outputLabel for="fgColor" value="#{msg.fgColor}" />
			<h:selectOneMenu id="fgColor"
						value="#{resumeBean.fgColor}"
						disabled="#{!resumeBean.colorSupported}">
				<f:selectItems value="#{resumeBean.availableColors}" />
				
			</h:selectOneMenu>
			<h:outputLabel for="bgColor" value="#{msg.bgColor}" />
			<h:selectOneMenu id="bgColor" 
						value="#{resumeBean.bgColor}"
						disabled="#{!resumeBean.colorSupported}">
				<f:selectItems value="#{resumeBean.availableColors}" />
			</h:selectOneMenu>
		</h:panelGrid>
		<h:commandButton value="#{resumeBean.colorSupportLabel}"
						actionListener="#{resumeBean.toggleColorSupport}" 
						immediate="true" />
		<br />
		<br />
		<br />
		<hr width="25%" />
		<h:panelGrid id="i5" columns="2">
			<h:outputLabel for="name" value="#{msg.name}" />
			<h:inputText id="name" value="#{resumeBean.name}" required="true" />
			<h:outputLabel for="age" value="#{msg.age}" />
			<h:inputText id="age" value="#{resumeBean.age}" required="true">
				<f:validateLongRange minimum="16" maximum="64" />
			</h:inputText>
			<h:outputLabel for="jobTitle" value="#{msg.jobTitle}" />
			<h:inputText id="jobTitle" value="#{resumeBean.jobTitle}" required="true" />
		</h:panelGrid>
		<h:messages showSummary="true" showDetail="true"  />
		<hr />
		<h:commandButton value="#{msg.showPreview}"	action="#{resumeBean.showPreview}" />
	</h:form>
	</center>
	</body>
</f:view>
</html>
