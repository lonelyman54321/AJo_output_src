/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.tasks;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.zzc;
import com.google.android.gms.tasks.zzq;
import com.google.android.gms.tasks.zzw;
import java.util.concurrent.Executor;

final class zzd
implements zzq {
    private final Executor zza;
    private final Continuation zzb;
    private final zzw zzc;

    public zzd(Executor executor, Continuation continuation, zzw zzw2) {
        this.zza = executor;
        this.zzb = continuation;
        this.zzc = zzw2;
    }

    public static /* bridge */ /* synthetic */ Continuation zza(zzd zzd2) {
        return zzd2.zzb;
    }

    public static /* bridge */ /* synthetic */ zzw zzb(zzd zzd2) {
        return zzd2.zzc;
    }

    public final void zzc() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }

    public final void zzd(Task task2) {
        zzc zzc2 = new zzc(this, task2);
        this.zza.execute(zzc2);
    }
}

