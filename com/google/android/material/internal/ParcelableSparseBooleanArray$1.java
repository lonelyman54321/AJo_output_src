/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.material.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.internal.ParcelableSparseBooleanArray;

class ParcelableSparseBooleanArray$1
implements Parcelable.Creator {
    public ParcelableSparseBooleanArray createFromParcel(Parcel parcel) {
        int n3 = parcel.readInt();
        ParcelableSparseBooleanArray parcelableSparseBooleanArray = new ParcelableSparseBooleanArray(n3);
        int[] nArray = new int[n3];
        boolean[] blArray = new boolean[n3];
        parcel.readIntArray(nArray);
        parcel.readBooleanArray(blArray);
        parcel = null;
        for (int i3 = 0; i3 < n3; ++i3) {
            int n4 = nArray[i3];
            boolean bl2 = blArray[i3];
            parcelableSparseBooleanArray.put(n4, bl2);
        }
        return parcelableSparseBooleanArray;
    }

    public ParcelableSparseBooleanArray[] newArray(int n3) {
        return new ParcelableSparseBooleanArray[n3];
    }
}

