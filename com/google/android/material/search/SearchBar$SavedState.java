/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.google.android.material.search;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.search.SearchBar$SavedState$1;

class SearchBar$SavedState
extends AbsSavedState {
    public static final Parcelable.Creator CREATOR;
    String text;

    static {
        SearchBar$SavedState$1 searchBar$SavedState$1 = new SearchBar$SavedState$1();
        CREATOR = searchBar$SavedState$1;
    }

    public SearchBar$SavedState(Parcel parcel) {
        this(parcel, null);
    }

    public SearchBar$SavedState(Parcel object, ClassLoader classLoader) {
        super((Parcel)object, classLoader);
        object = object.readString();
        this.text = object;
    }

    public SearchBar$SavedState(Parcelable parcelable) {
        super(parcelable);
    }

    public void writeToParcel(Parcel parcel, int n3) {
        super.writeToParcel(parcel, n3);
        String string2 = this.text;
        parcel.writeString(string2);
    }
}

