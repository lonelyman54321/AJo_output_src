/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzqb;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class zzpy {
    private final List zza;
    private final Map zzb;
    private final String zzc;

    public zzpy(List object, Map map2, String string2, int n3) {
        object = Collections.unmodifiableList(object);
        this.zza = object;
        this.zzb = object = Collections.unmodifiableMap(map2);
        this.zzc = string2;
    }

    public final String toString() {
        String string2 = String.valueOf(this.zza);
        String string3 = String.valueOf(this.zzb);
        return UX.c("Rules: ", string2, "\n  Macros: ", string3);
    }

    public final zzqb zza(String string2) {
        return (zzqb)this.zzb.get(string2);
    }

    public final String zzb() {
        return this.zzc;
    }

    public final List zzc() {
        return this.zza;
    }
}

