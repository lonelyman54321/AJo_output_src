/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.google.android.material.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.internal.CheckableImageButton$SavedState$1;

class CheckableImageButton$SavedState
extends AbsSavedState {
    public static final Parcelable.Creator CREATOR;
    boolean checked;

    static {
        CheckableImageButton$SavedState$1 checkableImageButton$SavedState$1 = new CheckableImageButton$SavedState$1();
        CREATOR = checkableImageButton$SavedState$1;
    }

    public CheckableImageButton$SavedState(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.readFromParcel(parcel);
    }

    public CheckableImageButton$SavedState(Parcelable parcelable) {
        super(parcelable);
    }

    private void readFromParcel(Parcel parcel) {
        int n3;
        int n4 = parcel.readInt();
        if (n4 != (n3 = 1)) {
            n3 = 0;
        }
        this.checked = n3;
    }

    public void writeToParcel(Parcel parcel, int n3) {
        super.writeToParcel(parcel, n3);
        n3 = (int)(this.checked ? 1 : 0);
        parcel.writeInt(n3);
    }
}

