/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.auth-api;

import com.google.android.gms.auth.api.identity.AuthorizationResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ApiExceptionUtil;
import com.google.android.gms.internal.auth-api.zbaq;
import com.google.android.gms.internal.auth-api.zby;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zbap
extends zby {
    final /* synthetic */ TaskCompletionSource zba;

    public zbap(zbaq zbaq2, TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
    }

    public final void zbb(Status object, AuthorizationResult object2) {
        boolean bl2 = ((Status)object).isSuccess();
        if (bl2) {
            this.zba.setResult(object2);
            return;
        }
        object2 = this.zba;
        object = ApiExceptionUtil.fromStatus((Status)object);
        ((TaskCompletionSource)object2).setException((Exception)object);
    }
}

