/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.LayoutInflater
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.TextView
 */
package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$f;
import com.google.android.material.R$layout;
import com.google.android.material.datepicker.CalendarItemStyle;
import com.google.android.material.datepicker.DateStrings;
import com.google.android.material.datepicker.MaterialCalendar;
import com.google.android.material.datepicker.UtcDates;
import com.google.android.material.datepicker.YearGridAdapter$1;
import com.google.android.material.datepicker.YearGridAdapter$ViewHolder;
import java.util.Calendar;
import java.util.Locale;

class YearGridAdapter
extends RecyclerView$f {
    private final MaterialCalendar materialCalendar;

    public YearGridAdapter(MaterialCalendar materialCalendar) {
        this.materialCalendar = materialCalendar;
    }

    public static /* synthetic */ MaterialCalendar access$000(YearGridAdapter yearGridAdapter) {
        return yearGridAdapter.materialCalendar;
    }

    private View.OnClickListener createYearClickListener(int n3) {
        YearGridAdapter$1 yearGridAdapter$1 = new YearGridAdapter$1(this, n3);
        return yearGridAdapter$1;
    }

    public int getItemCount() {
        return this.materialCalendar.getCalendarConstraints().getYearSpan();
    }

    public int getPositionForYear(int n3) {
        int n4 = this.materialCalendar.getCalendarConstraints().getStart().year;
        return n3 - n4;
    }

    public int getYearForPosition(int n3) {
        return this.materialCalendar.getCalendarConstraints().getStart().year + n3;
    }

    public void onBindViewHolder(YearGridAdapter$ViewHolder yearGridAdapter$ViewHolder, int n3) {
        n3 = this.getYearForPosition(n3);
        Object object = yearGridAdapter$ViewHolder.textView;
        Object object2 = Locale.getDefault();
        Object object3 = n3;
        int n4 = 1;
        Object object4 = new Object[n4];
        int n7 = 0;
        Long l2 = null;
        object4[0] = object3;
        object3 = "%d";
        object2 = String.format((Locale)object2, (String)object3, (Object[])object4);
        object.setText((CharSequence)object2);
        object = yearGridAdapter$ViewHolder.textView;
        object2 = DateStrings.getYearContentDescription(object.getContext(), n3);
        object.setContentDescription((CharSequence)object2);
        object = this.materialCalendar.getCalendarStyle();
        object2 = UtcDates.getTodayCalendar();
        int n8 = ((Calendar)object2).get(n4);
        object3 = n8 == n3 ? object.todayYear : object.year;
        object4 = this.materialCalendar.getDateSelector().getSelectedDays().iterator();
        while ((n7 = object4.hasNext()) != 0) {
            l2 = (Long)object4.next();
            long l3 = l2;
            ((Calendar)object2).setTimeInMillis(l3);
            n7 = ((Calendar)object2).get(n4);
            if (n7 != n3) continue;
            object3 = object.selectedYear;
        }
        object = yearGridAdapter$ViewHolder.textView;
        ((CalendarItemStyle)object3).styleItem((TextView)object);
        yearGridAdapter$ViewHolder = yearGridAdapter$ViewHolder.textView;
        View.OnClickListener onClickListener = this.createYearClickListener(n3);
        yearGridAdapter$ViewHolder.setOnClickListener(onClickListener);
    }

    public YearGridAdapter$ViewHolder onCreateViewHolder(ViewGroup viewGroup, int n3) {
        Object object = LayoutInflater.from((Context)viewGroup.getContext());
        int n4 = R$layout.mtrl_calendar_year;
        viewGroup = (TextView)object.inflate(n4, viewGroup, false);
        object = new YearGridAdapter$ViewHolder((TextView)viewGroup);
        return object;
    }
}

