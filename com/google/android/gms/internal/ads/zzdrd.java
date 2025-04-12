/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdlt;
import com.google.android.gms.internal.ads.zzdmm;
import com.google.android.gms.internal.ads.zzdrc;
import com.google.android.gms.internal.ads.zzhkp;
import com.google.android.gms.internal.ads.zzhlg;

public final class zzdrd
implements zzhkp {
    private final zzhlg zza;

    public zzdrd(zzhlg zzhlg2) {
        this.zza = zzhlg2;
    }

    public final zzdrc zza() {
        zzdlt zzdlt2 = ((zzdmm)this.zza).zza();
        zzdrc zzdrc2 = new zzdrc(zzdlt2);
        return zzdrc2;
    }
}

