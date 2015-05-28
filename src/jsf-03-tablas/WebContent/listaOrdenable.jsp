<%@ page session="false" contentType="text/html;charset=utf-8"%>

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
    <f:loadBundle basename="com.autentia.pruebaTablas.recursos" var="mensajes"/>

    <h:panelGroup id="body">    

        <t:dataTable id="data"

                styleClass="scrollerTable"

                headerClass="standardTable_Header"

                footerClass="standardTable_Header"

                rowClasses="standardTable_Row1,standardTable_Row2"

                columnClasses="columna_abajoderecha,columna_abajoderecha,columna_abajo"

                var="usuario"

                value="#{listaUsuariosBean.listaUsuarios}"

                sortColumn="#{listaUsuariosBean.sort}"

               sortAscending="#{listaUsuariosBean.ascendente}"

               preserveDataModel="true"

              preserveSort="true"

           >

           

           <h:column>

            <f:facet name="header">

                <t:commandSortHeader columnName="login" arrow="false">

                    <f:facet name="ascending">

                        <t:graphicImage value="images/ascending-arrow.gif" rendered="true" 

                                                   border="0"/>

                    </f:facet>

                    <f:facet name="descending">

                        <t:graphicImage value="images/descending-arrow.gif" rendered="true" 

                                                    border="0"/>

                    </f:facet>

                    <h:outputText value="#{mensajes['listapaginada_login']}" />

                </t:commandSortHeader>

            </f:facet>

            <h:outputText value="#{usuario.login}" />           

          </h:column>

           

           <h:column>

            <f:facet name="header">

                <t:commandSortHeader columnName="nombre" arrow="false">

                    <f:facet name="ascending">

                        <t:graphicImage value="images/ascending-arrow.gif" rendered="true" border="0"/>

                    </f:facet>

                    <f:facet name="descending">

                        <t:graphicImage value="images/descending-arrow.gif" rendered="true" border="0"/>

                    </f:facet>

                    <h:outputText value="#{mensajes['listapaginada_nombre']}" />

                </t:commandSortHeader>

            </f:facet>

            <h:outputText value="#{usuario.nombre}" />           

          </h:column>

 

           <h:column>

            <f:facet name="header">

                <t:commandSortHeader columnName="perfil" arrow="false">

                    <f:facet name="ascending">

                        <t:graphicImage value="images/ascending-arrow.gif" rendered="true" border="0"/>

                    </f:facet>

                    <f:facet name="descending">

                        <t:graphicImage value="images/descending-arrow.gif" rendered="true" border="0"/>

                    </f:facet>

                    <h:outputText value="#{mensajes['listapaginada_perfil']}" />

                </t:commandSortHeader>

            </f:facet>

            <h:outputText value="#{usuario.perfil.descripcion}" />           

          </h:column>

          

          <h:column>

            <f:facet name="header">

                <t:commandSortHeader columnName="edad" arrow="false">

                    <f:facet name="ascending">

                        <t:graphicImage value="images/ascending-arrow.gif" rendered="true" border="0"/>

                    </f:facet>

                    <f:facet name="descending">

                        <t:graphicImage value="images/descending-arrow.gif" rendered="true" border="0"/>

                    </f:facet>

                    <h:outputText value="#{mensajes['listapaginada_edad']}" />

                </t:commandSortHeader>

            </f:facet>

            <h:outputText value="#{usuario.edad}" />           

          </h:column>

          

          <h:column>

            <f:facet name="header">

                <t:commandSortHeader columnName="fecha" arrow="false">

                    <f:facet name="ascending">

                        <t:graphicImage value="images/ascending-arrow.gif" rendered="true" border="0"/>

                    </f:facet>

                    <f:facet name="descending">

                        <t:graphicImage value="images/descending-arrow.gif" rendered="true" border="0"/>

                    </f:facet>

                    <h:outputText value="#{mensajes['listapaginada_fecha']}" />

                </t:commandSortHeader>

            </f:facet>

            <h:outputText value="#{usuario.fechaNacimiento}" />           

          </h:column>

        </t:dataTable>

    </h:panelGroup>        
</h:form>
</f:view>

</body>

</html>

