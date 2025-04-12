/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.auth.api.accounttransfer;

import com.google.android.gms.auth.api.accounttransfer.AccountTransferException;
import com.google.android.gms.auth.api.accounttransfer.zzn;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.auth.zzan;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzm
extends zzan {
    final /* synthetic */ zzn zza;

    public zzm(zzn zzn2) {
        this.zza = zzn2;
    }

    public final void zzd(Status status) {
        TaskCompletionSource taskCompletionSource = this.zza.zzb;
        AccountTransferException accountTransferException = new AccountTransferException(status);
        taskCompletionSource.setException(accountTransferException);
    }

    public final void zze() {
        this.zza.zzb.setResult(null);
    }
}

