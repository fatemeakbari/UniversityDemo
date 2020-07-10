package com.liferay.myportlet.portlet;


import com.liferay.myportlet.constants.TeacherPortletKeys;
import com.liferay.myportlet.display.context.FakeUniversityPerson;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.util.ParamUtil;

import org.osgi.service.component.annotations.Component;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import java.io.IOException;

@Component(
        immediate = true,
        configurationPid = "com.liferay.myportlet.config.TeacherConfiguration",
        property = {
                "com.liferay.portlet.display-category=university",
                "com.liferay.portlet.header-portlet-css=/css/style.min.css",

                "com.liferay.portlet.instanceable=true",
                "javax.portlet.display-name=Teacher Info",
                "javax.portlet.init-param.template-path=/",
                "javax.portlet.init-param.config-template=/configuration.jsp",
                "javax.portlet.init-param.view-template=/bio.jsp",
                "javax.portlet.name=" + TeacherPortletKeys.TEACHER_INFO,
                "javax.portlet.resource-bundle=content.Language",
                "com.liferay.portlet.add-default-resource=true",
                "javax.portlet.supported-public-render-parameter=teacherId"

        },
        service = Portlet.class
)
public class TeacherInfoPortlet extends MVCPortlet {

        @Override
        public void doView(RenderRequest renderRequest,
                           RenderResponse renderResponse) throws IOException, PortletException {

                long teacherId = ParamUtil.getLong(renderRequest,"teacherId");
                renderRequest.setAttribute("teacherId", teacherId);

                FakeUniversityPerson fakeUniversityPerson = new FakeUniversityPerson();
                renderRequest.setAttribute(TeacherPortletKeys.FAKE_UNIVERSITY_PERSONS, fakeUniversityPerson.getUniversityPersons());

                super.doView(renderRequest, renderResponse);
        }
}
