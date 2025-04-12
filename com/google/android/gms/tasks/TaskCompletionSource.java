/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.tasks;

import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.OnTokenCanceledListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.zzs;
import com.google.android.gms.tasks.zzw;

public class TaskCompletionSource {
    private final zzw zza;

    public TaskCompletionSource() {
        zzw zzw2;
        this.zza = zzw2 = new zzw();
    }

    public TaskCompletionSource(CancellationToken cancellationToken) {
        Object object = new zzw();
        this.zza = object;
        object = new zzs(this);
        cancellationToken.onCanceledRequested((OnTokenCanceledListener)object);
    }

    public static /* bridge */ /* synthetic */ zzw zza(TaskCompletionSource taskCompletionSource) {
        return taskCompletionSource.zza;
    }

    public Task getTask() {
        return this.zza;
    }

    public void setException(Exception exception) {
        this.zza.zza(exception);
    }

    public void setResult(Object object) {
        this.zza.zzb(object);
    }

    public boolean trySetException(Exception exception) {
        return this.zza.zzd(exception);
    }

    public boolean trySetResult(Object object) {
        return this.zza.zze(object);
    }
}

