/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.DisplayMetrics
 */
package com.google.android.material.datepicker;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.o;
import com.google.android.material.datepicker.SmoothCalendarLayoutManager;

class SmoothCalendarLayoutManager$1
extends o {
    final /* synthetic */ SmoothCalendarLayoutManager this$0;

    public SmoothCalendarLayoutManager$1(SmoothCalendarLayoutManager smoothCalendarLayoutManager, Context context) {
        this.this$0 = smoothCalendarLayoutManager;
        super(context);
    }

    public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
        float f5 = displayMetrics.densityDpi;
        return 100.0f / f5;
    }
}

