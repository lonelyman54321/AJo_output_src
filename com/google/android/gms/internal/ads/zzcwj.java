/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.ads.zzbdv$zzb;
import com.google.android.gms.internal.ads.zzbxu;
import com.google.android.gms.internal.ads.zzbyh;
import com.google.android.gms.internal.ads.zzcbr;
import com.google.android.gms.internal.ads.zzczl;
import com.google.android.gms.internal.ads.zzdaf;
import com.google.android.gms.internal.ads.zzdaz;
import com.google.android.gms.internal.ads.zzdcg;
import com.google.android.gms.internal.ads.zzdes;
import com.google.android.gms.internal.ads.zzfhf;

public final class zzcwj
implements zzdaz,
zza,
zzdcg,
zzdaf,
zzczl,
zzdes {
    private final Clock zza;
    private final zzcbr zzb;

    public zzcwj(Clock clock, zzcbr zzcbr2) {
        this.zza = clock;
        this.zzb = zzcbr2;
    }

    public final void onAdClicked() {
        this.zzb.zzd();
    }

    public final void zza() {
        this.zzb.zze();
    }

    public final void zzb() {
    }

    public final void zzc() {
    }

    public final void zzdn(zzbxu zzbxu2) {
    }

    public final void zzdo(zzfhf object) {
        object = this.zza;
        zzcbr zzcbr2 = this.zzb;
        long l2 = object.elapsedRealtime();
        zzcbr2.zzk(l2);
    }

    public final void zzds(zzbyh zzbyh2, String string2, String string3) {
    }

    public final void zze() {
    }

    public final void zzf() {
    }

    public final String zzg() {
        return this.zzb.zzc();
    }

    public final void zzh() {
    }

    public final void zzi(zzbdv$zzb zzbdv$zzb) {
        this.zzb.zzi();
    }

    public final void zzj(zzbdv$zzb zzbdv$zzb) {
    }

    public final void zzk(zzl zzl2) {
        this.zzb.zzj(zzl2);
    }

    public final void zzl(boolean bl2) {
    }

    public final void zzm(zzbdv$zzb zzbdv$zzb) {
        this.zzb.zzg();
    }

    public final void zzn(boolean bl2) {
    }

    public final void zzr() {
        this.zzb.zzf();
    }

    public final void zzs() {
        this.zzb.zzh(true);
    }
}

