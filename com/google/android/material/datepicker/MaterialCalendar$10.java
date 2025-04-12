/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.material.datepicker.MaterialCalendar;
import com.google.android.material.datepicker.Month;
import com.google.android.material.datepicker.MonthsPagerAdapter;

class MaterialCalendar$10
implements View.OnClickListener {
    final /* synthetic */ MaterialCalendar this$0;
    final /* synthetic */ MonthsPagerAdapter val$monthsPagerAdapter;

    public MaterialCalendar$10(MaterialCalendar materialCalendar, MonthsPagerAdapter monthsPagerAdapter) {
        this.this$0 = materialCalendar;
        this.val$monthsPagerAdapter = monthsPagerAdapter;
    }

    public void onClick(View object) {
        object = this.this$0.getLayoutManager();
        int n3 = ((LinearLayoutManager)object).findLastVisibleItemPosition() + -1;
        if (n3 >= 0) {
            MaterialCalendar materialCalendar = this.this$0;
            MonthsPagerAdapter monthsPagerAdapter = this.val$monthsPagerAdapter;
            object = monthsPagerAdapter.getPageMonth(n3);
            materialCalendar.setCurrentMonth((Month)object);
        }
    }
}

