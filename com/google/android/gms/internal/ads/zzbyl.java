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
import com.google.android.gms.internal.ads.zzbyh;
import com.google.android.gms.internal.ads.zzbyn;

public final class zzbyl
extends zzbad
implements zzbyn {
    public zzbyl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
    }

    public final void zze(zzbyh zzbyh2) {
        Parcel parcel = this.zza();
        zzbaf.zzf(parcel, zzbyh2);
        this.zzdc(5, parcel);
    }

    public final void zzf() {
        Parcel parcel = this.zza();
        this.zzdc(4, parcel);
    }

    public final void zzg(int n3) {
        Parcel parcel = this.zza();
        parcel.writeInt(n3);
        this.zzdc(7, parcel);
    }

    public final void zzh() {
        Parcel parcel = this.zza();
        this.zzdc(6, parcel);
    }

    public final void zzi() {
        Parcel parcel = this.zza();
        this.zzdc(1, parcel);
    }

    public final void zzj() {
        Parcel parcel = this.zza();
        this.zzdc(2, parcel);
    }

    public final void zzk() {
        Parcel parcel = this.zza();
        this.zzdc(8, parcel);
    }

    public final void zzl() {
        Parcel parcel = this.zza();
        this.zzdc(3, parcel);
    }
}

