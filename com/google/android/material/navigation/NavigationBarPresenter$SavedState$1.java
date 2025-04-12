/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.material.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.navigation.NavigationBarPresenter$SavedState;

class NavigationBarPresenter$SavedState$1
implements Parcelable.Creator {
    public NavigationBarPresenter$SavedState createFromParcel(Parcel parcel) {
        NavigationBarPresenter$SavedState navigationBarPresenter$SavedState = new NavigationBarPresenter$SavedState(parcel);
        return navigationBarPresenter$SavedState;
    }

    public NavigationBarPresenter$SavedState[] newArray(int n3) {
        return new NavigationBarPresenter$SavedState[n3];
    }
}

