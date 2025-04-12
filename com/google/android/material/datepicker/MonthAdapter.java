/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.graphics.drawable.Drawable
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.BaseAdapter
 *  android.widget.TextView
 */
package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.google.android.material.R$layout;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.CalendarConstraints$DateValidator;
import com.google.android.material.datepicker.CalendarItemStyle;
import com.google.android.material.datepicker.CalendarStyle;
import com.google.android.material.datepicker.DateSelector;
import com.google.android.material.datepicker.DateStrings;
import com.google.android.material.datepicker.DayViewDecorator;
import com.google.android.material.datepicker.MaterialCalendarGridView;
import com.google.android.material.datepicker.Month;
import com.google.android.material.datepicker.UtcDates;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;

class MonthAdapter
extends BaseAdapter {
    private static final int MAXIMUM_GRID_CELLS = 0;
    static final int MAXIMUM_WEEKS = 0;
    private static final int NO_DAY_NUMBER = 255;
    final CalendarConstraints calendarConstraints;
    CalendarStyle calendarStyle;
    final DateSelector dateSelector;
    final DayViewDecorator dayViewDecorator;
    final Month month;
    private Collection previouslySelectedDates;

    static {
        MAXIMUM_WEEKS = UtcDates.getUtcCalendar().getMaximum(4);
        int n3 = UtcDates.getUtcCalendar().getMaximum(5);
        MAXIMUM_GRID_CELLS = UtcDates.getUtcCalendar().getMaximum(7) + n3 + -1;
    }

    public MonthAdapter(Month object, DateSelector dateSelector, CalendarConstraints calendarConstraints, DayViewDecorator dayViewDecorator) {
        this.month = object;
        this.dateSelector = dateSelector;
        this.calendarConstraints = calendarConstraints;
        this.dayViewDecorator = dayViewDecorator;
        this.previouslySelectedDates = object = dateSelector.getSelectedDays();
    }

    private String getDayContentDescription(Context context, long l2) {
        boolean bl2 = this.isToday(l2);
        boolean bl3 = this.isStartOfRange(l2);
        boolean bl4 = this.isEndOfRange(l2);
        return DateStrings.getDayContentDescription(context, l2, bl2, bl3, bl4);
    }

    private void initializeStyles(Context context) {
        CalendarStyle calendarStyle = this.calendarStyle;
        if (calendarStyle == null) {
            this.calendarStyle = calendarStyle = new CalendarStyle(context);
        }
    }

    private boolean isSelected(long l2) {
        boolean bl2;
        Iterator iterator = this.dateSelector.getSelectedDays().iterator();
        while (bl2 = iterator.hasNext()) {
            Long l3 = (Long)iterator.next();
            long l4 = l3;
            long l7 = UtcDates.canonicalYearMonthDay(l2);
            long l8 = l7 - (l4 = UtcDates.canonicalYearMonthDay(l4));
            Object object = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
            if (object != false) continue;
            return true;
        }
        return false;
    }

    private boolean isToday(long l2) {
        Calendar calendar = UtcDates.getTodayCalendar();
        long l3 = calendar.getTimeInMillis();
        long l4 = l3 - l2;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        boolean bl2 = object == false;
        return bl2;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void updateSelectedState(TextView textView, long l2, int n3) {
        int n4;
        Object object;
        boolean bl2;
        CalendarItemStyle calendarItemStyle;
        Object object2;
        boolean bl3;
        MonthAdapter monthAdapter = this;
        TextView textView2 = textView;
        if (textView == null) {
            return;
        }
        Context context = textView.getContext();
        String string2 = this.getDayContentDescription(context, l2);
        textView.setContentDescription((CharSequence)string2);
        CalendarConstraints$DateValidator calendarConstraints$DateValidator = this.calendarConstraints.getDateValidator();
        boolean bl4 = calendarConstraints$DateValidator.isValid(l2);
        if (bl4) {
            boolean bl5;
            textView.setEnabled(true);
            bl3 = this.isSelected(l2);
            textView.setSelected(bl3);
            object2 = bl3 ? this.calendarStyle.selectedDay : ((bl5 = this.isToday(l2)) ? this.calendarStyle.todayDay : this.calendarStyle.day);
            calendarItemStyle = object2;
            bl2 = bl3;
        } else {
            boolean bl6 = false;
            object2 = null;
            textView.setEnabled(false);
            object = this.calendarStyle.invalidDay;
            calendarItemStyle = object;
            bl2 = false;
        }
        object2 = monthAdapter.dayViewDecorator;
        if (object2 != null && n3 != (n4 = -1)) {
            object = monthAdapter.month;
            boolean bl7 = ((Month)object).year;
            int n7 = ((Month)object).month;
            object = context;
            bl3 = bl7;
            int n8 = n7;
            boolean bl8 = bl2;
            ColorStateList colorStateList = ((DayViewDecorator)object2).getBackgroundColor(context, (int)(bl7 ? 1 : 0), n8, n3, bl4, bl2);
            object2 = monthAdapter.dayViewDecorator;
            ColorStateList colorStateList2 = colorStateList;
            object2 = ((DayViewDecorator)object2).getTextColor(context, (int)(bl7 ? 1 : 0), n8, n3, bl4, bl2);
            calendarItemStyle.styleItem(textView2, colorStateList, (ColorStateList)object2);
            calendarItemStyle = monthAdapter.dayViewDecorator.getCompoundDrawableLeft(context, (int)(bl7 ? 1 : 0), n8, n3, bl4, bl2);
            colorStateList2 = monthAdapter.dayViewDecorator.getCompoundDrawableTop(context, (int)(bl7 ? 1 : 0), n8, n3, bl4, bl2);
            colorStateList = monthAdapter.dayViewDecorator.getCompoundDrawableRight(context, (int)(bl7 ? 1 : 0), n8, n3, bl4, bl2);
            object2 = monthAdapter.dayViewDecorator;
            String string3 = string2;
            string2 = colorStateList;
            object2 = ((DayViewDecorator)object2).getCompoundDrawableBottom(context, (int)(bl7 ? 1 : 0), n8, n3, bl4, bl2);
            textView2.setCompoundDrawables((Drawable)calendarItemStyle, (Drawable)colorStateList2, (Drawable)colorStateList, (Drawable)object2);
            object2 = monthAdapter.dayViewDecorator;
            String string4 = string3;
            object2 = ((DayViewDecorator)object2).getContentDescription((Context)object, (int)(bl7 ? 1 : 0), n8, n3, bl4, bl2, string3);
            textView2.setContentDescription((CharSequence)object2);
            return;
        }
        calendarItemStyle.styleItem(textView2);
    }

    private void updateSelectedStateForDate(MaterialCalendarGridView materialCalendarGridView, long l2) {
        Object object;
        Month month = Month.create(l2);
        int n3 = month.equals(object = this.month);
        if (n3 != 0) {
            month = this.month;
            n3 = month.getDayOfMonth(l2);
            object = materialCalendarGridView.getAdapter();
            int n4 = ((MonthAdapter)((Object)object)).dayToPosition(n3);
            int n7 = materialCalendarGridView.getFirstVisiblePosition();
            materialCalendarGridView = (TextView)materialCalendarGridView.getChildAt(n4 -= n7);
            this.updateSelectedState((TextView)materialCalendarGridView, l2, n3);
        }
    }

    public int dayToPosition(int n3) {
        return this.firstPositionInMonth() + (n3 += -1);
    }

    public int firstPositionInMonth() {
        Month month = this.month;
        int n3 = this.calendarConstraints.getFirstDayOfWeek();
        return month.daysFromStartOfWeekToFirstOfMonth(n3);
    }

    public int getCount() {
        return MAXIMUM_GRID_CELLS;
    }

    public Long getItem(int n3) {
        int n4 = this.firstPositionInMonth();
        if (n3 >= n4 && n3 <= (n4 = this.lastPositionInMonth())) {
            Month month = this.month;
            n3 = this.positionToDay(n3);
            return month.getDay(n3);
        }
        return null;
    }

    public long getItemId(int n3) {
        int n4 = this.month.daysInWeek;
        return n3 / n4;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public TextView getView(int var1_1, View var2_2, ViewGroup var3_3) {
        var4_4 = 1;
        var5_5 = var3_3 /* !! */ .getContext();
        this.initializeStyles(var5_5);
        var5_5 = var2_2;
        var5_5 = (TextView)var2_2;
        if (var2_2 == null) {
            var2_2 = LayoutInflater.from((Context)var3_3 /* !! */ .getContext());
            var6_6 = R$layout.mtrl_calendar_day;
            var2_2 = var2_2.inflate(var6_6, var3_3 /* !! */ , false);
            var5_5 = var2_2;
            var5_5 = (TextView)var2_2;
        }
        var7_7 = this.firstPositionInMonth();
        if ((var7_7 = var1_1 - var7_7) < 0) ** GOTO lbl-1000
        var3_3 /* !! */  = this.month;
        var8_8 = var3_3 /* !! */ .daysInMonth;
        if (var7_7 < var8_8) {
            var5_5.setTag((Object)var3_3 /* !! */ );
            var3_3 /* !! */  = var5_5.getResources().getConfiguration().locale;
            var9_9 = var7_7 += var4_4;
            var10_10 = new Object[var4_4];
            var10_10[0] = var9_9;
            var9_9 = "%d";
            var3_3 /* !! */  = String.format((Locale)var3_3 /* !! */ , (String)var9_9, var10_10);
            var5_5.setText((CharSequence)var3_3 /* !! */ );
            var5_5.setVisibility(0);
            var5_5.setEnabled((boolean)var4_4);
        } else lbl-1000:
        // 2 sources

        {
            var5_5.setVisibility(8);
            var5_5.setEnabled(false);
            var7_7 = -1;
        }
        var11_11 = this.getItem(var1_1);
        if (var11_11 == null) {
            return var5_5;
        }
        var12_12 = var11_11;
        this.updateSelectedState((TextView)var5_5, var12_12, var7_7);
        return var5_5;
    }

    public boolean hasStableIds() {
        return true;
    }

    public boolean isEndOfRange(long l2) {
        boolean bl2;
        Iterator iterator = this.dateSelector.getSelectedRanges().iterator();
        while (bl2 = iterator.hasNext()) {
            long l3;
            long l4;
            long l7;
            Object object = ((lm2)iterator.next()).b;
            if (object == null || (l7 = (l4 = (l3 = ((Long)(object = (Long)object)).longValue()) - l2) == 0L ? 0 : (l4 < 0L ? -1 : 1)) != false) continue;
            return true;
        }
        return false;
    }

    public boolean isFirstInRow(int n3) {
        Month month = this.month;
        int n4 = month.daysInWeek;
        n3 = (n3 %= n4) == 0 ? 1 : 0;
        return n3 != 0;
    }

    public boolean isLastInRow(int n3) {
        int n4 = 1;
        n3 += n4;
        Month month = this.month;
        int n7 = month.daysInWeek;
        if ((n3 %= n7) != 0) {
            n4 = 0;
        }
        return n4 != 0;
    }

    public boolean isStartOfRange(long l2) {
        boolean bl2;
        Iterator iterator = this.dateSelector.getSelectedRanges().iterator();
        while (bl2 = iterator.hasNext()) {
            long l3;
            long l4;
            long l7;
            Object object = ((lm2)iterator.next()).a;
            if (object == null || (l7 = (l4 = (l3 = ((Long)(object = (Long)object)).longValue()) - l2) == 0L ? 0 : (l4 < 0L ? -1 : 1)) != false) continue;
            return true;
        }
        return false;
    }

    public int lastPositionInMonth() {
        int n3 = this.firstPositionInMonth();
        int n4 = this.month.daysInMonth;
        return n3 + n4 + -1;
    }

    public int positionToDay(int n3) {
        int n4 = this.firstPositionInMonth();
        return n3 - n4 + 1;
    }

    public void updateSelectedStates(MaterialCalendarGridView object) {
        long l2;
        Long l3;
        boolean bl2;
        Object object2 = this.previouslySelectedDates.iterator();
        while (bl2 = object2.hasNext()) {
            l3 = (Long)object2.next();
            l2 = l3;
            this.updateSelectedStateForDate((MaterialCalendarGridView)((Object)object), l2);
        }
        object2 = this.dateSelector;
        if (object2 != null) {
            object2 = object2.getSelectedDays().iterator();
            while (bl2 = object2.hasNext()) {
                l3 = (Long)object2.next();
                l2 = l3;
                this.updateSelectedStateForDate((MaterialCalendarGridView)((Object)object), l2);
            }
            object = this.dateSelector.getSelectedDays();
            this.previouslySelectedDates = object;
        }
    }

    public boolean withinMonth(int n3) {
        int n4 = this.firstPositionInMonth();
        n3 = n3 >= n4 && n3 <= (n4 = this.lastPositionInMonth()) ? 1 : 0;
        return n3 != 0;
    }
}

