/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$ClassLoaderCreator
 */
package androidx.slidingpanelayout.widget;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.slidingpanelayout.widget.SlidingPaneLayout$SavedState;

public final class SlidingPaneLayout$SavedState$a
implements Parcelable.ClassLoaderCreator {
    public final Object createFromParcel(Parcel parcel) {
        SlidingPaneLayout$SavedState slidingPaneLayout$SavedState = new SlidingPaneLayout$SavedState(parcel);
        return slidingPaneLayout$SavedState;
    }

    public final Object createFromParcel(Parcel parcel, ClassLoader object) {
        object = new SlidingPaneLayout$SavedState(parcel);
        return object;
    }

    public final Object[] newArray(int n3) {
        return new SlidingPaneLayout$SavedState[n3];
    }
}

