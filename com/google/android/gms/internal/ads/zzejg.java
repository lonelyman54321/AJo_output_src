/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcci;
import com.google.android.gms.internal.ads.zzctg;
import com.google.android.gms.internal.ads.zzczn;
import com.google.android.gms.internal.ads.zzdux;
import com.google.android.gms.internal.ads.zzeim;
import com.google.android.gms.internal.ads.zzein;
import com.google.android.gms.internal.ads.zzejf;
import com.google.android.gms.internal.ads.zzgge;
import com.google.android.gms.internal.ads.zzhkp;
import com.google.android.gms.internal.ads.zzhkx;
import com.google.android.gms.internal.ads.zzhlg;
import java.util.concurrent.ScheduledExecutorService;

public final class zzejg
implements zzhkp {
    private final zzhlg zza;
    private final zzhlg zzb;
    private final zzhlg zzc;
    private final zzhlg zzd;
    private final zzhlg zze;
    private final zzhlg zzf;

    public zzejg(zzhlg zzhlg2, zzhlg zzhlg3, zzhlg zzhlg4, zzhlg zzhlg5, zzhlg zzhlg6, zzhlg zzhlg7) {
        this.zza = zzhlg2;
        this.zzb = zzhlg3;
        this.zzc = zzhlg4;
        this.zzd = zzhlg5;
        this.zze = zzhlg6;
        this.zzf = zzhlg7;
    }

    public final zzejf zza() {
        Object object;
        Object object2 = object = this.zza.zzb();
        object2 = (zzctg)object;
        zzeim zzeim2 = ((zzein)this.zzb).zza();
        Object object3 = object = this.zzc.zzb();
        object3 = (zzczn)object;
        Object object4 = object = this.zzd.zzb();
        object4 = (ScheduledExecutorService)object;
        zzgge zzgge2 = zzcci.zza;
        zzhkx.zzb(zzgge2);
        Object object5 = object = this.zzf.zzb();
        object5 = (zzdux)object;
        object = new zzejf((zzctg)object2, zzeim2, (zzczn)object3, (ScheduledExecutorService)object4, zzgge2, (zzdux)object5);
        return object;
    }
}

