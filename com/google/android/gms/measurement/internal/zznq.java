/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.job.JobParameters
 */
package com.google.android.gms.measurement.internal;

import android.app.job.JobParameters;
import com.google.android.gms.measurement.internal.zznr;

public final class zznq
implements Runnable {
    private /* synthetic */ zznr zza;
    private /* synthetic */ JobParameters zzb;

    public /* synthetic */ zznq(zznr zznr2, JobParameters jobParameters) {
        this.zza = zznr2;
        this.zzb = jobParameters;
    }

    public final void run() {
        zznr zznr2 = this.zza;
        JobParameters jobParameters = this.zzb;
        zznr.zza(zznr2, jobParameters);
    }
}

