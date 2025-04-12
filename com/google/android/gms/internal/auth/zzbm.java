/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.auth;

import com.google.android.gms.auth.api.proxy.ProxyResponse;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.internal.auth.zzbd;
import com.google.android.gms.internal.auth.zzbo;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzbm
extends zzbd {
    final /* synthetic */ TaskCompletionSource zza;

    public zzbm(zzbo zzbo2, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    public final void zzb(ProxyResponse proxyResponse) {
        int n3 = proxyResponse.googlePlayServicesStatusCode;
        Status status = new Status(n3);
        TaskCompletionSource taskCompletionSource = this.zza;
        TaskUtil.setResultOrApiException(status, proxyResponse, taskCompletionSource);
    }
}

