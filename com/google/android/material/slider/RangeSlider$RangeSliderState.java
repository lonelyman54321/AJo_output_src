/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  android.view.AbsSavedState
 */
package com.google.android.material.slider;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.slider.RangeSlider$1;
import com.google.android.material.slider.RangeSlider$RangeSliderState$1;

class RangeSlider$RangeSliderState
extends AbsSavedState {
    public static final Parcelable.Creator CREATOR;
    private float minSeparation;
    private int separationUnit;

    static {
        RangeSlider$RangeSliderState$1 rangeSlider$RangeSliderState$1 = new RangeSlider$RangeSliderState$1();
        CREATOR = rangeSlider$RangeSliderState$1;
    }

    private RangeSlider$RangeSliderState(Parcel parcel) {
        int n3;
        float f5;
        ClassLoader classLoader = RangeSlider$RangeSliderState.class.getClassLoader();
        classLoader = parcel.readParcelable(classLoader);
        super((Parcelable)classLoader);
        this.minSeparation = f5 = parcel.readFloat();
        this.separationUnit = n3 = parcel.readInt();
    }

    public /* synthetic */ RangeSlider$RangeSliderState(Parcel parcel, RangeSlider$1 rangeSlider$1) {
        this(parcel);
    }

    public RangeSlider$RangeSliderState(Parcelable parcelable) {
        super(parcelable);
    }

    public static /* synthetic */ float access$000(RangeSlider$RangeSliderState rangeSlider$RangeSliderState) {
        return rangeSlider$RangeSliderState.minSeparation;
    }

    public static /* synthetic */ float access$002(RangeSlider$RangeSliderState rangeSlider$RangeSliderState, float f5) {
        rangeSlider$RangeSliderState.minSeparation = f5;
        return f5;
    }

    public static /* synthetic */ int access$100(RangeSlider$RangeSliderState rangeSlider$RangeSliderState) {
        return rangeSlider$RangeSliderState.separationUnit;
    }

    public static /* synthetic */ int access$102(RangeSlider$RangeSliderState rangeSlider$RangeSliderState, int n3) {
        rangeSlider$RangeSliderState.separationUnit = n3;
        return n3;
    }

    public void writeToParcel(Parcel parcel, int n3) {
        super.writeToParcel(parcel, n3);
        float f5 = this.minSeparation;
        parcel.writeFloat(f5);
        n3 = this.separationUnit;
        parcel.writeInt(n3);
    }
}

