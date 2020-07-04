package com.proliferay.myportlet.internal.security.permission.resource;

import java.util.Dictionary;

import com.liferay.portal.kernel.security.permission.resource.PortletResourcePermissionFactory;
import com.liferay.portal.kernel.security.permission.resource.StagedPortletPermissionLogic;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;


import com.liferay.exportimport.kernel.staging.permission.StagingPermission;
import com.liferay.portal.kernel.security.permission.resource.PortletResourcePermission;
import com.liferay.portal.kernel.util.HashMapDictionary;

@Component (immediate = true)
public class StudentPortletResourcePermissionRegistrar {

    @Activate
    public void activate(BundleContext bundleContext) {
        Dictionary<String, Object> properties = new HashMapDictionary<>();

        properties.put("resource.name", "com.proliferay.myportlet");

        _serviceRegistration = bundleContext.registerService(
                PortletResourcePermission.class,
                PortletResourcePermissionFactory.create(
                        "com.proliferay.myportlet",
                        new StagedPortletPermissionLogic(
                                _stagingPermission, "com_proliferay_myportlet_StudentPortlet")),
                properties);
    }

    @Deactivate
    public void deactivate() {
        _serviceRegistration.unregister();
    }

    private ServiceRegistration<PortletResourcePermission> _serviceRegistration;

    @Reference
    private StagingPermission _stagingPermission;

}