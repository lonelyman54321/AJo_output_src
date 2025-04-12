/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.LayoutInflater
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.AdapterView$OnItemClickListener
 *  android.widget.LinearLayout
 *  android.widget.ListAdapter
 */
package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView$LayoutParams;
import androidx.recyclerview.widget.RecyclerView$f;
import com.google.android.material.R$id;
import com.google.android.material.R$layout;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.DateSelector;
import com.google.android.material.datepicker.DayViewDecorator;
import com.google.android.material.datepicker.MaterialCalendar;
import com.google.android.material.datepicker.MaterialCalendar$OnDayClickListener;
import com.google.android.material.datepicker.MaterialCalendarGridView;
import com.google.android.material.datepicker.MaterialDatePicker;
import com.google.android.material.datepicker.Month;
import com.google.android.material.datepicker.MonthAdapter;
import com.google.android.material.datepicker.MonthsPagerAdapter$1;
import com.google.android.material.datepicker.MonthsPagerAdapter$ViewHolder;

class MonthsPagerAdapter
extends RecyclerView$f {
    private final CalendarConstraints calendarConstraints;
    private final DateSelector dateSelector;
    private final DayViewDecorator dayViewDecorator;
    private final int itemHeight;
    private final MaterialCalendar$OnDayClickListener onDayClickListener;

    public MonthsPagerAdapter(Context object, DateSelector dateSelector, CalendarConstraints calendarConstraints, DayViewDecorator dayViewDecorator, MaterialCalendar$OnDayClickListener materialCalendar$OnDayClickListener) {
        Month month = calendarConstraints.getStart();
        Month month2 = calendarConstraints.getEnd();
        Month month3 = calendarConstraints.getOpenAt();
        int n3 = month.compareTo(month3);
        if (n3 <= 0) {
            n3 = month3.compareTo(month2);
            if (n3 <= 0) {
                int n4;
                n3 = MonthAdapter.MAXIMUM_WEEKS;
                int n7 = MaterialCalendar.getDayHeight(object) * n3;
                n3 = (int)(MaterialDatePicker.isFullscreen(object) ? 1 : 0);
                if (n3 != 0) {
                    n4 = MaterialCalendar.getDayHeight(object);
                } else {
                    n4 = 0;
                    object = null;
                }
                this.itemHeight = n7 += n4;
                this.calendarConstraints = calendarConstraints;
                this.dateSelector = dateSelector;
                this.dayViewDecorator = dayViewDecorator;
                this.onDayClickListener = materialCalendar$OnDayClickListener;
                this.setHasStableIds(true);
                return;
            }
            super("currentPage cannot be after lastPage");
            throw object;
        }
        super("firstPage cannot be after currentPage");
        throw object;
    }

    public static /* synthetic */ MaterialCalendar$OnDayClickListener access$000(MonthsPagerAdapter monthsPagerAdapter) {
        return monthsPagerAdapter.onDayClickListener;
    }

    public int getItemCount() {
        return this.calendarConstraints.getMonthSpan();
    }

    public long getItemId(int n3) {
        return this.calendarConstraints.getStart().monthsLater(n3).getStableId();
    }

    public Month getPageMonth(int n3) {
        return this.calendarConstraints.getStart().monthsLater(n3);
    }

    public CharSequence getPageTitle(int n3) {
        return this.getPageMonth(n3).getLongName();
    }

    public int getPosition(Month month) {
        return this.calendarConstraints.getStart().monthsUntil(month);
    }

    public void onBindViewHolder(MonthsPagerAdapter$ViewHolder object, int n3) {
        Object object2 = this.calendarConstraints.getStart().monthsLater(n3);
        Object object3 = ((MonthsPagerAdapter$ViewHolder)object).monthTitle;
        Object object4 = ((Month)object2).getLongName();
        object3.setText((CharSequence)object4);
        object = ((MonthsPagerAdapter$ViewHolder)object).monthGrid;
        int n4 = R$id.month_grid;
        object = (MaterialCalendarGridView)object.findViewById(n4);
        object3 = ((MaterialCalendarGridView)((Object)object)).getAdapter();
        if (object3 != null && (n4 = (int)(((Month)object2).equals(object3 = ((MaterialCalendarGridView)((Object)object)).getAdapter().month) ? 1 : 0)) != 0) {
            object.invalidate();
            object2 = ((MaterialCalendarGridView)((Object)object)).getAdapter();
            ((MonthAdapter)((Object)object2)).updateSelectedStates((MaterialCalendarGridView)((Object)object));
        } else {
            object4 = this.dateSelector;
            CalendarConstraints calendarConstraints = this.calendarConstraints;
            DayViewDecorator dayViewDecorator = this.dayViewDecorator;
            object3 = new MonthAdapter((Month)object2, (DateSelector)object4, calendarConstraints, dayViewDecorator);
            n3 = ((Month)object2).daysInWeek;
            object.setNumColumns(n3);
            ((MaterialCalendarGridView)((Object)object)).setAdapter((ListAdapter)object3);
        }
        object2 = new MonthsPagerAdapter$1(this, (MaterialCalendarGridView)((Object)object));
        object.setOnItemClickListener((AdapterView.OnItemClickListener)object2);
    }

    public MonthsPagerAdapter$ViewHolder onCreateViewHolder(ViewGroup object, int n3) {
        LayoutInflater layoutInflater = LayoutInflater.from((Context)object.getContext());
        int n4 = R$layout.mtrl_calendar_month_labeled;
        int n7 = 0;
        layoutInflater = (LinearLayout)layoutInflater.inflate(n4, object, false);
        boolean bl2 = MaterialDatePicker.isFullscreen((Context)(object = object.getContext()));
        if (bl2) {
            n7 = this.itemHeight;
            object = new RecyclerView$LayoutParams(-1, n7);
            layoutInflater.setLayoutParams((ViewGroup.LayoutParams)object);
            object = new MonthsPagerAdapter$ViewHolder((LinearLayout)layoutInflater, true);
            return object;
        }
        object = new MonthsPagerAdapter$ViewHolder((LinearLayout)layoutInflater, false);
        return object;
    }
}

