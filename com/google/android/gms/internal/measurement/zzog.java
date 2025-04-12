/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzof;
import com.google.android.gms.internal.measurement.zzoi;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

public final class zzog
implements Supplier {
    private static zzog zza;
    private final Supplier zzb;

    static {
        zzog zzog2;
        zza = zzog2 = new zzog();
    }

    public zzog() {
        Object object = new zzoi();
        this.zzb = object = Suppliers.ofInstance(object);
    }

    public static boolean zza() {
        return ((zzof)zza.get()).zza();
    }

    public static boolean zzb() {
        return ((zzof)zza.get()).zzb();
    }

    public static boolean zzc() {
        return ((zzof)zza.get()).zzc();
    }

    public final /* synthetic */ Object get() {
        return (zzof)this.zzb.get();
    }
}

