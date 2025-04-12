/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.gtm;

import android.content.Context;
import com.google.android.gms.internal.gtm.zzfx;
import com.google.android.gms.internal.gtm.zzpa;
import com.google.android.gms.internal.gtm.zzpj;
import com.google.android.gms.internal.gtm.zzpu;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final class zzpv {
    private final ScheduledExecutorService zza;
    private ScheduledFuture zzb;

    public zzpv() {
        ScheduledExecutorService scheduledExecutorService = zzfx.zza().zzb(1, 2);
        this.zzb = null;
        this.zza = scheduledExecutorService;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zza(Context object, zzpj object2, long l2, zzpa zzpa2) {
        synchronized (this) {
            Throwable throwable2;
            block4: {
                Object object3;
                block3: {
                    try {
                        object3 = this.zzb;
                        if (object3 == null) break block3;
                        object3.cancel(false);
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                object3 = new zzpu((Context)object, (zzpj)object2, zzpa2);
                object = this.zza;
                object2 = TimeUnit.MILLISECONDS;
                long l3 = 0L;
                this.zzb = object = object.schedule((Runnable)object3, l3, (TimeUnit)((Object)object2));
                return;
            }
            throw throwable2;
        }
    }
}

