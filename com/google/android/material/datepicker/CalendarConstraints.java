/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.CalendarConstraints$1;
import com.google.android.material.datepicker.CalendarConstraints$DateValidator;
import com.google.android.material.datepicker.Month;
import com.google.android.material.datepicker.UtcDates;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Objects;

public final class CalendarConstraints
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    private final Month end;
    private final int firstDayOfWeek;
    private final int monthSpan;
    private Month openAt;
    private final Month start;
    private final CalendarConstraints$DateValidator validator;
    private final int yearSpan;

    static {
        CalendarConstraints$1 calendarConstraints$1 = new CalendarConstraints$1();
        CREATOR = calendarConstraints$1;
    }

    private CalendarConstraints(Month object, Month month, CalendarConstraints$DateValidator object2, Month month2, int n3) {
        int n4;
        int n7;
        Objects.requireNonNull(object, "start cannot be null");
        Objects.requireNonNull(month, "end cannot be null");
        String string2 = "validator cannot be null";
        Objects.requireNonNull(object2, string2);
        this.start = object;
        this.end = month;
        this.openAt = month2;
        this.firstDayOfWeek = n3;
        this.validator = object2;
        if (month2 != null && (n7 = ((Month)object).compareTo(month2)) > 0) {
            object = new IllegalArgumentException("start Month cannot be after current Month");
            throw object;
        }
        if (month2 != null && (n7 = month2.compareTo(month)) > 0) {
            object = new IllegalArgumentException("current Month cannot be after end Month");
            throw object;
        }
        if (n3 >= 0 && n3 <= (n7 = ((Calendar)(object2 = UtcDates.getUtcCalendar())).getMaximum(n4 = 7))) {
            this.monthSpan = n7 = ((Month)object).monthsUntil(month) + 1;
            int n8 = month.year;
            int n10 = ((Month)object).year;
            this.yearSpan = n8 = n8 - n10 + 1;
            return;
        }
        object = new IllegalArgumentException("firstDayOfWeek is not valid");
        throw object;
    }

    public /* synthetic */ CalendarConstraints(Month month, Month month2, CalendarConstraints$DateValidator calendarConstraints$DateValidator, Month month3, int n3, CalendarConstraints$1 calendarConstraints$1) {
        this(month, month2, calendarConstraints$DateValidator, month3, n3);
    }

    public static /* synthetic */ Month access$100(CalendarConstraints calendarConstraints) {
        return calendarConstraints.start;
    }

    public static /* synthetic */ Month access$200(CalendarConstraints calendarConstraints) {
        return calendarConstraints.end;
    }

    public static /* synthetic */ Month access$300(CalendarConstraints calendarConstraints) {
        return calendarConstraints.openAt;
    }

    public static /* synthetic */ int access$400(CalendarConstraints calendarConstraints) {
        return calendarConstraints.firstDayOfWeek;
    }

    public static /* synthetic */ CalendarConstraints$DateValidator access$500(CalendarConstraints calendarConstraints) {
        return calendarConstraints.validator;
    }

    public Month clamp(Month month) {
        Month month2 = this.start;
        int n3 = month.compareTo(month2);
        if (n3 < 0) {
            return this.start;
        }
        month2 = this.end;
        n3 = month.compareTo(month2);
        if (n3 > 0) {
            month = this.end;
        }
        return month;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object object) {
        boolean bl2;
        int n3;
        boolean bl3 = true;
        if (this == object) {
            return bl3;
        }
        int n4 = object instanceof CalendarConstraints;
        if (n4 == 0) {
            return false;
        }
        object = (CalendarConstraints)object;
        Parcelable parcelable = this.start;
        Month month = ((CalendarConstraints)object).start;
        n4 = parcelable.equals(month);
        if (n4 == 0 || (n4 = (parcelable = this.end).equals(month = ((CalendarConstraints)object).end)) == 0 || (n4 = Objects.equals(parcelable = this.openAt, month = ((CalendarConstraints)object).openAt)) == 0 || (n4 = this.firstDayOfWeek) != (n3 = ((CalendarConstraints)object).firstDayOfWeek) || !(bl2 = (parcelable = this.validator).equals(object = ((CalendarConstraints)object).validator))) {
            bl3 = false;
        }
        return bl3;
    }

    public CalendarConstraints$DateValidator getDateValidator() {
        return this.validator;
    }

    public Month getEnd() {
        return this.end;
    }

    public long getEndMs() {
        return this.end.timeInMillis;
    }

    public int getFirstDayOfWeek() {
        return this.firstDayOfWeek;
    }

    public int getMonthSpan() {
        return this.monthSpan;
    }

    public Month getOpenAt() {
        return this.openAt;
    }

    public Long getOpenAtMs() {
        Comparable comparable = this.openAt;
        if (comparable == null) {
            comparable = null;
        } else {
            long l2 = comparable.timeInMillis;
            comparable = Long.valueOf(l2);
        }
        return comparable;
    }

    public Month getStart() {
        return this.start;
    }

    public long getStartMs() {
        return this.start.timeInMillis;
    }

    public int getYearSpan() {
        return this.yearSpan;
    }

    public int hashCode() {
        Month month = this.start;
        Month month2 = this.end;
        Month month3 = this.openAt;
        Integer n3 = this.firstDayOfWeek;
        CalendarConstraints$DateValidator calendarConstraints$DateValidator = this.validator;
        Object[] objectArray = new Object[]{month, month2, month3, n3, calendarConstraints$DateValidator};
        return Arrays.hashCode(objectArray);
    }

    public boolean isWithinBounds(long l2) {
        int n3;
        long l3;
        Month month = this.start;
        boolean bl2 = true;
        long l4 = month.getDay((int)(bl2 ? 1 : 0));
        long l7 = l4 - l2;
        Object object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (object > 0 || (object = (l3 = l2 - (l4 = (month = this.end).getDay(n3 = month.daysInMonth))) == 0L ? 0 : (l3 < 0L ? -1 : 1)) > 0) {
            bl2 = false;
        }
        return bl2;
    }

    public void setOpenAt(Month month) {
        this.openAt = month;
    }

    public void writeToParcel(Parcel parcel, int n3) {
        Parcelable parcelable = this.start;
        parcel.writeParcelable(parcelable, 0);
        parcelable = this.end;
        parcel.writeParcelable(parcelable, 0);
        parcelable = this.openAt;
        parcel.writeParcelable(parcelable, 0);
        parcelable = this.validator;
        parcel.writeParcelable(parcelable, 0);
        n3 = this.firstDayOfWeek;
        parcel.writeInt(n3);
    }
}

