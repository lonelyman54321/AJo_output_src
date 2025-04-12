/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzph;
import com.google.android.gms.internal.measurement.zzpi;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

public final class zzpf
implements Supplier {
    private static zzpf zza;
    private final Supplier zzb;

    static {
        zzpf zzpf2;
        zza = zzpf2 = new zzpf();
    }

    public zzpf() {
        Object object = new zzph();
        this.zzb = object = Suppliers.ofInstance(object);
    }

    public static boolean zza() {
        return ((zzpi)zza.get()).zza();
    }

    public static boolean zzb() {
        return ((zzpi)zza.get()).zzb();
    }

    public final /* synthetic */ Object get() {
        return (zzpi)this.zzb.get();
    }
}

