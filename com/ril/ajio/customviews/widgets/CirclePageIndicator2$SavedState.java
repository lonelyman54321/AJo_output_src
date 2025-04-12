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
import com.ril.ajio.customviews.widgets.CirclePageIndicator2$SavedState$1;

class CirclePageIndicator2$SavedState
extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR;
    int currentPage;

    static {
        CirclePageIndicator2$SavedState$1 circlePageIndicator2$SavedState$1 = new CirclePageIndicator2$SavedState$1();
        CREATOR = circlePageIndicator2$SavedState$1;
    }

    private CirclePageIndicator2$SavedState(Parcel parcel) {
        super(parcel);
        int n3;
        this.currentPage = n3 = parcel.readInt();
    }

    public /* synthetic */ CirclePageIndicator2$SavedState(Parcel parcel, int n3) {
        this(parcel);
    }

    public CirclePageIndicator2$SavedState(Parcelable parcelable) {
        super(parcelable);
    }

    public void writeToParcel(Parcel parcel, int n3) {
        super.writeToParcel(parcel, n3);
        n3 = this.currentPage;
        parcel.writeInt(n3);
    }
}

