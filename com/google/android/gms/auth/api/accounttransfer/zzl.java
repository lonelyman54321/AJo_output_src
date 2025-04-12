/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.auth.api.accounttransfer;

import com.google.android.gms.auth.api.accounttransfer.zzk;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.internal.auth.zzau;
import com.google.android.gms.tasks.TaskCompletionSource;

abstract class zzl
extends TaskApiCall {
    protected TaskCompletionSource zzb;

    public /* synthetic */ zzl(int n3, zzk zzk2) {
        super(null, false, n3);
    }

    public abstract void zza(zzau var1);
}

