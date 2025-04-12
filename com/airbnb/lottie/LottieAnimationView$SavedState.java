/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 *  android.view.View$BaseSavedState
 */
package com.airbnb.lottie;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.airbnb.lottie.LottieAnimationView$SavedState$a;

class LottieAnimationView$SavedState
extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR;
    public String a;
    public int b;
    public float c;
    public boolean d;
    public String e;
    public int f;
    public int g;

    static {
        LottieAnimationView$SavedState$a lottieAnimationView$SavedState$a = new Object();
        CREATOR = lottieAnimationView$SavedState$a;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        super.writeToParcel(parcel, n3);
        String string2 = this.a;
        parcel.writeString(string2);
        float f5 = this.c;
        parcel.writeFloat(f5);
        n3 = (int)(this.d ? 1 : 0);
        parcel.writeInt(n3);
        string2 = this.e;
        parcel.writeString(string2);
        n3 = this.f;
        parcel.writeInt(n3);
        n3 = this.g;
        parcel.writeInt(n3);
    }
}

