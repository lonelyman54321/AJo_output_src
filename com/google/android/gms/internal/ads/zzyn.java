/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzan;
import com.google.android.gms.internal.ads.zzgar;
import com.google.android.gms.internal.ads.zzze;

final class zzyn
implements Comparable {
    private final boolean zza;
    private final boolean zzb;

    public zzyn(zzan zzan2, int n3) {
        int n4 = zzan2.zzf;
        int n7 = 1;
        if (n7 != (n4 &= n7)) {
            n7 = 0;
        }
        this.zza = n7;
        n4 = (int)(zzze.zzo(n3, false) ? 1 : 0);
        this.zzb = n4;
    }

    public final int zza(zzyn zzyn2) {
        zzgar zzgar2 = zzgar.zzk();
        boolean bl2 = this.zzb;
        boolean bl3 = zzyn2.zzb;
        zzgar2 = zzgar2.zze(bl2, bl3);
        bl2 = this.zza;
        boolean bl4 = zzyn2.zza;
        return zzgar2.zze(bl2, bl4).zza();
    }
}

