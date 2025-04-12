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
import com.google.android.material.datepicker.DateValidatorPointForward;

class DateValidatorPointForward$1
implements Parcelable.Creator {
    public DateValidatorPointForward createFromParcel(Parcel parcel) {
        long l2 = parcel.readLong();
        DateValidatorPointForward dateValidatorPointForward = new DateValidatorPointForward(l2, null);
        return dateValidatorPointForward;
    }

    public DateValidatorPointForward[] newArray(int n3) {
        return new DateValidatorPointForward[n3];
    }
}

