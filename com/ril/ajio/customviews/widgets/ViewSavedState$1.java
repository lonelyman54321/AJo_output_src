/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.ril.ajio.customviews.widgets;

import android.os.Parcel;
import android.os.Parcelable;
import com.ril.ajio.customviews.widgets.ViewSavedState;

class ViewSavedState$1
implements Parcelable.Creator {
    public ViewSavedState createFromParcel(Parcel parcel) {
        ViewSavedState viewSavedState = new ViewSavedState(parcel, 0);
        return viewSavedState;
    }

    public ViewSavedState[] newArray(int n3) {
        return new ViewSavedState[n3];
    }
}

