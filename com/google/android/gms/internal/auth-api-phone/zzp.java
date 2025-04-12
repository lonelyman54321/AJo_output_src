/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.auth-api-phone;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.internal.auth-api-phone.zzd;
import com.google.android.gms.internal.auth-api-phone.zzr;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzp
extends zzd {
    final /* synthetic */ TaskCompletionSource zza;

    public zzp(zzr zzr2, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    public final void zzb(Status status, int n3) {
        Integer n4 = n3;
        TaskCompletionSource taskCompletionSource = this.zza;
        TaskUtil.setResultOrApiException(status, n4, taskCompletionSource);
    }
}

