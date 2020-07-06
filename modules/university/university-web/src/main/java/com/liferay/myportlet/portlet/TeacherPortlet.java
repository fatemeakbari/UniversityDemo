package com.liferay.myportlet.portlet;

import com.liferay.myportlet.constants.TeacherPortletKeys;

import com.liferay.myportlet.display.context.CardsDropdownDisplayContext;
import com.liferay.myportlet.display.context.MenuDropdownDisplayContext;
import com.liferay.myportlet.model.Teacher;
import com.liferay.myportlet.service.TeacherLocalService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import javax.portlet.*;

import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import java.io.IOException;

/**
 * @author fateme
 */
@Component(
	immediate = true,
	configurationPid = "com.liferay.myportlet.config.TeacherConfiguration",
	property = {
		"com.liferay.portlet.display-category=university",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=Teacher",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.config-template=/configuration.jsp",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + TeacherPortletKeys.TEACHER,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class TeacherPortlet extends MVCPortlet {

	@Override
	public void doDispatch(
			RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {

		MenuDropdownDisplayContext menuDropdownDisplayContext = new MenuDropdownDisplayContext(renderResponse);

		renderRequest.setAttribute(
				TeacherPortletKeys.MENUS_DISPLAY_CONTEXT, menuDropdownDisplayContext);


		CardsDropdownDisplayContext cardsDropdownDisplayContext = new CardsDropdownDisplayContext(renderResponse);

		renderRequest.setAttribute(TeacherPortletKeys.CARDS_DISPLAY_CONTEXT, cardsDropdownDisplayContext);


		super.doDispatch(renderRequest, renderResponse);
	}

	@ProcessAction(name = "addTeacher")
	public void addTeacher(ActionRequest actionRequest, ActionResponse actionResponse) throws IOException {

		_log.info("inside add teacher");

		ServiceContext serviceContext = null;
		try {
			serviceContext = ServiceContextFactory.getInstance(Teacher.class.getName(),actionRequest);
		} catch (PortalException e) {
			e.printStackTrace();
		}

		long teacherId = ParamUtil.getLong(actionRequest, "teacherId");
		String name = ParamUtil.getString(actionRequest, "name");
		String emailAddress = ParamUtil.getString(actionRequest, "emailAddress");
		String biography = ParamUtil.getString(actionRequest, "biography");
		String college = ParamUtil.getString(actionRequest, "college");
		String rank = ParamUtil.getString(actionRequest, "rank");
		String position = ParamUtil.getString(actionRequest, "position");
		String roomNumber = ParamUtil.getString(actionRequest, "roomNumber");
		String phoneNumber = ParamUtil.getString(actionRequest, "phoneNumber");
		String linkedin = ParamUtil.getString(actionRequest, "linkedin");
		String twitter = ParamUtil.getString(actionRequest, "twitter");
		String googlePlus = ParamUtil.getString(actionRequest, "googlePlus");

		Teacher teacher = null;
		try {
			teacher = teacherLocalService.addTeacher(teacherId,
					name,
					emailAddress,
					biography,
					college,
					rank,
					position,
					roomNumber,
					phoneNumber,
					linkedin,
					twitter,
					googlePlus,
					serviceContext);
			SessionMessages.add(actionRequest, "Teacher Added");

		} catch (PortalException e) {
			SessionErrors.add(actionRequest, "Error");
			System.out.println("here");
			e.printStackTrace();
			actionResponse.sendRedirect("mvcPath", "/edit_teacher.jsp");
		}


	}

	@ProcessAction(name = "deleteTeacher")
	public void deleteTeacher(ActionRequest actionRequest, ActionResponse actionResponse) throws IOException {

		_log.info("inside delete teacher");
		Long teacherId = ParamUtil.getLong(actionRequest, "teacherId");

		System.out.println("teacher Id = "+teacherId);
//		try {
//			teacherLocalService.deleteTeacher(teacherId);
//		} catch (PortalException e) {
//			actionResponse.sendRedirect("mvcPath", "/view.jsp");
//		}
	}

	@Reference
	TeacherLocalService teacherLocalService;
	private Log _log = LogFactoryUtil.getLog(TeacherPortlet.class);




}