/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$ClassLoaderCreator
 */
package androidx.customview.view;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.customview.view.AbsSavedState;

public final class AbsSavedState$a
implements Parcelable.ClassLoaderCreator {
    public final Object createFromParcel(Parcel object) {
        if ((object = object.readParcelable(null)) == null) {
            return AbsSavedState.EMPTY_STATE;
        }
        object = new IllegalStateException("superState must be null");
        throw object;
    }

    public final Object createFromParcel(Parcel object, ClassLoader classLoader) {
        if ((object = object.readParcelable(classLoader)) == null) {
            return AbsSavedState.EMPTY_STATE;
        }
        object = new IllegalStateException("superState must be null");
        throw object;
    }

    public final Object[] newArray(int n3) {
        return new AbsSavedState[n3];
    }
}

