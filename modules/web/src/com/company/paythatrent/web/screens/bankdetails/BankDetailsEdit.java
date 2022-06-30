package com.company.paythatrent.web.screens.bankdetails;

import com.haulmont.cuba.gui.screen.*;
import com.company.paythatrent.entity.employermanagement.BankDetails;

@UiController("paythatrent_BankDetails.edit")
@UiDescriptor("bank-details-edit.xml")
@EditedEntityContainer("bankDetailsDc")
@LoadDataBeforeShow
public class BankDetailsEdit extends StandardEditor<BankDetails> {
}