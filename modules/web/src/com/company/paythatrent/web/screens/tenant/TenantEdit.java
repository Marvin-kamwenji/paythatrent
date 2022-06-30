package com.company.paythatrent.web.screens.tenant;

import com.haulmont.cuba.gui.screen.*;
import com.company.paythatrent.entity.Tenant;

@UiController("paythatrent_Tenant.edit")
@UiDescriptor("tenant-edit.xml")
@EditedEntityContainer("tenantDc")
@LoadDataBeforeShow
public class TenantEdit extends StandardEditor<Tenant> {
}