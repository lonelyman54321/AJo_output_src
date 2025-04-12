/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbyt;
import com.google.android.gms.internal.ads.zzbyx;
import com.google.android.gms.internal.ads.zzczj;
import com.google.android.gms.internal.ads.zzczy;
import com.google.android.gms.internal.ads.zzdad;
import com.google.android.gms.internal.ads.zzdas;
import com.google.android.gms.internal.ads.zzdax;
import com.google.android.gms.internal.ads.zzdbr;
import com.google.android.gms.internal.ads.zzdeb;
import com.google.android.gms.internal.ads.zzdef;
import com.google.android.gms.internal.ads.zzdhg;
import com.google.android.gms.internal.ads.zzdhr;
import com.google.android.gms.internal.ads.zzdid;
import com.google.android.gms.internal.ads.zzemz;

public class zzely
extends zzemz {
    private final zzdhr zza;

    public zzely(zzczj zzczj2, zzdhg zzdhg2, zzdad zzdad2, zzdas zzdas2, zzdax zzdax2, zzczy zzczy2, zzdef zzdef2, zzdid zzdid2, zzdbr zzdbr2, zzdhr zzdhr2, zzdeb zzdeb2) {
        super(zzczj2, zzdhg2, zzdad2, zzdas2, zzdax2, zzdef2, zzdbr2, zzdid2, zzdeb2, zzczy2);
        this.zza = zzdhr2;
    }

    public final void zzs(zzbyt zzbyt2) {
        this.zza.zza(zzbyt2);
    }

    public final void zzt(zzbyx zzbyx2) {
        String string2 = zzbyx2.zzf();
        int n3 = zzbyx2.zze();
        zzbyt zzbyt2 = new zzbyt(string2, n3);
        this.zza.zza(zzbyt2);
    }

    public final void zzu() {
        this.zza.zzb();
    }

    public final void zzv() {
        this.zza.zzb();
    }

    public final void zzy() {
        this.zza.zzc();
    }
}

