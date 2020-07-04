package com.proliferay.myportlet.config;

import com.liferay.portal.kernel.portlet.ConfigurationAction;
import com.liferay.portal.kernel.portlet.DefaultConfigurationAction;
import java.util.Map;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletConfig;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.proliferay.myportlet.constants.StudentPortletKeys;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Modified;

import aQute.bnd.annotation.metatype.Configurable;

import com.liferay.portal.configuration.metatype.bnd.util.ConfigurableUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.ConfigurationAction;
import com.liferay.portal.kernel.portlet.DefaultConfigurationAction;
import com.liferay.portal.kernel.util.ParamUtil;



@Component(
        configurationPid = "com.proliferay.myportlet.config.StudentConfiguration",
        configurationPolicy = ConfigurationPolicy.OPTIONAL, immediate = true,
        property = "javax.portlet.name="+ StudentPortletKeys.STUDENT,

        service = ConfigurationAction.class
)
public class StudentConfigurationAction extends DefaultConfigurationAction {

    @Override
    public void include(PortletConfig portletConfig, HttpServletRequest httpServletRequest,
                        HttpServletResponse httpServletResponse) throws Exception {

        httpServletRequest.setAttribute(StudentConfiguration.class.getName(), studentConfiguration);

        super.include(portletConfig, httpServletRequest, httpServletResponse);
    }

    @Override
    public void processAction(PortletConfig portletConfig, ActionRequest actionRequest, ActionResponse actionResponse)
            throws Exception {



//        String city = ParamUtil.getString(actionRequest, "city");
//        String unit = ParamUtil.getString(actionRequest, "unit");
//
//
//
//        setPreference(actionRequest, "city", city);
//        setPreference(actionRequest, "unit", unit);

        String displayStyle = ParamUtil.getString(actionRequest, "displayStyle");
        _log.info("########process action########  display = "+displayStyle);

        setPreference(actionRequest,"displayStyle",displayStyle);
        super.processAction(portletConfig, actionRequest, actionResponse);
    }


    @Activate
    @Modified
    protected void activate(Map<Object, Object> properties) {
        _log.info("#####Calling activate() method######");

        studentConfiguration = ConfigurableUtil.createConfigurable(StudentConfiguration.class, properties);
    }

    private static final Log _log = LogFactoryUtil.getLog(StudentConfigurationAction.class);

    private volatile StudentConfiguration studentConfiguration;

}