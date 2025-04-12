/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.zzgu;
import com.google.android.gms.measurement.internal.zzou;
import java.util.List;
import java.util.Map;

final class zzoz
implements zzgu {
    private final /* synthetic */ String zza;
    private final /* synthetic */ List zzb;
    private final /* synthetic */ zzou zzc;

    public zzoz(zzou zzou2, String string2, List list) {
        this.zza = string2;
        this.zzb = list;
        this.zzc = zzou2;
    }

    public final void zza(String string2, int n3, Throwable throwable, byte[] byArray, Map map2) {
        zzou zzou2 = this.zzc;
        String string3 = this.zza;
        List list = this.zzb;
        zzou2.zza(true, n3, throwable, byArray, string3, list);
    }
}

