package com.company.paythatrent.web.screens.tenant;

import com.haulmont.cuba.gui.screen.*;
import com.company.paythatrent.entity.Tenant;

@UiController("paythatrent_Tenant.browse")
@UiDescriptor("tenant-browse.xml")
@LookupComponent("tenantsTable")
@LoadDataBeforeShow
public class TenantBrowse extends StandardLookup<Tenant> {
}