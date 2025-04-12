/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 *  android.view.View$BaseSavedState
 */
package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.FragmentTabHost$SavedState;

public final class FragmentTabHost$SavedState$a
implements Parcelable.Creator {
    public final Object createFromParcel(Parcel object) {
        FragmentTabHost$SavedState fragmentTabHost$SavedState = new View.BaseSavedState(object);
        object = object.readString();
        fragmentTabHost$SavedState.a = object;
        return fragmentTabHost$SavedState;
    }

    public final Object[] newArray(int n3) {
        return new FragmentTabHost$SavedState[n3];
    }
}

