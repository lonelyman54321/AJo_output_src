/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Log
 */
package com.google.android.gms.analytics;

import android.util.Log;
import com.google.android.gms.analytics.zzn;
import com.google.android.gms.analytics.zzr;
import java.util.concurrent.FutureTask;

final class zzm
extends FutureTask {
    final /* synthetic */ zzn zza;

    public zzm(zzn zzn2, Runnable runnable2, Object object) {
        this.zza = zzn2;
        super(runnable2, object);
    }

    public final void setException(Throwable throwable) {
        Object object = zzr.zze(this.zza.zza);
        if (object != null) {
            Thread thread2 = Thread.currentThread();
            object.uncaughtException(thread2, throwable);
        } else {
            object = "GAv4";
            int n3 = 6;
            boolean bl2 = Log.isLoggable((String)object, (int)n3);
            if (bl2) {
                object = String.valueOf(throwable);
                String string2 = "MeasurementExecutor: job failed with ";
                string2.concat((String)object);
            }
        }
        super.setException(throwable);
    }
}

