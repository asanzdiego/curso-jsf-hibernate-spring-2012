<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<html>
<head>
<title>TUTORIAL VALIDACIONES/CONVERSIONES</title>
<link rel="stylesheet" type="text/css" href="css/estilos.css" />
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

        <h:outputLabel for="nombre" value="Nombre" />
        <h:inputText id="nombre" styleClass="CajasTexto" size="30"
          maxlength="100" value="#{gestionUsuariosBean.nombre}" />

        <h:outputLabel for="edad" value="Edad" />
        <h:inputText id="edad" converter="javax.faces.Integer"
          styleClass="CajasTexto" size="30" maxlength="3"
          value="#{gestionUsuariosBean.edad}" />

        <h:outputLabel for="fechaNacimiento" value="Fecha de nacimiento" />
        <h:inputText id="fechaNacimiento" styleClass="CajasTexto"
          size="30" maxlength="12"
          value="#{gestionUsuariosBean.fechaNacimiento}">
          <f:convertDateTime pattern="dd/MM/yyyy" />
        </h:inputText>

        <h:outputLabel for="sueldo" value="Sueldo" />
        <h:inputText id="sueldo" styleClass="CajasTexto"
          converter="javax.faces.BigDecimal" size="30" maxlength="15"
          value="#{gestionUsuariosBean.sueldo}" />

        <h:commandButton action="resultado_conversion" value="Validar" />
      </h:panelGrid>
    </h:form>
  </f:view>
</body>
</html>
