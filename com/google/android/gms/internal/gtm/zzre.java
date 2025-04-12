/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzap;
import com.google.android.gms.internal.gtm.zzrf;
import com.google.android.gms.internal.gtm.zzrl;
import java.util.Collections;
import java.util.Map;

public final class zzre {
    private final Map zza;
    private final zzap zzb;

    public /* synthetic */ zzre(Map map2, zzap zzap2, zzrl zzrl2) {
        this.zza = map2;
        this.zzb = zzap2;
    }

    public static zzrf zzb() {
        zzrf zzrf2 = new zzrf(null);
        return zzrf2;
    }

    public final String toString() {
        String string2 = String.valueOf(Collections.unmodifiableMap(this.zza));
        String string3 = String.valueOf(this.zzb);
        return UX.c("Properties: ", string2, " pushAfterEvaluate: ", string3);
    }

    public final zzap zza() {
        return this.zzb;
    }

    public final Map zzc() {
        return Collections.unmodifiableMap(this.zza);
    }

    public final void zzd(String string2, zzap zzap2) {
        this.zza.put(string2, zzap2);
    }
}

