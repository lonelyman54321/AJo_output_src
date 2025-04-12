/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zznz;
import com.google.android.gms.internal.measurement.zzoc;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

public final class zzoa
implements Supplier {
    private static zzoa zza;
    private final Supplier zzb;

    static {
        zzoa zzoa2;
        zza = zzoa2 = new zzoa();
    }

    public zzoa() {
        Object object = new zzoc();
        this.zzb = object = Suppliers.ofInstance(object);
    }

    public static boolean zza() {
        return ((zznz)zza.get()).zza();
    }

    public final /* synthetic */ Object get() {
        return (zznz)this.zzb.get();
    }
}

