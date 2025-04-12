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
import com.google.android.material.slider.BaseSlider$SliderState;

class BaseSlider$SliderState$1
implements Parcelable.Creator {
    public BaseSlider$SliderState createFromParcel(Parcel parcel) {
        BaseSlider$SliderState baseSlider$SliderState = new BaseSlider$SliderState(parcel, null);
        return baseSlider$SliderState;
    }

    public BaseSlider$SliderState[] newArray(int n3) {
        return new BaseSlider$SliderState[n3];
    }
}

