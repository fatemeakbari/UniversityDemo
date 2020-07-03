package com.proliferay.myportlet.config;

import aQute.bnd.annotation.metatype.Meta;

@Meta.OCD(
        id = "com.proliferay.myportlet.config.StudentConfiguration"
)
public interface StudentConfiguration {

    @Meta.AD(required = false)
    public String city();

    @Meta.AD(required = false)
    public String temperatureUnit();
}
