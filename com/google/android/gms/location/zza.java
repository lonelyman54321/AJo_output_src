/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.location;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.location.zzb;

public final class zza {
    private long zza = Long.MIN_VALUE;

    public final zza zza(long l2) {
        long l3 = 0L;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        boolean bl2 = object >= 0;
        Preconditions.checkArgument(bl2, "intervalMillis can't be negative.");
        this.zza = l2;
        return this;
    }

    public final zzb zzb() {
        zzb zzb2;
        boolean bl2;
        long l2 = this.zza;
        long l3 = Long.MIN_VALUE;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object != false) {
            bl2 = true;
        } else {
            bl2 = false;
            zzb2 = null;
        }
        Preconditions.checkState(bl2, "Must set intervalMillis.");
        long l7 = this.zza;
        zzb2 = new zzb(l7, true, null, null, null, false, null, 0L, null);
        return zzb2;
    }
}

