/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzggc;
import com.google.android.gms.internal.ads.zzggt;
import java.util.concurrent.Callable;

final class zzggs
extends zzggc {
    final /* synthetic */ zzggt zza;
    private final Callable zzb;

    public zzggs(zzggt zzggt2, Callable callable) {
        this.zza = zzggt2;
        callable.getClass();
        this.zzb = callable;
    }

    public final Object zza() {
        return this.zzb.call();
    }

    public final String zzb() {
        return this.zzb.toString();
    }

    public final void zzd(Throwable throwable) {
        this.zza.zzd(throwable);
    }

    public final void zze(Object object) {
        this.zza.zzc(object);
    }

    public final boolean zzg() {
        return this.zza.isDone();
    }
}

