/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.Editable
 *  android.text.TextUtils
 */
package com.google.android.material.timepicker;

import android.text.Editable;
import android.text.TextUtils;
import com.google.android.material.internal.TextWatcherAdapter;
import com.google.android.material.timepicker.TimeModel;
import com.google.android.material.timepicker.TimePickerTextInputPresenter;

class TimePickerTextInputPresenter$2
extends TextWatcherAdapter {
    final /* synthetic */ TimePickerTextInputPresenter this$0;

    public TimePickerTextInputPresenter$2(TimePickerTextInputPresenter timePickerTextInputPresenter) {
        this.this$0 = timePickerTextInputPresenter;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void afterTextChanged(Editable object) {
        try {
            boolean bl2 = TextUtils.isEmpty((CharSequence)object);
            if (bl2) {
                object = this.this$0;
                object = TimePickerTextInputPresenter.access$000((TimePickerTextInputPresenter)object);
                bl2 = false;
                Object var3_3 = null;
                ((TimeModel)object).setHour(0);
                return;
            }
            object = object.toString();
            int n3 = Integer.parseInt((String)object);
            Object object2 = this.this$0;
            object2 = TimePickerTextInputPresenter.access$000((TimePickerTextInputPresenter)object2);
            ((TimeModel)object2).setHour(n3);
            return;
        }
        catch (NumberFormatException numberFormatException) {
            return;
        }
    }
}

