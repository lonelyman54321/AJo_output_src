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
import com.google.android.material.search.SearchBar$SavedState;

class SearchBar$SavedState$1
implements Parcelable.ClassLoaderCreator {
    public SearchBar$SavedState createFromParcel(Parcel parcel) {
        SearchBar$SavedState searchBar$SavedState = new SearchBar$SavedState(parcel);
        return searchBar$SavedState;
    }

    public SearchBar$SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
        SearchBar$SavedState searchBar$SavedState = new SearchBar$SavedState(parcel, classLoader);
        return searchBar$SavedState;
    }

    public SearchBar$SavedState[] newArray(int n3) {
        return new SearchBar$SavedState[n3];
    }
}

