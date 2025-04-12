/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$ClassLoaderCreator
 */
package androidx.appcompat.widget;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.widget.SearchView$SavedState;

public final class SearchView$SavedState$a
implements Parcelable.ClassLoaderCreator {
    public final Object createFromParcel(Parcel parcel) {
        SearchView$SavedState searchView$SavedState = new SearchView$SavedState(parcel, null);
        return searchView$SavedState;
    }

    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        SearchView$SavedState searchView$SavedState = new SearchView$SavedState(parcel, classLoader);
        return searchView$SavedState;
    }

    public final Object[] newArray(int n3) {
        return new SearchView$SavedState[n3];
    }
}

