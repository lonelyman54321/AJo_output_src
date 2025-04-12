/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzov;
import com.google.android.gms.internal.measurement.zzow;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

public final class zzot
implements Supplier {
    private static zzot zza;
    private final Supplier zzb;

    static {
        zzot zzot2;
        zza = zzot2 = new zzot();
    }

    public zzot() {
        Object object = new zzov();
        this.zzb = object = Suppliers.ofInstance(object);
    }

    public static double zza() {
        return ((zzow)zza.get()).zza();
    }

    public static long zzb() {
        return ((zzow)zza.get()).zzb();
    }

    public static long zzc() {
        return ((zzow)zza.get()).zzc();
    }

    public static long zzd() {
        return ((zzow)zza.get()).zzd();
    }

    public static String zze() {
        return ((zzow)zza.get()).zze();
    }

    public static boolean zzf() {
        return ((zzow)zza.get()).zzf();
    }

    public final /* synthetic */ Object get() {
        return (zzow)this.zzb.get();
    }
}

