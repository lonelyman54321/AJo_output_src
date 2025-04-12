/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 *  android.view.View$BaseSavedState
 */
package androidx.core.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.core.widget.NestedScrollView$SavedState;

public final class NestedScrollView$SavedState$a
implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int n3;
        NestedScrollView$SavedState nestedScrollView$SavedState = new View.BaseSavedState(parcel);
        nestedScrollView$SavedState.a = n3 = parcel.readInt();
        return nestedScrollView$SavedState;
    }

    public final Object[] newArray(int n3) {
        return new NestedScrollView$SavedState[n3];
    }
}

