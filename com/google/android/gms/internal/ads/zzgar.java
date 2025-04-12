/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgao;
import com.google.android.gms.internal.ads.zzgap;
import com.google.android.gms.internal.ads.zzgaq;
import java.util.Comparator;

public abstract class zzgar {
    private static final zzgar zza;
    private static final zzgar zzb;
    private static final zzgar zzc;

    static {
        zzgar zzgar2 = new zzgao();
        zza = zzgar2;
        zzgar2 = new zzgap(-1);
        zzb = zzgar2;
        zzgar2 = new zzgap(1);
        zzc = zzgar2;
    }

    public /* synthetic */ zzgar(zzgaq zzgaq2) {
    }

    public static /* bridge */ /* synthetic */ zzgar zzh() {
        return zza;
    }

    public static /* bridge */ /* synthetic */ zzgar zzi() {
        return zzc;
    }

    public static /* bridge */ /* synthetic */ zzgar zzj() {
        return zzb;
    }

    public static zzgar zzk() {
        return zza;
    }

    public abstract int zza();

    public abstract zzgar zzb(int var1, int var2);

    public abstract zzgar zzc(long var1, long var3);

    public abstract zzgar zzd(Object var1, Object var2, Comparator var3);

    public abstract zzgar zze(boolean var1, boolean var2);

    public abstract zzgar zzf(boolean var1, boolean var2);
}

