/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzghi;
import com.google.android.gms.internal.ads.zzgic;
import com.google.android.gms.internal.ads.zzgok;
import com.google.android.gms.internal.ads.zzgol;
import com.google.android.gms.internal.ads.zzgom;
import com.google.android.gms.internal.ads.zzgqq;
import com.google.android.gms.internal.ads.zzgze;

public abstract class zzgon {
    private final zzgze zza;
    private final Class zzb;

    public /* synthetic */ zzgon(zzgze zzgze2, Class clazz, zzgom zzgom2) {
        this.zza = zzgze2;
        this.zzb = clazz;
    }

    public static zzgon zzb(zzgol zzgol2, zzgze zzgze2, Class clazz) {
        zzgok zzgok2 = new zzgok(zzgze2, clazz, zzgol2);
        return zzgok2;
    }

    public abstract zzghi zza(zzgqq var1, zzgic var2);

    public final zzgze zzc() {
        return this.zza;
    }

    public final Class zzd() {
        return this.zzb;
    }
}

