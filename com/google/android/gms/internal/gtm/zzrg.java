/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzrh;
import com.google.android.gms.internal.gtm.zzrl;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class zzrg {
    private final List zza;
    private final Map zzb;
    private final String zzc;

    public /* synthetic */ zzrg(List object, Map map2, String string2, int n3, zzrl zzrl2) {
        object = Collections.unmodifiableList(object);
        this.zza = object;
        this.zzb = object = Collections.unmodifiableMap(map2);
        this.zzc = string2;
    }

    public static zzrh zza() {
        zzrh zzrh2 = new zzrh(null);
        return zzrh2;
    }

    public final String toString() {
        String string2 = String.valueOf(this.zza);
        String string3 = String.valueOf(this.zzb);
        return UX.c("Rules: ", string2, "  Macros: ", string3);
    }

    public final String zzb() {
        return this.zzc;
    }

    public final List zzc() {
        return this.zza;
    }

    public final Map zzd() {
        return this.zzb;
    }
}

