/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.auth-api-phone;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.internal.auth-api-phone.zzf;
import com.google.android.gms.internal.auth-api-phone.zzr;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzq
extends zzf {
    final /* synthetic */ TaskCompletionSource zza;

    public zzq(zzr zzr2, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    public final void zzb(Status status, boolean bl2) {
        Boolean bl3 = bl2;
        TaskCompletionSource taskCompletionSource = this.zza;
        TaskUtil.setResultOrApiException(status, bl3, taskCompletionSource);
    }
}

