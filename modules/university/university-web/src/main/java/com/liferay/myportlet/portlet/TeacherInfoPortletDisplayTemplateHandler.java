package com.liferay.myportlet.portlet;

import com.liferay.myportlet.constants.TeacherPortletKeys;
import com.liferay.myportlet.model.Teacher;
import com.liferay.myportlet.fakemodel.UniversityEducation;
import com.liferay.myportlet.fakemodel.UniversityFaculty;
import com.liferay.myportlet.fakemodel.UniversityPerson;
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
                "javax.portlet.name="+ TeacherPortletKeys.TEACHER_INFO_ADT
        },
        service = TemplateHandler.class
)
public class TeacherInfoPortletDisplayTemplateHandler extends BasePortletDisplayTemplateHandler {
    @Override
    public String getClassName() {
        return UniversityPerson.class.getName();
    }

    @Override
    public String getName(Locale locale) {
        return "Teacher Info ADT";
    }

    @Override
    public String getResourceName() {
        return TeacherPortletKeys.TEACHER_INFO;
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
                "universityPersons", List.class, PortletDisplayTemplateConstants.ENTRIES,
                "universityPerson", UniversityPerson.class, "curUniversityPerson", "name");

        //templateVariableGroup.addVariable("teacher",Teacher.class, PortletDisplayTemplateConstants.ENTRY);
        templateVariableGroup.addVariable("universityPerson", UniversityPerson.class, PortletDisplayTemplateConstants.ENTRY);
        templateVariableGroup.addVariable("universityEducation", UniversityEducation.class, "universityEducationEntry");


        return templateVariableGroups;
    }
}
