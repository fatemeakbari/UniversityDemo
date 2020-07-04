package com.proliferay.myportlet.portlet;

import com.liferay.portal.configuration.metatype.bnd.util.ConfigurableUtil;
import com.proliferay.myportlet.config.StudentConfiguration;
import com.proliferay.myportlet.constants.StudentPortletKeys;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Modified;

import java.io.IOException;
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
		"javax.portlet.init-param.config-template=/configuration.jsp",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + StudentPortletKeys.STUDENT,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class StudentPortlet extends MVCPortlet {

	@Override
	public void doView(
			RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {

			_log.info("Render Student");
		 renderRequest.setAttribute(
		 StudentConfiguration.class.getName(),
		 studentConfiguration);

		super.doView(renderRequest, renderResponse);
	}

	@Activate
	@Modified
	protected void activate(Map<Object, Object> properties) {
		_log.info("#####Calling activate() method######");
		studentConfiguration = ConfigurableUtil.createConfigurable(StudentConfiguration.class, properties);

	}

	private volatile StudentConfiguration studentConfiguration;
	private static final Log _log = LogFactoryUtil.getLog(StudentPortlet.class);
}