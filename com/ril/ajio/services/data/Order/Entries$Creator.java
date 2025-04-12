/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.ril.ajio.services.data.Order;

import android.os.Parcel;
import android.os.Parcelable;
import com.ril.ajio.services.data.Order.Entries;
import kotlin.jvm.internal.Intrinsics;

public final class Entries$Creator
implements Parcelable.Creator {
    public final Entries createFromParcel(Parcel object) {
        Intrinsics.checkNotNullParameter(object, "parcel");
        String string2 = object.readString();
        object = object.readString();
        Entries entries2 = new Entries(string2, (String)object);
        return entries2;
    }

    public final Entries[] newArray(int n3) {
        return new Entries[n3];
    }
}

