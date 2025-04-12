/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzop;
import com.google.android.gms.internal.measurement.zzoq;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

public final class zzon
implements Supplier {
    private static zzon zza;
    private final Supplier zzb;

    static {
        zzon zzon2;
        zza = zzon2 = new zzon();
    }

    public zzon() {
        Object object = new zzop();
        this.zzb = object = Suppliers.ofInstance(object);
    }

    public static boolean zza() {
        return ((zzoq)zza.get()).zza();
    }

    public final /* synthetic */ Object get() {
        return (zzoq)this.zzb.get();
    }
}

