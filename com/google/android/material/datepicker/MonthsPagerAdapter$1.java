/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.AdapterView
 *  android.widget.AdapterView$OnItemClickListener
 */
package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;
import com.google.android.material.datepicker.MaterialCalendarGridView;
import com.google.android.material.datepicker.MonthsPagerAdapter;

class MonthsPagerAdapter$1
implements AdapterView.OnItemClickListener {
    final /* synthetic */ MonthsPagerAdapter this$0;
    final /* synthetic */ MaterialCalendarGridView val$monthGrid;

    public MonthsPagerAdapter$1(MonthsPagerAdapter monthsPagerAdapter, MaterialCalendarGridView materialCalendarGridView) {
        this.this$0 = monthsPagerAdapter;
        this.val$monthGrid = materialCalendarGridView;
    }

    public void onItemClick(AdapterView object, View object2, int n3, long l2) {
        object = this.val$monthGrid.getAdapter();
        boolean bl2 = object.withinMonth(n3);
        if (bl2) {
            object = MonthsPagerAdapter.access$000(this.this$0);
            object2 = this.val$monthGrid.getAdapter().getItem(n3);
            long l3 = (Long)object2;
            object.onDayClick(l3);
        }
    }
}

