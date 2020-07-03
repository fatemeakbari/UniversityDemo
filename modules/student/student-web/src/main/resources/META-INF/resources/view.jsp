<%@ include file="/init.jsp" %>

<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page import="com.proliferay.myportlet.model.DumpStudent" %>
<%@ include file="init.jsp" %>

<%
	if(Validator.isNull(city)){
		city ="Not Configured";
	}

	if(Validator.isNull(unit)){
		unit ="Not Configured";
	}

%>

<b>City:</b><%=city%>
<br/>
<b>Unit:</b><%=unit%>




