/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$ClassLoaderCreator
 */
package com.google.android.material.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.navigation.NavigationBarView$SavedState;

class NavigationBarView$SavedState$1
implements Parcelable.ClassLoaderCreator {
    public NavigationBarView$SavedState createFromParcel(Parcel parcel) {
        NavigationBarView$SavedState navigationBarView$SavedState = new NavigationBarView$SavedState(parcel, null);
        return navigationBarView$SavedState;
    }

    public NavigationBarView$SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
        NavigationBarView$SavedState navigationBarView$SavedState = new NavigationBarView$SavedState(parcel, classLoader);
        return navigationBarView$SavedState;
    }

    public NavigationBarView$SavedState[] newArray(int n3) {
        return new NavigationBarView$SavedState[n3];
    }
}

