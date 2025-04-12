/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  android.util.SparseBooleanArray
 */
package com.google.android.material.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import com.google.android.material.internal.ParcelableSparseBooleanArray$1;

public class ParcelableSparseBooleanArray
extends SparseBooleanArray
implements Parcelable {
    public static final Parcelable.Creator CREATOR;

    static {
        ParcelableSparseBooleanArray$1 parcelableSparseBooleanArray$1 = new ParcelableSparseBooleanArray$1();
        CREATOR = parcelableSparseBooleanArray$1;
    }

    public ParcelableSparseBooleanArray() {
    }

    public ParcelableSparseBooleanArray(int n3) {
        super(n3);
    }

    public ParcelableSparseBooleanArray(SparseBooleanArray sparseBooleanArray) {
        int n3;
        int n4 = sparseBooleanArray.size();
        super(n4);
        for (n4 = 0; n4 < (n3 = sparseBooleanArray.size()); ++n4) {
            n3 = sparseBooleanArray.keyAt(n4);
            boolean bl2 = sparseBooleanArray.valueAt(n4);
            this.put(n3, bl2);
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
        boolean[] blArray = new boolean[n8];
        for (n7 = 0; n7 < (n4 = this.size()); ++n7) {
            nArray[n7] = n4 = this.keyAt(n7);
            blArray[n7] = n4 = (int)(this.valueAt(n7) ? 1 : 0);
        }
        n7 = this.size();
        parcel.writeInt(n7);
        parcel.writeIntArray(nArray);
        parcel.writeBooleanArray(blArray);
    }
}

