/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.ril.ajio.plp;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.customview.view.AbsSavedState;
import com.ril.ajio.plp.PlpBottomSheetBehavior$SavedState$a;

public class PlpBottomSheetBehavior$SavedState
extends AbsSavedState {
    public static final Parcelable.Creator CREATOR;
    public final int a;

    static {
        PlpBottomSheetBehavior$SavedState$a plpBottomSheetBehavior$SavedState$a = new Object();
        CREATOR = plpBottomSheetBehavior$SavedState$a;
    }

    public PlpBottomSheetBehavior$SavedState(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int n3;
        this.a = n3 = parcel.readInt();
    }

    public PlpBottomSheetBehavior$SavedState(Parcelable parcelable, int n3) {
        super(parcelable);
        this.a = n3;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        super.writeToParcel(parcel, n3);
        n3 = this.a;
        parcel.writeInt(n3);
    }
}

