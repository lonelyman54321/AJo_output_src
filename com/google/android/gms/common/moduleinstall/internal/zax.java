/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.moduleinstall.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.IStatusCallback$Stub;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.common.moduleinstall.internal.zay;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zax
extends IStatusCallback$Stub {
    final /* synthetic */ TaskCompletionSource zaa;

    public zax(zay zay2, TaskCompletionSource taskCompletionSource) {
        this.zaa = taskCompletionSource;
    }

    public final void onResult(Status status) {
        TaskCompletionSource taskCompletionSource = this.zaa;
        TaskUtil.trySetResultOrApiException(status, null, taskCompletionSource);
    }
}

