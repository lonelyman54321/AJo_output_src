/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.gtm.zzox;

public final class zzpj {
    private zzox zza;

    public final zzox zza() {
        return this.zza;
    }

    public final zzpj zzb(zzox zzox2) {
        Preconditions.checkNotNull(zzox2);
        this.zza = zzox2;
        return this;
    }

    public final String zzc() {
        Object object = this.zza;
        object = object == null ? "" : ((zzox)object).zzb();
        return object;
    }
}

