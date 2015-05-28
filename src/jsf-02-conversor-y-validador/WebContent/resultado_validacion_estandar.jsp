<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
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

        <h:outputLabel for="login" value="Nombre" />
        <h:panelGroup>
          <h:outputText id="nombre" styleClass="CajasTexto"
            value="#{gestionUsuariosBean.nombre}" />

        </h:panelGroup>
        <h:outputLabel for="edad" value="Edad" />
        <h:panelGroup>
          <h:outputText id="laEdad" styleClass="CajasTexto"
            value="#{gestionUsuariosBean.edad}" />
        </h:panelGroup>
        <h:outputLabel for="password" value="Password" />
        <h:panelGroup>
          <h:outputText id="password" styleClass="CajasTexto"
            value="#{gestionUsuariosBean.password}" />
        </h:panelGroup>
      </h:panelGrid>
      <h:panelGroup>
        <h:commandButton action="home" value="Volver" />
        <f:verbatim>&nbsp;</f:verbatim>
      </h:panelGroup>
    </h:form>
  </f:view>
</body>
</html>
