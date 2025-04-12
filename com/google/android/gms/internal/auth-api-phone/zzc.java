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
package com.google.android.gms.internal.auth-api-phone;

import android.os.BadParcelableException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

public final class zzc {
    private static final ClassLoader zza = zzc.class.getClassLoader();

    private zzc() {
    }

    public static Parcelable zza(Parcel parcel, Parcelable.Creator creator) {
        int n3 = parcel.readInt();
        if (n3 == 0) {
            return null;
        }
        return (Parcelable)creator.createFromParcel(parcel);
    }

    public static void zzb(Parcel object) {
        int n3 = object.dataAvail();
        if (n3 <= 0) {
            return;
        }
        object = hj0_0.a(n3, "Parcel data not fully consumed, unread size: ");
        BadParcelableException badParcelableException = new BadParcelableException((String)object);
        throw badParcelableException;
    }

    public static void zzc(Parcel parcel, IInterface iInterface) {
        iInterface = iInterface.asBinder();
        parcel.writeStrongBinder((IBinder)iInterface);
    }
}

