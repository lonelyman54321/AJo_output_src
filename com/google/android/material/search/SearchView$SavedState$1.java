/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$ClassLoaderCreator
 */
package com.google.android.material.search;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.search.SearchView$SavedState;

class SearchView$SavedState$1
implements Parcelable.ClassLoaderCreator {
    public SearchView$SavedState createFromParcel(Parcel parcel) {
        SearchView$SavedState searchView$SavedState = new SearchView$SavedState(parcel);
        return searchView$SavedState;
    }

    public SearchView$SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
        SearchView$SavedState searchView$SavedState = new SearchView$SavedState(parcel, classLoader);
        return searchView$SavedState;
    }

    public SearchView$SavedState[] newArray(int n3) {
        return new SearchView$SavedState[n3];
    }
}

