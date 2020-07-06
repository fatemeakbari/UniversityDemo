package com.liferay.myportlet.config;


import aQute.bnd.annotation.metatype.Meta;
import com.liferay.portal.configuration.metatype.annotations.ExtendedObjectClassDefinition;

@ExtendedObjectClassDefinition(
        scope = ExtendedObjectClassDefinition.Scope.PORTLET_INSTANCE
)
@Meta.OCD(
        id = "com.liferay.myportlet.config.TeacherConfiguration"
)

public interface TeacherConfiguration {

    @Meta.AD(deflt = "", name = "display-style", required = false)
    String displayStyle();

    @Meta.AD(deflt = "0", name = "display-style-group-id", required = false)
    long displayStyleGroupId();
}
