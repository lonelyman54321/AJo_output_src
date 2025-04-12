/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.timepicker;

import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.button.MaterialButtonToggleGroup$OnButtonCheckedListener;
import com.google.android.material.timepicker.TimePickerView;

public final class d
implements MaterialButtonToggleGroup$OnButtonCheckedListener {
    public final /* synthetic */ TimePickerView a;

    public /* synthetic */ d(TimePickerView timePickerView) {
        this.a = timePickerView;
    }

    public final void onButtonChecked(MaterialButtonToggleGroup materialButtonToggleGroup, int n3, boolean bl2) {
        TimePickerView.a(this.a, materialButtonToggleGroup, n3, bl2);
    }
}

