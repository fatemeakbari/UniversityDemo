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

package com.liferay.myportlet.service.persistence;

import com.liferay.myportlet.exception.NoSuchTeacherException;
import com.liferay.myportlet.model.Teacher;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the teacher service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TeacherUtil
 * @generated
 */
@ProviderType
public interface TeacherPersistence extends BasePersistence<Teacher> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TeacherUtil} to access the teacher persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the teachers where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching teachers
	 */
	public java.util.List<Teacher> findByUuid(String uuid);

	/**
	 * Returns a range of all the teachers where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TeacherModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of teachers
	 * @param end the upper bound of the range of teachers (not inclusive)
	 * @return the range of matching teachers
	 */
	public java.util.List<Teacher> findByUuid(String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the teachers where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TeacherModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of teachers
	 * @param end the upper bound of the range of teachers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching teachers
	 */
	public java.util.List<Teacher> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Teacher>
			orderByComparator);

	/**
	 * Returns an ordered range of all the teachers where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TeacherModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of teachers
	 * @param end the upper bound of the range of teachers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching teachers
	 */
	public java.util.List<Teacher> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Teacher>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first teacher in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching teacher
	 * @throws NoSuchTeacherException if a matching teacher could not be found
	 */
	public Teacher findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Teacher>
				orderByComparator)
		throws NoSuchTeacherException;

	/**
	 * Returns the first teacher in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching teacher, or <code>null</code> if a matching teacher could not be found
	 */
	public Teacher fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Teacher>
			orderByComparator);

	/**
	 * Returns the last teacher in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching teacher
	 * @throws NoSuchTeacherException if a matching teacher could not be found
	 */
	public Teacher findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Teacher>
				orderByComparator)
		throws NoSuchTeacherException;

	/**
	 * Returns the last teacher in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching teacher, or <code>null</code> if a matching teacher could not be found
	 */
	public Teacher fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Teacher>
			orderByComparator);

	/**
	 * Returns the teachers before and after the current teacher in the ordered set where uuid = &#63;.
	 *
	 * @param teacherId the primary key of the current teacher
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next teacher
	 * @throws NoSuchTeacherException if a teacher with the primary key could not be found
	 */
	public Teacher[] findByUuid_PrevAndNext(
			long teacherId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Teacher>
				orderByComparator)
		throws NoSuchTeacherException;

	/**
	 * Removes all the teachers where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of teachers where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching teachers
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the teacher where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchTeacherException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching teacher
	 * @throws NoSuchTeacherException if a matching teacher could not be found
	 */
	public Teacher findByUUID_G(String uuid, long groupId)
		throws NoSuchTeacherException;

	/**
	 * Returns the teacher where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching teacher, or <code>null</code> if a matching teacher could not be found
	 */
	public Teacher fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the teacher where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching teacher, or <code>null</code> if a matching teacher could not be found
	 */
	public Teacher fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the teacher where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the teacher that was removed
	 */
	public Teacher removeByUUID_G(String uuid, long groupId)
		throws NoSuchTeacherException;

	/**
	 * Returns the number of teachers where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching teachers
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the teachers where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching teachers
	 */
	public java.util.List<Teacher> findByUuid_C(String uuid, long companyId);

	/**
	 * Returns a range of all the teachers where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TeacherModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of teachers
	 * @param end the upper bound of the range of teachers (not inclusive)
	 * @return the range of matching teachers
	 */
	public java.util.List<Teacher> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the teachers where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TeacherModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of teachers
	 * @param end the upper bound of the range of teachers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching teachers
	 */
	public java.util.List<Teacher> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Teacher>
			orderByComparator);

	/**
	 * Returns an ordered range of all the teachers where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TeacherModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of teachers
	 * @param end the upper bound of the range of teachers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching teachers
	 */
	public java.util.List<Teacher> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Teacher>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first teacher in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching teacher
	 * @throws NoSuchTeacherException if a matching teacher could not be found
	 */
	public Teacher findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Teacher>
				orderByComparator)
		throws NoSuchTeacherException;

	/**
	 * Returns the first teacher in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching teacher, or <code>null</code> if a matching teacher could not be found
	 */
	public Teacher fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Teacher>
			orderByComparator);

	/**
	 * Returns the last teacher in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching teacher
	 * @throws NoSuchTeacherException if a matching teacher could not be found
	 */
	public Teacher findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Teacher>
				orderByComparator)
		throws NoSuchTeacherException;

	/**
	 * Returns the last teacher in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching teacher, or <code>null</code> if a matching teacher could not be found
	 */
	public Teacher fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Teacher>
			orderByComparator);

	/**
	 * Returns the teachers before and after the current teacher in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param teacherId the primary key of the current teacher
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next teacher
	 * @throws NoSuchTeacherException if a teacher with the primary key could not be found
	 */
	public Teacher[] findByUuid_C_PrevAndNext(
			long teacherId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Teacher>
				orderByComparator)
		throws NoSuchTeacherException;

	/**
	 * Removes all the teachers where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of teachers where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching teachers
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the teachers where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching teachers
	 */
	public java.util.List<Teacher> findByGroupId(long groupId);

	/**
	 * Returns a range of all the teachers where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TeacherModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of teachers
	 * @param end the upper bound of the range of teachers (not inclusive)
	 * @return the range of matching teachers
	 */
	public java.util.List<Teacher> findByGroupId(
		long groupId, int start, int end);

	/**
	 * Returns an ordered range of all the teachers where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TeacherModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of teachers
	 * @param end the upper bound of the range of teachers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching teachers
	 */
	public java.util.List<Teacher> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Teacher>
			orderByComparator);

	/**
	 * Returns an ordered range of all the teachers where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TeacherModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of teachers
	 * @param end the upper bound of the range of teachers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching teachers
	 */
	public java.util.List<Teacher> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Teacher>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first teacher in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching teacher
	 * @throws NoSuchTeacherException if a matching teacher could not be found
	 */
	public Teacher findByGroupId_First(
			long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<Teacher>
				orderByComparator)
		throws NoSuchTeacherException;

	/**
	 * Returns the first teacher in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching teacher, or <code>null</code> if a matching teacher could not be found
	 */
	public Teacher fetchByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Teacher>
			orderByComparator);

	/**
	 * Returns the last teacher in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching teacher
	 * @throws NoSuchTeacherException if a matching teacher could not be found
	 */
	public Teacher findByGroupId_Last(
			long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<Teacher>
				orderByComparator)
		throws NoSuchTeacherException;

	/**
	 * Returns the last teacher in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching teacher, or <code>null</code> if a matching teacher could not be found
	 */
	public Teacher fetchByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Teacher>
			orderByComparator);

	/**
	 * Returns the teachers before and after the current teacher in the ordered set where groupId = &#63;.
	 *
	 * @param teacherId the primary key of the current teacher
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next teacher
	 * @throws NoSuchTeacherException if a teacher with the primary key could not be found
	 */
	public Teacher[] findByGroupId_PrevAndNext(
			long teacherId, long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<Teacher>
				orderByComparator)
		throws NoSuchTeacherException;

	/**
	 * Removes all the teachers where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	public void removeByGroupId(long groupId);

	/**
	 * Returns the number of teachers where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching teachers
	 */
	public int countByGroupId(long groupId);

	/**
	 * Returns all the teachers where groupId = &#63; and college = &#63;.
	 *
	 * @param groupId the group ID
	 * @param college the college
	 * @return the matching teachers
	 */
	public java.util.List<Teacher> findByCollege(long groupId, String college);

	/**
	 * Returns a range of all the teachers where groupId = &#63; and college = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TeacherModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param college the college
	 * @param start the lower bound of the range of teachers
	 * @param end the upper bound of the range of teachers (not inclusive)
	 * @return the range of matching teachers
	 */
	public java.util.List<Teacher> findByCollege(
		long groupId, String college, int start, int end);

	/**
	 * Returns an ordered range of all the teachers where groupId = &#63; and college = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TeacherModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param college the college
	 * @param start the lower bound of the range of teachers
	 * @param end the upper bound of the range of teachers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching teachers
	 */
	public java.util.List<Teacher> findByCollege(
		long groupId, String college, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Teacher>
			orderByComparator);

	/**
	 * Returns an ordered range of all the teachers where groupId = &#63; and college = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TeacherModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param college the college
	 * @param start the lower bound of the range of teachers
	 * @param end the upper bound of the range of teachers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching teachers
	 */
	public java.util.List<Teacher> findByCollege(
		long groupId, String college, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Teacher>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first teacher in the ordered set where groupId = &#63; and college = &#63;.
	 *
	 * @param groupId the group ID
	 * @param college the college
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching teacher
	 * @throws NoSuchTeacherException if a matching teacher could not be found
	 */
	public Teacher findByCollege_First(
			long groupId, String college,
			com.liferay.portal.kernel.util.OrderByComparator<Teacher>
				orderByComparator)
		throws NoSuchTeacherException;

	/**
	 * Returns the first teacher in the ordered set where groupId = &#63; and college = &#63;.
	 *
	 * @param groupId the group ID
	 * @param college the college
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching teacher, or <code>null</code> if a matching teacher could not be found
	 */
	public Teacher fetchByCollege_First(
		long groupId, String college,
		com.liferay.portal.kernel.util.OrderByComparator<Teacher>
			orderByComparator);

	/**
	 * Returns the last teacher in the ordered set where groupId = &#63; and college = &#63;.
	 *
	 * @param groupId the group ID
	 * @param college the college
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching teacher
	 * @throws NoSuchTeacherException if a matching teacher could not be found
	 */
	public Teacher findByCollege_Last(
			long groupId, String college,
			com.liferay.portal.kernel.util.OrderByComparator<Teacher>
				orderByComparator)
		throws NoSuchTeacherException;

	/**
	 * Returns the last teacher in the ordered set where groupId = &#63; and college = &#63;.
	 *
	 * @param groupId the group ID
	 * @param college the college
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching teacher, or <code>null</code> if a matching teacher could not be found
	 */
	public Teacher fetchByCollege_Last(
		long groupId, String college,
		com.liferay.portal.kernel.util.OrderByComparator<Teacher>
			orderByComparator);

	/**
	 * Returns the teachers before and after the current teacher in the ordered set where groupId = &#63; and college = &#63;.
	 *
	 * @param teacherId the primary key of the current teacher
	 * @param groupId the group ID
	 * @param college the college
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next teacher
	 * @throws NoSuchTeacherException if a teacher with the primary key could not be found
	 */
	public Teacher[] findByCollege_PrevAndNext(
			long teacherId, long groupId, String college,
			com.liferay.portal.kernel.util.OrderByComparator<Teacher>
				orderByComparator)
		throws NoSuchTeacherException;

	/**
	 * Removes all the teachers where groupId = &#63; and college = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param college the college
	 */
	public void removeByCollege(long groupId, String college);

	/**
	 * Returns the number of teachers where groupId = &#63; and college = &#63;.
	 *
	 * @param groupId the group ID
	 * @param college the college
	 * @return the number of matching teachers
	 */
	public int countByCollege(long groupId, String college);

	/**
	 * Returns all the teachers where teacherId = &#63;.
	 *
	 * @param teacherId the teacher ID
	 * @return the matching teachers
	 */
	public java.util.List<Teacher> findByTeacherId(long teacherId);

	/**
	 * Returns a range of all the teachers where teacherId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TeacherModelImpl</code>.
	 * </p>
	 *
	 * @param teacherId the teacher ID
	 * @param start the lower bound of the range of teachers
	 * @param end the upper bound of the range of teachers (not inclusive)
	 * @return the range of matching teachers
	 */
	public java.util.List<Teacher> findByTeacherId(
		long teacherId, int start, int end);

	/**
	 * Returns an ordered range of all the teachers where teacherId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TeacherModelImpl</code>.
	 * </p>
	 *
	 * @param teacherId the teacher ID
	 * @param start the lower bound of the range of teachers
	 * @param end the upper bound of the range of teachers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching teachers
	 */
	public java.util.List<Teacher> findByTeacherId(
		long teacherId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Teacher>
			orderByComparator);

	/**
	 * Returns an ordered range of all the teachers where teacherId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TeacherModelImpl</code>.
	 * </p>
	 *
	 * @param teacherId the teacher ID
	 * @param start the lower bound of the range of teachers
	 * @param end the upper bound of the range of teachers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching teachers
	 */
	public java.util.List<Teacher> findByTeacherId(
		long teacherId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Teacher>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first teacher in the ordered set where teacherId = &#63;.
	 *
	 * @param teacherId the teacher ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching teacher
	 * @throws NoSuchTeacherException if a matching teacher could not be found
	 */
	public Teacher findByTeacherId_First(
			long teacherId,
			com.liferay.portal.kernel.util.OrderByComparator<Teacher>
				orderByComparator)
		throws NoSuchTeacherException;

	/**
	 * Returns the first teacher in the ordered set where teacherId = &#63;.
	 *
	 * @param teacherId the teacher ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching teacher, or <code>null</code> if a matching teacher could not be found
	 */
	public Teacher fetchByTeacherId_First(
		long teacherId,
		com.liferay.portal.kernel.util.OrderByComparator<Teacher>
			orderByComparator);

	/**
	 * Returns the last teacher in the ordered set where teacherId = &#63;.
	 *
	 * @param teacherId the teacher ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching teacher
	 * @throws NoSuchTeacherException if a matching teacher could not be found
	 */
	public Teacher findByTeacherId_Last(
			long teacherId,
			com.liferay.portal.kernel.util.OrderByComparator<Teacher>
				orderByComparator)
		throws NoSuchTeacherException;

	/**
	 * Returns the last teacher in the ordered set where teacherId = &#63;.
	 *
	 * @param teacherId the teacher ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching teacher, or <code>null</code> if a matching teacher could not be found
	 */
	public Teacher fetchByTeacherId_Last(
		long teacherId,
		com.liferay.portal.kernel.util.OrderByComparator<Teacher>
			orderByComparator);

	/**
	 * Removes all the teachers where teacherId = &#63; from the database.
	 *
	 * @param teacherId the teacher ID
	 */
	public void removeByTeacherId(long teacherId);

	/**
	 * Returns the number of teachers where teacherId = &#63;.
	 *
	 * @param teacherId the teacher ID
	 * @return the number of matching teachers
	 */
	public int countByTeacherId(long teacherId);

	/**
	 * Caches the teacher in the entity cache if it is enabled.
	 *
	 * @param teacher the teacher
	 */
	public void cacheResult(Teacher teacher);

	/**
	 * Caches the teachers in the entity cache if it is enabled.
	 *
	 * @param teachers the teachers
	 */
	public void cacheResult(java.util.List<Teacher> teachers);

	/**
	 * Creates a new teacher with the primary key. Does not add the teacher to the database.
	 *
	 * @param teacherId the primary key for the new teacher
	 * @return the new teacher
	 */
	public Teacher create(long teacherId);

	/**
	 * Removes the teacher with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param teacherId the primary key of the teacher
	 * @return the teacher that was removed
	 * @throws NoSuchTeacherException if a teacher with the primary key could not be found
	 */
	public Teacher remove(long teacherId) throws NoSuchTeacherException;

	public Teacher updateImpl(Teacher teacher);

	/**
	 * Returns the teacher with the primary key or throws a <code>NoSuchTeacherException</code> if it could not be found.
	 *
	 * @param teacherId the primary key of the teacher
	 * @return the teacher
	 * @throws NoSuchTeacherException if a teacher with the primary key could not be found
	 */
	public Teacher findByPrimaryKey(long teacherId)
		throws NoSuchTeacherException;

	/**
	 * Returns the teacher with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param teacherId the primary key of the teacher
	 * @return the teacher, or <code>null</code> if a teacher with the primary key could not be found
	 */
	public Teacher fetchByPrimaryKey(long teacherId);

	/**
	 * Returns all the teachers.
	 *
	 * @return the teachers
	 */
	public java.util.List<Teacher> findAll();

	/**
	 * Returns a range of all the teachers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TeacherModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of teachers
	 * @param end the upper bound of the range of teachers (not inclusive)
	 * @return the range of teachers
	 */
	public java.util.List<Teacher> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the teachers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TeacherModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of teachers
	 * @param end the upper bound of the range of teachers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of teachers
	 */
	public java.util.List<Teacher> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Teacher>
			orderByComparator);

	/**
	 * Returns an ordered range of all the teachers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TeacherModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of teachers
	 * @param end the upper bound of the range of teachers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of teachers
	 */
	public java.util.List<Teacher> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Teacher>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the teachers from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of teachers.
	 *
	 * @return the number of teachers
	 */
	public int countAll();

}