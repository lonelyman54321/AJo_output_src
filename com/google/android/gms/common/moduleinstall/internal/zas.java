/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.moduleinstall.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.common.moduleinstall.internal.zaa;
import com.google.android.gms.common.moduleinstall.internal.zay;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zas
extends zaa {
    final /* synthetic */ TaskCompletionSource zaa;

    public zas(zay zay2, TaskCompletionSource taskCompletionSource) {
        this.zaa = taskCompletionSource;
    }

    public final void zab(Status status) {
        TaskCompletionSource taskCompletionSource = this.zaa;
        TaskUtil.trySetResultOrApiException(status, null, taskCompletionSource);
    }
}

