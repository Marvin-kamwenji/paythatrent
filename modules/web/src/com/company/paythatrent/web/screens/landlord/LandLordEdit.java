package com.company.paythatrent.web.screens.landlord;

import com.haulmont.cuba.gui.screen.*;
import com.company.paythatrent.entity.landlordmanagement.LandLord;

@UiController("paythatrent_LandLord.edit")
@UiDescriptor("land-lord-edit.xml")
@EditedEntityContainer("landLordDc")
@LoadDataBeforeShow
public class LandLordEdit extends StandardEditor<LandLord> {
}