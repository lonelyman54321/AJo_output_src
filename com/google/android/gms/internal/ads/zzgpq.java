/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzghx;
import com.google.android.gms.internal.ads.zzgpn;
import com.google.android.gms.internal.ads.zzgpo;
import com.google.android.gms.internal.ads.zzgpp;
import com.google.android.gms.internal.ads.zzgqq;
import com.google.android.gms.internal.ads.zzgze;

public abstract class zzgpq {
    private final zzgze zza;
    private final Class zzb;

    public /* synthetic */ zzgpq(zzgze zzgze2, Class clazz, zzgpp zzgpp2) {
        this.zza = zzgze2;
        this.zzb = clazz;
    }

    public static zzgpq zzb(zzgpo zzgpo2, zzgze zzgze2, Class clazz) {
        zzgpn zzgpn2 = new zzgpn(zzgze2, clazz, zzgpo2);
        return zzgpn2;
    }

    public abstract zzghx zza(zzgqq var1);

    public final zzgze zzc() {
        return this.zza;
    }

    public final Class zzd() {
        return this.zzb;
    }
}

