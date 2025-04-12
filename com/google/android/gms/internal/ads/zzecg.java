/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcci;
import com.google.android.gms.internal.ads.zzecf;
import com.google.android.gms.internal.ads.zzecx;
import com.google.android.gms.internal.ads.zzecy;
import com.google.android.gms.internal.ads.zzgge;
import com.google.android.gms.internal.ads.zzhkp;
import com.google.android.gms.internal.ads.zzhkx;
import com.google.android.gms.internal.ads.zzhlg;

public final class zzecg
implements zzhkp {
    private final zzhlg zza;
    private final zzhlg zzb;
    private final zzhlg zzc;

    public zzecg(zzhlg zzhlg2, zzhlg zzhlg3, zzhlg zzhlg4) {
        this.zza = zzhlg2;
        this.zzb = zzhlg3;
        this.zzc = zzhlg4;
    }

    public final zzecf zza() {
        zzgge zzgge2 = zzcci.zzb;
        zzhkx.zzb(zzgge2);
        zzgge zzgge3 = zzcci.zza;
        zzhkx.zzb(zzgge3);
        zzecx zzecx2 = ((zzecy)this.zzc).zza();
        zzecf zzecf2 = new zzecf(zzgge2, zzgge3, zzecx2);
        return zzecf2;
    }
}

