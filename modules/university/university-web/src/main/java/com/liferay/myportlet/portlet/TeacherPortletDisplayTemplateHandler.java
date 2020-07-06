package com.liferay.myportlet.portlet;

import com.liferay.myportlet.constants.TeacherPortletKeys;
import com.liferay.myportlet.model.Teacher;
import com.liferay.portal.kernel.portletdisplaytemplate.BasePortletDisplayTemplateHandler;
import com.liferay.portal.kernel.template.TemplateHandler;
import com.liferay.portal.kernel.template.TemplateVariableGroup;
import com.liferay.portlet.display.template.PortletDisplayTemplateConstants;
import org.osgi.service.component.annotations.Component;

import java.util.List;
import java.util.Locale;
import java.util.Map;


@Component(
        immediate = true,
        property = {
                "javax.portlet.name="+ TeacherPortletKeys.TEACHER_ADT
        },
        service = TemplateHandler.class
)
public class TeacherPortletDisplayTemplateHandler extends BasePortletDisplayTemplateHandler {
    @Override
    public String getClassName() {
        return Teacher.class.getName();
    }

    @Override
    public String getName(Locale locale) {
        return "Teacher ADT";
    }

    @Override
    public String getResourceName() {
        return TeacherPortletKeys.TEACHER;
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
                "teachers", List.class, PortletDisplayTemplateConstants.ENTRIES,
                "teacher", Teacher.class, "curTeacher", "name");

        templateVariableGroup.addVariable("teacher",Teacher.class, PortletDisplayTemplateConstants.ENTRY);

        return templateVariableGroups;
    }
}
