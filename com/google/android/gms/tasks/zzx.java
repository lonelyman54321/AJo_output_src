/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.tasks;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.TimeoutException;

public final class zzx
implements Runnable {
    public final /* synthetic */ TaskCompletionSource zza;

    public /* synthetic */ zzx(TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    public final void run() {
        TimeoutException timeoutException = new TimeoutException();
        this.zza.trySetException(timeoutException);
    }
}

