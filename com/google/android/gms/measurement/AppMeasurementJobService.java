/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.job.JobParameters
 *  android.app.job.JobService
 *  android.content.Context
 *  android.content.Intent
 */
package com.google.android.gms.measurement;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.measurement.internal.zznr;
import com.google.android.gms.measurement.internal.zznu;

public final class AppMeasurementJobService
extends JobService
implements zznu {
    private zznr zza;

    private final zznr zza() {
        zznr zznr2 = this.zza;
        if (zznr2 == null) {
            this.zza = zznr2 = new zznr((Context)this);
        }
        return this.zza;
    }

    public final void onCreate() {
        super.onCreate();
        this.zza().zza();
    }

    public final void onDestroy() {
        this.zza().zzb();
        super.onDestroy();
    }

    public final void onRebind(Intent intent) {
        this.zza().zzb(intent);
    }

    public final boolean onStartJob(JobParameters jobParameters) {
        return this.zza().zza(jobParameters);
    }

    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    public final boolean onUnbind(Intent intent) {
        return this.zza().zzc(intent);
    }

    public final void zza(JobParameters jobParameters, boolean bl2) {
        this.jobFinished(jobParameters, false);
    }

    public final void zza(Intent intent) {
    }

    public final boolean zza(int n3) {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }
}

