/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcci;
import com.google.android.gms.internal.ads.zzecf;
import com.google.android.gms.internal.ads.zzecg;
import com.google.android.gms.internal.ads.zzeck;
import com.google.android.gms.internal.ads.zzflt;
import com.google.android.gms.internal.ads.zzgge;
import com.google.android.gms.internal.ads.zzhkp;
import com.google.android.gms.internal.ads.zzhkx;
import com.google.android.gms.internal.ads.zzhlg;

public final class zzecl
implements zzhkp {
    private final zzhlg zza;
    private final zzhlg zzb;
    private final zzhlg zzc;

    public zzecl(zzhlg zzhlg2, zzhlg zzhlg3, zzhlg zzhlg4) {
        this.zza = zzhlg2;
        this.zzb = zzhlg3;
        this.zzc = zzhlg4;
    }

    public final zzeck zza() {
        zzgge zzgge2 = zzcci.zza;
        zzhkx.zzb(zzgge2);
        zzecf zzecf2 = ((zzecg)this.zzb).zza();
        zzflt zzflt2 = (zzflt)this.zzc.zzb();
        zzeck zzeck2 = new zzeck(zzgge2, zzecf2, zzflt2);
        return zzeck2;
    }
}

