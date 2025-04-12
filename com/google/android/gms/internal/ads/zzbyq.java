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
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbad;
import com.google.android.gms.internal.ads.zzbaf;
import com.google.android.gms.internal.ads.zzbys;
import com.google.android.gms.internal.ads.zzbyt;

public final class zzbyq
extends zzbad
implements zzbys {
    public zzbyq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    public final void zze(IObjectWrapper iObjectWrapper) {
        Parcel parcel = this.zza();
        zzbaf.zzf(parcel, iObjectWrapper);
        this.zzdc(8, parcel);
    }

    public final void zzf(IObjectWrapper iObjectWrapper) {
        Parcel parcel = this.zza();
        zzbaf.zzf(parcel, iObjectWrapper);
        this.zzdc(6, parcel);
    }

    public final void zzg(IObjectWrapper iObjectWrapper, int n3) {
        Parcel parcel = this.zza();
        zzbaf.zzf(parcel, iObjectWrapper);
        parcel.writeInt(n3);
        this.zzdc(9, parcel);
    }

    public final void zzh(IObjectWrapper iObjectWrapper) {
        throw null;
    }

    public final void zzi(IObjectWrapper iObjectWrapper) {
        Parcel parcel = this.zza();
        zzbaf.zzf(parcel, iObjectWrapper);
        this.zzdc(3, parcel);
    }

    public final void zzj(IObjectWrapper iObjectWrapper) {
        Parcel parcel = this.zza();
        zzbaf.zzf(parcel, iObjectWrapper);
        this.zzdc(4, parcel);
    }

    public final void zzk(IObjectWrapper iObjectWrapper, int n3) {
        throw null;
    }

    public final void zzl(IObjectWrapper iObjectWrapper) {
        Parcel parcel = this.zza();
        zzbaf.zzf(parcel, iObjectWrapper);
        this.zzdc(1, parcel);
    }

    public final void zzm(IObjectWrapper iObjectWrapper, zzbyt zzbyt2) {
        Parcel parcel = this.zza();
        zzbaf.zzf(parcel, iObjectWrapper);
        zzbaf.zzd(parcel, zzbyt2);
        this.zzdc(7, parcel);
    }

    public final void zzn(IObjectWrapper iObjectWrapper) {
        Parcel parcel = this.zza();
        zzbaf.zzf(parcel, iObjectWrapper);
        this.zzdc(11, parcel);
    }

    public final void zzo(IObjectWrapper iObjectWrapper) {
        Parcel parcel = this.zza();
        zzbaf.zzf(parcel, iObjectWrapper);
        this.zzdc(5, parcel);
    }
}

