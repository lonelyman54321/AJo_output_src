/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.tasks;

import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.zzb;

public class CancellationTokenSource {
    private final zzb zza;

    public CancellationTokenSource() {
        zzb zzb2;
        this.zza = zzb2 = new zzb();
    }

    public void cancel() {
        this.zza.zza();
    }

    public CancellationToken getToken() {
        return this.zza;
    }
}

