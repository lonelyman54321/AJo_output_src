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
import com.google.android.material.internal.CheckableImageButton$SavedState;

class CheckableImageButton$SavedState$1
implements Parcelable.ClassLoaderCreator {
    public CheckableImageButton$SavedState createFromParcel(Parcel parcel) {
        CheckableImageButton$SavedState checkableImageButton$SavedState = new CheckableImageButton$SavedState(parcel, null);
        return checkableImageButton$SavedState;
    }

    public CheckableImageButton$SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
        CheckableImageButton$SavedState checkableImageButton$SavedState = new CheckableImageButton$SavedState(parcel, classLoader);
        return checkableImageButton$SavedState;
    }

    public CheckableImageButton$SavedState[] newArray(int n3) {
        return new CheckableImageButton$SavedState[n3];
    }
}

