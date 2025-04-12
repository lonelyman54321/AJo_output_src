/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.Parcel
 */
package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzbh;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.internal.ads.zzbad;
import com.google.android.gms.internal.ads.zzbaf;

public final class zzbf
extends zzbad
implements zzbh {
    public zzbf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdListener");
    }

    public final void zzc() {
        Parcel parcel = this.zza();
        this.zzdc(6, parcel);
    }

    public final void zzd() {
        Parcel parcel = this.zza();
        this.zzdc(1, parcel);
    }

    public final void zze(int n3) {
        Parcel parcel = this.zza();
        parcel.writeInt(n3);
        this.zzdc(2, parcel);
    }

    public final void zzf(zze zze2) {
        Parcel parcel = this.zza();
        zzbaf.zzd(parcel, zze2);
        this.zzdc(8, parcel);
    }

    public final void zzg() {
        Parcel parcel = this.zza();
        this.zzdc(7, parcel);
    }

    public final void zzh() {
        Parcel parcel = this.zza();
        this.zzdc(3, parcel);
    }

    public final void zzi() {
        Parcel parcel = this.zza();
        this.zzdc(4, parcel);
    }

    public final void zzj() {
        Parcel parcel = this.zza();
        this.zzdc(5, parcel);
    }

    public final void zzk() {
        Parcel parcel = this.zza();
        this.zzdc(9, parcel);
    }
}

