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
package com.google.android.gms.internal.gtm;

import android.os.BadParcelableException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;

public final class zzat {
    public static final /* synthetic */ int zza;
    private static final ClassLoader zzb = zzat.class.getClassLoader();

    private zzat() {
    }

    public static Parcelable zza(Parcel parcel, Parcelable.Creator creator) {
        int n3 = parcel.readInt();
        if (n3 == 0) {
            return null;
        }
        return (Parcelable)creator.createFromParcel(parcel);
    }

    public static HashMap zzb(Parcel parcel) {
        ClassLoader classLoader = zzb;
        return parcel.readHashMap(classLoader);
    }

    public static void zzc(Parcel object) {
        int n3 = object.dataAvail();
        if (n3 <= 0) {
            return;
        }
        object = hj0_0.a(n3, "Parcel data not fully consumed, unread size: ");
        BadParcelableException badParcelableException = new BadParcelableException((String)object);
        throw badParcelableException;
    }

    public static void zzd(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    public static void zze(Parcel parcel, IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder(null);
            return;
        }
        iInterface = iInterface.asBinder();
        parcel.writeStrongBinder((IBinder)iInterface);
    }

    public static boolean zzf(Parcel parcel) {
        int n3 = parcel.readInt();
        return n3 != 0;
    }
}

