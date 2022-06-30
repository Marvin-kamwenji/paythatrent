package com.company.paythatrent.web.screens.bankdetails;

import com.haulmont.cuba.gui.screen.*;
import com.company.paythatrent.entity.employermanagement.BankDetails;

@UiController("paythatrent_BankDetails.browse")
@UiDescriptor("bank-details-browse.xml")
@LookupComponent("bankDetailsesTable")
@LoadDataBeforeShow
public class BankDetailsBrowse extends StandardLookup<BankDetails> {
}