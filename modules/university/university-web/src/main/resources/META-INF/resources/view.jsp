<%@ taglib prefix="liferay-ddm" uri="http://liferay.com/tld/ddm" %>
<%@ page import="com.liferay.frontend.taglib.clay.servlet.taglib.util.DropdownItemList" %>
<%@ page import="com.liferay.frontend.taglib.clay.servlet.taglib.util.DropdownItem" %>
<%@ page import="javax.portlet.PortletURL" %>
<%@ page import="com.liferay.portal.kernel.util.ParamUtil" %>
<%@ page import="javax.portlet.RenderResponse" %>
<%@ page import="javax.portlet.RenderURL" %>
<%@ include file="/init.jsp" %>



<%

	String collegeName = ParamUtil.getString(request,"collegeName");
	if(collegeName == null){
		collegeName = "mathCollege";
	}
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
<%--<liferay-ddm:template-renderer--%>
<%--		className="<%= Teacher.class.getName() %>"--%>
<%--		displayStyle="<%= displayStyle %>"--%>
<%--		displayStyleGroupId="<%= displayStyleGroupId %>"--%>
<%--		entries="<%= teachers %>">--%>



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

			<portlet:renderURL var="teacherInfoURL">
				<portlet:param name="mvcPath" value="/teacher_info.jsp"/>
				<portlet:param name="teacherId" value="<%=String.valueOf(curTeacher.getTeacherId())%>"/>
			</portlet:renderURL>
			<clay:user-card
					name="<%=curTeacher.getName()%>"
					subtitle="<%=curTeacher.getCollege()%>"
					href="${teacherInfoURL}"
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

<%--</liferay-ddm:template-renderer>--%>


