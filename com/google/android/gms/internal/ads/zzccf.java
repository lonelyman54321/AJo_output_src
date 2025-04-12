/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 */
package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.ads.internal.util.zzf;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzu;
import java.util.concurrent.Executor;

final class zzccf
implements Executor {
    private final Handler zza;

    public zzccf() {
        Looper looper = Looper.getMainLooper();
        zzf zzf2 = new zzf(looper);
        this.zza = zzf2;
    }

    public final void execute(Runnable runnable2) {
        Thread thread2;
        Thread thread3 = Looper.getMainLooper().getThread();
        if (thread3 == (thread2 = Thread.currentThread())) {
            try {
                runnable2.run();
                return;
            }
            catch (Throwable throwable) {
                zzu.zzp();
                zzt.zzM(zzu.zzo().zzd(), throwable);
                throw throwable;
            }
        }
        this.zza.post(runnable2);
    }
}

