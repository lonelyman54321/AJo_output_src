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
import com.google.android.material.datepicker.Month;

class Month$1
implements Parcelable.Creator {
    public Month createFromParcel(Parcel parcel) {
        int n3 = parcel.readInt();
        int n4 = parcel.readInt();
        return Month.create(n3, n4);
    }

    public Month[] newArray(int n3) {
        return new Month[n3];
    }
}

