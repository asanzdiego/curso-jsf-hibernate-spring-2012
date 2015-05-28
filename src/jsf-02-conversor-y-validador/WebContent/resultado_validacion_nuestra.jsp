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
      <h:panelGrid columns="2" styleClass="gestionUsuariosFormTable"
        headerClass="gestionUsuariosFormHeader"
        footerClass="gestionUsuariosFormFooter"
        columnClasses="gestionUsuariosFormLabels, gestionUsuariosFormInputs"
        width="600">
        <h:outputLabel for="login" value="Nombre" />
        <h:panelGroup>
          <h:outputText id="nombre" styleClass="CajasTexto"
            value="#{gestionUsuariosBean.nombre}" />

        </h:panelGroup>
        <h:outputLabel for="nif" value="Nif" />
        <h:panelGroup>
          <h:outputText id="elNif" styleClass="CajasTexto"
            value="#{gestionUsuariosBean.nif}" />

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
