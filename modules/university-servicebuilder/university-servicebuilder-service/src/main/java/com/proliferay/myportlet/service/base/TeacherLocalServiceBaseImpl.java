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

package com.proliferay.myportlet.service.base;

import com.liferay.exportimport.kernel.lar.ExportImportHelperUtil;
import com.liferay.exportimport.kernel.lar.ManifestSummary;
import com.liferay.exportimport.kernel.lar.PortletDataContext;
import com.liferay.exportimport.kernel.lar.StagedModelDataHandler;
import com.liferay.exportimport.kernel.lar.StagedModelDataHandlerRegistryUtil;
import com.liferay.exportimport.kernel.lar.StagedModelDataHandlerUtil;
import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.dao.db.DB;
import com.liferay.portal.kernel.dao.db.DBManagerUtil;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Criterion;
import com.liferay.portal.kernel.dao.orm.DefaultActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Disjunction;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.dao.orm.Property;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.framework.service.IdentifiableOSGiService;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalServiceImpl;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.workflow.WorkflowConstants;

import com.proliferay.myportlet.model.Teacher;
import com.proliferay.myportlet.service.TeacherLocalService;
import com.proliferay.myportlet.service.persistence.TeacherPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the teacher local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.proliferay.myportlet.service.impl.TeacherLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.proliferay.myportlet.service.impl.TeacherLocalServiceImpl
 * @generated
 */
public abstract class TeacherLocalServiceBaseImpl
	extends BaseLocalServiceImpl
	implements AopService, IdentifiableOSGiService, TeacherLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>TeacherLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.proliferay.myportlet.service.TeacherLocalServiceUtil</code>.
	 */

	/**
	 * Adds the teacher to the database. Also notifies the appropriate model listeners.
	 *
	 * @param teacher the teacher
	 * @return the teacher that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public Teacher addTeacher(Teacher teacher) {
		teacher.setNew(true);

		return teacherPersistence.update(teacher);
	}

	/**
	 * Creates a new teacher with the primary key. Does not add the teacher to the database.
	 *
	 * @param teacherId the primary key for the new teacher
	 * @return the new teacher
	 */
	@Override
	@Transactional(enabled = false)
	public Teacher createTeacher(long teacherId) {
		return teacherPersistence.create(teacherId);
	}

	/**
	 * Deletes the teacher with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param teacherId the primary key of the teacher
	 * @return the teacher that was removed
	 * @throws PortalException if a teacher with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public Teacher deleteTeacher(long teacherId) throws PortalException {
		return teacherPersistence.remove(teacherId);
	}

	/**
	 * Deletes the teacher from the database. Also notifies the appropriate model listeners.
	 *
	 * @param teacher the teacher
	 * @return the teacher that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public Teacher deleteTeacher(Teacher teacher) {
		return teacherPersistence.remove(teacher);
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(
			Teacher.class, clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return teacherPersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.proliferay.myportlet.model.impl.TeacherModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return teacherPersistence.findWithDynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.proliferay.myportlet.model.impl.TeacherModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator) {

		return teacherPersistence.findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return teacherPersistence.countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		DynamicQuery dynamicQuery, Projection projection) {

		return teacherPersistence.countWithDynamicQuery(
			dynamicQuery, projection);
	}

	@Override
	public Teacher fetchTeacher(long teacherId) {
		return teacherPersistence.fetchByPrimaryKey(teacherId);
	}

	/**
	 * Returns the teacher matching the UUID and group.
	 *
	 * @param uuid the teacher's UUID
	 * @param groupId the primary key of the group
	 * @return the matching teacher, or <code>null</code> if a matching teacher could not be found
	 */
	@Override
	public Teacher fetchTeacherByUuidAndGroupId(String uuid, long groupId) {
		return teacherPersistence.fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the teacher with the primary key.
	 *
	 * @param teacherId the primary key of the teacher
	 * @return the teacher
	 * @throws PortalException if a teacher with the primary key could not be found
	 */
	@Override
	public Teacher getTeacher(long teacherId) throws PortalException {
		return teacherPersistence.findByPrimaryKey(teacherId);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery =
			new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(teacherLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(Teacher.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("teacherId");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		IndexableActionableDynamicQuery indexableActionableDynamicQuery =
			new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(
			teacherLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(Teacher.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName("teacherId");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {

		actionableDynamicQuery.setBaseLocalService(teacherLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(Teacher.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("teacherId");
	}

	@Override
	public ExportActionableDynamicQuery getExportActionableDynamicQuery(
		final PortletDataContext portletDataContext) {

		final ExportActionableDynamicQuery exportActionableDynamicQuery =
			new ExportActionableDynamicQuery() {

				@Override
				public long performCount() throws PortalException {
					ManifestSummary manifestSummary =
						portletDataContext.getManifestSummary();

					StagedModelType stagedModelType = getStagedModelType();

					long modelAdditionCount = super.performCount();

					manifestSummary.addModelAdditionCount(
						stagedModelType, modelAdditionCount);

					long modelDeletionCount =
						ExportImportHelperUtil.getModelDeletionCount(
							portletDataContext, stagedModelType);

					manifestSummary.addModelDeletionCount(
						stagedModelType, modelDeletionCount);

					return modelAdditionCount;
				}

			};

		initActionableDynamicQuery(exportActionableDynamicQuery);

		exportActionableDynamicQuery.setAddCriteriaMethod(
			new ActionableDynamicQuery.AddCriteriaMethod() {

				@Override
				public void addCriteria(DynamicQuery dynamicQuery) {
					Criterion modifiedDateCriterion =
						portletDataContext.getDateRangeCriteria("modifiedDate");

					Criterion statusDateCriterion =
						portletDataContext.getDateRangeCriteria("statusDate");

					if ((modifiedDateCriterion != null) &&
						(statusDateCriterion != null)) {

						Disjunction disjunction =
							RestrictionsFactoryUtil.disjunction();

						disjunction.add(modifiedDateCriterion);
						disjunction.add(statusDateCriterion);

						dynamicQuery.add(disjunction);
					}

					Property workflowStatusProperty =
						PropertyFactoryUtil.forName("status");

					if (portletDataContext.isInitialPublication()) {
						dynamicQuery.add(
							workflowStatusProperty.ne(
								WorkflowConstants.STATUS_IN_TRASH));
					}
					else {
						StagedModelDataHandler<?> stagedModelDataHandler =
							StagedModelDataHandlerRegistryUtil.
								getStagedModelDataHandler(
									Teacher.class.getName());

						dynamicQuery.add(
							workflowStatusProperty.in(
								stagedModelDataHandler.
									getExportableStatuses()));
					}
				}

			});

		exportActionableDynamicQuery.setCompanyId(
			portletDataContext.getCompanyId());

		exportActionableDynamicQuery.setPerformActionMethod(
			new ActionableDynamicQuery.PerformActionMethod<Teacher>() {

				@Override
				public void performAction(Teacher teacher)
					throws PortalException {

					StagedModelDataHandlerUtil.exportStagedModel(
						portletDataContext, teacher);
				}

			});
		exportActionableDynamicQuery.setStagedModelType(
			new StagedModelType(
				PortalUtil.getClassNameId(Teacher.class.getName())));

		return exportActionableDynamicQuery;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException {

		return teacherLocalService.deleteTeacher((Teacher)persistedModel);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return teacherPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns all the teachers matching the UUID and company.
	 *
	 * @param uuid the UUID of the teachers
	 * @param companyId the primary key of the company
	 * @return the matching teachers, or an empty list if no matches were found
	 */
	@Override
	public List<Teacher> getTeachersByUuidAndCompanyId(
		String uuid, long companyId) {

		return teacherPersistence.findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of teachers matching the UUID and company.
	 *
	 * @param uuid the UUID of the teachers
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of teachers
	 * @param end the upper bound of the range of teachers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching teachers, or an empty list if no matches were found
	 */
	@Override
	public List<Teacher> getTeachersByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Teacher> orderByComparator) {

		return teacherPersistence.findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the teacher matching the UUID and group.
	 *
	 * @param uuid the teacher's UUID
	 * @param groupId the primary key of the group
	 * @return the matching teacher
	 * @throws PortalException if a matching teacher could not be found
	 */
	@Override
	public Teacher getTeacherByUuidAndGroupId(String uuid, long groupId)
		throws PortalException {

		return teacherPersistence.findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns a range of all the teachers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.proliferay.myportlet.model.impl.TeacherModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of teachers
	 * @param end the upper bound of the range of teachers (not inclusive)
	 * @return the range of teachers
	 */
	@Override
	public List<Teacher> getTeachers(int start, int end) {
		return teacherPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of teachers.
	 *
	 * @return the number of teachers
	 */
	@Override
	public int getTeachersCount() {
		return teacherPersistence.countAll();
	}

	/**
	 * Updates the teacher in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param teacher the teacher
	 * @return the teacher that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public Teacher updateTeacher(Teacher teacher) {
		return teacherPersistence.update(teacher);
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			TeacherLocalService.class, IdentifiableOSGiService.class,
			PersistedModelLocalService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		teacherLocalService = (TeacherLocalService)aopProxy;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return TeacherLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return Teacher.class;
	}

	protected String getModelClassName() {
		return Teacher.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = teacherPersistence.getDataSource();

			DB db = DBManagerUtil.getDB();

			sql = db.buildSQL(sql);
			sql = PortalUtil.transformSQL(sql);

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(
				dataSource, sql);

			sqlUpdate.update();
		}
		catch (Exception exception) {
			throw new SystemException(exception);
		}
	}

	protected TeacherLocalService teacherLocalService;

	@Reference
	protected TeacherPersistence teacherPersistence;

	@Reference
	protected com.liferay.counter.kernel.service.CounterLocalService
		counterLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.ClassNameLocalService
		classNameLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.ResourceLocalService
		resourceLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.UserLocalService
		userLocalService;

}