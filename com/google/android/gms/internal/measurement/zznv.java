/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zznx;
import com.google.android.gms.internal.measurement.zzny;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

public final class zznv
implements Supplier {
    private static zznv zza;
    private final Supplier zzb;

    static {
        zznv zznv2;
        zza = zznv2 = new zznv();
    }

    public zznv() {
        Object object = new zznx();
        this.zzb = object = Suppliers.ofInstance(object);
    }

    public static long zza() {
        return ((zzny)zza.get()).zza();
    }

    public final /* synthetic */ Object get() {
        return (zzny)this.zzb.get();
    }
}

