/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.login.DeviceAuthDialog$RequestState$a;
import kotlin.jvm.internal.Intrinsics;

final class DeviceAuthDialog$RequestState
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public String a;
    public String b;
    public String c;
    public long d;
    public long e;

    static {
        DeviceAuthDialog$RequestState$a deviceAuthDialog$RequestState$a = new Object();
        CREATOR = deviceAuthDialog$RequestState$a;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        String string2 = this.a;
        parcel.writeString(string2);
        string2 = this.b;
        parcel.writeString(string2);
        string2 = this.c;
        parcel.writeString(string2);
        long l2 = this.d;
        parcel.writeLong(l2);
        l2 = this.e;
        parcel.writeLong(l2);
    }
}

