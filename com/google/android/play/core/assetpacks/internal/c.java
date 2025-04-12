/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.BadParcelableException
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.google.android.play.core.assetpacks.internal;

import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;

public final class c {
    static {
        c.class.getClassLoader();
    }

    private c() {
    }

    public static Parcelable a(Parcel parcel, Parcelable.Creator creator) {
        int n3 = parcel.readInt();
        if (n3 == 0) {
            return null;
        }
        return (Parcelable)creator.createFromParcel(parcel);
    }

    public static void b(Parcel object) {
        int n3 = object.dataAvail();
        if (n3 <= 0) {
            return;
        }
        object = hj0_0.a(n3, "Parcel data not fully consumed, unread size: ");
        BadParcelableException badParcelableException = new BadParcelableException((String)object);
        throw badParcelableException;
    }

    public static void c(Parcel parcel, Parcelable parcelable) {
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }
}

