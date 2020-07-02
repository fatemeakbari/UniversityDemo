package com.proliferay.myportlet.portlet;


import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.proliferay.myportlet.constants.TeacherPortletKeys;
import org.osgi.service.component.annotations.Component;

import javax.portlet.Portlet;

@Component(
        immediate = true,
        property = {
                "com.liferay.portlet.display-category=educational",
                "com.liferay.portlet.header-portlet-css=/css/main.css",
                "com.liferay.portlet.instanceable=true",
                "javax.portlet.display-name= DisplayTeacher",
                "javax.portlet.init-param.template-path=/",
                "javax.portlet.init-param.view-template=/view.jsp",
                "javax.portlet.name=" + TeacherPortletKeys.TEACHER_DISPLAY,
                "javax.portlet.resource-bundle=content.Language",
                "javax.portlet.security-role-ref=power-user,user"
        },
        service = Portlet.class
)
public class TeacherDisplayPortlet extends MVCPortlet {
}
