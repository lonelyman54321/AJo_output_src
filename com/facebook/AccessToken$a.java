/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.AccessToken;
import kotlin.jvm.internal.Intrinsics;

public final class AccessToken$a
implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "source");
        AccessToken accessToken = new AccessToken(parcel);
        return accessToken;
    }

    public final Object[] newArray(int n3) {
        return new AccessToken[n3];
    }
}

