/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.measurement.internal.zzbn;
import com.google.android.gms.measurement.internal.zzou;

final class zzou$zzb {
    private final zzou zza;
    private int zzb;
    private long zzc;

    public zzou$zzb(zzou zzou2) {
        long l2;
        this.zza = zzou2;
        this.zzb = 1;
        this.zzc = l2 = this.zzc();
    }

    private final long zzc() {
        long l2;
        int n3;
        Preconditions.checkNotNull(this.zza);
        long l3 = (Long)zzbn.zzt.zza(null);
        Long l4 = (Long)zzbn.zzu.zza(null);
        long l7 = l4;
        int n4 = 1;
        for (int i3 = 1; i3 < (n3 = this.zzb) && (n3 = (int)((l2 = (l3 <<= n4) - l7) == 0L ? 0 : (l2 < 0L ? -1 : 1))) < 0; ++i3) {
        }
        long l8 = this.zza.zzb().currentTimeMillis();
        return Math.min(l3, l7) + l8;
    }

    public final void zza() {
        long l2;
        int n3;
        this.zzb = n3 = this.zzb + 1;
        this.zzc = l2 = this.zzc();
    }

    public final boolean zzb() {
        long l2;
        Clock clock = this.zza.zzb();
        long l3 = clock.currentTimeMillis();
        long l4 = l3 - (l2 = this.zzc);
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        return object >= 0;
    }
}

