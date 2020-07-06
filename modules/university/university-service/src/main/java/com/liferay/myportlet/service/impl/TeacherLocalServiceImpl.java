/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.myportlet.service.impl;

import com.liferay.myportlet.exception.NoSuchTeacherException;
import com.liferay.myportlet.exception.TeacherCollegeException;
import com.liferay.myportlet.exception.TeacherEmailAddressException;
import com.liferay.myportlet.exception.TeacherNameException;
import com.liferay.myportlet.model.Teacher;
import com.liferay.myportlet.service.base.TeacherLocalServiceBaseImpl;
import com.liferay.portal.aop.AopService;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.Validator;
import org.osgi.service.component.annotations.Component;

import java.util.Date;
import java.util.List;

/**
 * The implementation of the teacher local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>com.liferay.myportlet.service.TeacherLocalService</code> interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TeacherLocalServiceBaseImpl
 */
@Component(
	property = "model.class.name=com.liferay.myportlet.model.Teacher",
	service = AopService.class
)
public class TeacherLocalServiceImpl extends TeacherLocalServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Use <code>com.liferay.myportlet.service.TeacherLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.liferay.myportlet.service.TeacherLocalServiceUtil</code>.
	 */

	public Teacher addTeacher(long teacherId,
							  String name,
							  String emailAddress,
							  String biography,
							  String college,
							  String rank,
							  String position,
							  String roomNumber,
							  String phoneNumber,
							  String linkedinAddress,
							  String twitterAddress,
							  String googlePlusAddress,
							  ServiceContext serviceContext) throws PortalException {

		validate(college, name, emailAddress);

		long groupId = serviceContext.getScopeGroupId();


		long userId = serviceContext.getUserId();
		User user = userLocalService.getUser(userId);
		Date now = new Date();

		Teacher teacher;
		if(teacherId > 0 ){
			teacher = teacherLocalService.getTeacher(teacherId);
		}
		else{

			teacherId = counterLocalService.increment(Teacher.class.getName());
			teacher = teacherLocalService.createTeacher(teacherId);
		}


		teacher.setUserId(userId);
		teacher.setGroupId(groupId);
		teacher.setCompanyId(user.getCompanyId());
		teacher.setUserName(user.getFullName());
		teacher.setCreateDate(serviceContext.getCreateDate(now));
		teacher.setModifiedDate(serviceContext.getModifiedDate(now));
		teacher.setExpandoBridgeAttributes(serviceContext);

		teacher.setCollege(college);
		teacher.setName(name);
		teacher.setRank(rank);
		teacher.setPosition(position);
		teacher.setRoomNumber(roomNumber);
		teacher.setPhoneNumber(phoneNumber);
		teacher.setEmailAddress(emailAddress);
		teacher.setBiography(biography);
		teacher.setTwitterAddress(twitterAddress);
		teacher.setGooglePlusAddress(googlePlusAddress);
		teacher.setLinkedinAddress(linkedinAddress);


		teacherLocalService.updateTeacher(teacher);
		return teacher;
	}


	public Teacher getTeacher(long teacherId) throws NoSuchTeacherException {

		return teacherPersistence.findByPrimaryKey(teacherId);

	}


	public List<Teacher> getTeachers(String college, long groupId){

		return teacherPersistence.findByCollege(groupId, college);
	}

	public List<Teacher> getTeachers(String college, long groupId, int start, int end){

		return teacherPersistence.findByCollege(groupId, college,start,end);
	}

	public Integer getTeachersCount(long groupId, String college){
		return teacherPersistence.countByCollege(groupId,college);
	}

	public Integer getTeacherCount(long groupId){
		return teacherPersistence.countByGroupId(groupId);
	}

	public Teacher deleteTeacher(long teacherId) throws PortalException {
		Teacher teacher = teacherLocalService.getTeacher(teacherId);
		teacherLocalService.deleteTeacher(teacher);
		return teacher;
	}

	public Teacher deleteTeacher(Teacher teacher){
		teacherLocalService.deleteTeacher(teacher);
		return teacher;
	}

	public void validate(String college, String name, String emailAddress) throws PortalException {
		if(Validator.isNull(college)){
			throw new TeacherCollegeException("The college must not be empty");
		}
		if(Validator.isNull(college)){
			throw new TeacherNameException("The college must not be empty");
		}
		if(!Validator.isEmailAddress(emailAddress)){
			throw new TeacherEmailAddressException("The email address must be valid");
		}
	}
}