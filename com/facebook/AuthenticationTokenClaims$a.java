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
import com.facebook.AuthenticationTokenClaims;
import kotlin.jvm.internal.Intrinsics;

public final class AuthenticationTokenClaims$a
implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "source");
        AuthenticationTokenClaims authenticationTokenClaims = new AuthenticationTokenClaims(parcel);
        return authenticationTokenClaims;
    }

    public final Object[] newArray(int n3) {
        return new AuthenticationTokenClaims[n3];
    }
}

