/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package androidx.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.navigation.NavBackStackEntryState;
import kotlin.jvm.internal.Intrinsics;

public final class NavBackStackEntryState$a
implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "inParcel");
        NavBackStackEntryState navBackStackEntryState = new NavBackStackEntryState(parcel);
        return navBackStackEntryState;
    }

    public final Object[] newArray(int n3) {
        return new NavBackStackEntryState[n3];
    }
}

