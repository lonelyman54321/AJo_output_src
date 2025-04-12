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
import com.google.android.material.timepicker.TimePickerView;
import com.google.android.material.timepicker.TimePickerView$OnSelectionChange;

class TimePickerView$1
implements View.OnClickListener {
    final /* synthetic */ TimePickerView this$0;

    public TimePickerView$1(TimePickerView timePickerView) {
        this.this$0 = timePickerView;
    }

    public void onClick(View object) {
        TimePickerView$OnSelectionChange timePickerView$OnSelectionChange = TimePickerView.access$000(this.this$0);
        if (timePickerView$OnSelectionChange != null) {
            timePickerView$OnSelectionChange = TimePickerView.access$000(this.this$0);
            int n3 = R$id.selection_type;
            object = (Integer)object.getTag(n3);
            int n4 = (Integer)object;
            timePickerView$OnSelectionChange.onSelectionChanged(n4);
        }
    }
}

