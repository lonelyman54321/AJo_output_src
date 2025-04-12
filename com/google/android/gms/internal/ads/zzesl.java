/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcci;
import com.google.android.gms.internal.ads.zzczc;
import com.google.android.gms.internal.ads.zzesj;
import com.google.android.gms.internal.ads.zzfho;
import com.google.android.gms.internal.ads.zzgge;
import com.google.android.gms.internal.ads.zzhkp;
import com.google.android.gms.internal.ads.zzhkx;
import com.google.android.gms.internal.ads.zzhlg;

public final class zzesl
implements zzhkp {
    private final zzhlg zza;
    private final zzhlg zzb;

    public zzesl(zzhlg zzhlg2, zzhlg zzhlg3) {
        this.zza = zzhlg2;
        this.zzb = zzhlg3;
    }

    public final zzesj zza() {
        zzgge zzgge2 = zzcci.zza;
        zzhkx.zzb(zzgge2);
        zzfho zzfho2 = ((zzczc)this.zzb).zza();
        zzesj zzesj2 = new zzesj(zzgge2, zzfho2);
        return zzesj2;
    }
}

