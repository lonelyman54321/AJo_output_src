/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzpj;
import com.google.android.gms.internal.measurement.zzpm;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

public final class zzpk
implements Supplier {
    private static zzpk zza;
    private final Supplier zzb;

    static {
        zzpk zzpk2;
        zza = zzpk2 = new zzpk();
    }

    public zzpk() {
        Object object = new zzpm();
        this.zzb = object = Suppliers.ofInstance(object);
    }

    public static boolean zza() {
        return ((zzpj)zza.get()).zza();
    }

    public final /* synthetic */ Object get() {
        return (zzpj)this.zzb.get();
    }
}

