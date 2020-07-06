package com.liferay.myportlet.display.context;

import com.liferay.frontend.taglib.clay.servlet.taglib.util.DropdownItem;
import com.liferay.frontend.taglib.clay.servlet.taglib.util.DropdownItemList;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import javax.portlet.PortletURL;
import javax.portlet.RenderResponse;
import java.util.List;

public class CardsDropdownDisplayContext {

    private RenderResponse renderResponse;
    private List<DropdownItem> teacherDropdownItems;

    private static Log _log = LogFactoryUtil.getLog(CardsDropdownDisplayContext.class);

    public CardsDropdownDisplayContext(RenderResponse renderResponse) {
        this.renderResponse = renderResponse;
    }

    private PortletURL getEditRenderURL(long teacherId){
        PortletURL editTeacherURL = renderResponse.createRenderURL();
        editTeacherURL.addProperty("mvcPath","/edit_teacher.jsp");
        editTeacherURL.addProperty("teacherId", String.valueOf(teacherId));
        return editTeacherURL;
    }

    private PortletURL getDeleteActionURL(long teacherId){
        PortletURL actionURL = renderResponse.createActionURL();
        actionURL.addProperty("javax.portlet.action", "deleteTeacher");
        actionURL.addProperty("teacherId", String.valueOf(teacherId));
        return actionURL;
    }



    public List<DropdownItem> getTeacherDropdownItems(long teacherId) {

        PortletURL editTeacherURL = renderResponse.createRenderURL();
        PortletURL deleteTeacherURL = renderResponse.createActionURL();


        teacherDropdownItems = new DropdownItemList(){
            {
                add(dropdownItem -> {
                    dropdownItem.setLabel("Edit");
                    dropdownItem.setHref(editTeacherURL,"mvcPath","/edit_teacher.jsp");
                });

                add(dropdownItem -> {
                    dropdownItem.setLabel("Delete");
                    dropdownItem.setHref(deleteTeacherURL,"javax.portlet.action","deleteTeacher","teacherId", teacherId,"dd",teacherDropdownItems);
                });
            }
        };

        return teacherDropdownItems;
    }
}
