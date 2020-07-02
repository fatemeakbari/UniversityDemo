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

package com.proliferay.myportlet.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.proliferay.myportlet.model.Teacher;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Teacher in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class TeacherCacheModel implements CacheModel<Teacher>, Externalizable {

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TeacherCacheModel)) {
			return false;
		}

		TeacherCacheModel teacherCacheModel = (TeacherCacheModel)obj;

		if (teacherId == teacherCacheModel.teacherId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, teacherId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(47);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", teacherId=");
		sb.append(teacherId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", status=");
		sb.append(status);
		sb.append(", statusByUserId=");
		sb.append(statusByUserId);
		sb.append(", statusByUserName=");
		sb.append(statusByUserName);
		sb.append(", statusDate=");
		sb.append(statusDate);
		sb.append(", name=");
		sb.append(name);
		sb.append(", biography=");
		sb.append(biography);
		sb.append(", college=");
		sb.append(college);
		sb.append(", rank=");
		sb.append(rank);
		sb.append(", position=");
		sb.append(position);
		sb.append(", roomNumber=");
		sb.append(roomNumber);
		sb.append(", phoneNumber=");
		sb.append(phoneNumber);
		sb.append(", emailAddress=");
		sb.append(emailAddress);
		sb.append(", twitterAddress=");
		sb.append(twitterAddress);
		sb.append(", googlePlusAddress=");
		sb.append(googlePlusAddress);
		sb.append(", linkedinAddress=");
		sb.append(linkedinAddress);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Teacher toEntityModel() {
		TeacherImpl teacherImpl = new TeacherImpl();

		if (uuid == null) {
			teacherImpl.setUuid("");
		}
		else {
			teacherImpl.setUuid(uuid);
		}

		teacherImpl.setTeacherId(teacherId);
		teacherImpl.setGroupId(groupId);
		teacherImpl.setCompanyId(companyId);
		teacherImpl.setUserId(userId);

		if (userName == null) {
			teacherImpl.setUserName("");
		}
		else {
			teacherImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			teacherImpl.setCreateDate(null);
		}
		else {
			teacherImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			teacherImpl.setModifiedDate(null);
		}
		else {
			teacherImpl.setModifiedDate(new Date(modifiedDate));
		}

		teacherImpl.setStatus(status);
		teacherImpl.setStatusByUserId(statusByUserId);

		if (statusByUserName == null) {
			teacherImpl.setStatusByUserName("");
		}
		else {
			teacherImpl.setStatusByUserName(statusByUserName);
		}

		if (statusDate == Long.MIN_VALUE) {
			teacherImpl.setStatusDate(null);
		}
		else {
			teacherImpl.setStatusDate(new Date(statusDate));
		}

		if (name == null) {
			teacherImpl.setName("");
		}
		else {
			teacherImpl.setName(name);
		}

		if (biography == null) {
			teacherImpl.setBiography("");
		}
		else {
			teacherImpl.setBiography(biography);
		}

		if (college == null) {
			teacherImpl.setCollege("");
		}
		else {
			teacherImpl.setCollege(college);
		}

		if (rank == null) {
			teacherImpl.setRank("");
		}
		else {
			teacherImpl.setRank(rank);
		}

		if (position == null) {
			teacherImpl.setPosition("");
		}
		else {
			teacherImpl.setPosition(position);
		}

		if (roomNumber == null) {
			teacherImpl.setRoomNumber("");
		}
		else {
			teacherImpl.setRoomNumber(roomNumber);
		}

		if (phoneNumber == null) {
			teacherImpl.setPhoneNumber("");
		}
		else {
			teacherImpl.setPhoneNumber(phoneNumber);
		}

		if (emailAddress == null) {
			teacherImpl.setEmailAddress("");
		}
		else {
			teacherImpl.setEmailAddress(emailAddress);
		}

		if (twitterAddress == null) {
			teacherImpl.setTwitterAddress("");
		}
		else {
			teacherImpl.setTwitterAddress(twitterAddress);
		}

		if (googlePlusAddress == null) {
			teacherImpl.setGooglePlusAddress("");
		}
		else {
			teacherImpl.setGooglePlusAddress(googlePlusAddress);
		}

		if (linkedinAddress == null) {
			teacherImpl.setLinkedinAddress("");
		}
		else {
			teacherImpl.setLinkedinAddress(linkedinAddress);
		}

		teacherImpl.resetOriginalValues();

		return teacherImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		teacherId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		status = objectInput.readInt();

		statusByUserId = objectInput.readLong();
		statusByUserName = objectInput.readUTF();
		statusDate = objectInput.readLong();
		name = objectInput.readUTF();
		biography = objectInput.readUTF();
		college = objectInput.readUTF();
		rank = objectInput.readUTF();
		position = objectInput.readUTF();
		roomNumber = objectInput.readUTF();
		phoneNumber = objectInput.readUTF();
		emailAddress = objectInput.readUTF();
		twitterAddress = objectInput.readUTF();
		googlePlusAddress = objectInput.readUTF();
		linkedinAddress = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(teacherId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		objectOutput.writeInt(status);

		objectOutput.writeLong(statusByUserId);

		if (statusByUserName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(statusByUserName);
		}

		objectOutput.writeLong(statusDate);

		if (name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (biography == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(biography);
		}

		if (college == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(college);
		}

		if (rank == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(rank);
		}

		if (position == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(position);
		}

		if (roomNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(roomNumber);
		}

		if (phoneNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(phoneNumber);
		}

		if (emailAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(emailAddress);
		}

		if (twitterAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(twitterAddress);
		}

		if (googlePlusAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(googlePlusAddress);
		}

		if (linkedinAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(linkedinAddress);
		}
	}

	public String uuid;
	public long teacherId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public int status;
	public long statusByUserId;
	public String statusByUserName;
	public long statusDate;
	public String name;
	public String biography;
	public String college;
	public String rank;
	public String position;
	public String roomNumber;
	public String phoneNumber;
	public String emailAddress;
	public String twitterAddress;
	public String googlePlusAddress;
	public String linkedinAddress;

}