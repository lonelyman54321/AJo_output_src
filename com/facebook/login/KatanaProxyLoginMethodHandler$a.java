/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.login.KatanaProxyLoginMethodHandler;
import kotlin.jvm.internal.Intrinsics;

public final class KatanaProxyLoginMethodHandler$a
implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "source");
        KatanaProxyLoginMethodHandler katanaProxyLoginMethodHandler = new KatanaProxyLoginMethodHandler(parcel);
        return katanaProxyLoginMethodHandler;
    }

    public final Object[] newArray(int n3) {
        return new KatanaProxyLoginMethodHandler[n3];
    }
}

