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
import com.facebook.AuthenticationToken;
import kotlin.jvm.internal.Intrinsics;

public final class AuthenticationToken$a
implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "source");
        AuthenticationToken authenticationToken = new AuthenticationToken(parcel);
        return authenticationToken;
    }

    public final Object[] newArray(int n3) {
        return new AuthenticationToken[n3];
    }
}

