package com.liferay.myportlet.config;

import com.liferay.myportlet.constants.TeacherPortletKeys;
import com.liferay.portal.configuration.metatype.bnd.util.ConfigurableUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.ConfigurationAction;
import com.liferay.portal.kernel.portlet.DefaultConfigurationAction;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Modified;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletConfig;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;


@Component(
        configurationPid = "com.liferay.myportlet.config.TeacherConfiguration",
        configurationPolicy = ConfigurationPolicy.OPTIONAL, immediate = true,
        property = "javax.portlet.name="+ TeacherPortletKeys.TEACHER,

        service = ConfigurationAction.class
)
public class TeacherConfigurationAction extends DefaultConfigurationAction {

    @Override
    public void include(PortletConfig portletConfig, HttpServletRequest httpServletRequest,
                        HttpServletResponse httpServletResponse) throws Exception {

        httpServletRequest.setAttribute(TeacherConfiguration.class.getName(), teacherConfiguration);

        super.include(portletConfig, httpServletRequest, httpServletResponse);
    }

    @Override
    public void processAction(PortletConfig portletConfig, ActionRequest actionRequest, ActionResponse actionResponse)
            throws Exception {

        _log.info("########process action########");

        //setPreference(actionRequest,"displayStyle",displayStyle);
        super.processAction(portletConfig, actionRequest, actionResponse);
    }


    @Activate
    @Modified
    protected void activate(Map<Object, Object> properties) {
        _log.info("##### Calling activate() method######");

        teacherConfiguration = ConfigurableUtil.createConfigurable(TeacherConfiguration.class, properties);
    }

    private static final Log _log = LogFactoryUtil.getLog(TeacherConfigurationAction.class);

    private volatile TeacherConfiguration teacherConfiguration;

}
