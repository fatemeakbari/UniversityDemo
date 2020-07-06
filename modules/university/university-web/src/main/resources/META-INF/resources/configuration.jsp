<%@ include file="/init.jsp"%>




<%@taglib uri="http://liferay.com/tld/ddm" prefix="liferay-ddm" %>


<%@ page import="com.liferay.portal.kernel.util.Constants" %>


<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<%@ taglib prefix="liferay-ui" uri="http://liferay.com/tld/ui" %>
<%@ taglib prefix="liferay-frontend" uri="http://liferay.com/tld/frontend" %>
<liferay-portlet:actionURL portletConfiguration="<%= true %>" var="configurationActionURL" />

<liferay-portlet:renderURL portletConfiguration="<%= true %>" var="configurationRenderURL" />


<aui:form action="${configurationActionURL}" method="post" name="fm">
    <aui:input name="<%=Constants.CMD%>" type="hidden"
               value="<%=Constants.UPDATE%>" />

    <aui:input name="redirect" type="hidden"
               value="${configurationRenderURL}" />


    <liferay-frontend:fieldset
            collapsible="<%= true %>"
            label="templates"
    >
        <div class="display-template">

            <liferay-ddm:template-selector
                    className="<%= Teacher.class.getName() %>"
                    displayStyle="<%= displayStyle %>"
                    displayStyleGroupId="<%= displayStyleGroupId %>"
                    refreshURL="${configurationRenderURL}"
                    showEmptyOption="<%= true %>"
            />

        </div>
    </liferay-frontend:fieldset>


    <aui:button-row>
        <aui:button type="submit" name="submit" />
    </aui:button-row>
</aui:form>