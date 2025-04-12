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
import com.airbnb.lottie.LottieAnimationView$SavedState;

public final class LottieAnimationView$SavedState$a
implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int n3;
        int n4;
        float f5;
        String string2;
        LottieAnimationView$SavedState lottieAnimationView$SavedState = new View.BaseSavedState(parcel);
        lottieAnimationView$SavedState.a = string2 = parcel.readString();
        lottieAnimationView$SavedState.c = f5 = parcel.readFloat();
        int n7 = parcel.readInt();
        if (n7 != (n4 = 1)) {
            n4 = 0;
        }
        lottieAnimationView$SavedState.d = n4;
        lottieAnimationView$SavedState.e = string2 = parcel.readString();
        lottieAnimationView$SavedState.f = n7 = parcel.readInt();
        lottieAnimationView$SavedState.g = n3 = parcel.readInt();
        return lottieAnimationView$SavedState;
    }

    public final Object[] newArray(int n3) {
        return new LottieAnimationView$SavedState[n3];
    }
}

