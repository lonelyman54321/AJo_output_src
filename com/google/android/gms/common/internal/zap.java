/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.PendingResult$StatusListener;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ApiExceptionUtil;
import com.google.android.gms.common.internal.PendingResultUtil$ResultConverter;
import com.google.android.gms.common.internal.zas;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.TimeUnit;

final class zap
implements PendingResult$StatusListener {
    final /* synthetic */ PendingResult zaa;
    final /* synthetic */ TaskCompletionSource zab;
    final /* synthetic */ PendingResultUtil$ResultConverter zac;
    final /* synthetic */ zas zad;

    public zap(PendingResult pendingResult, TaskCompletionSource taskCompletionSource, PendingResultUtil$ResultConverter pendingResultUtil$ResultConverter, zas zas2) {
        this.zaa = pendingResult;
        this.zab = taskCompletionSource;
        this.zac = pendingResultUtil$ResultConverter;
        this.zad = zas2;
    }

    public final void onComplete(Status object) {
        boolean bl2 = ((Status)object).isSuccess();
        if (bl2) {
            object = this.zaa;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            object = ((PendingResult)object).await(0L, timeUnit);
            TaskCompletionSource taskCompletionSource = this.zab;
            object = this.zac.convert((Result)object);
            taskCompletionSource.setResult(object);
            return;
        }
        TaskCompletionSource taskCompletionSource = this.zab;
        object = ApiExceptionUtil.fromStatus((Status)object);
        taskCompletionSource.setException((Exception)object);
    }
}

