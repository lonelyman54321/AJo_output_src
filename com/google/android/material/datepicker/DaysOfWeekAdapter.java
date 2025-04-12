/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Build$VERSION
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.BaseAdapter
 *  android.widget.TextView
 */
package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.google.android.material.R$layout;
import com.google.android.material.R$string;
import com.google.android.material.datepicker.UtcDates;
import java.util.Calendar;
import java.util.Locale;

class DaysOfWeekAdapter
extends BaseAdapter {
    private static final int CALENDAR_DAY_STYLE = 0;
    private static final int NARROW_FORMAT = 4;
    private final Calendar calendar;
    private final int daysInWeek;
    private final int firstDayOfWeek;

    static {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 26;
        n3 = n3 >= n4 ? 4 : 1;
        CALENDAR_DAY_STYLE = n3;
    }

    public DaysOfWeekAdapter() {
        int n3;
        int n4;
        Calendar calendar;
        this.calendar = calendar = UtcDates.getUtcCalendar();
        this.daysInWeek = n4 = calendar.getMaximum(7);
        this.firstDayOfWeek = n3 = calendar.getFirstDayOfWeek();
    }

    public DaysOfWeekAdapter(int n3) {
        int n4;
        Calendar calendar;
        this.calendar = calendar = UtcDates.getUtcCalendar();
        this.daysInWeek = n4 = calendar.getMaximum(7);
        this.firstDayOfWeek = n3;
    }

    private int positionToDayOfWeek(int n3) {
        int n4 = this.firstDayOfWeek;
        if ((n3 += n4) > (n4 = this.daysInWeek)) {
            n3 -= n4;
        }
        return n3;
    }

    public int getCount() {
        return this.daysInWeek;
    }

    public Integer getItem(int n3) {
        int n4 = this.daysInWeek;
        if (n3 >= n4) {
            return null;
        }
        return this.positionToDayOfWeek(n3);
    }

    public long getItemId(int n3) {
        return 0L;
    }

    public View getView(int n3, View object, ViewGroup objectArray) {
        Object object2 = object;
        object2 = (TextView)object;
        if (object == null) {
            object = LayoutInflater.from((Context)objectArray.getContext());
            int n4 = R$layout.mtrl_calendar_day_of_week;
            object = object.inflate(n4, (ViewGroup)objectArray, false);
            object2 = object;
            object2 = (TextView)object;
        }
        object = this.calendar;
        n3 = this.positionToDayOfWeek(n3);
        int n7 = 7;
        ((Calendar)object).set(n7, n3);
        Object object3 = object2.getResources().getConfiguration().locale;
        object = this.calendar;
        int n8 = CALENDAR_DAY_STYLE;
        object3 = ((Calendar)object).getDisplayName(n7, n8, (Locale)object3);
        object2.setText((CharSequence)object3);
        object3 = objectArray.getContext();
        int n10 = R$string.mtrl_picker_day_of_week_column_header;
        object3 = object3.getString(n10);
        object = this.calendar;
        Locale locale = Locale.getDefault();
        object = ((Calendar)object).getDisplayName(n7, 2, locale);
        objectArray = new Object[]{object};
        object3 = String.format((String)object3, objectArray);
        object2.setContentDescription((CharSequence)object3);
        return object2;
    }
}

