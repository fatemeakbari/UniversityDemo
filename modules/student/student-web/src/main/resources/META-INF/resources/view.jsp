<%@ taglib prefix="liferay-ddm" uri="http://liferay.com/tld/ddm" %>
<%@ page import="com.proliferay.myportlet.model.DumpStudent" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ include file="/init.jsp" %>

This is the <b>Location Listing Portlet</b> in View mode.
<%
	List<DumpStudent> students = new ArrayList<DumpStudent>();
	for(int i=1; i<10; i++){
		DumpStudent student = new DumpStudent();
		student.setId(i);
		student.setName("name"+i);
		student.setCity("city"+i);
		students.add(student);
	}
%>
<liferay-ddm:template-renderer
		className="<%= DumpStudent.class.getName() %>"
		displayStyle="<%= displayStyle %>"
		displayStyleGroupId="<%= displayStyleGroupId %>"
		entries="<%= students %>">

	<table border="1">--%>
		<tr><th>Name</th><th>city</th></tr>

		<%
			for(DumpStudent student:students){%>
		<tr><td><%=student.getName()%></td>
			<td><%=student.getCity()%></td></tr>
		<%} %>
	</table>

</liferay-ddm:template-renderer>
<p>display = <%=displayStyle%></p>
<p>display ID = <%=displayStyleGroupId%></p>
<p>scope ID = <%=scopeGroupId%></p>