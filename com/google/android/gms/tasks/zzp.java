/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.tasks;

import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.zzo;
import com.google.android.gms.tasks.zzq;
import com.google.android.gms.tasks.zzw;
import java.util.concurrent.Executor;

final class zzp
implements OnSuccessListener,
OnFailureListener,
OnCanceledListener,
zzq {
    private final Executor zza;
    private final SuccessContinuation zzb;
    private final zzw zzc;

    public zzp(Executor executor, SuccessContinuation successContinuation, zzw zzw2) {
        this.zza = executor;
        this.zzb = successContinuation;
        this.zzc = zzw2;
    }

    public static /* bridge */ /* synthetic */ SuccessContinuation zza(zzp zzp2) {
        return zzp2.zzb;
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
        zzo zzo2 = new zzo(this, task2);
        this.zza.execute(zzo2);
    }
}

