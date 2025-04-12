/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.tasks;

import com.google.android.gms.tasks.OnTokenCanceledListener;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzs
implements OnTokenCanceledListener {
    final /* synthetic */ TaskCompletionSource zza;

    public zzs(TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    public final void onCanceled() {
        TaskCompletionSource.zza(this.zza).zzc();
    }
}

