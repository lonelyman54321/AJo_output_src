/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.internal.auth.zzbd;
import com.google.android.gms.internal.auth.zzbo;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzbn
extends zzbd {
    final /* synthetic */ TaskCompletionSource zza;

    public zzbn(zzbo zzbo2, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    public final void zzc(String string2) {
        Status status;
        if (string2 != null) {
            status = Status.RESULT_SUCCESS;
        } else {
            int n3 = 3006;
            status = new Status(n3);
        }
        TaskCompletionSource taskCompletionSource = this.zza;
        TaskUtil.setResultOrApiException(status, string2, taskCompletionSource);
    }
}

