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
      <h:messages id="messageList" showSummary="true" showDetail="true" />
      <h:panelGrid columns="2" styleClass="gestionUsuariosFormTable"
        headerClass="gestionUsuariosFormHeader"
        footerClass="gestionUsuariosFormFooter"
        columnClasses="gestionUsuariosFormLabels, gestionUsuariosFormInputs"
        width="600">

        <h:outputLabel for="login" value="Tarjeta" />
        <h:panelGroup>
          <h:inputText id="nombre" styleClass="CajasTexto" size="30"
            maxlength="100" value="#{gestionUsuariosBean.nombre}">
            <f:validateLength maximum="50" />
            <t:validateCreditCard visa="true" summaryMessage="Error!!"
              detailMessage="la visa no es valida" />
          </h:inputText>
        </h:panelGroup>
        <h:outputLabel for="edad" value="Edad" />
        <h:panelGroup>
          <h:inputText id="laEdad" converter="#{Integer}"
            styleClass="CajasTexto" size="30" maxlength="3"
            value="#{gestionUsuariosBean.edad}">
            <f:validateLongRange maximum="100" minimum="5" />
          </h:inputText>
        </h:panelGroup>
        <h:outputLabel for="password" value="Password" />
        <h:panelGroup>
          <h:inputSecret id="password" styleClass="CajasTexto" size="30"
            maxlength="12" value="#{gestionUsuariosBean.password}" />
        </h:panelGroup>
        <h:outputLabel for="password" value="Repetición de password" />
        <h:panelGroup>
          <h:inputSecret id="passwordRepe" styleClass="CajasTexto"
            size="30" maxlength="12"
            value="#{gestionUsuariosBean.password}">
            <t:validateEqual for="password" summaryMessage="Error!!"
              detailMessage="las contraseñas no coinciden" />

          </h:inputSecret>
        </h:panelGroup>
        <h:panelGroup>
          <h:commandButton action="resultado_validacion" value="Validar" />
          <f:verbatim>&nbsp;</f:verbatim>
        </h:panelGroup>
      </h:panelGrid>
    </h:form>
  </f:view>
</body>
</html>
