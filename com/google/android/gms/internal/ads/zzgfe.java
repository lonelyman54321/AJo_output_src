/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgff;
import com.google.android.gms.internal.ads.zzgfg;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

final class zzgfe
extends zzgff {
    final /* synthetic */ zzgfg zza;
    private final Callable zzc;

    public zzgfe(zzgfg zzgfg2, Callable callable, Executor executor) {
        this.zza = zzgfg2;
        super(zzgfg2, executor);
        this.zzc = callable;
    }

    public final Object zza() {
        return this.zzc.call();
    }

    public final String zzb() {
        return this.zzc.toString();
    }

    public final void zzc(Object object) {
        this.zza.zzc(object);
    }
}

