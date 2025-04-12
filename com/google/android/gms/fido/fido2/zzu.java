/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.fido.fido2;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fido.fido2.Fido2PrivilegedApiClient;
import com.google.android.gms.internal.fido.zzd;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzu
extends zzd {
    final /* synthetic */ TaskCompletionSource zza;

    public zzu(Fido2PrivilegedApiClient fido2PrivilegedApiClient, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    public final void zzb(boolean bl2) {
        TaskCompletionSource taskCompletionSource = this.zza;
        Boolean bl3 = bl2;
        taskCompletionSource.setResult(bl3);
    }

    public final void zzc(Status status) {
        TaskCompletionSource taskCompletionSource = this.zza;
        ApiException apiException = new ApiException(status);
        taskCompletionSource.trySetException(apiException);
    }
}

