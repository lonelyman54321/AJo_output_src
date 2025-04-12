/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzghi;
import com.google.android.gms.internal.ads.zzgic;
import com.google.android.gms.internal.ads.zzgoo;
import com.google.android.gms.internal.ads.zzgop;
import com.google.android.gms.internal.ads.zzgoq;
import com.google.android.gms.internal.ads.zzgqq;

public abstract class zzgor {
    private final Class zza;
    private final Class zzb;

    public /* synthetic */ zzgor(Class clazz, Class clazz2, zzgoq zzgoq2) {
        this.zza = clazz;
        this.zzb = clazz2;
    }

    public static zzgor zzb(zzgop zzgop2, Class clazz, Class clazz2) {
        zzgoo zzgoo2 = new zzgoo(clazz, clazz2, zzgop2);
        return zzgoo2;
    }

    public abstract zzgqq zza(zzghi var1, zzgic var2);

    public final Class zzc() {
        return this.zza;
    }

    public final Class zzd() {
        return this.zzb;
    }
}

