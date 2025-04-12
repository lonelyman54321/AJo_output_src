/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$ClassLoaderCreator
 */
package com.google.android.material.stateful;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.stateful.ExtendableSavedState;

class ExtendableSavedState$1
implements Parcelable.ClassLoaderCreator {
    public ExtendableSavedState createFromParcel(Parcel parcel) {
        ExtendableSavedState extendableSavedState = new ExtendableSavedState(parcel, null, null);
        return extendableSavedState;
    }

    public ExtendableSavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
        ExtendableSavedState extendableSavedState = new ExtendableSavedState(parcel, classLoader, null);
        return extendableSavedState;
    }

    public ExtendableSavedState[] newArray(int n3) {
        return new ExtendableSavedState[n3];
    }
}

