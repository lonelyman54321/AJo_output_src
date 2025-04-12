/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
package com.google.android.material.timepicker;

import android.view.View;
import com.google.android.material.R$id;
import com.google.android.material.timepicker.TimePickerTextInputPresenter;

class TimePickerTextInputPresenter$3
implements View.OnClickListener {
    final /* synthetic */ TimePickerTextInputPresenter this$0;

    public TimePickerTextInputPresenter$3(TimePickerTextInputPresenter timePickerTextInputPresenter) {
        this.this$0 = timePickerTextInputPresenter;
    }

    public void onClick(View view) {
        TimePickerTextInputPresenter timePickerTextInputPresenter = this.this$0;
        int n3 = R$id.selection_type;
        int n4 = (Integer)view.getTag(n3);
        timePickerTextInputPresenter.onSelectionChanged(n4);
    }
}

