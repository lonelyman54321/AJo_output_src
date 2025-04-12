/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.BadParcelableException
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.internal.auth-api;

import android.os.BadParcelableException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

public final class zbc {
    private static final ClassLoader zba = zbc.class.getClassLoader();

    private zbc() {
    }

    public static Parcelable zba(Parcel parcel, Parcelable.Creator creator) {
        int n3 = parcel.readInt();
        if (n3 == 0) {
            return null;
        }
        return (Parcelable)creator.createFromParcel(parcel);
    }

    public static void zbb(Parcel object) {
        int n3 = object.dataAvail();
        if (n3 <= 0) {
            return;
        }
        object = hj0_0.a(n3, "Parcel data not fully consumed, unread size: ");
        BadParcelableException badParcelableException = new BadParcelableException((String)object);
        throw badParcelableException;
    }

    public static void zbc(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    public static void zbd(Parcel parcel, IInterface iInterface) {
        iInterface = iInterface.asBinder();
        parcel.writeStrongBinder((IBinder)iInterface);
    }
}

