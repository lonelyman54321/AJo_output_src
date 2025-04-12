/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.job.JobParameters
 */
package com.google.android.gms.measurement.internal;

import android.app.job.JobParameters;
import com.google.android.gms.measurement.internal.zzgo;
import com.google.android.gms.measurement.internal.zznr;

public final class zzns
implements Runnable {
    private /* synthetic */ zznr zza;
    private /* synthetic */ zzgo zzb;
    private /* synthetic */ JobParameters zzc;

    public /* synthetic */ zzns(zznr zznr2, zzgo zzgo2, JobParameters jobParameters) {
        this.zza = zznr2;
        this.zzb = zzgo2;
        this.zzc = jobParameters;
    }

    public final void run() {
        zznr zznr2 = this.zza;
        zzgo zzgo2 = this.zzb;
        JobParameters jobParameters = this.zzc;
        zznr.zza(zznr2, zzgo2, jobParameters);
    }
}

