/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzafa;
import com.google.android.gms.internal.ads.zzfu;

abstract class zzagg {
    protected final zzafa zza;

    public zzagg(zzafa zzafa2) {
        this.zza = zzafa2;
    }

    public abstract boolean zza(zzfu var1);

    public abstract boolean zzb(zzfu var1, long var2);

    public final boolean zzf(zzfu zzfu2, long l2) {
        boolean bl2;
        boolean bl3 = this.zza(zzfu2);
        return bl3 && (bl2 = this.zzb(zzfu2, l2));
    }
}

