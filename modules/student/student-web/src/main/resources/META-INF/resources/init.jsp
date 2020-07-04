<%@ page import="com.liferay.portal.kernel.util.GetterUtil" %>
<%@ page import="com.liferay.portal.kernel.util.StringPool" %>
<%@ page import="com.liferay.portal.kernel.portlet.PortletPreferencesFactoryUtil" %>
<%@ page import="com.liferay.portal.kernel.portlet.PortalPreferences" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %><%@
taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %><%@
taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %><%@
taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://liferay.com/tld/security" prefix="liferay-security" %>
<%@ taglib uri="http://liferay.com/tld/util" prefix="liferay-util" %>

<liferay-theme:defineObjects />
<portlet:defineObjects />

<%

    PortalPreferences portalPreferences = PortletPreferencesFactoryUtil.getPortalPreferences(liferayPortletRequest);
    String displayStyle =
            GetterUtil.getString(portletPreferences.getValue("displayStyle", StringPool.BLANK));
    long displayStyleGroupId = GetterUtil.getLong(portletPreferences.getValue("displayStyleGroupId", null), scopeGroupId);

//    long portletDisplayDDMTemplateId = PortletDisplayTemplateUtil.getPortletDisplayTemplateDDMTemplateId
//            (displayStyleGroupId, displayStyle);

    //long portletDisplayDDMTemplateId = PortletDisplayTemplateUtil.getPortletDisplayTemplate().getDDMTemplateGroupId(displayStyleGroupId);
%>

