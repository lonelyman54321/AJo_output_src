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
import com.facebook.login.InstagramAppLoginMethodHandler;
import kotlin.jvm.internal.Intrinsics;

public final class InstagramAppLoginMethodHandler$a
implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "source");
        InstagramAppLoginMethodHandler instagramAppLoginMethodHandler = new InstagramAppLoginMethodHandler(parcel);
        return instagramAppLoginMethodHandler;
    }

    public final Object[] newArray(int n3) {
        return new InstagramAppLoginMethodHandler[n3];
    }
}

