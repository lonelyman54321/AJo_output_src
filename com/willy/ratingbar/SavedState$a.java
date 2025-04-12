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
import com.willy.ratingbar.SavedState;

public final class SavedState$a
implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        float f5;
        SavedState savedState = new View.BaseSavedState(parcel);
        savedState.a = f5 = parcel.readFloat();
        return savedState;
    }

    public final Object[] newArray(int n3) {
        return new SavedState[n3];
    }
}

