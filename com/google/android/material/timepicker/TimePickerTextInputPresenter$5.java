/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 */
package com.google.android.material.timepicker;

import android.content.Context;
import android.view.View;
import com.google.android.material.R$string;
import com.google.android.material.timepicker.ClickActionDelegate;
import com.google.android.material.timepicker.TimeModel;
import com.google.android.material.timepicker.TimePickerTextInputPresenter;

class TimePickerTextInputPresenter$5
extends ClickActionDelegate {
    final /* synthetic */ TimePickerTextInputPresenter this$0;
    final /* synthetic */ TimeModel val$time;

    public TimePickerTextInputPresenter$5(TimePickerTextInputPresenter timePickerTextInputPresenter, Context context, int n3, TimeModel timeModel) {
        this.this$0 = timePickerTextInputPresenter;
        this.val$time = timeModel;
        super(context, n3);
    }

    public void onInitializeAccessibilityNodeInfo(View object, C2 c2) {
        super.onInitializeAccessibilityNodeInfo((View)object, c2);
        object = object.getResources();
        int n3 = R$string.material_minute_suffix;
        String string2 = String.valueOf(this.val$time.minute);
        Object[] objectArray = new Object[]{string2};
        object = object.getString(n3, objectArray);
        c2.o((CharSequence)object);
    }
}

