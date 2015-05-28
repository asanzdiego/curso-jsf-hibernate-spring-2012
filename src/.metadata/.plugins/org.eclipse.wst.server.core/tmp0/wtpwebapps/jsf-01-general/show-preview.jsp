<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<html>
<f:view>
	<f:loadBundle basename="MessageResources" var="msg" />
	<head>
	<title><h:outputFormat value="#{msg.preview_title}">
		<f:param value="#{resumeBean.name}" />
	</h:outputFormat></title>
	</head>
	<body text="<h:outputText value="#{resumeBean.fgColor}" />"
		bgcolor="<h:outputText value="#{resumeBean.bgColor}" />">
	<h1 align="CENTER"><h:outputText value="#{resumeBean.name}" /><BR>
	<small><h:outputText value="#{resumeBean.jobTitle}" /></small></h1>
	<h:outputFormat value="#{msg.summary}">
		<f:param value="#{resumeBean.age}" />
		<f:param value="#{resumeBean.jobTitle}" />
	</h:outputFormat>
	<h2>${msg.employmentHistory}</h2>
	Blah, blah, blah, blah. Yadda, yadda, yadda, yadda. Blah, blah, blah,
	blah. Yadda, yadda, yadda, yadda.
	<h2>${msg.education}</h2>
	Blah, blah, blah, blah. Yadda, yadda, yadda, yadda. Blah, blah, blah,
	blah. Yadda, yadda, yadda, yadda.
	<h2>${msg.publications}</h2>
	Blah, blah, blah, blah. Yadda, yadda, yadda, yadda. Blah, blah, blah,
	blah. Yadda, yadda, yadda, yadda.
	</body>
</f:view>
</html>
