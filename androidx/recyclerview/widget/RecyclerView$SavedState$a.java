/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$ClassLoaderCreator
 */
package androidx.recyclerview.widget;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView$SavedState;

public final class RecyclerView$SavedState$a
implements Parcelable.ClassLoaderCreator {
    public final Object createFromParcel(Parcel parcel) {
        RecyclerView$SavedState recyclerView$SavedState = new RecyclerView$SavedState(parcel, null);
        return recyclerView$SavedState;
    }

    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        RecyclerView$SavedState recyclerView$SavedState = new RecyclerView$SavedState(parcel, classLoader);
        return recyclerView$SavedState;
    }

    public final Object[] newArray(int n3) {
        return new RecyclerView$SavedState[n3];
    }
}

