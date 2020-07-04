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

package com.proliferay.myportlet.service;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for Student. This utility wraps
 * <code>com.proliferay.myportlet.service.impl.StudentLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see StudentLocalService
 * @generated
 */
public class StudentLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.proliferay.myportlet.service.impl.StudentLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static com.proliferay.myportlet.model.Student addStudent(
		String name, String city,
		com.liferay.portal.kernel.service.ServiceContext serviceContext) {

		return getService().addStudent(name, city, serviceContext);
	}

	/**
	 * Adds the student to the database. Also notifies the appropriate model listeners.
	 *
	 * @param student the student
	 * @return the student that was added
	 */
	public static com.proliferay.myportlet.model.Student addStudent(
		com.proliferay.myportlet.model.Student student) {

		return getService().addStudent(student);
	}

	/**
	 * Creates a new student with the primary key. Does not add the student to the database.
	 *
	 * @param studentId the primary key for the new student
	 * @return the new student
	 */
	public static com.proliferay.myportlet.model.Student createStudent(
		long studentId) {

		return getService().createStudent(studentId);
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			deletePersistedModel(
				com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the student with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param studentId the primary key of the student
	 * @return the student that was removed
	 * @throws PortalException if a student with the primary key could not be found
	 */
	public static com.proliferay.myportlet.model.Student deleteStudent(
			long studentId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteStudent(studentId);
	}

	/**
	 * Deletes the student from the database. Also notifies the appropriate model listeners.
	 *
	 * @param student the student
	 * @return the student that was removed
	 */
	public static com.proliferay.myportlet.model.Student deleteStudent(
		com.proliferay.myportlet.model.Student student) {

		return getService().deleteStudent(student);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery
		dynamicQuery() {

		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.proliferay.myportlet.model.impl.StudentModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.proliferay.myportlet.model.impl.StudentModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static com.proliferay.myportlet.model.Student fetchStudent(
		long studentId) {

		return getService().fetchStudent(studentId);
	}

	/**
	 * Returns the student matching the UUID and group.
	 *
	 * @param uuid the student's UUID
	 * @param groupId the primary key of the group
	 * @return the matching student, or <code>null</code> if a matching student could not be found
	 */
	public static com.proliferay.myportlet.model.Student
		fetchStudentByUuidAndGroupId(String uuid, long groupId) {

		return getService().fetchStudentByUuidAndGroupId(uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			getPersistedModel(java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the student with the primary key.
	 *
	 * @param studentId the primary key of the student
	 * @return the student
	 * @throws PortalException if a student with the primary key could not be found
	 */
	public static com.proliferay.myportlet.model.Student getStudent(
			long studentId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getStudent(studentId);
	}

	/**
	 * Returns the student matching the UUID and group.
	 *
	 * @param uuid the student's UUID
	 * @param groupId the primary key of the group
	 * @return the matching student
	 * @throws PortalException if a matching student could not be found
	 */
	public static com.proliferay.myportlet.model.Student
			getStudentByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getStudentByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the students.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.proliferay.myportlet.model.impl.StudentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of students
	 * @param end the upper bound of the range of students (not inclusive)
	 * @return the range of students
	 */
	public static java.util.List<com.proliferay.myportlet.model.Student>
		getStudents(int start, int end) {

		return getService().getStudents(start, end);
	}

	/**
	 * Returns all the students matching the UUID and company.
	 *
	 * @param uuid the UUID of the students
	 * @param companyId the primary key of the company
	 * @return the matching students, or an empty list if no matches were found
	 */
	public static java.util.List<com.proliferay.myportlet.model.Student>
		getStudentsByUuidAndCompanyId(String uuid, long companyId) {

		return getService().getStudentsByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of students matching the UUID and company.
	 *
	 * @param uuid the UUID of the students
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of students
	 * @param end the upper bound of the range of students (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching students, or an empty list if no matches were found
	 */
	public static java.util.List<com.proliferay.myportlet.model.Student>
		getStudentsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.proliferay.myportlet.model.Student> orderByComparator) {

		return getService().getStudentsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of students.
	 *
	 * @return the number of students
	 */
	public static int getStudentsCount() {
		return getService().getStudentsCount();
	}

	/**
	 * Updates the student in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param student the student
	 * @return the student that was updated
	 */
	public static com.proliferay.myportlet.model.Student updateStudent(
		com.proliferay.myportlet.model.Student student) {

		return getService().updateStudent(student);
	}

	public static StudentLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<StudentLocalService, StudentLocalService>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(StudentLocalService.class);

		ServiceTracker<StudentLocalService, StudentLocalService>
			serviceTracker =
				new ServiceTracker<StudentLocalService, StudentLocalService>(
					bundle.getBundleContext(), StudentLocalService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}