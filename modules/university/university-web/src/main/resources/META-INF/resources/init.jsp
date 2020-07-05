<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %><%@
taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %><%@
taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %><%@
taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>

<%@ taglib uri="http://liferay.com/tld/clay" prefix="clay" %>


<%@ taglib uri="http://liferay.com/tld/frontend" prefix="liferay-frontend" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="" %>
<%@ taglib uri="http://liferay.com/tld/security" prefix="liferay-security" %>


<%@ page import="com.liferay.myportlet.service.TeacherLocalServiceUtil" %>
<%@ page import="com.liferay.myportlet.model.Teacher" %>
<%@ page import="com.liferay.myportlet.display.context.DropDownDisplayContext" %>

<%@ page import="com.liferay.frontend.taglib.clay.servlet.taglib.util.SelectOption" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<liferay-theme:defineObjects />
<portlet:defineObjects />
