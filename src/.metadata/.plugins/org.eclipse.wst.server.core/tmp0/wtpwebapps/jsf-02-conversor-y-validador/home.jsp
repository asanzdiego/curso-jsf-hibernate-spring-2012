<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<html>
<head>
<title>Tutorial de Conversiones y validaciones</title>
</head>
<body>
  <f:view>
    <h:outputLink value="conversion_estandar.faces">
      <f:verbatim>Conversión estándar</f:verbatim>
    </h:outputLink>
    <br />
    <h:outputLink value="conversion_nuestra.faces">
      <f:verbatim>Nuestra conversión</f:verbatim>
    </h:outputLink>
    <br />
    <br />
    <h:outputLink value="validacion_estandar.faces">
      <f:verbatim>Validación estándar</f:verbatim>
    </h:outputLink>
    <br />
    <h:outputLink value="validacion_nuestra.faces">
      <f:verbatim>Nuestra validación</f:verbatim>
    </h:outputLink>
    <br />
    <br />
  </f:view>
</body>
</html>
