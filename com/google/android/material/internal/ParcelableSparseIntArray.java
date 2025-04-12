/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  android.util.SparseIntArray
 */
package com.google.android.material.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseIntArray;
import com.google.android.material.internal.ParcelableSparseIntArray$1;

public class ParcelableSparseIntArray
extends SparseIntArray
implements Parcelable {
    public static final Parcelable.Creator CREATOR;

    static {
        ParcelableSparseIntArray$1 parcelableSparseIntArray$1 = new ParcelableSparseIntArray$1();
        CREATOR = parcelableSparseIntArray$1;
    }

    public ParcelableSparseIntArray() {
    }

    public ParcelableSparseIntArray(int n3) {
        super(n3);
    }

    public ParcelableSparseIntArray(SparseIntArray sparseIntArray) {
        int n3;
        for (int i3 = 0; i3 < (n3 = sparseIntArray.size()); ++i3) {
            n3 = sparseIntArray.keyAt(i3);
            int n4 = sparseIntArray.valueAt(i3);
            this.put(n3, n4);
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int n3) {
        int n4;
        int n7;
        n3 = this.size();
        int[] nArray = new int[n3];
        int n8 = this.size();
        int[] nArray2 = new int[n8];
        for (n7 = 0; n7 < (n4 = this.size()); ++n7) {
            nArray[n7] = n4 = this.keyAt(n7);
            nArray2[n7] = n4 = this.valueAt(n7);
        }
        n7 = this.size();
        parcel.writeInt(n7);
        parcel.writeIntArray(nArray);
        parcel.writeIntArray(nArray2);
    }
}

