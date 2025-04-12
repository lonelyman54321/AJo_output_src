/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class zzbw {
    private final String zza;
    private final String zzb;
    private final boolean zzc;
    private long zzd;
    private final Map zze;

    public zzbw(long l2, String string2, String string3, boolean bl2, long l3, Map map2) {
        Map map3;
        Preconditions.checkNotEmpty(string2);
        Preconditions.checkNotEmpty(string3);
        this.zza = string2;
        this.zzb = string3;
        this.zzc = bl2;
        this.zzd = l3;
        if (map2 != null) {
            HashMap hashMap;
            this.zze = hashMap = new HashMap(map2);
            return;
        }
        this.zze = map3 = Collections.emptyMap();
    }

    public final long zza() {
        return this.zzd;
    }

    public final String zzb() {
        return this.zza;
    }

    public final String zzc() {
        return this.zzb;
    }

    public final Map zzd() {
        return this.zze;
    }

    public final void zze(long l2) {
        this.zzd = l2;
    }

    public final boolean zzf() {
        return this.zzc;
    }
}

