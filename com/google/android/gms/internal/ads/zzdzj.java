/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcci;
import com.google.android.gms.internal.ads.zzdzi;
import com.google.android.gms.internal.ads.zzdzw;
import com.google.android.gms.internal.ads.zzeap;
import com.google.android.gms.internal.ads.zzgge;
import com.google.android.gms.internal.ads.zzhkj;
import com.google.android.gms.internal.ads.zzhko;
import com.google.android.gms.internal.ads.zzhkp;
import com.google.android.gms.internal.ads.zzhkx;
import com.google.android.gms.internal.ads.zzhla;
import com.google.android.gms.internal.ads.zzhlg;

public final class zzdzj
implements zzhkp {
    private final zzhlg zza;
    private final zzhlg zzb;
    private final zzhlg zzc;
    private final zzhlg zzd;

    public zzdzj(zzhlg zzhlg2, zzhlg zzhlg3, zzhlg zzhlg4, zzhlg zzhlg5) {
        this.zza = zzhlg2;
        this.zzb = zzhlg3;
        this.zzc = zzhlg4;
        this.zzd = zzhlg5;
    }

    public final zzdzi zza() {
        zzgge zzgge2 = zzcci.zzb;
        zzhkx.zzb(zzgge2);
        zzgge zzgge3 = zzcci.zza;
        zzhkx.zzb(zzgge3);
        zzeap zzeap2 = ((zzdzw)this.zzc).zza();
        zzhkj zzhkj2 = zzhko.zza(zzhla.zza(this.zzd));
        zzdzi zzdzi2 = new zzdzi(zzgge2, zzgge3, zzeap2, zzhkj2);
        return zzdzi2;
    }
}

