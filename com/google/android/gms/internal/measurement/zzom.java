/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzol;
import com.google.android.gms.internal.measurement.zzoo;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

public final class zzom
implements Supplier {
    private static zzom zza;
    private final Supplier zzb;

    static {
        zzom zzom2;
        zza = zzom2 = new zzom();
    }

    public zzom() {
        Object object = new zzoo();
        this.zzb = object = Suppliers.ofInstance(object);
    }

    public static boolean zza() {
        return ((zzol)zza.get()).zza();
    }

    public final /* synthetic */ Object get() {
        return (zzol)this.zzb.get();
    }
}

