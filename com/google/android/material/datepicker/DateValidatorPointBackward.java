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
import com.google.android.material.datepicker.DateValidatorPointBackward$1;
import com.google.android.material.datepicker.UtcDates;
import java.util.Arrays;

public class DateValidatorPointBackward
implements CalendarConstraints$DateValidator {
    public static final Parcelable.Creator CREATOR;
    private final long point;

    static {
        DateValidatorPointBackward$1 dateValidatorPointBackward$1 = new DateValidatorPointBackward$1();
        CREATOR = dateValidatorPointBackward$1;
    }

    private DateValidatorPointBackward(long l2) {
        this.point = l2;
    }

    public /* synthetic */ DateValidatorPointBackward(long l2, DateValidatorPointBackward$1 dateValidatorPointBackward$1) {
        this(l2);
    }

    public static DateValidatorPointBackward before(long l2) {
        DateValidatorPointBackward dateValidatorPointBackward = new DateValidatorPointBackward(l2);
        return dateValidatorPointBackward;
    }

    public static DateValidatorPointBackward now() {
        return DateValidatorPointBackward.before(UtcDates.getTodayCalendar().getTimeInMillis());
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof DateValidatorPointBackward;
        if (!bl3) {
            return false;
        }
        object = (DateValidatorPointBackward)object;
        long l2 = this.point;
        long l3 = ((DateValidatorPointBackward)object).point;
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
        boolean bl2 = object <= 0;
        return bl2;
    }

    public void writeToParcel(Parcel parcel, int n3) {
        long l2 = this.point;
        parcel.writeLong(l2);
    }
}

