/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.tasks;

import com.google.android.gms.internal.tasks.zza;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.zzb;

public final class zzy
implements OnCompleteListener {
    public final /* synthetic */ zza zza;
    public final /* synthetic */ TaskCompletionSource zzb;
    public final /* synthetic */ zzb zzc;

    public /* synthetic */ zzy(zza zza2, TaskCompletionSource taskCompletionSource, zzb zzb2) {
        this.zza = zza2;
        this.zzb = taskCompletionSource;
        this.zzc = zzb2;
    }

    public final void onComplete(Task object) {
        this.zza.removeCallbacksAndMessages(null);
        TaskCompletionSource taskCompletionSource = this.zzb;
        boolean bl2 = ((Task)object).isSuccessful();
        if (bl2) {
            object = ((Task)object).getResult();
            taskCompletionSource.trySetResult(object);
            return;
        }
        bl2 = ((Task)object).isCanceled();
        if (bl2) {
            this.zzc.zza();
            return;
        }
        object = ((Task)object).getException();
        object.getClass();
        taskCompletionSource.trySetException((Exception)object);
    }
}

