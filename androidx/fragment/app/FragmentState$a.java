/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentState;

public final class FragmentState$a
implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        FragmentState fragmentState = new FragmentState(parcel);
        return fragmentState;
    }

    public final Object[] newArray(int n3) {
        return new FragmentState[n3];
    }
}

