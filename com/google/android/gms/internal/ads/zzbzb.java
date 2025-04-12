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
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.internal.ads.zzbad;
import com.google.android.gms.internal.ads.zzbaf;
import com.google.android.gms.internal.ads.zzbyx;
import com.google.android.gms.internal.ads.zzbzd;

public final class zzbzb
extends zzbad
implements zzbzd {
    public zzbzb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    public final void zze() {
        Parcel parcel = this.zza();
        this.zzdc(7, parcel);
    }

    public final void zzf() {
        Parcel parcel = this.zza();
        this.zzdc(6, parcel);
    }

    public final void zzg() {
        Parcel parcel = this.zza();
        this.zzdc(2, parcel);
    }

    public final void zzh(int n3) {
        Parcel parcel = this.zza();
        parcel.writeInt(n3);
        this.zzdc(4, parcel);
    }

    public final void zzi(zze zze2) {
        Parcel parcel = this.zza();
        zzbaf.zzd(parcel, zze2);
        this.zzdc(5, parcel);
    }

    public final void zzj() {
        Parcel parcel = this.zza();
        this.zzdc(1, parcel);
    }

    public final void zzk(zzbyx zzbyx2) {
        Parcel parcel = this.zza();
        zzbaf.zzf(parcel, zzbyx2);
        this.zzdc(3, parcel);
    }
}

