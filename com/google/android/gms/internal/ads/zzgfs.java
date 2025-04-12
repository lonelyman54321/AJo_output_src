/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgbc;
import com.google.android.gms.internal.ads.zzgfg;
import com.google.android.gms.internal.ads.zzgfr;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

public final class zzgfs {
    private final boolean zza;
    private final zzgbc zzb;

    public /* synthetic */ zzgfs(boolean bl2, zzgbc zzgbc2, zzgfr zzgfr2) {
        this.zza = bl2;
        this.zzb = zzgbc2;
    }

    public final ListenableFuture zza(Callable callable, Executor executor) {
        zzgbc zzgbc2 = this.zzb;
        boolean bl2 = this.zza;
        zzgfg zzgfg2 = new zzgfg(zzgbc2, bl2, executor, callable);
        return zzgfg2;
    }
}

