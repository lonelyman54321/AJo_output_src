/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzqb;
import com.google.android.gms.internal.gtm.zzqk;
import java.util.HashMap;
import java.util.Map;

public final class zzpz {
    private final Map zza;
    private zzqk zzb;

    public zzpz() {
        HashMap hashMap;
        this.zza = hashMap = new HashMap();
    }

    public final zzpz zza(String string2, zzqk zzqk2) {
        this.zza.put(string2, zzqk2);
        return this;
    }

    public final zzpz zzb(zzqk zzqk2) {
        this.zzb = zzqk2;
        return this;
    }

    public final zzqb zzc() {
        Map map2 = this.zza;
        zzqk zzqk2 = this.zzb;
        zzqb zzqb2 = new zzqb(map2, zzqk2, null);
        return zzqb2;
    }
}

