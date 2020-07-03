package com.proliferay.myportlet.portlet;

import com.liferay.portal.configuration.metatype.bnd.util.ConfigurableUtil;
import com.proliferay.myportlet.config.StudentConfiguration;
import com.proliferay.myportlet.constants.StudentPortletKeys;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import javax.portlet.Portlet;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Modified;

import java.util.Map;

/**
 * @author fateme
 */
@Component(
	immediate = true,
	configurationPid = "com.proliferay.myportlet.config.StudentConfiguration",
	property = {
		"com.liferay.portlet.display-category=student",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=Student",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + StudentPortletKeys.STUDENT,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class StudentPortlet extends MVCPortlet {

	@Activate
	@Modified
	protected void activate(Map<Object, Object> properties) {

		studentConfiguration = ConfigurableUtil.createConfigurable(StudentConfiguration.class, properties);
		//_demoConfiguration = ConfigurableUtil.createConfigurable(DemoConfiguration.class, properties);

	}

	private volatile StudentConfiguration studentConfiguration;
}