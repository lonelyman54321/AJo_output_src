/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  android.view.View$BaseSavedState
 */
package com.google.android.material.slider;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.google.android.material.slider.BaseSlider$1;
import com.google.android.material.slider.BaseSlider$SliderState$1;
import java.util.ArrayList;
import java.util.List;

class BaseSlider$SliderState
extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR;
    boolean hasFocus;
    float stepSize;
    float valueFrom;
    float valueTo;
    ArrayList values;

    static {
        BaseSlider$SliderState$1 baseSlider$SliderState$1 = new BaseSlider$SliderState$1();
        CREATOR = baseSlider$SliderState$1;
    }

    private BaseSlider$SliderState(Parcel parcel) {
        super(parcel);
        boolean bl2;
        ArrayList arrayList;
        float f5;
        this.valueFrom = f5 = parcel.readFloat();
        this.valueTo = f5 = parcel.readFloat();
        this.values = arrayList = new ArrayList();
        ClassLoader classLoader = Float.class.getClassLoader();
        parcel.readList(arrayList, classLoader);
        this.stepSize = f5 = parcel.readFloat();
        this.hasFocus = bl2 = parcel.createBooleanArray()[0];
    }

    public /* synthetic */ BaseSlider$SliderState(Parcel parcel, BaseSlider$1 baseSlider$1) {
        this(parcel);
    }

    public BaseSlider$SliderState(Parcelable parcelable) {
        super(parcelable);
    }

    public void writeToParcel(Parcel parcel, int n3) {
        super.writeToParcel(parcel, n3);
        float f5 = this.valueFrom;
        parcel.writeFloat(f5);
        f5 = this.valueTo;
        parcel.writeFloat(f5);
        ArrayList arrayList = this.values;
        parcel.writeList((List)arrayList);
        f5 = this.stepSize;
        parcel.writeFloat(f5);
        n3 = (int)(this.hasFocus ? 1 : 0);
        boolean[] blArray = new boolean[]{n3};
        parcel.writeBooleanArray(blArray);
    }
}

