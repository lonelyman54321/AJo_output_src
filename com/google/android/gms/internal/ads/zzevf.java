/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzdya;
import com.google.android.gms.internal.ads.zzeve;
import com.google.android.gms.internal.ads.zzevg;
import com.google.android.gms.internal.ads.zzexw;
import com.google.android.gms.internal.ads.zzgge;
import com.google.common.util.concurrent.ListenableFuture;

public final class zzevf
implements zzexw {
    private final zzgge zza;
    private final zzdya zzb;

    public zzevf(zzgge zzgge2, zzdya zzdya2) {
        this.zza = zzgge2;
        this.zzb = zzdya2;
    }

    public final int zza() {
        return 23;
    }

    public final ListenableFuture zzb() {
        zzeve zzeve2 = new zzeve(this);
        return this.zza.zzb(zzeve2);
    }

    public final /* synthetic */ zzevg zzc() {
        zzdya zzdya2 = this.zzb;
        String string2 = zzdya2.zzc();
        boolean bl2 = zzdya2.zzr();
        boolean bl3 = zzu.zzs().zzl();
        zzdya2 = this.zzb;
        boolean bl4 = zzdya2.zzp();
        boolean bl5 = zzdya2.zzs();
        zzevg zzevg2 = new zzevg(string2, bl2, bl3, bl4, bl5);
        return zzevg2;
    }
}

