/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzghi;
import com.google.android.gms.internal.ads.zzgpv;
import com.google.android.gms.internal.ads.zzgpw;
import com.google.android.gms.internal.ads.zzgpx;

public abstract class zzgpy {
    private final Class zza;
    private final Class zzb;

    public /* synthetic */ zzgpy(Class clazz, Class clazz2, zzgpx zzgpx2) {
        this.zza = clazz;
        this.zzb = clazz2;
    }

    public static zzgpy zzb(zzgpw zzgpw2, Class clazz, Class clazz2) {
        zzgpv zzgpv2 = new zzgpv(clazz, clazz2, zzgpw2);
        return zzgpv2;
    }

    public abstract Object zza(zzghi var1);

    public final Class zzc() {
        return this.zza;
    }

    public final Class zzd() {
        return this.zzb;
    }
}

