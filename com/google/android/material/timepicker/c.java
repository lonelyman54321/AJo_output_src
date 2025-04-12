/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.timepicker;

import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.button.MaterialButtonToggleGroup$OnButtonCheckedListener;
import com.google.android.material.timepicker.TimePickerTextInputPresenter;

public final class c
implements MaterialButtonToggleGroup$OnButtonCheckedListener {
    public final /* synthetic */ TimePickerTextInputPresenter a;

    public /* synthetic */ c(TimePickerTextInputPresenter timePickerTextInputPresenter) {
        this.a = timePickerTextInputPresenter;
    }

    public final void onButtonChecked(MaterialButtonToggleGroup materialButtonToggleGroup, int n3, boolean bl2) {
        TimePickerTextInputPresenter.a(this.a, materialButtonToggleGroup, n3, bl2);
    }
}

