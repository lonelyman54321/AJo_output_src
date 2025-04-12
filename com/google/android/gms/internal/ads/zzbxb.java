/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.Parcel
 */
package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzbad;
import com.google.android.gms.internal.ads.zzbaf;
import com.google.android.gms.internal.ads.zzbxd;
import com.google.android.gms.internal.ads.zzbxn;
import com.google.android.gms.internal.ads.zzbxu;

public final class zzbxb
extends zzbad
implements zzbxd {
    public zzbxb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    public final void zze(zzbxu zzbxu2, zzbxn zzbxn2) {
        Parcel parcel = this.zza();
        zzbaf.zzd(parcel, zzbxu2);
        zzbaf.zzf(parcel, zzbxn2);
        this.zzdc(6, parcel);
    }

    public final void zzf(zzbxu zzbxu2, zzbxn zzbxn2) {
        Parcel parcel = this.zza();
        zzbaf.zzd(parcel, zzbxu2);
        zzbaf.zzf(parcel, zzbxn2);
        this.zzdc(5, parcel);
    }

    public final void zzg(zzbxu zzbxu2, zzbxn zzbxn2) {
        Parcel parcel = this.zza();
        zzbaf.zzd(parcel, zzbxu2);
        zzbaf.zzf(parcel, zzbxn2);
        this.zzdc(4, parcel);
    }

    public final void zzh(String string2, zzbxn zzbxn2) {
        Parcel parcel = this.zza();
        parcel.writeString(string2);
        zzbaf.zzf(parcel, zzbxn2);
        this.zzdc(7, parcel);
    }
}

