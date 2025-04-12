/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.material.datepicker;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$x;
import androidx.recyclerview.widget.RecyclerView$y;
import com.google.android.material.datepicker.SmoothCalendarLayoutManager$1;

class SmoothCalendarLayoutManager
extends LinearLayoutManager {
    private static final float MILLISECONDS_PER_INCH = 100.0f;

    public SmoothCalendarLayoutManager(Context context, int n3, boolean bl2) {
        super(context, n3, bl2);
    }

    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView$y object, int n3) {
        recyclerView = recyclerView.getContext();
        object = new SmoothCalendarLayoutManager$1(this, (Context)recyclerView);
        ((RecyclerView$x)object).setTargetPosition(n3);
        this.startSmoothScroll((RecyclerView$x)object);
    }
}

