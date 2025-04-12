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
import com.google.android.material.datepicker.DateStrings;
import com.google.android.material.datepicker.Month$1;
import com.google.android.material.datepicker.UtcDates;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

final class Month
implements Comparable,
Parcelable {
    public static final Parcelable.Creator CREATOR;
    final int daysInMonth;
    final int daysInWeek;
    private final Calendar firstOfMonth;
    private String longName;
    final int month;
    final long timeInMillis;
    final int year;

    static {
        Month$1 month$1 = new Month$1();
        CREATOR = month$1;
    }

    private Month(Calendar calendar) {
        long l2;
        int n3;
        int n4 = 5;
        int n7 = 1;
        calendar.set(n4, n7);
        this.firstOfMonth = calendar = UtcDates.getDayCopy(calendar);
        this.month = n3 = calendar.get(2);
        this.year = n7 = calendar.get(n7);
        this.daysInWeek = n7 = calendar.getMaximum(7);
        this.daysInMonth = n4 = calendar.getActualMaximum(n4);
        this.timeInMillis = l2 = calendar.getTimeInMillis();
    }

    public static Month create(int n3, int n4) {
        Calendar calendar = UtcDates.getUtcCalendar();
        calendar.set(1, n3);
        calendar.set(2, n4);
        Month month = new Month(calendar);
        return month;
    }

    public static Month create(long l2) {
        Calendar calendar = UtcDates.getUtcCalendar();
        calendar.setTimeInMillis(l2);
        Month month = new Month(calendar);
        return month;
    }

    public static Month current() {
        Calendar calendar = UtcDates.getTodayCalendar();
        Month month = new Month(calendar);
        return month;
    }

    public int compareTo(Month comparable) {
        Calendar calendar = this.firstOfMonth;
        comparable = comparable.firstOfMonth;
        return calendar.compareTo((Calendar)comparable);
    }

    public int daysFromStartOfWeekToFirstOfMonth(int n3) {
        Calendar calendar = this.firstOfMonth;
        int n4 = 7;
        int n7 = calendar.get(n4);
        if (n3 <= 0) {
            Calendar calendar2 = this.firstOfMonth;
            n3 = calendar2.getFirstDayOfWeek();
        }
        if ((n7 -= n3) < 0) {
            n3 = this.daysInWeek;
            n7 += n3;
        }
        return n7;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object object) {
        int n3;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n4 = object instanceof Month;
        if (n4 == 0) {
            return false;
        }
        object = (Month)object;
        n4 = this.month;
        int n7 = ((Month)object).month;
        if (n4 != n7 || (n4 = this.year) != (n3 = ((Month)object).year)) {
            bl2 = false;
        }
        return bl2;
    }

    public long getDay(int n3) {
        Calendar calendar = UtcDates.getDayCopy(this.firstOfMonth);
        calendar.set(5, n3);
        return calendar.getTimeInMillis();
    }

    public int getDayOfMonth(long l2) {
        Calendar calendar = UtcDates.getDayCopy(this.firstOfMonth);
        calendar.setTimeInMillis(l2);
        return calendar.get(5);
    }

    public String getLongName() {
        String string2 = this.longName;
        if (string2 == null) {
            long l2 = this.firstOfMonth.getTimeInMillis();
            this.longName = string2 = DateStrings.getYearMonth(l2);
        }
        return this.longName;
    }

    public long getStableId() {
        return this.firstOfMonth.getTimeInMillis();
    }

    public int hashCode() {
        Integer n3 = this.month;
        Integer n4 = this.year;
        Object[] objectArray = new Object[]{n3, n4};
        return Arrays.hashCode(objectArray);
    }

    public Month monthsLater(int n3) {
        Calendar calendar = UtcDates.getDayCopy(this.firstOfMonth);
        calendar.add(2, n3);
        Month month = new Month(calendar);
        return month;
    }

    public int monthsUntil(Month object) {
        Calendar calendar = this.firstOfMonth;
        int n3 = calendar instanceof GregorianCalendar;
        if (n3 != 0) {
            n3 = ((Month)object).year;
            int n4 = this.year;
            n3 = (n3 - n4) * 12;
            int n7 = ((Month)object).month;
            n4 = this.month;
            return n7 - n4 + n3;
        }
        object = new IllegalArgumentException("Only Gregorian calendars are supported.");
        throw object;
    }

    public void writeToParcel(Parcel parcel, int n3) {
        n3 = this.year;
        parcel.writeInt(n3);
        n3 = this.month;
        parcel.writeInt(n3);
    }
}

