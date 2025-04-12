/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzai
implements BaseImplementation$ResultHolder {
    private final TaskCompletionSource zza;

    public zzai(TaskCompletionSource taskCompletionSource) {
        Preconditions.checkNotNull(taskCompletionSource);
        this.zza = taskCompletionSource;
    }

    public final void setFailedResult(Status status) {
        if (status == null) {
            return;
        }
        TaskCompletionSource taskCompletionSource = this.zza;
        ApiException apiException = new ApiException(status);
        taskCompletionSource.setException(apiException);
    }

    public final /* synthetic */ void setResult(Object object) {
        TaskCompletionSource taskCompletionSource = this.zza;
        TaskUtil.setResultOrApiException((Status)object, null, taskCompletionSource);
    }
}

