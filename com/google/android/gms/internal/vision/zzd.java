/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.internal.vision;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

public class zzd {
    private static final ClassLoader zza = zzd.class.getClassLoader();

    private zzd() {
    }

    public static Parcelable zza(Parcel parcel, Parcelable.Creator creator) {
        int n3 = parcel.readInt();
        if (n3 == 0) {
            return null;
        }
        return (Parcelable)creator.createFromParcel(parcel);
    }

    public static void zza(Parcel parcel, IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder(null);
            return;
        }
        iInterface = iInterface.asBinder();
        parcel.writeStrongBinder((IBinder)iInterface);
    }

    public static void zza(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    public static void zza(Parcel parcel, boolean bl2) {
        parcel.writeInt((int)(bl2 ? 1 : 0));
    }

    public static boolean zza(Parcel parcel) {
        int n3 = parcel.readInt();
        return n3 != 0;
    }
}

