/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$ClassLoaderCreator
 */
package com.google.android.material.button;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.button.MaterialButton$SavedState;

class MaterialButton$SavedState$1
implements Parcelable.ClassLoaderCreator {
    public MaterialButton$SavedState createFromParcel(Parcel parcel) {
        MaterialButton$SavedState materialButton$SavedState = new MaterialButton$SavedState(parcel, null);
        return materialButton$SavedState;
    }

    public MaterialButton$SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
        MaterialButton$SavedState materialButton$SavedState = new MaterialButton$SavedState(parcel, classLoader);
        return materialButton$SavedState;
    }

    public MaterialButton$SavedState[] newArray(int n3) {
        return new MaterialButton$SavedState[n3];
    }
}

