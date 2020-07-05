<%@ page import="com.liferay.frontend.taglib.clay.servlet.taglib.util.DropdownItemList" %>
<%@ page import="com.liferay.frontend.taglib.clay.servlet.taglib.util.DropdownItem" %>
<%@ page import="javax.portlet.PortletURL" %>
<%@ page import="com.liferay.portal.kernel.util.ParamUtil" %>
<%@ include file="/init.jsp" %>
<%

	PortletURL renderURL = renderResponse.createRenderURL();
	renderURL.setProperty("mvcPath", "/jsp.view");
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

<div class="row">
	<div class="col-md-3">
		<clay:user-card
				name="<%=teachers.get(i).getName()%>"
				href="#1"
				imageAlt="thumbnail"
				subtitle="Author Action"

		/>

	</div>
	<c:if test="<%=(i+1)<teachers.size()%>">
		<div class="col-md-3">
			<clay:user-card
					name="<%=teachers.get(i+1).getName()%>"
					subtitle="Author Action"
			/>
		</div>
	</c:if>
	<c:if test="<%=(i+2)<teachers.size()%>">

		<div class="col-md-3">
			<clay:user-card
					name="<%=teachers.get(i+2).getName()%>"
					subtitle="Author Action"
			/>
		</div>
	</c:if>
	<c:if test="<%=(i+3)<teachers.size()%>">
		<div class="col-md-3">
			<clay:image-card
					title="<%=teachers.get(i+3).getName()%>"
					stickerImageAlt="Alt Text"
					stickerLabel="PNG"
					stickerShape="circle"
					stickerStyle="info"
					subtitle="Author Action"
			/>
		</div>
	</c:if>
</div>
<%
		}
	}
%>