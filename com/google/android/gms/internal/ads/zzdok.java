/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcci;
import com.google.android.gms.internal.ads.zzdoj;
import com.google.android.gms.internal.ads.zzdow;
import com.google.android.gms.internal.ads.zzdox;
import com.google.android.gms.internal.ads.zzdpb;
import com.google.android.gms.internal.ads.zzdpc;
import com.google.android.gms.internal.ads.zzgge;
import com.google.android.gms.internal.ads.zzhkp;
import com.google.android.gms.internal.ads.zzhkx;
import com.google.android.gms.internal.ads.zzhlg;

public final class zzdok
implements zzhkp {
    private final zzhlg zza;
    private final zzhlg zzb;
    private final zzhlg zzc;

    public zzdok(zzhlg zzhlg2, zzhlg zzhlg3, zzhlg zzhlg4) {
        this.zza = zzhlg2;
        this.zzb = zzhlg3;
        this.zzc = zzhlg4;
    }

    public final zzdoj zza() {
        zzgge zzgge2 = zzcci.zza;
        zzhkx.zzb(zzgge2);
        zzdow zzdow2 = ((zzdox)this.zzb).zza();
        zzdpb zzdpb2 = ((zzdpc)this.zzc).zza();
        zzdoj zzdoj2 = new zzdoj(zzgge2, zzdow2, zzdpb2);
        return zzdoj2;
    }
}

