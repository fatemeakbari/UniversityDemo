package com.proliferay.myportlet.portlet;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.proliferay.myportlet.constants.TeacherPortletKeys;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import javax.portlet.*;


import com.proliferay.myportlet.model.Teacher;
import com.proliferay.myportlet.service.TeacherLocalService;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import java.io.IOException;


/**
 * @author fateme
 */
//@Component(
//	immediate = true,
//	property = {
//		"com.liferay.portlet.display-category=educational",
//		"com.liferay.portlet.header-portlet-css=/css/main.css",
//		"com.liferay.portlet.instanceable=true",
//		"javax.portlet.display-name=Teacher",
//		"javax.portlet.init-param.template-path=/",
//		"javax.portlet.init-param.view-template=/view.jsp",
//		"javax.portlet.name=" + TeacherPortletKeys.TEACHER,
//		"javax.portlet.resource-bundle=content.Language",
//		"javax.portlet.security-role-ref=power-user,user"
//	},
//	service = Portlet.class
//)
public class TeacherPortlet extends MVCPortlet {

//
//	@Reference
//	TeacherLocalService teacherLocalService;
//	@Override
//	public void render(RenderRequest renderRequest, RenderResponse renderResponse) throws IOException, PortletException {
//
//		super.render(renderRequest, renderResponse);
//	}
//
//	@ProcessAction(name = "addTeacher")
//	public void addTeacher(ActionRequest actionRequest, ActionResponse actionResponse) throws IOException {
//
//		ServiceContext serviceContext = null;
//		try {
//			serviceContext = ServiceContextFactory.getInstance(Teacher.class.getName(),actionRequest);
//		} catch (PortalException e) {
//			e.printStackTrace();
//		}
//
//		long teacherId = ParamUtil.getLong(actionRequest, "teacherId");
//		String name = ParamUtil.getString(actionRequest, "name");
//		String emailAddress = ParamUtil.getString(actionRequest, "emailAddress");
//		String biography = ParamUtil.getString(actionRequest, "biography");
//		String college = ParamUtil.getString(actionRequest, "college");
//		String rank = ParamUtil.getString(actionRequest, "rank");
//		String position = ParamUtil.getString(actionRequest, "position");
//		String roomNumber = ParamUtil.getString(actionRequest, "roomNumber");
//		String phoneNumber = ParamUtil.getString(actionRequest, "phoneNumber");
//		String linkedin = ParamUtil.getString(actionRequest, "linkedin");
//		String twitter = ParamUtil.getString(actionRequest, "twitter");
//		String googlePlus = ParamUtil.getString(actionRequest, "googlePlus");
//
//		Teacher teacher = null;
//		try {
//			teacher = teacherLocalService.addTeacher(teacherId,
//					name,
//					emailAddress,
//					biography,
//					college,
//					rank,
//					position,
//					roomNumber,
//					phoneNumber,
//					linkedin,
//					twitter,
//					googlePlus,
//					serviceContext);
//			SessionMessages.add(actionRequest, "Teacher Added");
////			UploadPortletRequest uploadPortalRequest = PortalUtil.getUploadPortletRequest(actionRequest);
////			if(uploadPortalRequest.getSize("offerImage") == 0){
////				SessionErrors.add(actionRequest, "error");
////			}
////			String sourceFileName = uploadPortalRequest.getFileName("offerImage");
////			File file = uploadPortalRequest.getFile("offerImage");
////			file.renameTo(new File(String.valueOf(teacher.getTeacherId())+".jpg"));
////			FileOutputStream outputStream = new FileOutputStream(file);
////			outputStream.w
//		} catch (PortalException e) {
//			SessionErrors.add(actionRequest, "Error");
//			System.out.println("here");
//			e.printStackTrace();
//			actionResponse.sendRedirect("mvcPath", "/edit_teacher.jsp");
//		}
//
//
//	}
}