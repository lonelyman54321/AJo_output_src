/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbh;
import com.google.android.gms.internal.ads.zzboi;
import com.google.android.gms.internal.ads.zzczo;
import com.google.android.gms.internal.ads.zzdaz;
import com.google.android.gms.internal.ads.zzdjy;
import com.google.android.gms.internal.ads.zzdme;
import com.google.android.gms.internal.ads.zzdvc;
import com.google.android.gms.internal.ads.zzepc;
import com.google.android.gms.internal.ads.zzepo;

public final class zzepp {
    private final zzdme zza;
    private final zzepc zzb;
    private final zzczo zzc;

    public zzepp(zzdme object, zzdvc object2) {
        zzepc zzepc2;
        this.zza = object;
        this.zzb = zzepc2 = new zzepc((zzdvc)object2);
        object = ((zzdme)object).zzg();
        this.zzc = object2 = new zzepo(zzepc2, (zzboi)object);
    }

    public final zzczo zza() {
        return this.zzc;
    }

    public final zzdaz zzb() {
        return this.zzb;
    }

    public final zzdjy zzc() {
        Object object = this.zzb;
        zzdme zzdme2 = this.zza;
        object = ((zzepc)object).zzg();
        zzdjy zzdjy2 = new zzdjy(zzdme2, (zzbh)object);
        return zzdjy2;
    }

    public final zzepc zzd() {
        return this.zzb;
    }

    public final void zze(zzbh zzbh2) {
        this.zzb.zzj(zzbh2);
    }
}

