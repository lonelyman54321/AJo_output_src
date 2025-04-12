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
import com.google.android.material.datepicker.RangeDateSelector;

class RangeDateSelector$3
implements Parcelable.Creator {
    public RangeDateSelector createFromParcel(Parcel object) {
        RangeDateSelector rangeDateSelector = new RangeDateSelector();
        Object object2 = Long.class;
        Object object3 = ((Class)object2).getClassLoader();
        object3 = (Long)object.readValue((ClassLoader)object3);
        RangeDateSelector.access$302(rangeDateSelector, (Long)object3);
        object2 = ((Class)object2).getClassLoader();
        object = (Long)object.readValue((ClassLoader)object2);
        RangeDateSelector.access$402(rangeDateSelector, (Long)object);
        return rangeDateSelector;
    }

    public RangeDateSelector[] newArray(int n3) {
        return new RangeDateSelector[n3];
    }
}

