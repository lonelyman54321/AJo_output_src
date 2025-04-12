/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$ClassLoaderCreator
 */
package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment$SavedState;

public final class Fragment$SavedState$a
implements Parcelable.ClassLoaderCreator {
    public final Object createFromParcel(Parcel parcel) {
        Fragment$SavedState fragment$SavedState = new Fragment$SavedState(parcel, null);
        return fragment$SavedState;
    }

    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        Fragment$SavedState fragment$SavedState = new Fragment$SavedState(parcel, classLoader);
        return fragment$SavedState;
    }

    public final Object[] newArray(int n3) {
        return new Fragment$SavedState[n3];
    }
}

