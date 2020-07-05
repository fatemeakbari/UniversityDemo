<%@ page import="com.liferay.frontend.taglib.clay.servlet.taglib.util.DropdownItemList" %>
<%@ page import="com.liferay.frontend.taglib.clay.servlet.taglib.util.DropdownItem" %>
<%@ page import="javax.portlet.PortletURL" %>
<%@ page import="com.liferay.portal.kernel.util.ParamUtil" %>
<%@ page import="javax.portlet.RenderResponse" %>
<%@ page import="javax.portlet.RenderURL" %>
<%@ include file="/init.jsp" %>
<%

	PortletURL renderURL = renderResponse.createRenderURL();
	renderURL.addProperty("mvcPath", "/jsp.view");

	PortletURL actionURL = renderResponse.createActionURL();
	actionURL.addProperty("name", "deleteTeacher");



	List<DropdownItem> collegeDropdownItems = new DropdownItemList() {
		{
			add(dropdownItem -> {
				dropdownItem.setHref(renderURL, "collegeName", "mathCollege");
				dropdownItem.setLabel("Math College");
				dropdownItem.setActive(true);
			});

			add(dropdownItem -> {
				dropdownItem.setHref(renderURL, "collegeName", "computerCollege");
				dropdownItem.setLabel("Computer College");
				});

			add(dropdownItem -> {
				dropdownItem.setHref(renderURL, "collegeName", "chemistryCollege");
				dropdownItem.setLabel("Chemistry College");
				});

			add(dropdownItem -> {
				dropdownItem.setHref(renderURL, "collegeName", "mechanicCollege");
				dropdownItem.setLabel("Mechanic College");
				});

			add(dropdownItem -> {
				dropdownItem.setHref(renderURL, "collegeName", "constructionCollege");
				dropdownItem.setLabel("Construction College");
				});
	}

	};


	String collegeName = ParamUtil.getString(request,"collegeName");
	if(collegeName == null){
		collegeName = "mathCollege";
	}
%>
<%!

	public List<DropdownItem> getCartActions(long teacherId){

		List<DropdownItem> cartActions = new DropdownItemList(){
			{
				add(dropdownItem -> {
					dropdownItem.setLabel("edit");
				});
				add(dropdownItem -> {
					dropdownItem.setLabel("delete");
				});
			}
		};

		return cartActions;
	}

	public PortletURL create(RenderResponse renderResponse, long teacherId){
		PortletURL teacherInfoURL = renderResponse.createRenderURL();
		teacherInfoURL.addProperty("mvcPath", "/teacher_info.jsp");
		teacherInfoURL.addProperty("teacherId",String.valueOf(teacherId));

		return teacherInfoURL;
	}


%>

	<portlet:renderURL var="myUrl"> <portlet:param name="jspPage" value="/teacher_info.jsp" /> </portlet:renderURL>

<div align="right" >
	<clay:dropdown-menu

			searchable="true"
			dropdownItems="<%=collegeDropdownItems%>"
			label="College"
			itemsIconAlignment="right"
	/>
</div>

</br>
<%
	List<Teacher> teachers = TeacherLocalServiceUtil.getTeachers(collegeName,scopeGroupId);

	if(teachers.size() > 0){

		for(int i=0 ; i<teachers.size();i+=4){
%>

<%--href="<%=create(renderResponse,teachers.get(i+1).getTeacherId())%>"--%>

<div class="row">
	<div class="col-md-3">
		<clay:user-card
				name="<%=teachers.get(i).getName()%>"
				subtitle="<%=teachers.get(i).getCollege()%>"
				actionDropdownItems="<%=getCartActions(teachers.get(i).getTeacherId())%>"
				href=""

		/>
	</div>
	<c:if test="<%=(i+1)<teachers.size()%>">
		<div class="col-md-3">
			<clay:user-card
					name="<%=teachers.get(i+1).getName()%>"
					subtitle="<%=teachers.get(i+1).getCollege()%>"
					actionDropdownItems="<%=getCartActions(teachers.get(i+1).getTeacherId())%>"


			/>
		</div>
	</c:if>
	<c:if test="<%=(i+2)<teachers.size()%>">

		<div class="col-md-3">
			<clay:user-card
					name="<%=teachers.get(i+2).getName()%>"
					subtitle="<%=teachers.get(i+2).getCollege()%>"
					actionDropdownItems="<%=getCartActions(teachers.get(i+2).getTeacherId())%>"

			/>
		</div>
	</c:if>
	<c:if test="<%=(i+3)<teachers.size()%>">
		<div class="col-md-3">
			<clay:user-card
					name="<%=teachers.get(i+3).getName()%>"
					subtitle="<%=teachers.get(i+3).getCollege()%>"
					actionDropdownItems="<%=getCartActions(teachers.get(i+3).getTeacherId())%>"

			/>
		</div>
	</c:if>
</div>
<%
		}
	}
%>