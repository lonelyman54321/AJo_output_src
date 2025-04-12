/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.AsyncTask
 */
package com.google.android.gms.ads.internal;

import android.os.AsyncTask;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzaxd;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

final class zzr
extends AsyncTask {
    final /* synthetic */ zzt zza;

    public /* synthetic */ zzr(zzt zzt2, zzq zzq2) {
        this.zza = zzt2;
    }

    /*
     * WARNING - void declaration
     */
    public final String zza(Void ... object) {
        block9: {
            void var2_6;
            block11: {
                object = "";
                zzt zzt2 = this.zza;
                Object object2 = zzt.zzu(zzt2);
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                long l2 = 1000L;
                object2 = object2.get(l2, timeUnit);
                object2 = (zzaxd)object2;
                try {
                    zzt.zzv(zzt2, (zzaxd)object2);
                    break block9;
                }
                catch (TimeoutException timeoutException) {
                }
                catch (ExecutionException executionException) {
                    break block11;
                }
                catch (InterruptedException interruptedException) {
                    break block11;
                }
                zzm.zzk((String)object, timeoutException);
                break block9;
            }
            zzm.zzk((String)object, (Throwable)var2_6);
        }
        return this.zza.zzp();
    }
}

