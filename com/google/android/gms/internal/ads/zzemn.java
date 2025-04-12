/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbyr;
import com.google.android.gms.internal.ads.zzbyt;
import com.google.android.gms.internal.ads.zzczj;
import com.google.android.gms.internal.ads.zzdas;
import com.google.android.gms.internal.ads.zzdbr;
import com.google.android.gms.internal.ads.zzdhr;
import com.google.android.gms.internal.ads.zzemo;

final class zzemn
extends zzbyr {
    final /* synthetic */ zzdbr zza;
    final /* synthetic */ zzczj zzb;
    final /* synthetic */ zzdas zzc;
    final /* synthetic */ zzdhr zzd;

    public zzemn(zzemo zzemo2, zzdbr zzdbr2, zzczj zzczj2, zzdas zzdas2, zzdhr zzdhr2) {
        this.zza = zzdbr2;
        this.zzb = zzczj2;
        this.zzc = zzdas2;
        this.zzd = zzdhr2;
    }

    public final void zze(IObjectWrapper iObjectWrapper) {
        this.zzb.onAdClicked();
    }

    public final void zzf(IObjectWrapper iObjectWrapper) {
        this.zza.zzdu(4);
    }

    public final void zzg(IObjectWrapper iObjectWrapper, int n3) {
    }

    public final void zzh(IObjectWrapper iObjectWrapper) {
        this.zzc.zzb();
    }

    public final void zzi(IObjectWrapper iObjectWrapper) {
    }

    public final void zzj(IObjectWrapper iObjectWrapper) {
        this.zza.zzdr();
    }

    public final void zzk(IObjectWrapper iObjectWrapper, int n3) {
    }

    public final void zzl(IObjectWrapper iObjectWrapper) {
    }

    public final void zzm(IObjectWrapper iObjectWrapper, zzbyt zzbyt2) {
        this.zzd.zza(zzbyt2);
    }

    public final void zzn(IObjectWrapper iObjectWrapper) {
        this.zzc.zze();
    }

    public final void zzo(IObjectWrapper iObjectWrapper) {
        this.zzd.zzc();
    }
}

