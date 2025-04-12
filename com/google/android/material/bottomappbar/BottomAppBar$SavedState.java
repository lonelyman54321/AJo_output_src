/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.google.android.material.bottomappbar;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.bottomappbar.BottomAppBar$SavedState$1;

class BottomAppBar$SavedState
extends AbsSavedState {
    public static final Parcelable.Creator CREATOR;
    int fabAlignmentMode;
    boolean fabAttached;

    static {
        BottomAppBar$SavedState$1 bottomAppBar$SavedState$1 = new BottomAppBar$SavedState$1();
        CREATOR = bottomAppBar$SavedState$1;
    }

    public BottomAppBar$SavedState(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int n3;
        this.fabAlignmentMode = n3 = parcel.readInt();
        int n4 = parcel.readInt();
        if (n4 != 0) {
            n4 = 1;
        } else {
            n4 = 0;
            parcel = null;
        }
        this.fabAttached = n4;
    }

    public BottomAppBar$SavedState(Parcelable parcelable) {
        super(parcelable);
    }

    public void writeToParcel(Parcel parcel, int n3) {
        super.writeToParcel(parcel, n3);
        n3 = this.fabAlignmentMode;
        parcel.writeInt(n3);
        n3 = (int)(this.fabAttached ? 1 : 0);
        parcel.writeInt(n3);
    }
}

