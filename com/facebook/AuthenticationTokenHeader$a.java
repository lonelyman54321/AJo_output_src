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
import com.facebook.AuthenticationTokenHeader;
import kotlin.jvm.internal.Intrinsics;

public final class AuthenticationTokenHeader$a
implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "source");
        AuthenticationTokenHeader authenticationTokenHeader = new AuthenticationTokenHeader(parcel);
        return authenticationTokenHeader;
    }

    public final Object[] newArray(int n3) {
        return new AuthenticationTokenHeader[n3];
    }
}

