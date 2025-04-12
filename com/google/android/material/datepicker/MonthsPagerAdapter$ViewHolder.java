/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.LinearLayout
 *  android.widget.TextView
 */
package com.google.android.material.datepicker;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewCompat$a;
import androidx.recyclerview.widget.RecyclerView$B;
import com.google.android.material.R$id;
import com.google.android.material.datepicker.MaterialCalendarGridView;

public class MonthsPagerAdapter$ViewHolder
extends RecyclerView$B {
    final MaterialCalendarGridView monthGrid;
    final TextView monthTitle;

    public MonthsPagerAdapter$ViewHolder(LinearLayout object, boolean bl2) {
        super((View)object);
        TextView textView;
        int n3 = R$id.month_title;
        this.monthTitle = textView = (TextView)object.findViewById(n3);
        Object object2 = ViewCompat.a;
        int n4 = androidx.core.R$id.tag_accessibility_heading;
        Class<Boolean> clazz = Boolean.class;
        int n7 = 28;
        object2 = new ViewCompat$a(n4, clazz, 0, n7);
        Boolean bl3 = Boolean.TRUE;
        ((ViewCompat$a)object2).d((View)textView, bl3);
        int n8 = R$id.month_grid;
        object = (MaterialCalendarGridView)object.findViewById(n8);
        this.monthGrid = object;
        if (!bl2) {
            int n10 = 8;
            textView.setVisibility(n10);
        }
    }
}

