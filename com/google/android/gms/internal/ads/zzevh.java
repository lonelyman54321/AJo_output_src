/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcci;
import com.google.android.gms.internal.ads.zzdya;
import com.google.android.gms.internal.ads.zzevf;
import com.google.android.gms.internal.ads.zzgge;
import com.google.android.gms.internal.ads.zzhkp;
import com.google.android.gms.internal.ads.zzhkx;
import com.google.android.gms.internal.ads.zzhlg;

public final class zzevh
implements zzhkp {
    private final zzhlg zza;
    private final zzhlg zzb;

    public zzevh(zzhlg zzhlg2, zzhlg zzhlg3) {
        this.zza = zzhlg2;
        this.zzb = zzhlg3;
    }

    public final zzevf zza() {
        zzgge zzgge2 = zzcci.zza;
        zzhkx.zzb(zzgge2);
        zzdya zzdya2 = (zzdya)this.zzb.zzb();
        zzevf zzevf2 = new zzevf(zzgge2, zzdya2);
        return zzevf2;
    }
}

