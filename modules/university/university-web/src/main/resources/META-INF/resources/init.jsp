<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %><%@
taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %><%@
taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %><%@
taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>

<%@ taglib uri="http://liferay.com/tld/clay" prefix="clay" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="utf-8"%>


<%@ taglib uri="http://liferay.com/tld/frontend" prefix="liferay-frontend" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="" %>
<%@ taglib uri="http://liferay.com/tld/security" prefix="liferay-security" %>


<%@ page import="com.liferay.myportlet.service.TeacherLocalServiceUtil" %>
<%@ page import="com.liferay.myportlet.model.Teacher" %>
<%@ page import="com.liferay.myportlet.display.context.MenuDropdownDisplayContext" %>

<%@ page import="com.liferay.frontend.taglib.clay.servlet.taglib.util.SelectOption" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page import="com.liferay.myportlet.constants.TeacherPortletKeys" %>
<%@ page import="com.liferay.myportlet.display.context.CardsDropdownDisplayContext" %>
<%@ page import="com.liferay.myportlet.service.TeacherLocalService" %>
<%@ page import="com.liferay.portal.kernel.portlet.PortalPreferences" %>
<%@ page import="com.liferay.portal.kernel.portlet.PortletPreferencesFactoryUtil" %>
<%@ page import="com.liferay.portal.kernel.util.GetterUtil" %>
<%@ page import="com.liferay.portal.kernel.util.StringPool" %>
<%@ page import="com.liferay.portal.kernel.util.ParamUtil" %>
<%@ taglib prefix="liferay-ddm" uri="http://liferay.com/tld/ddm" %>
<%@ page import="com.liferay.portal.kernel.util.ParamUtil" %>
<%@ page import="com.liferay.portal.kernel.theme.ThemeDisplay" %>
<%@ page import="com.liferay.portal.kernel.model.Layout" %>
<liferay-theme:defineObjects />
<portlet:defineObjects />

<%
    MenuDropdownDisplayContext dropDownDisplayContext =
            (MenuDropdownDisplayContext) request.getAttribute(TeacherPortletKeys.MENUS_DISPLAY_CONTEXT);

    CardsDropdownDisplayContext cardsDropdownDisplayContext =
            (CardsDropdownDisplayContext) request.getAttribute(TeacherPortletKeys.CARDS_DISPLAY_CONTEXT);

    PortalPreferences portalPreferences = PortletPreferencesFactoryUtil.getPortalPreferences(liferayPortletRequest);
    String displayStyle =
            GetterUtil.getString(portletPreferences.getValue("displayStyle", StringPool.BLANK));
    long displayStyleGroupId = GetterUtil.getLong(portletPreferences.getValue("displayStyleGroupId", null), scopeGroupId);

%>
