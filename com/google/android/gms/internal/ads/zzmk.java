/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcz;
import com.google.android.gms.internal.ads.zzd;
import com.google.android.gms.internal.ads.zzdb;
import com.google.android.gms.internal.ads.zzdc;
import com.google.android.gms.internal.ads.zzml;
import com.google.android.gms.internal.ads.zzvc;

final class zzmk
extends zzvc {
    private final zzdb zzd;

    public zzmk(zzml object, zzdc zzdc2) {
        super(zzdc2);
        this.zzd = object = new zzdb();
    }

    public final zzcz zzd(int n3, zzcz zzcz2, boolean bl2) {
        zzcz zzcz3 = this.zzc.zzd(n3, zzcz2, bl2);
        Object object = this.zzc;
        int n4 = zzcz3.zzd;
        zzdb zzdb2 = this.zzd;
        long l2 = 0L;
        zzdb zzdb3 = ((zzdc)object).zze(n4, zzdb2, l2);
        boolean bl3 = zzdb3.zzb();
        if (bl3) {
            Object object2 = zzcz2.zzb;
            Object object3 = zzcz2.zzc;
            int n7 = zzcz2.zzd;
            long l3 = zzcz2.zze;
            zzd zzd2 = com.google.android.gms.internal.ads.zzd.zza;
            boolean bl4 = true;
            long l4 = 0L;
            object = zzcz3;
            zzcz3.zzl(object2, object3, n7, l3, l4, zzd2, bl4);
        } else {
            boolean bl5;
            zzcz3.zzg = bl5 = true;
        }
        return zzcz3;
    }
}

