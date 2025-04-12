/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$ClassLoaderCreator
 */
package com.google.android.material.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.internal.ParcelableSparseArray;

class ParcelableSparseArray$1
implements Parcelable.ClassLoaderCreator {
    public ParcelableSparseArray createFromParcel(Parcel parcel) {
        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray(parcel, null);
        return parcelableSparseArray;
    }

    public ParcelableSparseArray createFromParcel(Parcel parcel, ClassLoader classLoader) {
        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray(parcel, classLoader);
        return parcelableSparseArray;
    }

    public ParcelableSparseArray[] newArray(int n3) {
        return new ParcelableSparseArray[n3];
    }
}

