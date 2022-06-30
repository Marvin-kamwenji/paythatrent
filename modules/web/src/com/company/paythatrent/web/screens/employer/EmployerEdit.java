package com.company.paythatrent.web.screens.employer;

import com.haulmont.cuba.gui.screen.*;
import com.company.paythatrent.entity.employermanagement.Employer;

@UiController("paythatrent_Employer.edit")
@UiDescriptor("employer-edit.xml")
@EditedEntityContainer("employerDc")
@LoadDataBeforeShow
public class EmployerEdit extends StandardEditor<Employer> {
}