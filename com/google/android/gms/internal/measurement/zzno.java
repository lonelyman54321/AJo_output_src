/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zznn;
import com.google.android.gms.internal.measurement.zznq;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

public final class zzno
implements Supplier {
    private static zzno zza;
    private final Supplier zzb;

    static {
        zzno zzno2;
        zza = zzno2 = new zzno();
    }

    public zzno() {
        Object object = new zznq();
        this.zzb = object = Suppliers.ofInstance(object);
    }

    public static boolean zza() {
        return ((zznn)zza.get()).zza();
    }

    public final /* synthetic */ Object get() {
        return (zznn)this.zzb.get();
    }
}

