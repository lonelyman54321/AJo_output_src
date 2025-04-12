/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.auth-api-phone;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.internal.auth-api-phone.zzab;
import com.google.android.gms.internal.auth-api-phone.zzi;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzaa
extends zzi {
    final /* synthetic */ TaskCompletionSource zza;

    public zzaa(zzab zzab2, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    public final void zzb(Status status) {
        TaskCompletionSource taskCompletionSource = this.zza;
        TaskUtil.setResultOrApiException(status, taskCompletionSource);
    }
}

