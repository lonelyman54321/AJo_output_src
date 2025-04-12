/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.datepicker;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$s;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.datepicker.MaterialCalendar;
import com.google.android.material.datepicker.Month;
import com.google.android.material.datepicker.MonthsPagerAdapter;

class MaterialCalendar$7
extends RecyclerView$s {
    final /* synthetic */ MaterialCalendar this$0;
    final /* synthetic */ MaterialButton val$monthDropSelect;
    final /* synthetic */ MonthsPagerAdapter val$monthsPagerAdapter;

    public MaterialCalendar$7(MaterialCalendar materialCalendar, MonthsPagerAdapter monthsPagerAdapter, MaterialButton materialButton) {
        this.this$0 = materialCalendar;
        this.val$monthsPagerAdapter = monthsPagerAdapter;
        this.val$monthDropSelect = materialButton;
    }

    public void onScrollStateChanged(RecyclerView recyclerView, int n3) {
        if (n3 == 0) {
            CharSequence charSequence = this.val$monthDropSelect.getText();
            recyclerView.announceForAccessibility(charSequence);
        }
    }

    public void onScrolled(RecyclerView object, int n3, int n4) {
        int n7;
        if (n3 < 0) {
            object = this.this$0.getLayoutManager();
            n7 = ((LinearLayoutManager)object).findFirstVisibleItemPosition();
        } else {
            object = this.this$0.getLayoutManager();
            n7 = ((LinearLayoutManager)object).findLastVisibleItemPosition();
        }
        Object object2 = this.this$0;
        Month month = this.val$monthsPagerAdapter.getPageMonth(n7);
        MaterialCalendar.access$602((MaterialCalendar)object2, month);
        object2 = this.val$monthDropSelect;
        object = this.val$monthsPagerAdapter.getPageTitle(n7);
        object2.setText((CharSequence)object);
    }
}

