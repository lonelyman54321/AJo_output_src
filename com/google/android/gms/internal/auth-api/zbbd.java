/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.auth-api;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.IStatusCallback$Stub;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.internal.auth-api.zbbg;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zbbd
extends IStatusCallback$Stub {
    final /* synthetic */ TaskCompletionSource zba;

    public zbbd(zbbg zbbg2, TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
    }

    public final void onResult(Status status) {
        TaskCompletionSource taskCompletionSource = this.zba;
        TaskUtil.setResultOrApiException(status, taskCompletionSource);
    }
}

