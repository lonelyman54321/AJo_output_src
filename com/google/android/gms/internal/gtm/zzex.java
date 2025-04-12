/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.job.JobParameters
 */
package com.google.android.gms.internal.gtm;

import android.app.job.JobParameters;
import com.google.android.gms.internal.gtm.zzeo;
import com.google.android.gms.internal.gtm.zzfa;

public final class zzex
implements Runnable {
    public final /* synthetic */ zzfa zza;
    public final /* synthetic */ zzeo zzb;
    public final /* synthetic */ JobParameters zzc;

    public /* synthetic */ zzex(zzfa zzfa2, zzeo zzeo2, JobParameters jobParameters) {
        this.zza = zzfa2;
        this.zzb = zzeo2;
        this.zzc = jobParameters;
    }

    public final void run() {
        zzfa zzfa2 = this.zza;
        zzeo zzeo2 = this.zzb;
        JobParameters jobParameters = this.zzc;
        zzfa2.zzd(zzeo2, jobParameters);
    }
}

