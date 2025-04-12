/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.TaskCompletionSource;

public abstract class zzfww
implements Runnable {
    private final TaskCompletionSource zza;

    public zzfww() {
        this.zza = null;
    }

    public zzfww(TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    public final void run() {
        try {
            this.zza();
            return;
        }
        catch (Exception exception) {
            this.zzc(exception);
            return;
        }
    }

    public abstract void zza();

    public final TaskCompletionSource zzb() {
        return this.zza;
    }

    public final void zzc(Exception exception) {
        TaskCompletionSource taskCompletionSource = this.zza;
        if (taskCompletionSource != null) {
            taskCompletionSource.trySetException(exception);
        }
    }
}

