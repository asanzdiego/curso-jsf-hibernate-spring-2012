<%@ page session="false" contentType="text/html;charset=iso-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<html>
<!--
 * Ejemplo de lista paginada. AUTENTIA
 *      http://www.autentia.com
 */
//-->
<head>
<meta HTTP-EQUIV="Content-Type" CONTENT="text/html;charset=iso-8859-1">
<title>AUTENTIA - TUTORIAL DE LISTADOS</title>
<link rel="stylesheet" type="text/css" href="css/estilos.css">
</head>
<body>
<f:view>
	<h:form>
		<f:loadBundle basename="com.autentia.pruebaTablas.recursos"	var="mensajes" />
		<h:panelGroup id="body">
			<t:dataTable id="data" styleClass="scrollerTable"
				headerClass="standardTable_Header"
				footerClass="standardTable_Header"
				columnClasses="columna_abajoderecha,columna_abajoderecha,columna_abajo"
				var="usuario" value="#{listaUsuariosBean.listaUsuarios}"
				preserveDataModel="false" rows="10">
				<h:column>
					<f:facet name="header">
						<h:outputText value="#{mensajes.listapaginada_login}" />
					</f:facet>
					<h:outputText value="#{usuario.login}" />
				</h:column>

				<h:column>
					<f:facet name="header">
						<h:outputText value="#{mensajes['listapaginada_nombre']}" />
					</f:facet>
					<h:outputText value="#{usuario.nombre}" />
				</h:column>

				<h:column>
					<f:facet name="header">
						<h:outputText value="#{mensajes['listapaginada_perfil']}" />
					</f:facet>
					<h:outputText value="#{usuario.perfil.descripcion}" />
				</h:column>
			</t:dataTable>

			<h:panelGrid columns="1" styleClass="tablapaginacion"
				columnClasses="standardTable_ColumnCentered">
				
				<t:dataScroller id="scroll_1" for="data" fastStep="10"
					paginator="true" paginatorMaxPages="3"
					paginatorTableClass="paginator" styleClass="scroller" 
					paginatorActiveColumnStyle="font-weight:bold;">

					<f:facet name="first">
						<t:graphicImage url="images/arrow-first.gif" border="0" />
					</f:facet>

					<f:facet name="last">
						<t:graphicImage url="images/arrow-last.gif" border="0" />
					</f:facet>

					<f:facet name="previous">
						<t:graphicImage url="images/arrow-previous.gif" border="0" />
					</f:facet>

					<f:facet name="next">
						<t:graphicImage url="images/arrow-next.gif" border="0" />
					</f:facet>

					<f:facet name="fastforward">
						<t:graphicImage url="images/arrow-ff.gif" border="0" />
					</f:facet>

					<f:facet name="fastrewind">
						<t:graphicImage url="images/arrow-fr.gif" border="0" />
					</f:facet>

				</t:dataScroller>

				<t:dataScroller id="scroll_2" for="data" rowsCountVar="rowsCount"
					displayedRowsCountVar="displayedRowsCountVar"
					firstRowIndexVar="firstRowIndex" lastRowIndexVar="lastRowIndex"
					pageCountVar="pageCount" pageIndexVar="pageIndex">
				
					<h:outputFormat value="#{mensajes['listapaginada_info']}" styleClass="standard">
						<f:param value="#{rowsCount}" />
						<f:param value="#{displayedRowsCountVar}" />
						<f:param value="#{firstRowIndex}" />
						<f:param value="#{lastRowIndex}" />
						<f:param value="#{pageIndex}" />
						<f:param value="#{pageCount}" />
					</h:outputFormat>
				</t:dataScroller>
			</h:panelGrid>
		</h:panelGroup>
	</h:form>
</f:view>
</body>
</html>
