<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %><%@
taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %><%@
taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %><%@
taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://liferay.com/tld/security" prefix="liferay-security" %>
<%@ taglib uri="http://liferay.com/tld/util" prefix="liferay-util" %>
<%@ page import="javax.portlet.PortletPreferences" %>
<%@ page import="com.liferay.portal.kernel.portlet.PortletPreferencesFactoryUtil" %>
<%@ page import="com.liferay.portal.kernel.util.*" %>
<%@ page import="com.proliferay.myportlet.config.StudentConfiguration" %>
<liferay-theme:defineObjects />

<portlet:defineObjects />



<%
    StudentConfiguration studentConfiguration = (StudentConfiguration) 	renderRequest.getAttribute(StudentConfiguration.class.getName());


    String city;
    String unit;
    if (Validator.isNotNull(studentConfiguration)) {
        city =
                portletPreferences.getValue(
                        "city", studentConfiguration.city());

        unit = portletPreferences.getValue("unit", studentConfiguration.temperatureUnit());
    }else{
        city =	portletPreferences.getValue("city", "");

        unit = portletPreferences.getValue("unit", "");
    }
%>