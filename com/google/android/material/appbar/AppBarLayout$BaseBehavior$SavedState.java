/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.google.android.material.appbar;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.appbar.AppBarLayout$BaseBehavior$SavedState$1;

public class AppBarLayout$BaseBehavior$SavedState
extends AbsSavedState {
    public static final Parcelable.Creator CREATOR;
    boolean firstVisibleChildAtMinimumHeight;
    int firstVisibleChildIndex;
    float firstVisibleChildPercentageShown;
    boolean fullyExpanded;
    boolean fullyScrolled;

    static {
        AppBarLayout$BaseBehavior$SavedState$1 appBarLayout$BaseBehavior$SavedState$1 = new AppBarLayout$BaseBehavior$SavedState$1();
        CREATOR = appBarLayout$BaseBehavior$SavedState$1;
    }

    public AppBarLayout$BaseBehavior$SavedState(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        float f5;
        int n3 = parcel.readByte();
        boolean bl2 = false;
        if (n3 != 0) {
            n3 = 1;
            f5 = Float.MIN_VALUE;
        } else {
            n3 = 0;
            f5 = 0.0f;
            classLoader = null;
        }
        this.fullyScrolled = n3;
        n3 = parcel.readByte();
        if (n3 != 0) {
            n3 = 1;
            f5 = Float.MIN_VALUE;
        } else {
            n3 = 0;
            f5 = 0.0f;
            classLoader = null;
        }
        this.fullyExpanded = n3;
        this.firstVisibleChildIndex = n3 = parcel.readInt();
        this.firstVisibleChildPercentageShown = f5 = parcel.readFloat();
        byte by2 = parcel.readByte();
        if (by2 != 0) {
            bl2 = true;
        }
        this.firstVisibleChildAtMinimumHeight = bl2;
    }

    public AppBarLayout$BaseBehavior$SavedState(Parcelable parcelable) {
        super(parcelable);
    }

    public void writeToParcel(Parcel parcel, int n3) {
        super.writeToParcel(parcel, n3);
        n3 = (byte)(this.fullyScrolled ? 1 : 0);
        parcel.writeByte((byte)n3);
        n3 = (byte)(this.fullyExpanded ? 1 : 0);
        parcel.writeByte((byte)n3);
        n3 = this.firstVisibleChildIndex;
        parcel.writeInt(n3);
        float f5 = this.firstVisibleChildPercentageShown;
        parcel.writeFloat(f5);
        n3 = (byte)(this.firstVisibleChildAtMinimumHeight ? 1 : 0);
        parcel.writeByte((byte)n3);
    }
}

