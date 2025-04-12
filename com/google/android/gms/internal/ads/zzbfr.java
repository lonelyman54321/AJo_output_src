/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nonagon.signalgeneration.zze;
import com.google.android.gms.internal.ads.zzbfq;
import com.google.android.gms.internal.ads.zzhkp;
import com.google.android.gms.internal.ads.zzhlg;
import java.util.concurrent.ScheduledExecutorService;

public final class zzbfr
implements zzhkp {
    private final zzhlg zza;
    private final zzhlg zzb;

    public zzbfr(zzhlg zzhlg2, zzhlg zzhlg3) {
        this.zza = zzhlg2;
        this.zzb = zzhlg3;
    }

    public final zzbfq zza() {
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService)this.zza.zzb();
        zze zze2 = (zze)this.zzb.zzb();
        zzbfq zzbfq2 = new zzbfq(scheduledExecutorService, zze2);
        return zzbfq2;
    }
}

