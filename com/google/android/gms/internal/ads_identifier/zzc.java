/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 */
package com.google.android.gms.internal.ads_identifier;

import android.os.Parcel;

public final class zzc {
    private static final ClassLoader zza = zzc.class.getClassLoader();

    private zzc() {
    }

    public static void zza(Parcel parcel, boolean bl2) {
        parcel.writeInt(1);
    }

    public static boolean zzb(Parcel parcel) {
        int n3 = parcel.readInt();
        return n3 != 0;
    }
}

