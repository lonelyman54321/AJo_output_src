/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.firebase;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.Timestamp;
import kotlin.jvm.internal.Intrinsics;

public final class Timestamp$Companion$CREATOR$1
implements Parcelable.Creator {
    public Timestamp createFromParcel(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "source");
        long l2 = parcel.readLong();
        int n3 = parcel.readInt();
        Timestamp timestamp = new Timestamp(l2, n3);
        return timestamp;
    }

    public Timestamp[] newArray(int n3) {
        return new Timestamp[n3];
    }
}

