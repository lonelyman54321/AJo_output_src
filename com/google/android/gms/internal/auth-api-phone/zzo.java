/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.auth-api-phone;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.IStatusCallback$Stub;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.common.internal.ApiExceptionUtil;
import com.google.android.gms.internal.auth-api-phone.zzr;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzo
extends IStatusCallback$Stub {
    final /* synthetic */ TaskCompletionSource zza;

    public zzo(zzr zzr2, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    public final void onResult(Status object) {
        int n3;
        int n4 = ((Status)object).getStatusCode();
        if (n4 == (n3 = 6)) {
            TaskCompletionSource taskCompletionSource = this.zza;
            object = ApiExceptionUtil.fromStatus((Status)object);
            taskCompletionSource.trySetException((Exception)object);
            return;
        }
        TaskCompletionSource taskCompletionSource = this.zza;
        TaskUtil.setResultOrApiException((Status)object, taskCompletionSource);
    }
}

