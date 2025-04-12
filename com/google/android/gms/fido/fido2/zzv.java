/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.fido.fido2;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fido.fido2.Fido2PrivilegedApiClient;
import com.google.android.gms.internal.fido.zzf;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.List;

final class zzv
extends zzf {
    final /* synthetic */ TaskCompletionSource zza;

    public zzv(Fido2PrivilegedApiClient fido2PrivilegedApiClient, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    public final void zzb(List list) {
        this.zza.setResult(list);
    }

    public final void zzc(Status status) {
        TaskCompletionSource taskCompletionSource = this.zza;
        ApiException apiException = new ApiException(status);
        taskCompletionSource.trySetException(apiException);
    }
}

