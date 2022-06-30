package com.company.paythatrent.web.screens.employer;

import com.haulmont.cuba.gui.screen.*;
import com.company.paythatrent.entity.employermanagement.Employer;

@UiController("paythatrent_Employer.browse")
@UiDescriptor("employer-browse.xml")
@LookupComponent("employersTable")
@LoadDataBeforeShow
public class EmployerBrowse extends StandardLookup<Employer> {
}