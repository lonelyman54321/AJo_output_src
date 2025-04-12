/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.material.timepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.timepicker.TimeModel;

class TimeModel$1
implements Parcelable.Creator {
    public TimeModel createFromParcel(Parcel parcel) {
        TimeModel timeModel = new TimeModel(parcel);
        return timeModel;
    }

    public TimeModel[] newArray(int n3) {
        return new TimeModel[n3];
    }
}

