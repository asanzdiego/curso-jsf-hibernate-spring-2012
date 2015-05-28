<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>

<html>
<head>
<title>TUTORIAL VALIDACIONES/CONVERSIONES</title>
<link rel="stylesheet" type="text/css" href="css/estilos.css">
</head>
<body>
  <f:view>
    <h:form>
      <h:messages id="messageList" styleClass="error" showSummary="true"
        showDetail="true" />
      <h:panelGrid columns="2" styleClass="gestionUsuariosFormTable"
        headerClass="gestionUsuariosFormHeader"
        footerClass="gestionUsuariosFormFooter"
        columnClasses="gestionUsuariosFormLabels, gestionUsuariosFormInputs"
        width="600">
        <!-- Nombre -->
        <h:outputLabel for="login" value="Nombre" />
        <h:panelGroup>
          <h:outputText value="#{gestionUsuariosBean.nombre}" />
        </h:panelGroup>
        <!-- Edad -->
        <h:outputLabel for="edad" value="Edad" />
        <h:panelGroup>
          <h:outputText value="#{gestionUsuariosBean.edad}" />
        </h:panelGroup>
        <!-- telefono -->
        <h:outputLabel for="fechaNacimiento" value="Telefono" />
        <h:panelGroup>
          <h:outputText value="#{gestionUsuariosBean.telefono}" />
        </h:panelGroup>
        <!-- Fecha de nacimiento -->
        <h:outputLabel for="fechaNacimiento" value="Fecha de nacimiento" />
        <h:panelGroup>
          <h:outputText value="#{gestionUsuariosBean.fechaNacimiento}" />
        </h:panelGroup>
        <!-- Sueldo -->
        <h:outputLabel for="sueldo" value="Sueldo" />
        <h:panelGroup>
          <h:outputText value="#{gestionUsuariosBean.sueldo}" />
        </h:panelGroup>
        <h:panelGroup>
          <h:commandButton action="home" value="Volver" />
          <f:verbatim>&nbsp;</f:verbatim>
        </h:panelGroup>
      </h:panelGrid>
    </h:form>
  </f:view>
</body>
</html>
