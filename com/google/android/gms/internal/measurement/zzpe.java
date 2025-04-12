/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzpd;
import com.google.android.gms.internal.measurement.zzpg;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

public final class zzpe
implements Supplier {
    private static zzpe zza;
    private final Supplier zzb;

    static {
        zzpe zzpe2;
        zza = zzpe2 = new zzpe();
    }

    public zzpe() {
        Object object = new zzpg();
        this.zzb = object = Suppliers.ofInstance(object);
    }

    public static boolean zza() {
        return ((zzpd)zza.get()).zza();
    }

    public static boolean zzb() {
        return ((zzpd)zza.get()).zzb();
    }

    public final /* synthetic */ Object get() {
        return (zzpd)this.zzb.get();
    }
}

