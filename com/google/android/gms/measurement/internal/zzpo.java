/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

final class zzpo {
    final String zza;
    final String zzb;
    final String zzc;
    final long zzd;
    final Object zze;

    public zzpo(String string2, String string3, String string4, long l2, Object object) {
        Preconditions.checkNotEmpty(string2);
        Preconditions.checkNotEmpty(string4);
        Preconditions.checkNotNull(object);
        this.zza = string2;
        this.zzb = string3;
        this.zzc = string4;
        this.zzd = l2;
        this.zze = object;
    }
}

