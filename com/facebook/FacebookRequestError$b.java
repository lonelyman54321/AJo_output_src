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
import com.facebook.FacebookRequestError;
import kotlin.jvm.internal.Intrinsics;

public final class FacebookRequestError$b
implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        int n3 = parcel.readInt();
        int n4 = parcel.readInt();
        int n7 = parcel.readInt();
        String string2 = parcel.readString();
        String string3 = parcel.readString();
        String string4 = parcel.readString();
        String string5 = parcel.readString();
        FacebookRequestError facebookRequestError = new FacebookRequestError(n3, n4, n7, string2, string3, string4, string5, null, null, false);
        return facebookRequestError;
    }

    public final Object[] newArray(int n3) {
        return new FacebookRequestError[n3];
    }
}

