/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.ril.ajio.services.data.Home;

import android.os.Parcel;
import android.os.Parcelable;
import com.ril.ajio.services.data.Home.Status;
import kotlin.jvm.internal.Intrinsics;

public final class Status$Creator
implements Parcelable.Creator {
    public final Status createFromParcel(Parcel object) {
        Intrinsics.checkNotNullParameter(object, "parcel");
        int n3 = object.readInt();
        String string2 = object.readString();
        object = object.readString();
        Status status = new Status(n3, string2, (String)object);
        return status;
    }

    public final Status[] newArray(int n3) {
        return new Status[n3];
    }
}

