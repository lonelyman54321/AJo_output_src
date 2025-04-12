/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzor;
import com.google.android.gms.internal.measurement.zzou;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

public final class zzos
implements Supplier {
    private static zzos zza;
    private final Supplier zzb;

    static {
        zzos zzos2;
        zza = zzos2 = new zzos();
    }

    public zzos() {
        Object object = new zzou();
        this.zzb = object = Suppliers.ofInstance(object);
    }

    public static boolean zza() {
        return ((zzor)zza.get()).zza();
    }

    public final /* synthetic */ Object get() {
        return (zzor)this.zzb.get();
    }
}

