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
import com.ril.ajio.customviews.widgets.CirclePageIndicator$SavedState;

class CirclePageIndicator$SavedState$1
implements Parcelable.Creator {
    public CirclePageIndicator$SavedState createFromParcel(Parcel parcel) {
        CirclePageIndicator$SavedState circlePageIndicator$SavedState = new CirclePageIndicator$SavedState(parcel, 0);
        return circlePageIndicator$SavedState;
    }

    public CirclePageIndicator$SavedState[] newArray(int n3) {
        return new CirclePageIndicator$SavedState[n3];
    }
}

