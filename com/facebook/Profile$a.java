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
import com.facebook.Profile;
import kotlin.jvm.internal.Intrinsics;

public final class Profile$a
implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "source");
        Profile profile = new Profile(parcel);
        return profile;
    }

    public final Object[] newArray(int n3) {
        return new Profile[n3];
    }
}

