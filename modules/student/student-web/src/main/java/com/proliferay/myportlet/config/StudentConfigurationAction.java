package com.proliferay.myportlet.config;

import com.liferay.portal.kernel.portlet.ConfigurationAction;
import com.liferay.portal.kernel.portlet.DefaultConfigurationAction;
import java.util.Map;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletConfig;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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

/**
 *
 * (1) configurationPolicy optional means that the component is created regardless of whether or not the configuration was set
 * (2) The property javax.portlet.name indicates that this configuration is for com_proliferay_portlet_DemoPortlet
 * (3 )This component should be registered as a configuration action class so it should specify service = ConfigurationAction.class
 *  in the @Component annotation.
 *
 */

@Component(
        configurationPid = "com.proliferay.myportlet.config.StudentConfiguration",
        configurationPolicy = ConfigurationPolicy.OPTIONAL, immediate = true,
        property = {
                "javax.portlet.name=com_proliferay_portlet_DemoPortlet"
        },
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



        String city = ParamUtil.getString(actionRequest, "city");
        String unit = ParamUtil.getString(actionRequest, "unit");



        setPreference(actionRequest, "city", city);
        setPreference(actionRequest, "unit", unit);


        super.processAction(portletConfig, actionRequest, actionResponse);
    }

    /**
     *
     * (1)If a method is annoted with @Activate then the method will be called at the time of activation of the component
     *  so that we can perform initialization task
     *
     * (2) This class is annoted with @Component where we have used configurationPid with id com.proliferay.configuration.DemoConfiguration
     * So if we modify any configuration then this method will be called.
     */
    @Activate
    @Modified
    protected void activate(Map<Object, Object> properties) {
        _log.info("#####Calling activate() method######");

        studentConfiguration = Configurable.createConfigurable(StudentConfiguration.class, properties);
        //_demoConfiguration = ConfigurableUtil.createConfigurable(DemoConfiguration.class, properties);
    }

    private static final Log _log = LogFactoryUtil.getLog(StudentConfigurationAction.class);

    private volatile StudentConfiguration studentConfiguration;

}