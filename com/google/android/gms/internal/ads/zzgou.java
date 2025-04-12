/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzghi;
import com.google.android.gms.internal.ads.zzgic;
import com.google.android.gms.internal.ads.zzgot;
import com.google.android.gms.internal.ads.zzgql;

public final class zzgou
extends zzghi {
    private final zzgql zza;

    public zzgou(zzgql zzgql2, zzgic zzgic2) {
        zzgou.zzc(zzgql2, zzgic2);
        this.zza = zzgql2;
    }

    private static void zzc(zzgql zzgql2, zzgic object) {
        object = zzgot.zzb;
        Object object2 = zzgql2.zzb().ordinal();
        object2 = object[object2];
    }

    public final zzgql zza(zzgic zzgic2) {
        zzgou.zzc(this.zza, zzgic2);
        return this.zza;
    }

    public final Integer zzb() {
        return this.zza.zzf();
    }
}

