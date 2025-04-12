/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.ril.ajio.services.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.ril.ajio.services.data.Deal;
import kotlin.jvm.internal.Intrinsics;

public final class Deal$Creator
implements Parcelable.Creator {
    public final Deal createFromParcel(Parcel object) {
        Intrinsics.checkNotNullParameter(object, "parcel");
        object.readInt();
        object = new Deal();
        return object;
    }

    public final Deal[] newArray(int n3) {
        return new Deal[n3];
    }
}

