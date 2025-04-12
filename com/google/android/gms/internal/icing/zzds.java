/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.icing;

import com.google.android.gms.internal.icing.zzdp;
import com.google.android.gms.internal.icing.zzdq;
import com.google.android.gms.internal.icing.zzdr;

abstract class zzds {
    private static final zzds zza;
    private static final zzds zzb;

    static {
        zzds zzds2 = new zzdq(null);
        zza = zzds2;
        zzds2 = new zzdr(null);
        zzb = zzds2;
    }

    public /* synthetic */ zzds(zzdp zzdp2) {
    }

    public static zzds zzc() {
        return zza;
    }

    public static zzds zzd() {
        return zzb;
    }

    public abstract void zza(Object var1, long var2);

    public abstract void zzb(Object var1, Object var2, long var3);
}

