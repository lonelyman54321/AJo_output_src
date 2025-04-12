/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
package com.google.android.material.datepicker;

import android.view.View;
import com.google.android.material.datepicker.MaterialCalendar;

class MaterialCalendar$8
implements View.OnClickListener {
    final /* synthetic */ MaterialCalendar this$0;

    public MaterialCalendar$8(MaterialCalendar materialCalendar) {
        this.this$0 = materialCalendar;
    }

    public void onClick(View view) {
        this.this$0.toggleVisibleSelector();
    }
}

