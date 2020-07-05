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

package com.liferay.myportlet.model;

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Teacher}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Teacher
 * @generated
 */
public class TeacherWrapper
	extends BaseModelWrapper<Teacher>
	implements ModelWrapper<Teacher>, Teacher {

	public TeacherWrapper(Teacher teacher) {
		super(teacher);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("teacherId", getTeacherId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("status", getStatus());
		attributes.put("statusByUserId", getStatusByUserId());
		attributes.put("statusByUserName", getStatusByUserName());
		attributes.put("statusDate", getStatusDate());
		attributes.put("name", getName());
		attributes.put("biography", getBiography());
		attributes.put("college", getCollege());
		attributes.put("rank", getRank());
		attributes.put("position", getPosition());
		attributes.put("roomNumber", getRoomNumber());
		attributes.put("phoneNumber", getPhoneNumber());
		attributes.put("emailAddress", getEmailAddress());
		attributes.put("twitterAddress", getTwitterAddress());
		attributes.put("googlePlusAddress", getGooglePlusAddress());
		attributes.put("linkedinAddress", getLinkedinAddress());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long teacherId = (Long)attributes.get("teacherId");

		if (teacherId != null) {
			setTeacherId(teacherId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		Long statusByUserId = (Long)attributes.get("statusByUserId");

		if (statusByUserId != null) {
			setStatusByUserId(statusByUserId);
		}

		String statusByUserName = (String)attributes.get("statusByUserName");

		if (statusByUserName != null) {
			setStatusByUserName(statusByUserName);
		}

		Date statusDate = (Date)attributes.get("statusDate");

		if (statusDate != null) {
			setStatusDate(statusDate);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String biography = (String)attributes.get("biography");

		if (biography != null) {
			setBiography(biography);
		}

		String college = (String)attributes.get("college");

		if (college != null) {
			setCollege(college);
		}

		String rank = (String)attributes.get("rank");

		if (rank != null) {
			setRank(rank);
		}

		String position = (String)attributes.get("position");

		if (position != null) {
			setPosition(position);
		}

		String roomNumber = (String)attributes.get("roomNumber");

		if (roomNumber != null) {
			setRoomNumber(roomNumber);
		}

		String phoneNumber = (String)attributes.get("phoneNumber");

		if (phoneNumber != null) {
			setPhoneNumber(phoneNumber);
		}

		String emailAddress = (String)attributes.get("emailAddress");

		if (emailAddress != null) {
			setEmailAddress(emailAddress);
		}

		String twitterAddress = (String)attributes.get("twitterAddress");

		if (twitterAddress != null) {
			setTwitterAddress(twitterAddress);
		}

		String googlePlusAddress = (String)attributes.get("googlePlusAddress");

		if (googlePlusAddress != null) {
			setGooglePlusAddress(googlePlusAddress);
		}

		String linkedinAddress = (String)attributes.get("linkedinAddress");

		if (linkedinAddress != null) {
			setLinkedinAddress(linkedinAddress);
		}
	}

	/**
	 * Returns the biography of this teacher.
	 *
	 * @return the biography of this teacher
	 */
	@Override
	public String getBiography() {
		return model.getBiography();
	}

	/**
	 * Returns the college of this teacher.
	 *
	 * @return the college of this teacher
	 */
	@Override
	public String getCollege() {
		return model.getCollege();
	}

	/**
	 * Returns the company ID of this teacher.
	 *
	 * @return the company ID of this teacher
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this teacher.
	 *
	 * @return the create date of this teacher
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the email address of this teacher.
	 *
	 * @return the email address of this teacher
	 */
	@Override
	public String getEmailAddress() {
		return model.getEmailAddress();
	}

	/**
	 * Returns the google plus address of this teacher.
	 *
	 * @return the google plus address of this teacher
	 */
	@Override
	public String getGooglePlusAddress() {
		return model.getGooglePlusAddress();
	}

	/**
	 * Returns the group ID of this teacher.
	 *
	 * @return the group ID of this teacher
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the linkedin address of this teacher.
	 *
	 * @return the linkedin address of this teacher
	 */
	@Override
	public String getLinkedinAddress() {
		return model.getLinkedinAddress();
	}

	/**
	 * Returns the modified date of this teacher.
	 *
	 * @return the modified date of this teacher
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the name of this teacher.
	 *
	 * @return the name of this teacher
	 */
	@Override
	public String getName() {
		return model.getName();
	}

	/**
	 * Returns the phone number of this teacher.
	 *
	 * @return the phone number of this teacher
	 */
	@Override
	public String getPhoneNumber() {
		return model.getPhoneNumber();
	}

	/**
	 * Returns the position of this teacher.
	 *
	 * @return the position of this teacher
	 */
	@Override
	public String getPosition() {
		return model.getPosition();
	}

	/**
	 * Returns the primary key of this teacher.
	 *
	 * @return the primary key of this teacher
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the rank of this teacher.
	 *
	 * @return the rank of this teacher
	 */
	@Override
	public String getRank() {
		return model.getRank();
	}

	/**
	 * Returns the room number of this teacher.
	 *
	 * @return the room number of this teacher
	 */
	@Override
	public String getRoomNumber() {
		return model.getRoomNumber();
	}

	/**
	 * Returns the status of this teacher.
	 *
	 * @return the status of this teacher
	 */
	@Override
	public int getStatus() {
		return model.getStatus();
	}

	/**
	 * Returns the status by user ID of this teacher.
	 *
	 * @return the status by user ID of this teacher
	 */
	@Override
	public long getStatusByUserId() {
		return model.getStatusByUserId();
	}

	/**
	 * Returns the status by user name of this teacher.
	 *
	 * @return the status by user name of this teacher
	 */
	@Override
	public String getStatusByUserName() {
		return model.getStatusByUserName();
	}

	/**
	 * Returns the status by user uuid of this teacher.
	 *
	 * @return the status by user uuid of this teacher
	 */
	@Override
	public String getStatusByUserUuid() {
		return model.getStatusByUserUuid();
	}

	/**
	 * Returns the status date of this teacher.
	 *
	 * @return the status date of this teacher
	 */
	@Override
	public Date getStatusDate() {
		return model.getStatusDate();
	}

	/**
	 * Returns the teacher ID of this teacher.
	 *
	 * @return the teacher ID of this teacher
	 */
	@Override
	public long getTeacherId() {
		return model.getTeacherId();
	}

	/**
	 * Returns the twitter address of this teacher.
	 *
	 * @return the twitter address of this teacher
	 */
	@Override
	public String getTwitterAddress() {
		return model.getTwitterAddress();
	}

	/**
	 * Returns the user ID of this teacher.
	 *
	 * @return the user ID of this teacher
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this teacher.
	 *
	 * @return the user name of this teacher
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this teacher.
	 *
	 * @return the user uuid of this teacher
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this teacher.
	 *
	 * @return the uuid of this teacher
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	/**
	 * Returns <code>true</code> if this teacher is approved.
	 *
	 * @return <code>true</code> if this teacher is approved; <code>false</code> otherwise
	 */
	@Override
	public boolean isApproved() {
		return model.isApproved();
	}

	/**
	 * Returns <code>true</code> if this teacher is denied.
	 *
	 * @return <code>true</code> if this teacher is denied; <code>false</code> otherwise
	 */
	@Override
	public boolean isDenied() {
		return model.isDenied();
	}

	/**
	 * Returns <code>true</code> if this teacher is a draft.
	 *
	 * @return <code>true</code> if this teacher is a draft; <code>false</code> otherwise
	 */
	@Override
	public boolean isDraft() {
		return model.isDraft();
	}

	/**
	 * Returns <code>true</code> if this teacher is expired.
	 *
	 * @return <code>true</code> if this teacher is expired; <code>false</code> otherwise
	 */
	@Override
	public boolean isExpired() {
		return model.isExpired();
	}

	/**
	 * Returns <code>true</code> if this teacher is inactive.
	 *
	 * @return <code>true</code> if this teacher is inactive; <code>false</code> otherwise
	 */
	@Override
	public boolean isInactive() {
		return model.isInactive();
	}

	/**
	 * Returns <code>true</code> if this teacher is incomplete.
	 *
	 * @return <code>true</code> if this teacher is incomplete; <code>false</code> otherwise
	 */
	@Override
	public boolean isIncomplete() {
		return model.isIncomplete();
	}

	/**
	 * Returns <code>true</code> if this teacher is pending.
	 *
	 * @return <code>true</code> if this teacher is pending; <code>false</code> otherwise
	 */
	@Override
	public boolean isPending() {
		return model.isPending();
	}

	/**
	 * Returns <code>true</code> if this teacher is scheduled.
	 *
	 * @return <code>true</code> if this teacher is scheduled; <code>false</code> otherwise
	 */
	@Override
	public boolean isScheduled() {
		return model.isScheduled();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the biography of this teacher.
	 *
	 * @param biography the biography of this teacher
	 */
	@Override
	public void setBiography(String biography) {
		model.setBiography(biography);
	}

	/**
	 * Sets the college of this teacher.
	 *
	 * @param college the college of this teacher
	 */
	@Override
	public void setCollege(String college) {
		model.setCollege(college);
	}

	/**
	 * Sets the company ID of this teacher.
	 *
	 * @param companyId the company ID of this teacher
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this teacher.
	 *
	 * @param createDate the create date of this teacher
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the email address of this teacher.
	 *
	 * @param emailAddress the email address of this teacher
	 */
	@Override
	public void setEmailAddress(String emailAddress) {
		model.setEmailAddress(emailAddress);
	}

	/**
	 * Sets the google plus address of this teacher.
	 *
	 * @param googlePlusAddress the google plus address of this teacher
	 */
	@Override
	public void setGooglePlusAddress(String googlePlusAddress) {
		model.setGooglePlusAddress(googlePlusAddress);
	}

	/**
	 * Sets the group ID of this teacher.
	 *
	 * @param groupId the group ID of this teacher
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the linkedin address of this teacher.
	 *
	 * @param linkedinAddress the linkedin address of this teacher
	 */
	@Override
	public void setLinkedinAddress(String linkedinAddress) {
		model.setLinkedinAddress(linkedinAddress);
	}

	/**
	 * Sets the modified date of this teacher.
	 *
	 * @param modifiedDate the modified date of this teacher
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the name of this teacher.
	 *
	 * @param name the name of this teacher
	 */
	@Override
	public void setName(String name) {
		model.setName(name);
	}

	/**
	 * Sets the phone number of this teacher.
	 *
	 * @param phoneNumber the phone number of this teacher
	 */
	@Override
	public void setPhoneNumber(String phoneNumber) {
		model.setPhoneNumber(phoneNumber);
	}

	/**
	 * Sets the position of this teacher.
	 *
	 * @param position the position of this teacher
	 */
	@Override
	public void setPosition(String position) {
		model.setPosition(position);
	}

	/**
	 * Sets the primary key of this teacher.
	 *
	 * @param primaryKey the primary key of this teacher
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the rank of this teacher.
	 *
	 * @param rank the rank of this teacher
	 */
	@Override
	public void setRank(String rank) {
		model.setRank(rank);
	}

	/**
	 * Sets the room number of this teacher.
	 *
	 * @param roomNumber the room number of this teacher
	 */
	@Override
	public void setRoomNumber(String roomNumber) {
		model.setRoomNumber(roomNumber);
	}

	/**
	 * Sets the status of this teacher.
	 *
	 * @param status the status of this teacher
	 */
	@Override
	public void setStatus(int status) {
		model.setStatus(status);
	}

	/**
	 * Sets the status by user ID of this teacher.
	 *
	 * @param statusByUserId the status by user ID of this teacher
	 */
	@Override
	public void setStatusByUserId(long statusByUserId) {
		model.setStatusByUserId(statusByUserId);
	}

	/**
	 * Sets the status by user name of this teacher.
	 *
	 * @param statusByUserName the status by user name of this teacher
	 */
	@Override
	public void setStatusByUserName(String statusByUserName) {
		model.setStatusByUserName(statusByUserName);
	}

	/**
	 * Sets the status by user uuid of this teacher.
	 *
	 * @param statusByUserUuid the status by user uuid of this teacher
	 */
	@Override
	public void setStatusByUserUuid(String statusByUserUuid) {
		model.setStatusByUserUuid(statusByUserUuid);
	}

	/**
	 * Sets the status date of this teacher.
	 *
	 * @param statusDate the status date of this teacher
	 */
	@Override
	public void setStatusDate(Date statusDate) {
		model.setStatusDate(statusDate);
	}

	/**
	 * Sets the teacher ID of this teacher.
	 *
	 * @param teacherId the teacher ID of this teacher
	 */
	@Override
	public void setTeacherId(long teacherId) {
		model.setTeacherId(teacherId);
	}

	/**
	 * Sets the twitter address of this teacher.
	 *
	 * @param twitterAddress the twitter address of this teacher
	 */
	@Override
	public void setTwitterAddress(String twitterAddress) {
		model.setTwitterAddress(twitterAddress);
	}

	/**
	 * Sets the user ID of this teacher.
	 *
	 * @param userId the user ID of this teacher
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this teacher.
	 *
	 * @param userName the user name of this teacher
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this teacher.
	 *
	 * @param userUuid the user uuid of this teacher
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this teacher.
	 *
	 * @param uuid the uuid of this teacher
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	public StagedModelType getStagedModelType() {
		return model.getStagedModelType();
	}

	@Override
	protected TeacherWrapper wrap(Teacher teacher) {
		return new TeacherWrapper(teacher);
	}

}