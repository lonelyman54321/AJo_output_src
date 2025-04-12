/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.google.android.material.navigation;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.navigation.NavigationBarView$SavedState$1;

class NavigationBarView$SavedState
extends AbsSavedState {
    public static final Parcelable.Creator CREATOR;
    Bundle menuPresenterState;

    static {
        NavigationBarView$SavedState$1 navigationBarView$SavedState$1 = new NavigationBarView$SavedState$1();
        CREATOR = navigationBarView$SavedState$1;
    }

    public NavigationBarView$SavedState(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        if (classLoader == null) {
            classLoader = this.getClass().getClassLoader();
        }
        this.readFromParcel(parcel, classLoader);
    }

    public NavigationBarView$SavedState(Parcelable parcelable) {
        super(parcelable);
    }

    private void readFromParcel(Parcel parcel, ClassLoader classLoader) {
        parcel = parcel.readBundle(classLoader);
        this.menuPresenterState = parcel;
    }

    public void writeToParcel(Parcel parcel, int n3) {
        super.writeToParcel(parcel, n3);
        Bundle bundle = this.menuPresenterState;
        parcel.writeBundle(bundle);
    }
}

