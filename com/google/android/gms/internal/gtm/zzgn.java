/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.gtm;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.internal.gtm.zzgm;
import com.google.android.gms.internal.gtm.zzgo;
import com.google.android.gms.internal.gtm.zzhw;
import com.google.android.gms.internal.gtm.zzjd;
import com.google.android.gms.internal.gtm.zzjf;
import com.google.android.gms.internal.gtm.zzpe;
import com.google.android.gms.tagmanager.zzcb;
import com.google.android.gms.tagmanager.zzck;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

public final class zzgn {
    private final Context zza;
    private final zzpe zzb;
    private final ExecutorService zzc;
    private final ScheduledExecutorService zzd;
    private final zzck zze;
    private final zzcb zzf;

    public zzgn(Context object, zzck zzck2, zzcb zzcb2) {
        zzpe zzpe2 = new zzpe((Context)object);
        ExecutorService executorService = zzjd.zza(object);
        ScheduledExecutorService scheduledExecutorService = zzjf.zza();
        this.zza = object = ((Context)Preconditions.checkNotNull(object)).getApplicationContext();
        object = (zzck)Preconditions.checkNotNull(zzck2);
        this.zze = object;
        object = (zzcb)Preconditions.checkNotNull(zzcb2);
        this.zzf = object;
        object = (zzpe)Preconditions.checkNotNull(zzpe2);
        this.zzb = object;
        object = (ExecutorService)Preconditions.checkNotNull(executorService);
        this.zzc = object;
        object = (ScheduledExecutorService)Preconditions.checkNotNull(scheduledExecutorService);
        this.zzd = object;
    }

    public final zzgm zza(String string2, String string3, String string4) {
        zzgm zzgm2;
        Object object = this.zza;
        zzck zzck2 = this.zze;
        Object object2 = this.zzf;
        zzhw zzhw2 = new zzhw((Context)object, zzck2, (zzcb)object2, string2);
        object = this.zza;
        zzgo zzgo2 = new zzgo((Context)object, string2);
        zzpe zzpe2 = this.zzb;
        ExecutorService executorService = this.zzc;
        ScheduledExecutorService scheduledExecutorService = this.zzd;
        zzck zzck3 = this.zze;
        Clock clock = DefaultClock.getInstance();
        zzck2 = this.zza;
        object = zzgm2;
        object2 = string3;
        zzgm2 = new zzgm((Context)zzck2, string2, string3, string4, zzhw2, zzpe2, executorService, scheduledExecutorService, zzck3, clock, zzgo2);
        return zzgm2;
    }
}

