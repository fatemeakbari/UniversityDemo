package com.proliferay.myportlet.portlet;

import com.liferay.portal.kernel.portletdisplaytemplate.BasePortletDisplayTemplateHandler;
import com.liferay.portal.kernel.template.TemplateHandler;
import com.liferay.portal.kernel.template.TemplateVariableGroup;
import com.liferay.portlet.display.template.PortletDisplayTemplateConstants;
import com.proliferay.myportlet.constants.StudentPortletKeys;
import com.proliferay.myportlet.model.DumpStudent;
import org.osgi.service.component.annotations.Component;

import java.util.List;
import java.util.Locale;
import java.util.Map;


@Component(
        immediate = true,
        property = {
                "javax.portlet.name="+ StudentPortletKeys.STUDENT_ADT
        },
        service = TemplateHandler.class
)
public class StudentPortletDisplayTemplateHandler extends BasePortletDisplayTemplateHandler {
    @Override
    public String getClassName() {
        return DumpStudent.class.getName();
    }

    @Override
    public String getName(Locale locale) {
        return "Student ADT";
    }

    @Override
    public String getResourceName() {
        return "Student_Template_Portlet";
    }

    @Override
    public Map<String, TemplateVariableGroup> getTemplateVariableGroups(long classPK,
                                                                        String language,
                                                                        Locale locale) throws Exception {

        Map<String, TemplateVariableGroup> templateVariableGroups =
                super.getTemplateVariableGroups(classPK, language, locale);

        TemplateVariableGroup templateVariableGroup =
                templateVariableGroups.get("fields");



        templateVariableGroup.empty();

        templateVariableGroup.addCollectionVariable(
                "students", List.class, PortletDisplayTemplateConstants.ENTRIES,
                "student", DumpStudent.class, "curStudent", "name");
        return templateVariableGroups;
    }
}
