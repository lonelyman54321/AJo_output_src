/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.ads.zzehq;
import com.google.android.gms.internal.ads.zzelf;
import com.google.android.gms.internal.ads.zzelh;
import com.google.android.gms.internal.ads.zzfoe;

public final class zzelo {
    private zzelf zza;

    public zzelo() {
    }

    private zzelo(zzelf zzelf2) {
        this.zza = zzelf2;
    }

    public static zzelo zzb(zzelf zzelf2) {
        zzelo zzelo2 = new zzelo(zzelf2);
        return zzelo2;
    }

    public final zzelf zza(Clock clock, zzelh zzelh2, zzehq zzehq2, zzfoe zzfoe2) {
        zzelf zzelf2 = this.zza;
        if (zzelf2 != null) {
            return zzelf2;
        }
        zzelf2 = new zzelf(clock, zzelh2, zzehq2, zzfoe2);
        return zzelf2;
    }
}

