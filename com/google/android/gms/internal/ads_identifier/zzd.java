/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.Parcel
 */
package com.google.android.gms.internal.ads_identifier;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads_identifier.zza;
import com.google.android.gms.internal.ads_identifier.zzc;
import com.google.android.gms.internal.ads_identifier.zzf;

public final class zzd
extends zza
implements zzf {
    public zzd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    }

    public final String zzc() {
        Object object = this.zza();
        Parcel parcel = this.zzb(1, (Parcel)object);
        object = parcel.readString();
        parcel.recycle();
        return object;
    }

    public final boolean zzd() {
        Parcel parcel = this.zza();
        Parcel parcel2 = this.zzb(6, parcel);
        boolean bl2 = zzc.zzb(parcel2);
        parcel2.recycle();
        return bl2;
    }

    public final boolean zze(boolean bl2) {
        Parcel parcel = this.zza();
        zzc.zza(parcel, true);
        parcel = this.zzb(2, parcel);
        boolean bl3 = zzc.zzb(parcel);
        parcel.recycle();
        return bl3;
    }
}

