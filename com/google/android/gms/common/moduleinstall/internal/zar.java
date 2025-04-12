/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.moduleinstall.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.google.android.gms.common.moduleinstall.internal.zaa;
import com.google.android.gms.common.moduleinstall.internal.zay;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zar
extends zaa {
    final /* synthetic */ TaskCompletionSource zaa;

    public zar(zay zay2, TaskCompletionSource taskCompletionSource) {
        this.zaa = taskCompletionSource;
    }

    public final void zae(Status status, ModuleAvailabilityResponse moduleAvailabilityResponse) {
        TaskCompletionSource taskCompletionSource = this.zaa;
        TaskUtil.trySetResultOrApiException(status, moduleAvailabilityResponse, taskCompletionSource);
    }
}

