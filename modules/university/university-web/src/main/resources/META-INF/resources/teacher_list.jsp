<%--
  Created by IntelliJ IDEA.
  User: fateme
  Date: 7/12/20
  Time: 10:47 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="utf-8"%>

<%@ page import="com.liferay.myportlet.fakemodel.UniversityPerson" %>
<%@ include file="/init.jsp" %>


<%
    List<UniversityPerson> universityPersons =
            (List<UniversityPerson>) renderRequest.getAttribute(TeacherPortletKeys.FAKE_UNIVERSITY_PERSONS);

%>

<liferay-ddm:template-renderer
        className="<%= UniversityPerson.class.getName() %>"
        displayStyle="<%= displayStyle %>"
        displayStyleGroupId="<%= displayStyleGroupId %>"
        entries="<%= universityPersons %>">


</liferay-ddm:template-renderer>