/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;

final class zzoh {
    private final Clock zza;
    private long zzb;

    public zzoh(Clock clock) {
        Preconditions.checkNotNull(clock);
        this.zza = clock;
    }

    public final void zza() {
        this.zzb = 0L;
    }

    public final boolean zza(long l2) {
        l2 = this.zzb;
        long l3 = 0L;
        boolean bl2 = true;
        Object object = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (object == false) {
            return bl2;
        }
        Clock clock = this.zza;
        l2 = clock.elapsedRealtime();
        l3 = this.zzb;
        long l4 = (l2 -= l3) - (l3 = 3600000L);
        object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object >= 0) {
            return bl2;
        }
        return false;
    }

    public final void zzb() {
        long l2;
        this.zzb = l2 = this.zza.elapsedRealtime();
    }
}

