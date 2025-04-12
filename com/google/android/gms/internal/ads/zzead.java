/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcci;
import com.google.android.gms.internal.ads.zzeac;
import com.google.android.gms.internal.ads.zzeau;
import com.google.android.gms.internal.ads.zzeav;
import com.google.android.gms.internal.ads.zzgge;
import com.google.android.gms.internal.ads.zzhkj;
import com.google.android.gms.internal.ads.zzhko;
import com.google.android.gms.internal.ads.zzhkp;
import com.google.android.gms.internal.ads.zzhkx;
import com.google.android.gms.internal.ads.zzhla;
import com.google.android.gms.internal.ads.zzhlg;
import java.util.concurrent.ScheduledExecutorService;

public final class zzead
implements zzhkp {
    private final zzhlg zza;
    private final zzhlg zzb;
    private final zzhlg zzc;
    private final zzhlg zzd;
    private final zzhlg zze;

    public zzead(zzhlg zzhlg2, zzhlg zzhlg3, zzhlg zzhlg4, zzhlg zzhlg5, zzhlg zzhlg6) {
        this.zza = zzhlg2;
        this.zzb = zzhlg3;
        this.zzc = zzhlg4;
        this.zzd = zzhlg5;
        this.zze = zzhlg6;
    }

    public final zzeac zza() {
        Object object;
        Object object2 = object = this.zza.zzb();
        object2 = (ScheduledExecutorService)object;
        zzgge zzgge2 = zzcci.zza;
        zzhkx.zzb(zzgge2);
        zzgge zzgge3 = zzcci.zzb;
        zzhkx.zzb(zzgge3);
        zzeau zzeau2 = ((zzeav)this.zzd).zza();
        zzhkj zzhkj2 = zzhko.zza(zzhla.zza(this.zze));
        object = new zzeac((ScheduledExecutorService)object2, zzgge2, zzgge3, zzeau2, zzhkj2);
        return object;
    }
}

