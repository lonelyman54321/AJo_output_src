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
import androidx.recyclerview.widget.RecyclerView$f;
import com.google.android.material.datepicker.MaterialCalendar;
import com.google.android.material.datepicker.Month;
import com.google.android.material.datepicker.MonthsPagerAdapter;

class MaterialCalendar$9
implements View.OnClickListener {
    final /* synthetic */ MaterialCalendar this$0;
    final /* synthetic */ MonthsPagerAdapter val$monthsPagerAdapter;

    public MaterialCalendar$9(MaterialCalendar materialCalendar, MonthsPagerAdapter monthsPagerAdapter) {
        this.this$0 = materialCalendar;
        this.val$monthsPagerAdapter = monthsPagerAdapter;
    }

    public void onClick(View object) {
        Object object2;
        int n3;
        object = this.this$0.getLayoutManager();
        int n4 = ((LinearLayoutManager)object).findFirstVisibleItemPosition() + 1;
        if (n4 < (n3 = ((RecyclerView$f)(object2 = MaterialCalendar.access$000(this.this$0).getAdapter())).getItemCount())) {
            object2 = this.this$0;
            MonthsPagerAdapter monthsPagerAdapter = this.val$monthsPagerAdapter;
            object = monthsPagerAdapter.getPageMonth(n4);
            ((MaterialCalendar)object2).setCurrentMonth((Month)object);
        }
    }
}

