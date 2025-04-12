/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 *  android.view.View$BaseSavedState
 */
package com.willy.ratingbar;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.willy.ratingbar.SavedState$a;

class SavedState
extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR;
    public float a;

    static {
        SavedState$a savedState$a = new Object();
        CREATOR = savedState$a;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        super.writeToParcel(parcel, n3);
        float f5 = this.a;
        parcel.writeFloat(f5);
    }
}

