/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.zzcbp;
import com.google.android.gms.internal.ads.zzeys;
import com.google.android.gms.internal.ads.zzhkp;
import com.google.android.gms.internal.ads.zzhlg;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

public final class zzeyu
implements zzhkp {
    private final zzhlg zza;
    private final zzhlg zzb;
    private final zzhlg zzc;
    private final zzhlg zzd;
    private final zzhlg zze;
    private final zzhlg zzf;
    private final zzhlg zzg;

    public zzeyu(zzhlg zzhlg2, zzhlg zzhlg3, zzhlg zzhlg4, zzhlg zzhlg5, zzhlg zzhlg6, zzhlg zzhlg7, zzhlg zzhlg8) {
        this.zza = zzhlg2;
        this.zzb = zzhlg3;
        this.zzc = zzhlg4;
        this.zzd = zzhlg5;
        this.zze = zzhlg6;
        this.zzf = zzhlg7;
        this.zzg = zzhlg8;
    }

    public static zzeys zza(zzcbp zzcbp2, Context context, ScheduledExecutorService scheduledExecutorService, Executor executor, int n3, boolean bl2, boolean bl3) {
        zzeys zzeys2 = new zzeys(zzcbp2, context, scheduledExecutorService, executor, n3, bl2, bl3);
        return zzeys2;
    }
}

