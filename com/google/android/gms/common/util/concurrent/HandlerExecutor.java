/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 */
package com.google.android.gms.common.util.concurrent;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.common.zzh;
import java.util.concurrent.Executor;

public class HandlerExecutor
implements Executor {
    private final Handler zza;

    public HandlerExecutor(Looper looper) {
        zzh zzh2 = new zzh(looper);
        this.zza = zzh2;
    }

    public final void execute(Runnable runnable2) {
        this.zza.post(runnable2);
    }
}

