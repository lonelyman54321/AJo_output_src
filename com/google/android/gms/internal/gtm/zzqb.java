/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzqa;
import com.google.android.gms.internal.gtm.zzqk;
import java.util.Collections;
import java.util.Map;

public final class zzqb {
    private final Map zza;
    private final zzqk zzb;

    public /* synthetic */ zzqb(Map map2, zzqk zzqk2, zzqa zzqa2) {
        this.zza = map2 = Collections.unmodifiableMap(map2);
        this.zzb = zzqk2;
    }

    public final String toString() {
        String string2 = String.valueOf(this.zza);
        String string3 = String.valueOf(this.zzb);
        return UX.c("Properties: ", string2, " pushAfterEvaluate: ", string3);
    }

    public final Map zza() {
        return this.zza;
    }
}

