/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.splitinstall.internal;

import com.google.android.gms.tasks.TaskCompletionSource;

public abstract class zzv
implements Runnable {
    private final TaskCompletionSource zza;

    public zzv() {
        this.zza = null;
    }

    public zzv(TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    public final void run() {
        try {
            this.zzc();
            return;
        }
        catch (Exception exception) {
            this.zzb(exception);
            return;
        }
    }

    public final TaskCompletionSource zza() {
        return this.zza;
    }

    public final void zzb(Exception exception) {
        TaskCompletionSource taskCompletionSource = this.zza;
        if (taskCompletionSource != null) {
            taskCompletionSource.trySetException(exception);
        }
    }

    public abstract void zzc();
}

