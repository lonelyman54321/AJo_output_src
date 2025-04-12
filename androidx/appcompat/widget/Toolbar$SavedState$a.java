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
import androidx.appcompat.widget.Toolbar$SavedState;

public final class Toolbar$SavedState$a
implements Parcelable.ClassLoaderCreator {
    public final Object createFromParcel(Parcel parcel) {
        Toolbar$SavedState toolbar$SavedState = new Toolbar$SavedState(parcel, null);
        return toolbar$SavedState;
    }

    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        Toolbar$SavedState toolbar$SavedState = new Toolbar$SavedState(parcel, classLoader);
        return toolbar$SavedState;
    }

    public final Object[] newArray(int n3) {
        return new Toolbar$SavedState[n3];
    }
}

