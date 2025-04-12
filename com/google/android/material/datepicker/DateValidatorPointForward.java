/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.CalendarConstraints$DateValidator;
import com.google.android.material.datepicker.DateValidatorPointForward$1;
import com.google.android.material.datepicker.UtcDates;
import java.util.Arrays;

public class DateValidatorPointForward
implements CalendarConstraints$DateValidator {
    public static final Parcelable.Creator CREATOR;
    private final long point;

    static {
        DateValidatorPointForward$1 dateValidatorPointForward$1 = new DateValidatorPointForward$1();
        CREATOR = dateValidatorPointForward$1;
    }

    private DateValidatorPointForward(long l2) {
        this.point = l2;
    }

    public /* synthetic */ DateValidatorPointForward(long l2, DateValidatorPointForward$1 dateValidatorPointForward$1) {
        this(l2);
    }

    public static DateValidatorPointForward from(long l2) {
        DateValidatorPointForward dateValidatorPointForward = new DateValidatorPointForward(l2);
        return dateValidatorPointForward;
    }

    public static DateValidatorPointForward now() {
        return DateValidatorPointForward.from(UtcDates.getTodayCalendar().getTimeInMillis());
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof DateValidatorPointForward;
        if (!bl3) {
            return false;
        }
        object = (DateValidatorPointForward)object;
        long l2 = this.point;
        long l3 = ((DateValidatorPointForward)object).point;
        long l4 = l2 - l3;
        Object object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object2 != false) {
            bl2 = false;
        }
        return bl2;
    }

    public int hashCode() {
        Long l2 = this.point;
        Object[] objectArray = new Object[]{l2};
        return Arrays.hashCode(objectArray);
    }

    public boolean isValid(long l2) {
        long l3 = this.point;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        boolean bl2 = object >= 0;
        return bl2;
    }

    public void writeToParcel(Parcel parcel, int n3) {
        long l2 = this.point;
        parcel.writeLong(l2);
    }
}

