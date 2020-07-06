package com.liferay.myportlet.display.context;

import com.liferay.frontend.taglib.clay.servlet.taglib.util.DropdownItem;
import com.liferay.frontend.taglib.clay.servlet.taglib.util.DropdownItemList;

import javax.portlet.GenericPortlet;
import javax.portlet.PortletURL;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import java.util.ArrayList;
import java.util.List;

public class MenuDropdownDisplayContext {

    private PortletURL renderURL;
    private List<DropdownItem> collegeDropdownItems;
    private RenderResponse renderResponse;

    public MenuDropdownDisplayContext(RenderResponse renderResponse) {
        this.renderResponse = renderResponse;
    }

    public List<DropdownItem> getCollegeDropdownItems() {

        if (collegeDropdownItems != null) {
            return collegeDropdownItems;
        }

        renderURL = renderResponse.createRenderURL();
        renderURL.addProperty("mvcPath", "/view.jsp");

        collegeDropdownItems = new DropdownItemList() {
            {
                add(dropdownItem -> {
                    dropdownItem.setHref(renderURL, "collegeName", "mathCollege");
                    dropdownItem.setLabel("Math College");
                    dropdownItem.setActive(true);
                });

                add(dropdownItem -> {
                    dropdownItem.setHref(renderURL, "collegeName", "computerCollege");
                    dropdownItem.setLabel("Computer College");
                });

                add(dropdownItem -> {
                    dropdownItem.setHref(renderURL, "collegeName", "chemistryCollege");
                    dropdownItem.setLabel("Chemistry College");
                });

                add(dropdownItem -> {
                    dropdownItem.setHref(renderURL, "collegeName", "mechanicCollege");
                    dropdownItem.setLabel("Mechanic College");
                });

                add(dropdownItem -> {
                    dropdownItem.setHref(renderURL, "collegeName", "constructionCollege");
                    dropdownItem.setLabel("Construction College");
                });
            }

        };

        return collegeDropdownItems;
    }
}
