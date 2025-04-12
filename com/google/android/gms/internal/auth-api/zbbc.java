/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.auth-api;

import com.google.android.gms.auth.api.identity.BeginSignInResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.internal.auth-api.zbab;
import com.google.android.gms.internal.auth-api.zbbg;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zbbc
extends zbab {
    final /* synthetic */ TaskCompletionSource zba;

    public zbbc(zbbg zbbg2, TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
    }

    public final void zbb(Status status, BeginSignInResult beginSignInResult) {
        TaskCompletionSource taskCompletionSource = this.zba;
        TaskUtil.setResultOrApiException(status, beginSignInResult, taskCompletionSource);
    }
}

