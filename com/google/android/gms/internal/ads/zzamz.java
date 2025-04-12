/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzalq;
import com.google.android.gms.internal.ads.zzams;
import java.util.Collections;
import java.util.List;
import java.util.Map;

final class zzamz
implements zzalq {
    private final zzams zza;
    private final long[] zzb;
    private final Map zzc;
    private final Map zzd;
    private final Map zze;

    public zzamz(zzams object, Map map2, Map map3, Map map4) {
        this.zza = object;
        this.zzd = map3;
        this.zze = map4;
        this.zzc = map2 = Collections.unmodifiableMap(map2);
        object = ((zzams)object).zzh();
        this.zzb = (long[])object;
    }

    public final int zza() {
        return this.zzb.length;
    }

    public final long zzb(int n3) {
        return this.zzb[n3];
    }

    public final List zzc(long l2) {
        Map map2 = this.zzc;
        Map map3 = this.zzd;
        Map map4 = this.zze;
        return this.zza.zze(l2, map2, map3, map4);
    }
}

