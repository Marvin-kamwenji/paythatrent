package com.company.paythatrent.web.screens.landlord;

import com.haulmont.cuba.gui.screen.*;
import com.company.paythatrent.entity.landlordmanagement.LandLord;

@UiController("paythatrent_LandLord.browse")
@UiDescriptor("land-lord-browse.xml")
@LookupComponent("landLordsTable")
@LoadDataBeforeShow
public class LandLordBrowse extends StandardLookup<LandLord> {
}