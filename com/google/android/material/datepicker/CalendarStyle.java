/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.TypedArray
 *  android.graphics.Paint
 */
package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import com.google.android.material.R$attr;
import com.google.android.material.R$styleable;
import com.google.android.material.datepicker.CalendarItemStyle;
import com.google.android.material.datepicker.MaterialCalendar;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.resources.MaterialResources;

final class CalendarStyle {
    final CalendarItemStyle day;
    final CalendarItemStyle invalidDay;
    final Paint rangeFill;
    final CalendarItemStyle selectedDay;
    final CalendarItemStyle selectedYear;
    final CalendarItemStyle todayDay;
    final CalendarItemStyle todayYear;
    final CalendarItemStyle year;

    public CalendarStyle(Context object) {
        CalendarItemStyle calendarItemStyle;
        int n3 = R$attr.materialCalendarStyle;
        Object object2 = MaterialCalendar.class.getCanonicalName();
        n3 = MaterialAttributes.resolveOrThrow(object, n3, (String)object2);
        object2 = R$styleable.MaterialCalendar;
        TypedArray typedArray = object.obtainStyledAttributes(n3, (int[])object2);
        int n4 = R$styleable.MaterialCalendar_dayStyle;
        n4 = typedArray.getResourceId(n4, 0);
        this.day = object2 = CalendarItemStyle.create(object, n4);
        n4 = R$styleable.MaterialCalendar_dayInvalidStyle;
        n4 = typedArray.getResourceId(n4, 0);
        this.invalidDay = object2 = CalendarItemStyle.create(object, n4);
        n4 = R$styleable.MaterialCalendar_daySelectedStyle;
        n4 = typedArray.getResourceId(n4, 0);
        this.selectedDay = object2 = CalendarItemStyle.create(object, n4);
        n4 = R$styleable.MaterialCalendar_dayTodayStyle;
        n4 = typedArray.getResourceId(n4, 0);
        this.todayDay = object2 = CalendarItemStyle.create(object, n4);
        n4 = R$styleable.MaterialCalendar_rangeFillColor;
        object2 = MaterialResources.getColorStateList(object, typedArray, n4);
        int n7 = R$styleable.MaterialCalendar_yearStyle;
        n7 = typedArray.getResourceId(n7, 0);
        this.year = calendarItemStyle = CalendarItemStyle.create(object, n7);
        n7 = R$styleable.MaterialCalendar_yearSelectedStyle;
        n7 = typedArray.getResourceId(n7, 0);
        this.selectedYear = calendarItemStyle = CalendarItemStyle.create(object, n7);
        n7 = R$styleable.MaterialCalendar_yearTodayStyle;
        int n8 = typedArray.getResourceId(n7, 0);
        object = CalendarItemStyle.create(object, n8);
        this.todayYear = object;
        this.rangeFill = object;
        n4 = object2.getDefaultColor();
        object.setColor(n4);
        typedArray.recycle();
    }
}

