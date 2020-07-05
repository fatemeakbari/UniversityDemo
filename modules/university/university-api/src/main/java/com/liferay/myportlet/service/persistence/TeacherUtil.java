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

import com.liferay.myportlet.model.Teacher;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The persistence utility for the teacher service. This utility wraps <code>com.liferay.myportlet.service.persistence.impl.TeacherPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TeacherPersistence
 * @generated
 */
public class TeacherUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(Teacher teacher) {
		getPersistence().clearCache(teacher);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, Teacher> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Teacher> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Teacher> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Teacher> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Teacher> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Teacher update(Teacher teacher) {
		return getPersistence().update(teacher);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Teacher update(
		Teacher teacher, ServiceContext serviceContext) {

		return getPersistence().update(teacher, serviceContext);
	}

	/**
	 * Returns all the teachers where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching teachers
	 */
	public static List<Teacher> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

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
	public static List<Teacher> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

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
	public static List<Teacher> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Teacher> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

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
	public static List<Teacher> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Teacher> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first teacher in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching teacher
	 * @throws NoSuchTeacherException if a matching teacher could not be found
	 */
	public static Teacher findByUuid_First(
			String uuid, OrderByComparator<Teacher> orderByComparator)
		throws com.liferay.myportlet.exception.NoSuchTeacherException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first teacher in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching teacher, or <code>null</code> if a matching teacher could not be found
	 */
	public static Teacher fetchByUuid_First(
		String uuid, OrderByComparator<Teacher> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last teacher in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching teacher
	 * @throws NoSuchTeacherException if a matching teacher could not be found
	 */
	public static Teacher findByUuid_Last(
			String uuid, OrderByComparator<Teacher> orderByComparator)
		throws com.liferay.myportlet.exception.NoSuchTeacherException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last teacher in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching teacher, or <code>null</code> if a matching teacher could not be found
	 */
	public static Teacher fetchByUuid_Last(
		String uuid, OrderByComparator<Teacher> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the teachers before and after the current teacher in the ordered set where uuid = &#63;.
	 *
	 * @param teacherId the primary key of the current teacher
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next teacher
	 * @throws NoSuchTeacherException if a teacher with the primary key could not be found
	 */
	public static Teacher[] findByUuid_PrevAndNext(
			long teacherId, String uuid,
			OrderByComparator<Teacher> orderByComparator)
		throws com.liferay.myportlet.exception.NoSuchTeacherException {

		return getPersistence().findByUuid_PrevAndNext(
			teacherId, uuid, orderByComparator);
	}

	/**
	 * Removes all the teachers where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of teachers where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching teachers
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the teacher where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchTeacherException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching teacher
	 * @throws NoSuchTeacherException if a matching teacher could not be found
	 */
	public static Teacher findByUUID_G(String uuid, long groupId)
		throws com.liferay.myportlet.exception.NoSuchTeacherException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the teacher where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching teacher, or <code>null</code> if a matching teacher could not be found
	 */
	public static Teacher fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the teacher where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching teacher, or <code>null</code> if a matching teacher could not be found
	 */
	public static Teacher fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the teacher where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the teacher that was removed
	 */
	public static Teacher removeByUUID_G(String uuid, long groupId)
		throws com.liferay.myportlet.exception.NoSuchTeacherException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of teachers where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching teachers
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the teachers where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching teachers
	 */
	public static List<Teacher> findByUuid_C(String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

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
	public static List<Teacher> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

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
	public static List<Teacher> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Teacher> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

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
	public static List<Teacher> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Teacher> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first teacher in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching teacher
	 * @throws NoSuchTeacherException if a matching teacher could not be found
	 */
	public static Teacher findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<Teacher> orderByComparator)
		throws com.liferay.myportlet.exception.NoSuchTeacherException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first teacher in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching teacher, or <code>null</code> if a matching teacher could not be found
	 */
	public static Teacher fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<Teacher> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last teacher in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching teacher
	 * @throws NoSuchTeacherException if a matching teacher could not be found
	 */
	public static Teacher findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<Teacher> orderByComparator)
		throws com.liferay.myportlet.exception.NoSuchTeacherException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last teacher in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching teacher, or <code>null</code> if a matching teacher could not be found
	 */
	public static Teacher fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<Teacher> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

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
	public static Teacher[] findByUuid_C_PrevAndNext(
			long teacherId, String uuid, long companyId,
			OrderByComparator<Teacher> orderByComparator)
		throws com.liferay.myportlet.exception.NoSuchTeacherException {

		return getPersistence().findByUuid_C_PrevAndNext(
			teacherId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the teachers where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of teachers where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching teachers
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the teachers where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching teachers
	 */
	public static List<Teacher> findByGroupId(long groupId) {
		return getPersistence().findByGroupId(groupId);
	}

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
	public static List<Teacher> findByGroupId(
		long groupId, int start, int end) {

		return getPersistence().findByGroupId(groupId, start, end);
	}

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
	public static List<Teacher> findByGroupId(
		long groupId, int start, int end,
		OrderByComparator<Teacher> orderByComparator) {

		return getPersistence().findByGroupId(
			groupId, start, end, orderByComparator);
	}

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
	public static List<Teacher> findByGroupId(
		long groupId, int start, int end,
		OrderByComparator<Teacher> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByGroupId(
			groupId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first teacher in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching teacher
	 * @throws NoSuchTeacherException if a matching teacher could not be found
	 */
	public static Teacher findByGroupId_First(
			long groupId, OrderByComparator<Teacher> orderByComparator)
		throws com.liferay.myportlet.exception.NoSuchTeacherException {

		return getPersistence().findByGroupId_First(groupId, orderByComparator);
	}

	/**
	 * Returns the first teacher in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching teacher, or <code>null</code> if a matching teacher could not be found
	 */
	public static Teacher fetchByGroupId_First(
		long groupId, OrderByComparator<Teacher> orderByComparator) {

		return getPersistence().fetchByGroupId_First(
			groupId, orderByComparator);
	}

	/**
	 * Returns the last teacher in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching teacher
	 * @throws NoSuchTeacherException if a matching teacher could not be found
	 */
	public static Teacher findByGroupId_Last(
			long groupId, OrderByComparator<Teacher> orderByComparator)
		throws com.liferay.myportlet.exception.NoSuchTeacherException {

		return getPersistence().findByGroupId_Last(groupId, orderByComparator);
	}

	/**
	 * Returns the last teacher in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching teacher, or <code>null</code> if a matching teacher could not be found
	 */
	public static Teacher fetchByGroupId_Last(
		long groupId, OrderByComparator<Teacher> orderByComparator) {

		return getPersistence().fetchByGroupId_Last(groupId, orderByComparator);
	}

	/**
	 * Returns the teachers before and after the current teacher in the ordered set where groupId = &#63;.
	 *
	 * @param teacherId the primary key of the current teacher
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next teacher
	 * @throws NoSuchTeacherException if a teacher with the primary key could not be found
	 */
	public static Teacher[] findByGroupId_PrevAndNext(
			long teacherId, long groupId,
			OrderByComparator<Teacher> orderByComparator)
		throws com.liferay.myportlet.exception.NoSuchTeacherException {

		return getPersistence().findByGroupId_PrevAndNext(
			teacherId, groupId, orderByComparator);
	}

	/**
	 * Removes all the teachers where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	public static void removeByGroupId(long groupId) {
		getPersistence().removeByGroupId(groupId);
	}

	/**
	 * Returns the number of teachers where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching teachers
	 */
	public static int countByGroupId(long groupId) {
		return getPersistence().countByGroupId(groupId);
	}

	/**
	 * Returns all the teachers where groupId = &#63; and college = &#63;.
	 *
	 * @param groupId the group ID
	 * @param college the college
	 * @return the matching teachers
	 */
	public static List<Teacher> findByCollege(long groupId, String college) {
		return getPersistence().findByCollege(groupId, college);
	}

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
	public static List<Teacher> findByCollege(
		long groupId, String college, int start, int end) {

		return getPersistence().findByCollege(groupId, college, start, end);
	}

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
	public static List<Teacher> findByCollege(
		long groupId, String college, int start, int end,
		OrderByComparator<Teacher> orderByComparator) {

		return getPersistence().findByCollege(
			groupId, college, start, end, orderByComparator);
	}

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
	public static List<Teacher> findByCollege(
		long groupId, String college, int start, int end,
		OrderByComparator<Teacher> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByCollege(
			groupId, college, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first teacher in the ordered set where groupId = &#63; and college = &#63;.
	 *
	 * @param groupId the group ID
	 * @param college the college
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching teacher
	 * @throws NoSuchTeacherException if a matching teacher could not be found
	 */
	public static Teacher findByCollege_First(
			long groupId, String college,
			OrderByComparator<Teacher> orderByComparator)
		throws com.liferay.myportlet.exception.NoSuchTeacherException {

		return getPersistence().findByCollege_First(
			groupId, college, orderByComparator);
	}

	/**
	 * Returns the first teacher in the ordered set where groupId = &#63; and college = &#63;.
	 *
	 * @param groupId the group ID
	 * @param college the college
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching teacher, or <code>null</code> if a matching teacher could not be found
	 */
	public static Teacher fetchByCollege_First(
		long groupId, String college,
		OrderByComparator<Teacher> orderByComparator) {

		return getPersistence().fetchByCollege_First(
			groupId, college, orderByComparator);
	}

	/**
	 * Returns the last teacher in the ordered set where groupId = &#63; and college = &#63;.
	 *
	 * @param groupId the group ID
	 * @param college the college
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching teacher
	 * @throws NoSuchTeacherException if a matching teacher could not be found
	 */
	public static Teacher findByCollege_Last(
			long groupId, String college,
			OrderByComparator<Teacher> orderByComparator)
		throws com.liferay.myportlet.exception.NoSuchTeacherException {

		return getPersistence().findByCollege_Last(
			groupId, college, orderByComparator);
	}

	/**
	 * Returns the last teacher in the ordered set where groupId = &#63; and college = &#63;.
	 *
	 * @param groupId the group ID
	 * @param college the college
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching teacher, or <code>null</code> if a matching teacher could not be found
	 */
	public static Teacher fetchByCollege_Last(
		long groupId, String college,
		OrderByComparator<Teacher> orderByComparator) {

		return getPersistence().fetchByCollege_Last(
			groupId, college, orderByComparator);
	}

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
	public static Teacher[] findByCollege_PrevAndNext(
			long teacherId, long groupId, String college,
			OrderByComparator<Teacher> orderByComparator)
		throws com.liferay.myportlet.exception.NoSuchTeacherException {

		return getPersistence().findByCollege_PrevAndNext(
			teacherId, groupId, college, orderByComparator);
	}

	/**
	 * Removes all the teachers where groupId = &#63; and college = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param college the college
	 */
	public static void removeByCollege(long groupId, String college) {
		getPersistence().removeByCollege(groupId, college);
	}

	/**
	 * Returns the number of teachers where groupId = &#63; and college = &#63;.
	 *
	 * @param groupId the group ID
	 * @param college the college
	 * @return the number of matching teachers
	 */
	public static int countByCollege(long groupId, String college) {
		return getPersistence().countByCollege(groupId, college);
	}

	/**
	 * Returns all the teachers where teacherId = &#63;.
	 *
	 * @param teacherId the teacher ID
	 * @return the matching teachers
	 */
	public static List<Teacher> findByTeacherId(long teacherId) {
		return getPersistence().findByTeacherId(teacherId);
	}

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
	public static List<Teacher> findByTeacherId(
		long teacherId, int start, int end) {

		return getPersistence().findByTeacherId(teacherId, start, end);
	}

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
	public static List<Teacher> findByTeacherId(
		long teacherId, int start, int end,
		OrderByComparator<Teacher> orderByComparator) {

		return getPersistence().findByTeacherId(
			teacherId, start, end, orderByComparator);
	}

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
	public static List<Teacher> findByTeacherId(
		long teacherId, int start, int end,
		OrderByComparator<Teacher> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByTeacherId(
			teacherId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first teacher in the ordered set where teacherId = &#63;.
	 *
	 * @param teacherId the teacher ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching teacher
	 * @throws NoSuchTeacherException if a matching teacher could not be found
	 */
	public static Teacher findByTeacherId_First(
			long teacherId, OrderByComparator<Teacher> orderByComparator)
		throws com.liferay.myportlet.exception.NoSuchTeacherException {

		return getPersistence().findByTeacherId_First(
			teacherId, orderByComparator);
	}

	/**
	 * Returns the first teacher in the ordered set where teacherId = &#63;.
	 *
	 * @param teacherId the teacher ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching teacher, or <code>null</code> if a matching teacher could not be found
	 */
	public static Teacher fetchByTeacherId_First(
		long teacherId, OrderByComparator<Teacher> orderByComparator) {

		return getPersistence().fetchByTeacherId_First(
			teacherId, orderByComparator);
	}

	/**
	 * Returns the last teacher in the ordered set where teacherId = &#63;.
	 *
	 * @param teacherId the teacher ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching teacher
	 * @throws NoSuchTeacherException if a matching teacher could not be found
	 */
	public static Teacher findByTeacherId_Last(
			long teacherId, OrderByComparator<Teacher> orderByComparator)
		throws com.liferay.myportlet.exception.NoSuchTeacherException {

		return getPersistence().findByTeacherId_Last(
			teacherId, orderByComparator);
	}

	/**
	 * Returns the last teacher in the ordered set where teacherId = &#63;.
	 *
	 * @param teacherId the teacher ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching teacher, or <code>null</code> if a matching teacher could not be found
	 */
	public static Teacher fetchByTeacherId_Last(
		long teacherId, OrderByComparator<Teacher> orderByComparator) {

		return getPersistence().fetchByTeacherId_Last(
			teacherId, orderByComparator);
	}

	/**
	 * Removes all the teachers where teacherId = &#63; from the database.
	 *
	 * @param teacherId the teacher ID
	 */
	public static void removeByTeacherId(long teacherId) {
		getPersistence().removeByTeacherId(teacherId);
	}

	/**
	 * Returns the number of teachers where teacherId = &#63;.
	 *
	 * @param teacherId the teacher ID
	 * @return the number of matching teachers
	 */
	public static int countByTeacherId(long teacherId) {
		return getPersistence().countByTeacherId(teacherId);
	}

	/**
	 * Caches the teacher in the entity cache if it is enabled.
	 *
	 * @param teacher the teacher
	 */
	public static void cacheResult(Teacher teacher) {
		getPersistence().cacheResult(teacher);
	}

	/**
	 * Caches the teachers in the entity cache if it is enabled.
	 *
	 * @param teachers the teachers
	 */
	public static void cacheResult(List<Teacher> teachers) {
		getPersistence().cacheResult(teachers);
	}

	/**
	 * Creates a new teacher with the primary key. Does not add the teacher to the database.
	 *
	 * @param teacherId the primary key for the new teacher
	 * @return the new teacher
	 */
	public static Teacher create(long teacherId) {
		return getPersistence().create(teacherId);
	}

	/**
	 * Removes the teacher with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param teacherId the primary key of the teacher
	 * @return the teacher that was removed
	 * @throws NoSuchTeacherException if a teacher with the primary key could not be found
	 */
	public static Teacher remove(long teacherId)
		throws com.liferay.myportlet.exception.NoSuchTeacherException {

		return getPersistence().remove(teacherId);
	}

	public static Teacher updateImpl(Teacher teacher) {
		return getPersistence().updateImpl(teacher);
	}

	/**
	 * Returns the teacher with the primary key or throws a <code>NoSuchTeacherException</code> if it could not be found.
	 *
	 * @param teacherId the primary key of the teacher
	 * @return the teacher
	 * @throws NoSuchTeacherException if a teacher with the primary key could not be found
	 */
	public static Teacher findByPrimaryKey(long teacherId)
		throws com.liferay.myportlet.exception.NoSuchTeacherException {

		return getPersistence().findByPrimaryKey(teacherId);
	}

	/**
	 * Returns the teacher with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param teacherId the primary key of the teacher
	 * @return the teacher, or <code>null</code> if a teacher with the primary key could not be found
	 */
	public static Teacher fetchByPrimaryKey(long teacherId) {
		return getPersistence().fetchByPrimaryKey(teacherId);
	}

	/**
	 * Returns all the teachers.
	 *
	 * @return the teachers
	 */
	public static List<Teacher> findAll() {
		return getPersistence().findAll();
	}

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
	public static List<Teacher> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

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
	public static List<Teacher> findAll(
		int start, int end, OrderByComparator<Teacher> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

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
	public static List<Teacher> findAll(
		int start, int end, OrderByComparator<Teacher> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the teachers from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of teachers.
	 *
	 * @return the number of teachers
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static TeacherPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<TeacherPersistence, TeacherPersistence>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(TeacherPersistence.class);

		ServiceTracker<TeacherPersistence, TeacherPersistence> serviceTracker =
			new ServiceTracker<TeacherPersistence, TeacherPersistence>(
				bundle.getBundleContext(), TeacherPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}