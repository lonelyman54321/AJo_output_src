/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.review.internal;

import com.google.android.gms.tasks.TaskCompletionSource;

public abstract class zzj
implements Runnable {
    private final TaskCompletionSource zza;

    public zzj() {
        this.zza = null;
    }

    public zzj(TaskCompletionSource taskCompletionSource) {
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

