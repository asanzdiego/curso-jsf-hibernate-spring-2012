<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<html>
<f:view>
	<f:loadBundle basename="MessageResources" var="msg" />
	<head>
	<title>${msg.sameColor_title}</title>
	</head>
	<body>
	<center>
	<table border=5>
		<tr>
			<th>${msg.sameColor_title}</th>
		</tr>
	</table>
	<p /><h:outputFormat value="#{msg.sameColor_message}" escape="false">
		<f:param value="#{resumeBean.fgColor}" />
	</h:outputFormat>
	</center>
	</body>
</f:view>
</html>
