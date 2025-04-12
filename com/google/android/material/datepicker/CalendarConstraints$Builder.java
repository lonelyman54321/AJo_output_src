/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Parcelable
 */
package com.google.android.material.datepicker;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.CalendarConstraints$DateValidator;
import com.google.android.material.datepicker.DateValidatorPointForward;
import com.google.android.material.datepicker.Month;
import com.google.android.material.datepicker.UtcDates;
import java.util.Objects;

public final class CalendarConstraints$Builder {
    private static final String DEEP_COPY_VALIDATOR_KEY = "DEEP_COPY_VALIDATOR_KEY";
    static final long DEFAULT_END;
    static final long DEFAULT_START;
    private long end;
    private int firstDayOfWeek;
    private Long openAt;
    private long start;
    private CalendarConstraints$DateValidator validator;

    static {
        DEFAULT_START = UtcDates.canonicalYearMonthDay(Month.create((int)1900, (int)0).timeInMillis);
        DEFAULT_END = UtcDates.canonicalYearMonthDay(Month.create((int)2100, (int)11).timeInMillis);
    }

    public CalendarConstraints$Builder() {
        long l2;
        this.start = l2 = DEFAULT_START;
        this.end = l2 = DEFAULT_END;
        DateValidatorPointForward dateValidatorPointForward = DateValidatorPointForward.from(Long.MIN_VALUE);
        this.validator = dateValidatorPointForward;
    }

    public CalendarConstraints$Builder(CalendarConstraints object) {
        int n3;
        long l2;
        this.start = l2 = DEFAULT_START;
        this.end = l2 = DEFAULT_END;
        Object object2 = DateValidatorPointForward.from(Long.MIN_VALUE);
        this.validator = object2;
        this.start = l2 = CalendarConstraints.access$100((CalendarConstraints)object).timeInMillis;
        this.end = l2 = CalendarConstraints.access$200((CalendarConstraints)object).timeInMillis;
        this.openAt = object2 = Long.valueOf(CalendarConstraints.access$300((CalendarConstraints)object).timeInMillis);
        this.firstDayOfWeek = n3 = CalendarConstraints.access$400(object);
        object = CalendarConstraints.access$500(object);
        this.validator = object;
    }

    public CalendarConstraints build() {
        Object object = new Bundle();
        Object object2 = this.validator;
        String string2 = DEEP_COPY_VALIDATOR_KEY;
        object.putParcelable(string2, (Parcelable)object2);
        long l2 = this.start;
        Month month = Month.create(l2);
        long l3 = this.end;
        Month month2 = Month.create(l3);
        object = object.getParcelable(string2);
        Object object3 = object;
        object3 = (CalendarConstraints$DateValidator)object;
        object = this.openAt;
        if (object == null) {
            object = null;
        } else {
            long l4 = (Long)object;
            object = Month.create(l4);
        }
        int n3 = this.firstDayOfWeek;
        object2 = new CalendarConstraints(month, month2, (CalendarConstraints$DateValidator)object3, (Month)object, n3, null);
        return object2;
    }

    public CalendarConstraints$Builder setEnd(long l2) {
        this.end = l2;
        return this;
    }

    public CalendarConstraints$Builder setFirstDayOfWeek(int n3) {
        this.firstDayOfWeek = n3;
        return this;
    }

    public CalendarConstraints$Builder setOpenAt(long l2) {
        Long l3;
        this.openAt = l3 = Long.valueOf(l2);
        return this;
    }

    public CalendarConstraints$Builder setStart(long l2) {
        this.start = l2;
        return this;
    }

    public CalendarConstraints$Builder setValidator(CalendarConstraints$DateValidator calendarConstraints$DateValidator) {
        Objects.requireNonNull(calendarConstraints$DateValidator, "validator cannot be null");
        this.validator = calendarConstraints$DateValidator;
        return this;
    }
}

