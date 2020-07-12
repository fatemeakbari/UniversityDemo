<%@ page import="com.liferay.myportlet.fakemodel.UniversityPerson" %><%--&lt;%&ndash;--%>
<%--  Created by IntelliJ IDEA.--%>
<%--  User: fateme--%>
<%--  Date: 7/8/20--%>
<%--  Time: 8:03 AM--%>
<%--  To change this template use File | Settings | File Templates.--%>
<%--&ndash;%&gt;--%>


<%@include file="init.jsp"%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="utf-8"%>

<%
    List<UniversityPerson> universityPersons =
            (List<UniversityPerson>) renderRequest.getAttribute(TeacherPortletKeys.FAKE_UNIVERSITY_PERSONS);
    //Long teacherId = ParamUtil.getLong(renderRequest,"teacherId");

 //   if(teacherId > 0){
//        Teacher teacher = TeacherLocalServiceUtil.getTeacher(teacherId);
//        List<Teacher> teachers = new ArrayList<>();
//        teachers.add(teacher);

    int universityPersonId = 1;
    UniversityPerson universityPerson = universityPersons.get(universityPersonId);
%>

<liferay-ddm:template-renderer
        className="<%= UniversityPerson.class.getName() %>"
        displayStyle="<%= displayStyle %>"
        displayStyleGroupId="<%= displayStyleGroupId %>"
        entries="<%= universityPersons %>">


</liferay-ddm:template-renderer>

<%--<%--%>

<%--    }--%>

<%--%>--%>

