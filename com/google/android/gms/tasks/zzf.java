/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.tasks;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.zze;
import com.google.android.gms.tasks.zzq;
import com.google.android.gms.tasks.zzw;
import java.util.concurrent.Executor;

final class zzf
implements OnSuccessListener,
OnFailureListener,
OnCanceledListener,
zzq {
    private final Executor zza;
    private final Continuation zzb;
    private final zzw zzc;

    public zzf(Executor executor, Continuation continuation, zzw zzw2) {
        this.zza = executor;
        this.zzb = continuation;
        this.zzc = zzw2;
    }

    public static /* bridge */ /* synthetic */ Continuation zza(zzf zzf2) {
        return zzf2.zzb;
    }

    public static /* bridge */ /* synthetic */ zzw zzb(zzf zzf2) {
        return zzf2.zzc;
    }

    public final void onCanceled() {
        this.zzc.zzc();
    }

    public final void onFailure(Exception exception) {
        this.zzc.zza(exception);
    }

    public final void onSuccess(Object object) {
        this.zzc.zzb(object);
    }

    public final void zzc() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }

    public final void zzd(Task task2) {
        zze zze2 = new zze(this, task2);
        this.zza.execute(zze2);
    }
}

