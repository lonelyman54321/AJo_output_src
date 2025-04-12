/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzpn;
import com.google.android.gms.internal.measurement.zzpo;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

public final class zzpl
implements Supplier {
    private static zzpl zza;
    private final Supplier zzb;

    static {
        zzpl zzpl2;
        zza = zzpl2 = new zzpl();
    }

    public zzpl() {
        Object object = new zzpn();
        this.zzb = object = Suppliers.ofInstance(object);
    }

    public static boolean zza() {
        return ((zzpo)zza.get()).zza();
    }

    public static boolean zzb() {
        return ((zzpo)zza.get()).zzb();
    }

    public static boolean zzc() {
        return ((zzpo)zza.get()).zzc();
    }

    public static boolean zzd() {
        return ((zzpo)zza.get()).zzd();
    }

    public static boolean zze() {
        return ((zzpo)zza.get()).zze();
    }

    public static boolean zzf() {
        return ((zzpo)zza.get()).zzf();
    }

    public static boolean zzg() {
        return ((zzpo)zza.get()).zzg();
    }

    public final /* synthetic */ Object get() {
        return (zzpo)this.zzb.get();
    }
}

