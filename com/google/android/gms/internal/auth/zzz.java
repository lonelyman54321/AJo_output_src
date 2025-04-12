/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.auth;

import com.google.android.gms.auth.AccountChangeEventsResponse;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.auth.zzab;
import com.google.android.gms.internal.auth.zzl;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzz
extends zzl {
    final /* synthetic */ TaskCompletionSource zza;

    public zzz(zzab zzab2, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    public final void zzb(Status status, AccountChangeEventsResponse accountChangeEventsResponse) {
        TaskCompletionSource taskCompletionSource = this.zza;
        zzab.zzf(status, accountChangeEventsResponse, taskCompletionSource);
    }
}

