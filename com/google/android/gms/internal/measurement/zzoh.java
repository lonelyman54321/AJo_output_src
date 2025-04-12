/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzoj;
import com.google.android.gms.internal.measurement.zzok;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

public final class zzoh
implements Supplier {
    private static zzoh zza;
    private final Supplier zzb;

    static {
        zzoh zzoh2;
        zza = zzoh2 = new zzoh();
    }

    public zzoh() {
        Object object = new zzoj();
        this.zzb = object = Suppliers.ofInstance(object);
    }

    public static boolean zza() {
        return ((zzok)zza.get()).zza();
    }

    public static boolean zzb() {
        return ((zzok)zza.get()).zzb();
    }

    public static boolean zzc() {
        return ((zzok)zza.get()).zzc();
    }

    public static boolean zzd() {
        return ((zzok)zza.get()).zzd();
    }

    public final /* synthetic */ Object get() {
        return (zzok)this.zzb.get();
    }
}

