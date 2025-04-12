/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Service
 *  android.app.job.JobParameters
 *  android.content.Context
 *  android.content.Intent
 *  android.os.IBinder
 */
package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import androidx.legacy.content.WakefulBroadcastReceiver;
import com.google.android.gms.measurement.internal.zznr;
import com.google.android.gms.measurement.internal.zznu;

public final class AppMeasurementService
extends Service
implements zznu {
    private zznr zza;

    private final zznr zza() {
        zznr zznr2 = this.zza;
        if (zznr2 == null) {
            this.zza = zznr2 = new zznr((Context)this);
        }
        return this.zza;
    }

    public final IBinder onBind(Intent intent) {
        return this.zza().zza(intent);
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

    public final int onStartCommand(Intent intent, int n3, int n4) {
        return this.zza().zza(intent, n3, n4);
    }

    public final boolean onUnbind(Intent intent) {
        return this.zza().zzc(intent);
    }

    public final void zza(JobParameters object, boolean bl2) {
        object = new UnsupportedOperationException();
        throw object;
    }

    public final void zza(Intent intent) {
        WakefulBroadcastReceiver.completeWakefulIntent(intent);
    }

    public final boolean zza(int n3) {
        return this.stopSelfResult(n3);
    }
}

