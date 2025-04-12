/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
package com.google.android.material.timepicker;

import android.view.View;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.timepicker.MaterialTimePicker;

class MaterialTimePicker$3
implements View.OnClickListener {
    final /* synthetic */ MaterialTimePicker this$0;

    public MaterialTimePicker$3(MaterialTimePicker materialTimePicker) {
        this.this$0 = materialTimePicker;
    }

    public void onClick(View object) {
        MaterialButton materialButton;
        object = this.this$0;
        int n3 = MaterialTimePicker.access$1100((MaterialTimePicker)object);
        if (n3 == 0) {
            n3 = 1;
        } else {
            n3 = 0;
            materialButton = null;
        }
        MaterialTimePicker.access$1102((MaterialTimePicker)object, n3);
        object = this.this$0;
        materialButton = MaterialTimePicker.access$1200((MaterialTimePicker)object);
        MaterialTimePicker.access$1300((MaterialTimePicker)object, materialButton);
    }
}

