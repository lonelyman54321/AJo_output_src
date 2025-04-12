/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 *  android.view.View$BaseSavedState
 */
package androidx.appcompat.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.appcompat.widget.AppCompatSpinner$SavedState;

public final class AppCompatSpinner$SavedState$a
implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        AppCompatSpinner$SavedState appCompatSpinner$SavedState = new View.BaseSavedState(parcel);
        byte by2 = parcel.readByte();
        if (by2 != 0) {
            by2 = 1;
        } else {
            by2 = 0;
            parcel = null;
        }
        appCompatSpinner$SavedState.a = by2;
        return appCompatSpinner$SavedState;
    }

    public final Object[] newArray(int n3) {
        return new AppCompatSpinner$SavedState[n3];
    }
}

