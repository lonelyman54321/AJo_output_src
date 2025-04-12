/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcci;
import com.google.android.gms.internal.ads.zzdow;
import com.google.android.gms.internal.ads.zzdox;
import com.google.android.gms.internal.ads.zzdpb;
import com.google.android.gms.internal.ads.zzgge;
import com.google.android.gms.internal.ads.zzhkp;
import com.google.android.gms.internal.ads.zzhkx;
import com.google.android.gms.internal.ads.zzhlg;

public final class zzdpc
implements zzhkp {
    private final zzhlg zza;
    private final zzhlg zzb;

    public zzdpc(zzhlg zzhlg2, zzhlg zzhlg3) {
        this.zza = zzhlg2;
        this.zzb = zzhlg3;
    }

    public final zzdpb zza() {
        zzgge zzgge2 = zzcci.zza;
        zzhkx.zzb(zzgge2);
        zzdow zzdow2 = ((zzdox)this.zzb).zza();
        zzdpb zzdpb2 = new zzdpb(zzgge2, zzdow2);
        return zzdpb2;
    }
}

