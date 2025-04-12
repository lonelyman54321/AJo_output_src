/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.IStatusCallback$Stub;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.internal.location.zzaj;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzah
extends IStatusCallback$Stub {
    final /* synthetic */ TaskCompletionSource zza;

    public zzah(zzaj zzaj2, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    public final void onResult(Status status) {
        TaskCompletionSource taskCompletionSource = this.zza;
        TaskUtil.setResultOrApiException(status, taskCompletionSource);
    }
}

