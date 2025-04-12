/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcjd;
import com.google.android.gms.internal.ads.zzcjg;
import com.google.android.gms.internal.ads.zzcla;
import com.google.android.gms.internal.ads.zzclv;
import com.google.android.gms.internal.ads.zzcnj;
import com.google.android.gms.internal.ads.zzcnv;
import com.google.android.gms.internal.ads.zzfir;
import com.google.android.gms.internal.ads.zzflx;
import com.google.android.gms.internal.ads.zzhkx;

public final class zzclw {
    private zzcjg zza;
    private zzcnj zzb;
    private zzflx zzc;
    private zzcnv zzd;
    private zzfir zze;

    private zzclw() {
        throw null;
    }

    public /* synthetic */ zzclw(zzclv zzclv2) {
    }

    public final zzcjd zza() {
        zzhkx.zzc(this.zza, zzcjg.class);
        Object object = this.zzb;
        Object object2 = zzcnj.class;
        zzhkx.zzc(object, object2);
        object = this.zzc;
        if (object == null) {
            this.zzc = object = new zzflx();
        }
        if ((object = this.zzd) == null) {
            this.zzd = object = new zzcnv();
        }
        if ((object = this.zze) == null) {
            this.zze = object = new zzfir();
        }
        zzcjg zzcjg2 = this.zza;
        zzcnj zzcnj2 = this.zzb;
        zzflx zzflx2 = this.zzc;
        zzcnv zzcnv2 = this.zzd;
        zzfir zzfir2 = this.zze;
        object2 = object;
        object = new zzcla(zzcjg2, zzcnj2, zzflx2, zzcnv2, zzfir2, null);
        return object;
    }

    public final zzclw zzb(zzcjg zzcjg2) {
        this.zza = zzcjg2;
        return this;
    }

    public final zzclw zzc(zzcnj zzcnj2) {
        this.zzb = zzcnj2;
        return this;
    }
}

