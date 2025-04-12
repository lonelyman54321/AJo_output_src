/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.IStatusCallback$Stub;
import com.google.android.gms.internal.auth.zzab;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzx
extends IStatusCallback$Stub {
    final /* synthetic */ TaskCompletionSource zza;

    public zzx(zzab zzab2, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    public final void onResult(Status status) {
        TaskCompletionSource taskCompletionSource = this.zza;
        zzab.zzf(status, null, taskCompletionSource);
    }
}

