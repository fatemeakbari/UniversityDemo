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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.liferay.myportlet.service.http.TeacherServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class TeacherSoap implements Serializable {

	public static TeacherSoap toSoapModel(Teacher model) {
		TeacherSoap soapModel = new TeacherSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setTeacherId(model.getTeacherId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setStatus(model.getStatus());
		soapModel.setStatusByUserId(model.getStatusByUserId());
		soapModel.setStatusByUserName(model.getStatusByUserName());
		soapModel.setStatusDate(model.getStatusDate());
		soapModel.setName(model.getName());
		soapModel.setBiography(model.getBiography());
		soapModel.setCollege(model.getCollege());
		soapModel.setRank(model.getRank());
		soapModel.setPosition(model.getPosition());
		soapModel.setRoomNumber(model.getRoomNumber());
		soapModel.setPhoneNumber(model.getPhoneNumber());
		soapModel.setEmailAddress(model.getEmailAddress());
		soapModel.setTwitterAddress(model.getTwitterAddress());
		soapModel.setGooglePlusAddress(model.getGooglePlusAddress());
		soapModel.setLinkedinAddress(model.getLinkedinAddress());

		return soapModel;
	}

	public static TeacherSoap[] toSoapModels(Teacher[] models) {
		TeacherSoap[] soapModels = new TeacherSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static TeacherSoap[][] toSoapModels(Teacher[][] models) {
		TeacherSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new TeacherSoap[models.length][models[0].length];
		}
		else {
			soapModels = new TeacherSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static TeacherSoap[] toSoapModels(List<Teacher> models) {
		List<TeacherSoap> soapModels = new ArrayList<TeacherSoap>(
			models.size());

		for (Teacher model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new TeacherSoap[soapModels.size()]);
	}

	public TeacherSoap() {
	}

	public long getPrimaryKey() {
		return _teacherId;
	}

	public void setPrimaryKey(long pk) {
		setTeacherId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getTeacherId() {
		return _teacherId;
	}

	public void setTeacherId(long teacherId) {
		_teacherId = teacherId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public int getStatus() {
		return _status;
	}

	public void setStatus(int status) {
		_status = status;
	}

	public long getStatusByUserId() {
		return _statusByUserId;
	}

	public void setStatusByUserId(long statusByUserId) {
		_statusByUserId = statusByUserId;
	}

	public String getStatusByUserName() {
		return _statusByUserName;
	}

	public void setStatusByUserName(String statusByUserName) {
		_statusByUserName = statusByUserName;
	}

	public Date getStatusDate() {
		return _statusDate;
	}

	public void setStatusDate(Date statusDate) {
		_statusDate = statusDate;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getBiography() {
		return _biography;
	}

	public void setBiography(String biography) {
		_biography = biography;
	}

	public String getCollege() {
		return _college;
	}

	public void setCollege(String college) {
		_college = college;
	}

	public String getRank() {
		return _rank;
	}

	public void setRank(String rank) {
		_rank = rank;
	}

	public String getPosition() {
		return _position;
	}

	public void setPosition(String position) {
		_position = position;
	}

	public String getRoomNumber() {
		return _roomNumber;
	}

	public void setRoomNumber(String roomNumber) {
		_roomNumber = roomNumber;
	}

	public String getPhoneNumber() {
		return _phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		_phoneNumber = phoneNumber;
	}

	public String getEmailAddress() {
		return _emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		_emailAddress = emailAddress;
	}

	public String getTwitterAddress() {
		return _twitterAddress;
	}

	public void setTwitterAddress(String twitterAddress) {
		_twitterAddress = twitterAddress;
	}

	public String getGooglePlusAddress() {
		return _googlePlusAddress;
	}

	public void setGooglePlusAddress(String googlePlusAddress) {
		_googlePlusAddress = googlePlusAddress;
	}

	public String getLinkedinAddress() {
		return _linkedinAddress;
	}

	public void setLinkedinAddress(String linkedinAddress) {
		_linkedinAddress = linkedinAddress;
	}

	private String _uuid;
	private long _teacherId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private int _status;
	private long _statusByUserId;
	private String _statusByUserName;
	private Date _statusDate;
	private String _name;
	private String _biography;
	private String _college;
	private String _rank;
	private String _position;
	private String _roomNumber;
	private String _phoneNumber;
	private String _emailAddress;
	private String _twitterAddress;
	private String _googlePlusAddress;
	private String _linkedinAddress;

}