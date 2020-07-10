<%@ taglib prefix="liferay-ddm" uri="http://liferay.com/tld/ddm" %>
<%@ page import="com.liferay.frontend.taglib.clay.servlet.taglib.util.DropdownItemList" %>
<%@ page import="com.liferay.frontend.taglib.clay.servlet.taglib.util.DropdownItem" %>
<%@ page import="com.liferay.portal.kernel.util.ParamUtil" %>
<%@ page import="com.liferay.portal.kernel.portlet.*" %>
<%@ page import="javax.portlet.*" %>
<%@ include file="/init.jsp" %>




<%--<liferay-portlet:renderURL var="portlet2Url" plid="<%= themeDisplay.getPlid()%>"--%>
<%--						   portletName="<%=TeacherPortletKeys.TEACHER_INFO%>"--%>
<%--						   windowState="<%=LiferayWindowState.MAXIMIZED.toString() %>"--%>
<%--						>--%>
<%--</liferay-portlet:renderURL>--%>
<%--<a href="${portlet2Url}">Portlet 2 Link</a>--%>
<%

	String collegeName; //= ParamUtil.getString(request,"collegeName");
	//if(collegeName == null){
		collegeName = "mathCollege";
	//}
%>


<div>
	<aui:button-row cssClass="">
		<portlet:renderURL var="addTeacherURL">
			<portlet:param name="mvcPath" value="/edit_teacher.jsp"/>
		</portlet:renderURL>
		<aui:button value="Add Teacher" onClick="${addTeacherURL}"  cssClass="btn btn-primary"/>
	</aui:button-row>
</div>

<div align="right" >
	<clay:dropdown-menu

			searchable="true"
			dropdownItems="<%=dropDownDisplayContext.getCollegeDropdownItems()%>"
			label="College"
			itemsIconAlignment="right"
	/>
</div>

</br>

<%

	List<Teacher> teachers = TeacherLocalServiceUtil.getTeachers(collegeName,scopeGroupId);
%>
<liferay-ddm:template-renderer
		className="<%= Teacher.class.getName() %>"
		displayStyle="<%= displayStyle %>"
		displayStyleGroupId="<%= displayStyleGroupId %>"
		entries="<%= teachers %>">



	<%
		Teacher curTeacher = null;
		int numOfTeacher =  teachers.size();
		int numOfCol=3;

		for(int row=0;row<numOfTeacher;row++){
			if (row%numOfCol == 0){

	%>

	<div class="row">

		<%
			for(int col=row;col<(row+numOfCol);col++){
				if(col<numOfTeacher)
				{
					curTeacher = teachers.get(col);

		%>
		<div class="col-md-4">

			<portlet:actionURL var="ipcTeacherId" name="ipcTeacherId">
				<portlet:param name="teacherId" value="<%=String.valueOf(curTeacher.getTeacherId())%>"/>
			</portlet:actionURL>
			<clay:user-card
					name="<%=curTeacher.getName()%>"
					subtitle="<%=curTeacher.getCollege()%>"
					href="${ipcTeacherId}"
					actionDropdownItems=
							"<%=cardsDropdownDisplayContext.getTeacherDropdownItems(curTeacher.getTeacherId())%>"

			/>
		</div>
		<%
				}
			}
		%>


	</div>
	<%
			}
		}
	%>

</liferay-ddm:template-renderer>


<%--<%=portletDisplayDDMTemplateId%>--%>
<%--<c:choose>--%>
<%--	<c:when test="<%= portletDisplayDDMTemplateId > 0 %>">--%>
<%--		<%= PortletDisplayTemplateUtil.renderDDMTemplate(request,response,portletDisplayDDMTemplateId,teachers) ;--%>
<%--		%>--%>
<%--		--%>
<%--	</c:when>--%>
<%--	<c:otherwise>--%>
<%--		<table border="1">--%>
<%--			<tr><th>Name</th><th>city</th></tr>--%>

<%--			<%--%>
<%--				for(Student student:students){%>--%>
<%--			<tr><td><%=student.getName()%></td>--%>
<%--				<td><%=student.getCity()%></td></tr>--%>
<%--			<%} %>--%>
<%--		</table>--%>
<%--	</c:otherwise>--%>
<%--</c:choose>--%>

