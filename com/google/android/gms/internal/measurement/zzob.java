/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzod;
import com.google.android.gms.internal.measurement.zzoe;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

public final class zzob
implements Supplier {
    private static zzob zza;
    private final Supplier zzb;

    static {
        zzob zzob2;
        zza = zzob2 = new zzob();
    }

    public zzob() {
        Object object = new zzod();
        this.zzb = object = Suppliers.ofInstance(object);
    }

    public static boolean zza() {
        return ((zzoe)zza.get()).zza();
    }

    public static boolean zzb() {
        return ((zzoe)zza.get()).zzb();
    }

    public final /* synthetic */ Object get() {
        return (zzoe)this.zzb.get();
    }
}

