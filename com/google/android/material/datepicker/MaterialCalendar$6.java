/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package com.google.android.material.datepicker;

import android.view.View;
import androidx.core.view.a;
import androidx.fragment.app.Fragment;
import com.google.android.material.R$string;
import com.google.android.material.datepicker.MaterialCalendar;

class MaterialCalendar$6
extends a {
    final /* synthetic */ MaterialCalendar this$0;

    public MaterialCalendar$6(MaterialCalendar materialCalendar) {
        this.this$0 = materialCalendar;
    }

    public void onInitializeAccessibilityNodeInfo(View object, C2 c2) {
        super.onInitializeAccessibilityNodeInfo((View)object, c2);
        object = MaterialCalendar.access$500(this.this$0);
        int n3 = object.getVisibility();
        if (n3 == 0) {
            object = this.this$0;
            int n4 = R$string.mtrl_picker_toggle_to_year_selection;
            object = ((Fragment)object).getString(n4);
        } else {
            object = this.this$0;
            int n7 = R$string.mtrl_picker_toggle_to_day_selection;
            object = ((Fragment)object).getString(n7);
        }
        c2.q((CharSequence)object);
    }
}

