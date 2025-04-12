/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.tasks;

import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.OnTokenCanceledListener;
import com.google.android.gms.tasks.TaskExecutors;
import com.google.android.gms.tasks.zza;
import com.google.android.gms.tasks.zzw;
import java.util.concurrent.Executor;

final class zzb
extends CancellationToken {
    private final zzw zza;

    public zzb() {
        zzw zzw2;
        this.zza = zzw2 = new zzw();
    }

    public final boolean isCancellationRequested() {
        return this.zza.isComplete();
    }

    public final CancellationToken onCanceledRequested(OnTokenCanceledListener object) {
        zza zza2 = new zza(this, (OnTokenCanceledListener)object);
        object = this.zza;
        Executor executor = TaskExecutors.MAIN_THREAD;
        ((zzw)object).addOnSuccessListener(executor, (OnSuccessListener)zza2);
        return this;
    }

    public final void zza() {
        this.zza.zze(null);
    }
}

