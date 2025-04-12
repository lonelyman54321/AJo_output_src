/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzgu;
import com.google.android.gms.measurement.internal.zzgz;
import java.util.Map;

final class zzgx
implements Runnable {
    private final zzgu zza;
    private final int zzb;
    private final Throwable zzc;
    private final byte[] zzd;
    private final String zze;
    private final Map zzf;

    private zzgx(String string2, zzgu zzgu2, int n3, Throwable throwable, byte[] byArray, Map map2) {
        Preconditions.checkNotNull(zzgu2);
        this.zza = zzgu2;
        this.zzb = n3;
        this.zzc = throwable;
        this.zzd = byArray;
        this.zze = string2;
        this.zzf = map2;
    }

    public /* synthetic */ zzgx(String string2, zzgu zzgu2, int n3, Throwable throwable, byte[] byArray, Map map2, zzgz zzgz2) {
        this(string2, zzgu2, n3, throwable, byArray, map2);
    }

    public final void run() {
        zzgu zzgu2 = this.zza;
        String string2 = this.zze;
        int n3 = this.zzb;
        Throwable throwable = this.zzc;
        byte[] byArray = this.zzd;
        Map map2 = this.zzf;
        zzgu2.zza(string2, n3, throwable, byArray, map2);
    }
}

