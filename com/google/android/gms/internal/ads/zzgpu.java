/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzghx;
import com.google.android.gms.internal.ads.zzgpr;
import com.google.android.gms.internal.ads.zzgps;
import com.google.android.gms.internal.ads.zzgpt;
import com.google.android.gms.internal.ads.zzgqq;

public abstract class zzgpu {
    private final Class zza;
    private final Class zzb;

    public /* synthetic */ zzgpu(Class clazz, Class clazz2, zzgpt zzgpt2) {
        this.zza = clazz;
        this.zzb = clazz2;
    }

    public static zzgpu zzb(zzgps zzgps2, Class clazz, Class clazz2) {
        zzgpr zzgpr2 = new zzgpr(clazz, clazz2, zzgps2);
        return zzgpr2;
    }

    public abstract zzgqq zza(zzghx var1);

    public final Class zzc() {
        return this.zza;
    }

    public final Class zzd() {
        return this.zzb;
    }
}

