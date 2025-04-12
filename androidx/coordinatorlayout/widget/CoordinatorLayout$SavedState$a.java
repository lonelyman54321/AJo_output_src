/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$ClassLoaderCreator
 */
package androidx.coordinatorlayout.widget;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.coordinatorlayout.widget.CoordinatorLayout$SavedState;

public final class CoordinatorLayout$SavedState$a
implements Parcelable.ClassLoaderCreator {
    public final Object createFromParcel(Parcel parcel) {
        CoordinatorLayout$SavedState coordinatorLayout$SavedState = new CoordinatorLayout$SavedState(parcel, null);
        return coordinatorLayout$SavedState;
    }

    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        CoordinatorLayout$SavedState coordinatorLayout$SavedState = new CoordinatorLayout$SavedState(parcel, classLoader);
        return coordinatorLayout$SavedState;
    }

    public final Object[] newArray(int n3) {
        return new CoordinatorLayout$SavedState[n3];
    }
}

