/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.material.datepicker;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$y;
import com.google.android.material.datepicker.MaterialCalendar;
import com.google.android.material.datepicker.SmoothCalendarLayoutManager;

class MaterialCalendar$2
extends SmoothCalendarLayoutManager {
    final /* synthetic */ MaterialCalendar this$0;
    final /* synthetic */ int val$orientation;

    public MaterialCalendar$2(MaterialCalendar materialCalendar, Context context, int n3, boolean bl2, int n4) {
        this.this$0 = materialCalendar;
        this.val$orientation = n4;
        super(context, n3, bl2);
    }

    public void calculateExtraLayoutSpace(RecyclerView$y object, int[] nArray) {
        int n3 = this.val$orientation;
        int n4 = 1;
        if (n3 == 0) {
            nArray[0] = n3 = MaterialCalendar.access$000(this.this$0).getWidth();
            object = MaterialCalendar.access$000(this.this$0);
            nArray[n4] = n3 = object.getWidth();
        } else {
            nArray[0] = n3 = MaterialCalendar.access$000(this.this$0).getHeight();
            object = MaterialCalendar.access$000(this.this$0);
            nArray[n4] = n3 = object.getHeight();
        }
    }
}

