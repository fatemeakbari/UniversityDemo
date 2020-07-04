package com.proliferay.myportlet.config;

import aQute.bnd.annotation.metatype.Meta;

@Meta.OCD(
        id = "com.proliferay.myportlet.config.StudentConfiguration"
)
public interface StudentConfiguration {

    @Meta.AD(deflt = "", name = "display-style", required = false)
    public String displayStyle();

    @Meta.AD(deflt = "0", name = "display-style-group-id", required = false)
    public long displayStyleGroupId();
}
