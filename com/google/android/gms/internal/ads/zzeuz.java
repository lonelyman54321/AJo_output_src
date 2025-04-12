/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcci;
import com.google.android.gms.internal.ads.zzczc;
import com.google.android.gms.internal.ads.zzeux;
import com.google.android.gms.internal.ads.zzfho;
import com.google.android.gms.internal.ads.zzgge;
import com.google.android.gms.internal.ads.zzhkp;
import com.google.android.gms.internal.ads.zzhkx;
import com.google.android.gms.internal.ads.zzhlg;

public final class zzeuz
implements zzhkp {
    private final zzhlg zza;
    private final zzhlg zzb;

    public zzeuz(zzhlg zzhlg2, zzhlg zzhlg3) {
        this.zza = zzhlg2;
        this.zzb = zzhlg3;
    }

    public final zzeux zza() {
        zzgge zzgge2 = zzcci.zza;
        zzhkx.zzb(zzgge2);
        zzfho zzfho2 = ((zzczc)this.zzb).zza();
        zzeux zzeux2 = new zzeux(zzgge2, zzfho2);
        return zzeux2;
    }
}

