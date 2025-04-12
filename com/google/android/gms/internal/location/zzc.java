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
package com.google.android.gms.internal.location;

import android.os.BadParcelableException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

public final class zzc {
    public static final /* synthetic */ int zza;
    private static final ClassLoader zzb = zzc.class.getClassLoader();

    private zzc() {
    }

    public static Parcelable zza(Parcel parcel, Parcelable.Creator creator) {
        int n3 = parcel.readInt();
        if (n3 == 0) {
            return null;
        }
        return (Parcelable)creator.createFromParcel(parcel);
    }

    public static void zzb(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    public static void zzc(Parcel parcel, IInterface iInterface) {
        iInterface = iInterface.asBinder();
        parcel.writeStrongBinder((IBinder)iInterface);
    }

    public static void zzd(Parcel object) {
        int n3 = object.dataAvail();
        if (n3 <= 0) {
            return;
        }
        int n4 = String.valueOf(n3).length();
        StringBuilder stringBuilder = new StringBuilder(n4 += 45);
        stringBuilder.append("Parcel data not fully consumed, unread size: ");
        stringBuilder.append(n3);
        object = stringBuilder.toString();
        BadParcelableException badParcelableException = new BadParcelableException((String)object);
        throw badParcelableException;
    }
}

