/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.zzcjj;
import com.google.android.gms.internal.ads.zzecu;
import com.google.android.gms.internal.ads.zzhkp;
import com.google.android.gms.internal.ads.zzhlg;
import java.util.concurrent.ScheduledExecutorService;

public final class zzecv
implements zzhkp {
    private final zzhlg zza;
    private final zzhlg zzb;

    public zzecv(zzhlg zzhlg2, zzhlg zzhlg3) {
        this.zza = zzhlg2;
        this.zzb = zzhlg3;
    }

    public final zzecu zza() {
        Context context = ((zzcjj)this.zza).zza();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService)this.zzb.zzb();
        zzecu zzecu2 = new zzecu(context, scheduledExecutorService);
        return zzecu2;
    }
}

