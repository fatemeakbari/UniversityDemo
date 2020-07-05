<%--
  Created by IntelliJ IDEA.
  User: fateme
  Date: 6/30/20
  Time: 10:58 AM
  To change this template use File | Settings | File Templates.
--%>

<%@ include file="/init.jsp" %>

<%
    List<SelectOption> ranks = new ArrayList<>();
    ranks.add(new SelectOption("Assistant Professor", String.valueOf("assistantProfessor")));
    ranks.add(new SelectOption("Associate Professor", String.valueOf("associateProfessor")));
    ranks.add(new SelectOption("Full Professor", String.valueOf("fullProfessor")));


    List<SelectOption> colleges = new ArrayList<SelectOption>(){
        {
            add(new SelectOption("Math College", String.valueOf("mathCollege")));
            add(new SelectOption("Computer College", String.valueOf("computerCollege")));
            add(new SelectOption("Chemistry College", String.valueOf("chemistryCollege")));
            add(new SelectOption("Mechanic College", String.valueOf("mechanicCollege")));
            add(new SelectOption("Construction College", String.valueOf("constructionCollege")));

        }
    };

    String curPortletNameSpace = themeDisplay.getPortletDisplay().getNamespace();
%>

<portlet:actionURL var="addTeacherURL" name="addTeacher"/>
<portlet:renderURL var="viewURL" >
    <portlet:param name="mvcPath" value="/view.jsp"/>
</portlet:renderURL>

<div size="256">

    <aui:form action="${addTeacherURL}" method="post" enctype="multipart/form-data" >
        <aui:fieldset >

            <aui:input name="teacherId" type="hidden"/>

            <aui:input name="name" label="Name" required="true"/>

            <aui:input label="Email Address" name="emailAddress" type="email" value="test@gmail.com">
                <aui:validator name="required"/>
            </aui:input>


            <%--        <aui:input type="file" name="offerImage" label="Personalize Image" multiple="multiple" accept="image/*" >--%>
            <%--            <aui:validator name="acceptFiles" >'jpg,png,tif,gif,jpeg'</aui:validator>--%>
            <%--        </aui:input>--%>

            <div class="row">

                <div class="col-md-6">
                    <clay:select label="College" name="<%=curPortletNameSpace+"college"%>" options="<%=colleges%>"/>
                </div>
                <div class="col-md-6">
                    <clay:select label="Rank" name="<%=curPortletNameSpace+"rank"%>" options="<%=ranks%>"/>
                </div>
            </div>

            <div class="row" >
                <div class="col-md-6">
                    <aui:input name="position" label="position"/>
                </div>

                <div class="col-md-3">
                    <aui:input name="phoneNumber" label="Phone Number">
                        <aui:validator name="alphanum"/>
                    </aui:input>
                </div>

                <div class="col-md-3">
                    <aui:input name="roomNumber" label="Room Number">
                        <aui:validator name="alphanum"/>
                    </aui:input>
                </div>
            </div>

            <aui:input  name="biography" label="Biogrophy"  type="textarea" />

            <aui:input name="linkedin" label="Linkedin Address"/>
            <aui:input name="twitter" label="Twitter Address"/>
            <aui:input name="googlePlus" label="GooglePlus Address"/>

        </aui:fieldset>

        <aui:button-row>
            <aui:button  value="Save"  type="submit" cssClass="btn btn-success"/>
            <aui:button  value="Cancel" type="cancel" onClick="${viewURL}" cssClass="btn btn-secondary"/>
        </aui:button-row>

    </aui:form>
</div>

