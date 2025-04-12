/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzpt;
import com.google.android.gms.internal.measurement.zzpu;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

public final class zzpr
implements Supplier {
    private static zzpr zza;
    private final Supplier zzb;

    static {
        zzpr zzpr2;
        zza = zzpr2 = new zzpr();
    }

    public zzpr() {
        Object object = new zzpt();
        this.zzb = object = Suppliers.ofInstance(object);
    }

    public static boolean zza() {
        return ((zzpu)zza.get()).zza();
    }

    public final /* synthetic */ Object get() {
        return (zzpu)this.zzb.get();
    }
}

