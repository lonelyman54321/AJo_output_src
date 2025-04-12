/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzgf$zzo;
import com.google.android.gms.measurement.internal.zzlu;
import java.util.Collections;
import java.util.Map;

public final class zzov {
    private final String zza;
    private final Map zzb;
    private final zzlu zzc;
    private final zzgf$zzo zzd;

    public zzov(String string2, zzlu zzlu2) {
        Map map2 = Collections.emptyMap();
        this(string2, map2, zzlu2, null);
    }

    public zzov(String string2, Map map2, zzlu zzlu2) {
        this(string2, map2, zzlu2, null);
    }

    public zzov(String string2, Map map2, zzlu zzlu2, zzgf$zzo zzgf$zzo) {
        this.zza = string2;
        this.zzb = map2;
        this.zzc = zzlu2;
        this.zzd = zzgf$zzo;
    }

    public final zzlu zza() {
        return this.zzc;
    }

    public final zzgf$zzo zzb() {
        return this.zzd;
    }

    public final String zzc() {
        return this.zza;
    }

    public final Map zzd() {
        Map map2 = this.zzb;
        if (map2 == null) {
            map2 = Collections.emptyMap();
        }
        return map2;
    }
}

