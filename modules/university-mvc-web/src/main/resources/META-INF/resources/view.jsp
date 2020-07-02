
<%@ page import="com.proliferay.myportlet.display.context.DropDownDisplayContext" %>
<%@ page import="com.liferay.portal.kernel.util.ParamUtil" %>

<%@ include file="/init.jsp" %>



<%
    DropDownDisplayContext dropDownDisplayContext = new DropDownDisplayContext();
    dropDownDisplayContext.doView(renderRequest,renderResponse);
    String collegeName = (String) request.getAttribute("collegeName");

%>

<%
    if(collegeName == null){
        collegeName = "mathCollege";
    }
%>


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

    if(teachers.size() > 0){


        for(int i=0 ; i<teachers.size();i+=4){
               %>
<div>
</div>
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
