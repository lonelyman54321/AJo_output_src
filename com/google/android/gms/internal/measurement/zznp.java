/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zznr;
import com.google.android.gms.internal.measurement.zzns;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

public final class zznp
implements Supplier {
    private static zznp zza;
    private final Supplier zzb;

    static {
        zznp zznp2;
        zza = zznp2 = new zznp();
    }

    public zznp() {
        Object object = new zznr();
        this.zzb = object = Suppliers.ofInstance(object);
    }

    public static boolean zza() {
        return ((zzns)zza.get()).zza();
    }

    public static boolean zzb() {
        return ((zzns)zza.get()).zzb();
    }

    public final /* synthetic */ Object get() {
        return (zzns)this.zzb.get();
    }
}

