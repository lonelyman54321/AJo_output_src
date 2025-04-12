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
import com.google.android.material.search.SearchView$SavedState$1;

class SearchView$SavedState
extends AbsSavedState {
    public static final Parcelable.Creator CREATOR;
    String text;
    int visibility;

    static {
        SearchView$SavedState$1 searchView$SavedState$1 = new SearchView$SavedState$1();
        CREATOR = searchView$SavedState$1;
    }

    public SearchView$SavedState(Parcel parcel) {
        this(parcel, null);
    }

    public SearchView$SavedState(Parcel parcel, ClassLoader object) {
        super(parcel, (ClassLoader)object);
        int n3;
        this.text = object = parcel.readString();
        this.visibility = n3 = parcel.readInt();
    }

    public SearchView$SavedState(Parcelable parcelable) {
        super(parcelable);
    }

    public void writeToParcel(Parcel parcel, int n3) {
        super.writeToParcel(parcel, n3);
        String string2 = this.text;
        parcel.writeString(string2);
        n3 = this.visibility;
        parcel.writeInt(n3);
    }
}

