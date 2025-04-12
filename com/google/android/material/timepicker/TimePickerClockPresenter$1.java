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
import com.google.android.material.timepicker.ClickActionDelegate;
import com.google.android.material.timepicker.TimePickerClockPresenter;

class TimePickerClockPresenter$1
extends ClickActionDelegate {
    final /* synthetic */ TimePickerClockPresenter this$0;

    public TimePickerClockPresenter$1(TimePickerClockPresenter timePickerClockPresenter, Context context, int n3) {
        this.this$0 = timePickerClockPresenter;
        super(context, n3);
    }

    public void onInitializeAccessibilityNodeInfo(View object, C2 c2) {
        super.onInitializeAccessibilityNodeInfo((View)object, c2);
        object = object.getResources();
        int n3 = TimePickerClockPresenter.access$000(this.this$0).getHourContentDescriptionResId();
        String string2 = String.valueOf(TimePickerClockPresenter.access$000(this.this$0).getHourForDisplay());
        Object[] objectArray = new Object[]{string2};
        object = object.getString(n3, objectArray);
        c2.o((CharSequence)object);
    }
}

