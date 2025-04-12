/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.zzcjj;
import com.google.android.gms.internal.ads.zzecx;
import com.google.android.gms.internal.ads.zzhkp;
import com.google.android.gms.internal.ads.zzhlg;
import java.util.concurrent.ScheduledExecutorService;

public final class zzecy
implements zzhkp {
    private final zzhlg zza;
    private final zzhlg zzb;

    public zzecy(zzhlg zzhlg2, zzhlg zzhlg3) {
        this.zza = zzhlg2;
        this.zzb = zzhlg3;
    }

    public final zzecx zza() {
        Context context = ((zzcjj)this.zza).zza();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService)this.zzb.zzb();
        zzecx zzecx2 = new zzecx(context, scheduledExecutorService);
        return zzecx2;
    }
}

