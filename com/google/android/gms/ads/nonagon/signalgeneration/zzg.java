/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.common.util.Clock;
import java.util.concurrent.atomic.AtomicBoolean;

public final class zzg {
    private final QueryInfo zza;
    private final String zzb;
    private final long zzc;
    private final int zzd;
    private final AtomicBoolean zze;

    public zzg(QueryInfo queryInfo, String string2, long l2, int n3) {
        AtomicBoolean atomicBoolean;
        this.zze = atomicBoolean = new AtomicBoolean(false);
        this.zza = queryInfo;
        this.zzb = string2;
        this.zzc = l2;
        this.zzd = n3;
    }

    public final int zza() {
        return this.zzd;
    }

    public final QueryInfo zzb() {
        return this.zza;
    }

    public final String zzc() {
        return this.zzb;
    }

    public final void zzd() {
        this.zze.set(true);
    }

    public final boolean zze() {
        long l2 = this.zzc;
        Clock clock = zzu.zzB();
        long l3 = clock.currentTimeMillis();
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        return object <= 0;
    }

    public final boolean zzf() {
        return this.zze.get();
    }
}

