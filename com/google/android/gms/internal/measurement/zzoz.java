/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzpb;
import com.google.android.gms.internal.measurement.zzpc;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

public final class zzoz
implements Supplier {
    private static zzoz zza;
    private final Supplier zzb;

    static {
        zzoz zzoz2;
        zza = zzoz2 = new zzoz();
    }

    public zzoz() {
        Object object = new zzpb();
        this.zzb = object = Suppliers.ofInstance(object);
    }

    public static boolean zza() {
        return ((zzpc)zza.get()).zza();
    }

    public final /* synthetic */ Object get() {
        return (zzpc)this.zzb.get();
    }
}

