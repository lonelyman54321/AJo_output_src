/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.ads.zzdca;
import com.google.android.gms.internal.ads.zzhkp;
import com.google.android.gms.internal.ads.zzhlg;
import java.util.concurrent.ScheduledExecutorService;

public final class zzcse
implements zzhkp {
    private final zzhlg zza;
    private final zzhlg zzb;

    public zzcse(zzhlg zzhlg2, zzhlg zzhlg3) {
        this.zza = zzhlg2;
        this.zzb = zzhlg3;
    }

    public final zzdca zza() {
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService)this.zza.zzb();
        Clock clock = (Clock)this.zzb.zzb();
        zzdca zzdca2 = new zzdca(scheduledExecutorService, clock);
        return zzdca2;
    }
}

