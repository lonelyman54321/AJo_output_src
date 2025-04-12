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
import com.google.android.material.datepicker.MaterialCalendar$CalendarSelector;
import com.google.android.material.datepicker.Month;
import com.google.android.material.datepicker.YearGridAdapter;

class YearGridAdapter$1
implements View.OnClickListener {
    final /* synthetic */ YearGridAdapter this$0;
    final /* synthetic */ int val$year;

    public YearGridAdapter$1(YearGridAdapter yearGridAdapter, int n3) {
        this.this$0 = yearGridAdapter;
        this.val$year = n3;
    }

    public void onClick(View object) {
        int n3 = this.val$year;
        int n4 = YearGridAdapter.access$000((YearGridAdapter)this.this$0).getCurrentMonth().month;
        object = Month.create(n3, n4);
        object = YearGridAdapter.access$000(this.this$0).getCalendarConstraints().clamp((Month)object);
        YearGridAdapter.access$000(this.this$0).setCurrentMonth((Month)object);
        object = YearGridAdapter.access$000(this.this$0);
        MaterialCalendar$CalendarSelector materialCalendar$CalendarSelector = MaterialCalendar$CalendarSelector.DAY;
        ((MaterialCalendar)object).setSelector(materialCalendar$CalendarSelector);
    }
}

