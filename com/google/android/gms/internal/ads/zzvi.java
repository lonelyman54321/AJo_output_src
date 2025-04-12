/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbu;
import com.google.android.gms.internal.ads.zzcz;
import com.google.android.gms.internal.ads.zzd;
import com.google.android.gms.internal.ads.zzdb;
import com.google.android.gms.internal.ads.zzdc;
import com.google.android.gms.internal.ads.zzvh;

public final class zzvi
extends zzdc {
    private final zzbu zzc;

    public zzvi(zzbu zzbu2) {
        this.zzc = zzbu2;
    }

    public final int zza(Object object) {
        Object object2 = zzvh.zzd;
        if (object == object2) {
            return 0;
        }
        return -1;
    }

    public final int zzb() {
        return 1;
    }

    public final int zzc() {
        return 1;
    }

    public final zzcz zzd(int n3, zzcz zzcz2, boolean bl2) {
        Integer n4;
        Object object = null;
        Integer n7 = bl2 ? (n4 = Integer.valueOf(0)) : null;
        if (bl2) {
            object = zzvh.zzd;
        }
        zzd zzd2 = zzd.zza;
        zzcz2.zzl(n7, object, 0, -9223372036854775807L, 0L, zzd2, true);
        return zzcz2;
    }

    public final zzdb zze(int n3, zzdb zzdb2, long l2) {
        Object object = zzdb.zza;
        zzbu zzbu2 = this.zzc;
        long l3 = -9223372036854775807L;
        long l4 = 0L;
        long l7 = -9223372036854775807L;
        zzdb2.zza(object, zzbu2, null, l3, l3, l3, false, true, null, l4, l7, 0, 0, 0L);
        object = zzdb2;
        zzdb2.zzm = true;
        return zzdb2;
    }

    public final Object zzf(int n3) {
        return zzvh.zzd;
    }
}

