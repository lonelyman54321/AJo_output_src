/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
package com.google.android.material.timepicker;

import android.view.View;
import com.google.android.material.timepicker.MaterialTimePicker;
import java.util.Iterator;

class MaterialTimePicker$2
implements View.OnClickListener {
    final /* synthetic */ MaterialTimePicker this$0;

    public MaterialTimePicker$2(MaterialTimePicker materialTimePicker) {
        this.this$0 = materialTimePicker;
    }

    public void onClick(View view) {
        boolean bl2;
        Iterator iterator = MaterialTimePicker.access$1000(this.this$0).iterator();
        while (bl2 = iterator.hasNext()) {
            View.OnClickListener onClickListener = (View.OnClickListener)iterator.next();
            onClickListener.onClick(view);
        }
        this.this$0.dismiss();
    }
}

