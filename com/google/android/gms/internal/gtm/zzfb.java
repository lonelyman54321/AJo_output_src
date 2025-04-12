/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;

final class zzfb {
    private final Clock zza;
    private long zzb;

    public zzfb(Clock clock) {
        Preconditions.checkNotNull(clock);
        this.zza = clock;
    }

    public zzfb(Clock clock, long l2) {
        Preconditions.checkNotNull(clock);
        this.zza = clock;
        this.zzb = l2;
    }

    public final void zza() {
        this.zzb = 0L;
    }

    public final void zzb() {
        long l2;
        this.zzb = l2 = this.zza.elapsedRealtime();
    }

    public final boolean zzc(long l2) {
        long l3 = this.zzb;
        long l4 = 0L;
        boolean bl2 = true;
        Object object = l3 == l4 ? 0 : (l3 < l4 ? -1 : 1);
        if (object == false) {
            return bl2;
        }
        Clock clock = this.zza;
        l3 = clock.elapsedRealtime();
        l4 = this.zzb;
        long l7 = (l3 -= l4) - l2;
        Object object2 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (object2 > 0) {
            return bl2;
        }
        return false;
    }
}

