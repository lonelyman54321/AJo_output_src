/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.auth.api.accounttransfer;

import com.google.android.gms.auth.api.accounttransfer.AccountTransferException;
import com.google.android.gms.auth.api.accounttransfer.zzl;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.auth.zzan;
import com.google.android.gms.tasks.TaskCompletionSource;

class zzj
extends zzan {
    final zzl zzb;

    public zzj(zzl zzl2) {
        this.zzb = zzl2;
    }

    public final void zzd(Status status) {
        TaskCompletionSource taskCompletionSource = this.zzb.zzb;
        AccountTransferException accountTransferException = new AccountTransferException(status);
        taskCompletionSource.setException(accountTransferException);
    }
}

