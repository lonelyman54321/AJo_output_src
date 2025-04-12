/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcci;
import com.google.android.gms.internal.ads.zzebz;
import com.google.android.gms.internal.ads.zzecu;
import com.google.android.gms.internal.ads.zzecv;
import com.google.android.gms.internal.ads.zzgge;
import com.google.android.gms.internal.ads.zzhkj;
import com.google.android.gms.internal.ads.zzhko;
import com.google.android.gms.internal.ads.zzhkp;
import com.google.android.gms.internal.ads.zzhkx;
import com.google.android.gms.internal.ads.zzhla;
import com.google.android.gms.internal.ads.zzhlg;

public final class zzeca
implements zzhkp {
    private final zzhlg zza;
    private final zzhlg zzb;
    private final zzhlg zzc;
    private final zzhlg zzd;

    public zzeca(zzhlg zzhlg2, zzhlg zzhlg3, zzhlg zzhlg4, zzhlg zzhlg5) {
        this.zza = zzhlg2;
        this.zzb = zzhlg3;
        this.zzc = zzhlg4;
        this.zzd = zzhlg5;
    }

    public final zzebz zza() {
        zzgge zzgge2 = zzcci.zzb;
        zzhkx.zzb(zzgge2);
        zzgge zzgge3 = zzcci.zza;
        zzhkx.zzb(zzgge3);
        zzecu zzecu2 = ((zzecv)this.zzc).zza();
        zzhkj zzhkj2 = zzhko.zza(zzhla.zza(this.zzd));
        zzebz zzebz2 = new zzebz(zzgge2, zzgge3, zzecu2, zzhkj2);
        return zzebz2;
    }
}

