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
import com.google.android.material.datepicker.DateValidatorPointBackward;

class DateValidatorPointBackward$1
implements Parcelable.Creator {
    public DateValidatorPointBackward createFromParcel(Parcel parcel) {
        long l2 = parcel.readLong();
        DateValidatorPointBackward dateValidatorPointBackward = new DateValidatorPointBackward(l2, null);
        return dateValidatorPointBackward;
    }

    public DateValidatorPointBackward[] newArray(int n3) {
        return new DateValidatorPointBackward[n3];
    }
}

