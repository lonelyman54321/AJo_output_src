/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  android.view.View$BaseSavedState
 */
package com.ril.ajio.customviews.widgets;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.ril.ajio.customviews.widgets.CirclePageIndicator$SavedState$1;

class CirclePageIndicator$SavedState
extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR;
    int currentPage;

    static {
        CirclePageIndicator$SavedState$1 circlePageIndicator$SavedState$1 = new CirclePageIndicator$SavedState$1();
        CREATOR = circlePageIndicator$SavedState$1;
    }

    private CirclePageIndicator$SavedState(Parcel parcel) {
        super(parcel);
        int n3;
        this.currentPage = n3 = parcel.readInt();
    }

    public /* synthetic */ CirclePageIndicator$SavedState(Parcel parcel, int n3) {
        this(parcel);
    }

    public CirclePageIndicator$SavedState(Parcelable parcelable) {
        super(parcelable);
    }

    public void writeToParcel(Parcel parcel, int n3) {
        super.writeToParcel(parcel, n3);
        n3 = this.currentPage;
        parcel.writeInt(n3);
    }
}

