/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzox;
import com.google.android.gms.internal.measurement.zzpa;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

public final class zzoy
implements Supplier {
    private static zzoy zza;
    private final Supplier zzb;

    static {
        zzoy zzoy2;
        zza = zzoy2 = new zzoy();
    }

    public zzoy() {
        Object object = new zzpa();
        this.zzb = object = Suppliers.ofInstance(object);
    }

    public static boolean zza() {
        return ((zzox)zza.get()).zza();
    }

    public static boolean zzb() {
        return ((zzox)zza.get()).zzb();
    }

    public static boolean zzc() {
        return ((zzox)zza.get()).zzc();
    }

    public static boolean zzd() {
        return ((zzox)zza.get()).zzd();
    }

    public static boolean zze() {
        return ((zzox)zza.get()).zze();
    }

    public static boolean zzf() {
        return ((zzox)zza.get()).zzf();
    }

    public static boolean zzg() {
        return ((zzox)zza.get()).zzg();
    }

    public static boolean zzh() {
        return ((zzox)zza.get()).zzh();
    }

    public static boolean zzi() {
        return ((zzox)zza.get()).zzi();
    }

    public static boolean zzj() {
        return ((zzox)zza.get()).zzj();
    }

    public static boolean zzk() {
        return ((zzox)zza.get()).zzk();
    }

    public final /* synthetic */ Object get() {
        return (zzox)this.zzb.get();
    }
}

