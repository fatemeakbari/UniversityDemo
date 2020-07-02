<%--
  Created by IntelliJ IDEA.
  User: fateme
  Date: 7/2/20
  Time: 10:02 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ include file="/init.jsp" %>
<div>
    <aui:button-row cssClass="">
        <portlet:renderURL var="addTeacherURL">
            <portlet:param name="mvcPath" value="/edit_teacher.jsp"/>
        </portlet:renderURL>
        <aui:button value="Add Teacher" onClick="${addTeacherURL}"  cssClass="btn btn-primary"/>
    </aui:button-row>
</div>

