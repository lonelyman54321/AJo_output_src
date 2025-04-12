/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 */
package com.google.android.gms.tasks;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.tasks.zza;
import java.util.concurrent.Executor;

final class zzu
implements Executor {
    private final Handler zza;

    public zzu() {
        Looper looper = Looper.getMainLooper();
        zza zza2 = new zza(looper);
        this.zza = zza2;
    }

    public final void execute(Runnable runnable2) {
        this.zza.post(runnable2);
    }
}

