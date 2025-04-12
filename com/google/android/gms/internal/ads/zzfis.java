/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.internal.ads.zzfir;
import com.google.android.gms.internal.ads.zzhkp;
import com.google.android.gms.internal.ads.zzhkx;

public final class zzfis
implements zzhkp {
    private final zzfir zza;

    public zzfis(zzfir zzfir2) {
        this.zza = zzfir2;
    }

    public final /* synthetic */ Object zzb() {
        Clock clock = DefaultClock.getInstance();
        zzhkx.zzb(clock);
        return clock;
    }
}

