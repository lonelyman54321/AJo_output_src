/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.ads.nonagon.signalgeneration.zzav;
import com.google.android.gms.internal.ads.zzcci;
import com.google.android.gms.internal.ads.zzeac;
import com.google.android.gms.internal.ads.zzead;
import com.google.android.gms.internal.ads.zzgge;
import com.google.android.gms.internal.ads.zzhkp;
import com.google.android.gms.internal.ads.zzhkx;
import com.google.android.gms.internal.ads.zzhlg;

public final class zzaw
implements zzhkp {
    private final zzhlg zza;
    private final zzhlg zzb;

    public zzaw(zzhlg zzhlg2, zzhlg zzhlg3) {
        this.zza = zzhlg2;
        this.zzb = zzhlg3;
    }

    public final zzav zza() {
        zzgge zzgge2 = zzcci.zza;
        zzhkx.zzb(zzgge2);
        zzeac zzeac2 = ((zzead)this.zzb).zza();
        zzav zzav2 = new zzav(zzgge2, zzeac2);
        return zzav2;
    }
}

