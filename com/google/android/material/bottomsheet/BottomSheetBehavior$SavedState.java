/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.google.android.material.bottomsheet;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetBehavior$SavedState$1;

public class BottomSheetBehavior$SavedState
extends AbsSavedState {
    public static final Parcelable.Creator CREATOR;
    boolean fitToContents;
    boolean hideable;
    int peekHeight;
    boolean skipCollapsed;
    final int state;

    static {
        BottomSheetBehavior$SavedState$1 bottomSheetBehavior$SavedState$1 = new BottomSheetBehavior$SavedState$1();
        CREATOR = bottomSheetBehavior$SavedState$1;
    }

    public BottomSheetBehavior$SavedState(Parcel parcel) {
        this(parcel, null);
    }

    public BottomSheetBehavior$SavedState(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int n3;
        this.state = n3 = parcel.readInt();
        this.peekHeight = n3 = parcel.readInt();
        n3 = parcel.readInt();
        boolean bl2 = false;
        int n4 = 1;
        if (n3 == n4) {
            n3 = 1;
        } else {
            n3 = 0;
            classLoader = null;
        }
        this.fitToContents = n3;
        n3 = parcel.readInt();
        if (n3 == n4) {
            n3 = 1;
        } else {
            n3 = 0;
            classLoader = null;
        }
        this.hideable = n3;
        int n7 = parcel.readInt();
        if (n7 == n4) {
            bl2 = true;
        }
        this.skipCollapsed = bl2;
    }

    public BottomSheetBehavior$SavedState(Parcelable parcelable, int n3) {
        super(parcelable);
        this.state = n3;
    }

    public BottomSheetBehavior$SavedState(Parcelable parcelable, BottomSheetBehavior bottomSheetBehavior) {
        super(parcelable);
        int n3;
        this.state = n3 = bottomSheetBehavior.state;
        this.peekHeight = n3 = BottomSheetBehavior.access$1900(bottomSheetBehavior);
        n3 = (int)(BottomSheetBehavior.access$1400(bottomSheetBehavior) ? 1 : 0);
        this.fitToContents = n3;
        n3 = (int)(bottomSheetBehavior.hideable ? 1 : 0);
        this.hideable = n3;
        n3 = (int)(BottomSheetBehavior.access$2000(bottomSheetBehavior) ? 1 : 0);
        this.skipCollapsed = n3;
    }

    public void writeToParcel(Parcel parcel, int n3) {
        super.writeToParcel(parcel, n3);
        n3 = this.state;
        parcel.writeInt(n3);
        n3 = this.peekHeight;
        parcel.writeInt(n3);
        n3 = (int)(this.fitToContents ? 1 : 0);
        parcel.writeInt(n3);
        n3 = (int)(this.hideable ? 1 : 0);
        parcel.writeInt(n3);
        n3 = (int)(this.skipCollapsed ? 1 : 0);
        parcel.writeInt(n3);
    }
}

