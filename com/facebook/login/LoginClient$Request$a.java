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
import com.facebook.login.LoginClient$Request;
import kotlin.jvm.internal.Intrinsics;

public final class LoginClient$Request$a
implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "source");
        LoginClient$Request loginClient$Request = new LoginClient$Request(parcel);
        return loginClient$Request;
    }

    public final Object[] newArray(int n3) {
        return new LoginClient$Request[n3];
    }
}

