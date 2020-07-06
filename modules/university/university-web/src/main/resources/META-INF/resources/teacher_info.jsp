<%@ taglib prefix="liferay-ddm" uri="http://liferay.com/tld/ddm" %>
<%@ page import="com.liferay.portal.kernel.util.ParamUtil" %><%--
  Created by IntelliJ IDEA.
  User: fateme
  Date: 7/5/20
  Time: 3:13 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ include file="init.jsp"%>
<%
    long teacherId = ParamUtil.getLong(request,"teacherId");
    Teacher teacher = TeacherLocalServiceUtil.getTeacher(teacherId);
%>

<liferay-ddm:template-renderer
        className="<%= Teacher.class.getName() %>"
        displayStyle="<%= displayStyle %>"
        displayStyleGroupId="<%= displayStyleGroupId %>"
        entries="teacher"
>


    <div style="box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2); text-align: center; max-width: 500px">
        <img src="img.jpg" alt="John" style="width:300px">
        <h1><%=teacher.getName()%>></h1>
        <p style="color: grey;font-size: 12px;"><%=teacher.getBiography()%></p>

    </div>


</liferay-ddm:template-renderer>

