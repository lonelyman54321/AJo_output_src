/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.zzou;
import com.google.android.gms.measurement.internal.zzpg;

final class zzou$zzc {
    final String zza;
    long zzb;

    private zzou$zzc(zzou zzou2) {
        String string2 = zzou2.zzq().zzq();
        this(zzou2, string2);
    }

    public /* synthetic */ zzou$zzc(zzou zzou2, zzpg zzpg2) {
        this(zzou2);
    }

    private zzou$zzc(zzou zzou2, String string2) {
        long l2;
        this.zza = string2;
        this.zzb = l2 = zzou2.zzb().elapsedRealtime();
    }

    public /* synthetic */ zzou$zzc(zzou zzou2, String string2, zzpg zzpg2) {
        this(zzou2, string2);
    }
}

