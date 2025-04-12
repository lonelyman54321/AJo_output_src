/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzpp;
import com.google.android.gms.internal.measurement.zzps;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

public final class zzpq
implements Supplier {
    private static zzpq zza;
    private final Supplier zzb;

    static {
        zzpq zzpq2;
        zza = zzpq2 = new zzpq();
    }

    public zzpq() {
        Object object = new zzps();
        this.zzb = object = Suppliers.ofInstance(object);
    }

    public static boolean zza() {
        return ((zzpp)zza.get()).zza();
    }

    public static boolean zzb() {
        return ((zzpp)zza.get()).zzb();
    }

    public final /* synthetic */ Object get() {
        return (zzpp)this.zzb.get();
    }
}

