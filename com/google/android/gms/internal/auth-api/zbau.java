/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.auth-api;

import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ApiExceptionUtil;
import com.google.android.gms.internal.auth-api.zbai;
import com.google.android.gms.internal.auth-api.zbaw;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zbau
extends zbai {
    final /* synthetic */ TaskCompletionSource zba;

    public zbau(zbaw zbaw2, TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
    }

    public final void zbb(Status object, SaveAccountLinkingTokenResult object2) {
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

