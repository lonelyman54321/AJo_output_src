/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.zzgu;
import com.google.android.gms.measurement.internal.zzou;
import com.google.android.gms.measurement.internal.zzpi;
import java.util.Map;

final class zzoy
implements zzgu {
    private final /* synthetic */ String zza;
    private final /* synthetic */ zzpi zzb;
    private final /* synthetic */ zzou zzc;

    public zzoy(zzou zzou2, String string2, zzpi zzpi2) {
        this.zza = string2;
        this.zzb = zzpi2;
        this.zzc = zzou2;
    }

    public final void zza(String string2, int n3, Throwable throwable, byte[] byArray, Map map2) {
        zzou zzou2 = this.zzc;
        String string3 = this.zza;
        zzpi zzpi2 = this.zzb;
        zzou2.zza(string3, n3, throwable, byArray, zzpi2);
    }
}

