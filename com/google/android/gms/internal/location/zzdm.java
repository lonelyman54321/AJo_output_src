/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.internal.location.zzn;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzdm
extends zzn {
    final /* synthetic */ TaskCompletionSource zza;

    public zzdm(TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    public final void zzb(Status status, boolean bl2) {
        Boolean bl3 = bl2;
        TaskCompletionSource taskCompletionSource = this.zza;
        TaskUtil.setResultOrApiException(status, bl3, taskCompletionSource);
    }
}

