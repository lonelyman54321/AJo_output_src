/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgic;
import com.google.android.gms.internal.ads.zzgqo;
import com.google.android.gms.internal.ads.zzgze;

public final class zzgzf {
    private final zzgze zza;

    private zzgzf(zzgze zzgze2) {
        this.zza = zzgze2;
    }

    public static zzgzf zzb(byte[] object, zzgic object2) {
        object = zzgze.zzb(object);
        object2 = new zzgzf((zzgze)object);
        return object2;
    }

    public static zzgzf zzc(int n3) {
        zzgze zzgze2 = zzgze.zzb(zzgqo.zzb(n3));
        zzgzf zzgzf2 = new zzgzf(zzgze2);
        return zzgzf2;
    }

    public final int zza() {
        return this.zza.zza();
    }

    public final byte[] zzd(zzgic zzgic2) {
        return this.zza.zzc();
    }
}

