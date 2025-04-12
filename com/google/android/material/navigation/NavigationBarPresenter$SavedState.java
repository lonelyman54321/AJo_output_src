/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.google.android.material.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.internal.ParcelableSparseArray;
import com.google.android.material.navigation.NavigationBarPresenter$SavedState$1;

class NavigationBarPresenter$SavedState
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    ParcelableSparseArray badgeSavedStates;
    int selectedItemId;

    static {
        NavigationBarPresenter$SavedState$1 navigationBarPresenter$SavedState$1 = new NavigationBarPresenter$SavedState$1();
        CREATOR = navigationBarPresenter$SavedState$1;
    }

    public NavigationBarPresenter$SavedState() {
    }

    public NavigationBarPresenter$SavedState(Parcel object) {
        int n3;
        this.selectedItemId = n3 = object.readInt();
        ClassLoader classLoader = this.getClass().getClassLoader();
        object = (ParcelableSparseArray)object.readParcelable(classLoader);
        this.badgeSavedStates = object;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int n3) {
        n3 = this.selectedItemId;
        parcel.writeInt(n3);
        ParcelableSparseArray parcelableSparseArray = this.badgeSavedStates;
        parcel.writeParcelable((Parcelable)parcelableSparseArray, 0);
    }
}

