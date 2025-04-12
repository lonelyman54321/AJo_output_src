/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 */
package com.google.android.gms.internal.ads;

import android.os.Handler;
import com.google.android.gms.internal.ads.zzfqo;

final class zzfql
implements Runnable {
    public final void run() {
        Handler handler = zzfqo.zzb();
        if (handler != null) {
            handler = zzfqo.zzb();
            Runnable runnable2 = zzfqo.zzf();
            handler.post(runnable2);
            handler = zzfqo.zzb();
            runnable2 = zzfqo.zze();
            long l2 = 200L;
            handler.postDelayed(runnable2, l2);
        }
    }
}

