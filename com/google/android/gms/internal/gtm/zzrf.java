/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzap;
import com.google.android.gms.internal.gtm.zzre;
import com.google.android.gms.internal.gtm.zzrl;
import java.util.HashMap;
import java.util.Map;

public final class zzrf {
    private final Map zza;
    private zzap zzb;

    private zzrf() {
        HashMap hashMap;
        this.zza = hashMap = new HashMap();
    }

    public /* synthetic */ zzrf(zzrl hashMap) {
        this.zza = hashMap = new HashMap();
    }

    public final zzre zza() {
        Map map2 = this.zza;
        zzap zzap2 = this.zzb;
        zzre zzre2 = new zzre(map2, zzap2, null);
        return zzre2;
    }

    public final zzrf zzb(String string2, zzap zzap2) {
        this.zza.put(string2, zzap2);
        return this;
    }

    public final zzrf zzc(zzap zzap2) {
        this.zzb = zzap2;
        return this;
    }
}

