/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.google.android.material.sidesheet;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior$SavedState$1;

public class SideSheetBehavior$SavedState
extends AbsSavedState {
    public static final Parcelable.Creator CREATOR;
    final int state;

    static {
        SideSheetBehavior$SavedState$1 sideSheetBehavior$SavedState$1 = new SideSheetBehavior$SavedState$1();
        CREATOR = sideSheetBehavior$SavedState$1;
    }

    public SideSheetBehavior$SavedState(Parcel parcel) {
        this(parcel, null);
    }

    public SideSheetBehavior$SavedState(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int n3;
        this.state = n3 = parcel.readInt();
    }

    public SideSheetBehavior$SavedState(Parcelable parcelable, SideSheetBehavior sideSheetBehavior) {
        super(parcelable);
        int n3;
        this.state = n3 = SideSheetBehavior.access$000(sideSheetBehavior);
    }

    public void writeToParcel(Parcel parcel, int n3) {
        super.writeToParcel(parcel, n3);
        n3 = this.state;
        parcel.writeInt(n3);
    }
}

