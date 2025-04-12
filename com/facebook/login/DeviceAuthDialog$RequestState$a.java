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
import com.facebook.login.DeviceAuthDialog$RequestState;
import kotlin.jvm.internal.Intrinsics;

public final class DeviceAuthDialog$RequestState$a
implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        long l2;
        String string2 = "parcel";
        Intrinsics.checkNotNullParameter(parcel, string2);
        Intrinsics.checkNotNullParameter(parcel, string2);
        DeviceAuthDialog$RequestState deviceAuthDialog$RequestState = new Object();
        deviceAuthDialog$RequestState.a = string2 = parcel.readString();
        deviceAuthDialog$RequestState.b = string2 = parcel.readString();
        deviceAuthDialog$RequestState.c = string2 = parcel.readString();
        deviceAuthDialog$RequestState.d = l2 = parcel.readLong();
        deviceAuthDialog$RequestState.e = l2 = parcel.readLong();
        return deviceAuthDialog$RequestState;
    }

    public final Object[] newArray(int n3) {
        return new DeviceAuthDialog$RequestState[n3];
    }
}

