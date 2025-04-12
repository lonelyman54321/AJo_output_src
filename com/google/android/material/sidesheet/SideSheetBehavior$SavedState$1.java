/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$ClassLoaderCreator
 */
package com.google.android.material.sidesheet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.sidesheet.SideSheetBehavior$SavedState;

class SideSheetBehavior$SavedState$1
implements Parcelable.ClassLoaderCreator {
    public SideSheetBehavior$SavedState createFromParcel(Parcel parcel) {
        SideSheetBehavior$SavedState sideSheetBehavior$SavedState = new SideSheetBehavior$SavedState(parcel, null);
        return sideSheetBehavior$SavedState;
    }

    public SideSheetBehavior$SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
        SideSheetBehavior$SavedState sideSheetBehavior$SavedState = new SideSheetBehavior$SavedState(parcel, classLoader);
        return sideSheetBehavior$SavedState;
    }

    public SideSheetBehavior$SavedState[] newArray(int n3) {
        return new SideSheetBehavior$SavedState[n3];
    }
}

