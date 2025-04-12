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
import androidx.fragment.app.BackStackState;

public final class BackStackState$a
implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        BackStackState backStackState = new BackStackState(parcel);
        return backStackState;
    }

    public final Object[] newArray(int n3) {
        return new BackStackState[n3];
    }
}

