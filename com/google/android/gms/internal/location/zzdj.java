/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.IStatusCallback$Stub;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzdj
extends IStatusCallback$Stub {
    final /* synthetic */ Object zza;
    final /* synthetic */ TaskCompletionSource zzb;

    public zzdj(Object object, TaskCompletionSource taskCompletionSource) {
        this.zza = object;
        this.zzb = taskCompletionSource;
    }

    public final void onResult(Status status) {
        Object object = this.zza;
        TaskCompletionSource taskCompletionSource = this.zzb;
        TaskUtil.setResultOrApiException(status, object, taskCompletionSource);
    }
}

