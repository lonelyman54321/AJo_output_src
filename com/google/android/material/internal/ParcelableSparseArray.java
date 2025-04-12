/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  android.util.SparseArray
 */
package com.google.android.material.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.material.internal.ParcelableSparseArray$1;

public class ParcelableSparseArray
extends SparseArray
implements Parcelable {
    public static final Parcelable.Creator CREATOR;

    static {
        ParcelableSparseArray$1 parcelableSparseArray$1 = new ParcelableSparseArray$1();
        CREATOR = parcelableSparseArray$1;
    }

    public ParcelableSparseArray() {
    }

    public ParcelableSparseArray(Parcel parcelableArray, ClassLoader classLoader) {
        int n3 = parcelableArray.readInt();
        int[] nArray = new int[n3];
        parcelableArray.readIntArray(nArray);
        parcelableArray = parcelableArray.readParcelableArray(classLoader);
        classLoader = null;
        for (int i3 = 0; i3 < n3; ++i3) {
            int n4 = nArray[i3];
            Parcelable parcelable = parcelableArray[i3];
            this.put(n4, parcelable);
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int n3) {
        int n4 = this.size();
        int[] nArray = new int[n4];
        Parcelable[] parcelableArray = new Parcelable[n4];
        for (int i3 = 0; i3 < n4; ++i3) {
            Parcelable parcelable;
            int n7;
            nArray[i3] = n7 = this.keyAt(i3);
            parcelableArray[i3] = parcelable = (Parcelable)this.valueAt(i3);
        }
        parcel.writeInt(n4);
        parcel.writeIntArray(nArray);
        parcel.writeParcelableArray(parcelableArray, n3);
    }
}

