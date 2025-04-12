/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.auth-api;

import com.google.android.gms.auth.api.identity.SavePasswordResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.internal.auth-api.zbak;
import com.google.android.gms.internal.auth-api.zbaw;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zbav
extends zbak {
    final /* synthetic */ TaskCompletionSource zba;

    public zbav(zbaw zbaw2, TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
    }

    public final void zbb(Status status, SavePasswordResult savePasswordResult) {
        TaskCompletionSource taskCompletionSource = this.zba;
        TaskUtil.setResultOrApiException(status, savePasswordResult, taskCompletionSource);
    }
}

