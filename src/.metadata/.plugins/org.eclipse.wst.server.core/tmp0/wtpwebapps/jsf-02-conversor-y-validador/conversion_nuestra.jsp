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

        <h:outputLabel for="login" value="Nombre" />
        <h:panelGroup>
          <h:inputText id="nombre" styleClass="CajasTexto" size="30"
            maxlength="100" value="#{gestionUsuariosBean.nombre}" />
        </h:panelGroup>
        <h:outputLabel for="telefono" value="Numero de telefono" />
        <h:panelGroup>
          <h:inputText id="telefono" styleClass="CajasTexto" size="30"
            maxlength="12" value="#{gestionUsuariosBean.telefono}">
            <f:converter converterId="telefonoConverter" />
          </h:inputText>
        </h:panelGroup>
        <h:panelGroup>
          <h:commandButton action="resultado_conversion_nuestra"
            value="Validar" />
          <f:verbatim>&nbsp;</f:verbatim>
        </h:panelGroup>
      </h:panelGrid>
    </h:form>
  </f:view>
</body>
</html>
