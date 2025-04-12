/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.material.slider;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.slider.RangeSlider$RangeSliderState;

class RangeSlider$RangeSliderState$1
implements Parcelable.Creator {
    public RangeSlider$RangeSliderState createFromParcel(Parcel parcel) {
        RangeSlider$RangeSliderState rangeSlider$RangeSliderState = new RangeSlider$RangeSliderState(parcel, null);
        return rangeSlider$RangeSliderState;
    }

    public RangeSlider$RangeSliderState[] newArray(int n3) {
        return new RangeSlider$RangeSliderState[n3];
    }
}

