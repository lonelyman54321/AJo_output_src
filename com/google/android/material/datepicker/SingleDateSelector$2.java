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
import com.google.android.material.datepicker.SingleDateSelector;

class SingleDateSelector$2
implements Parcelable.Creator {
    public SingleDateSelector createFromParcel(Parcel object) {
        SingleDateSelector singleDateSelector = new SingleDateSelector();
        ClassLoader classLoader = Long.class.getClassLoader();
        object = (Long)object.readValue(classLoader);
        SingleDateSelector.access$202(singleDateSelector, (Long)object);
        return singleDateSelector;
    }

    public SingleDateSelector[] newArray(int n3) {
        return new SingleDateSelector[n3];
    }
}

