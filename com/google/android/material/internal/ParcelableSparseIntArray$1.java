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
import com.google.android.material.internal.ParcelableSparseIntArray;

class ParcelableSparseIntArray$1
implements Parcelable.Creator {
    public ParcelableSparseIntArray createFromParcel(Parcel parcel) {
        int n3 = parcel.readInt();
        ParcelableSparseIntArray parcelableSparseIntArray = new ParcelableSparseIntArray(n3);
        int[] nArray = new int[n3];
        int[] nArray2 = new int[n3];
        parcel.readIntArray(nArray);
        parcel.readIntArray(nArray2);
        parcel = null;
        for (int i3 = 0; i3 < n3; ++i3) {
            int n4 = nArray[i3];
            int n7 = nArray2[i3];
            parcelableSparseIntArray.put(n4, n7);
        }
        return parcelableSparseIntArray;
    }

    public ParcelableSparseIntArray[] newArray(int n3) {
        return new ParcelableSparseIntArray[n3];
    }
}

