/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcor;
import com.google.android.gms.internal.ads.zzhkp;
import com.google.android.gms.internal.ads.zzhkt;
import com.google.android.gms.internal.ads.zzhlg;
import java.util.Map;

public final class zzcos
implements zzhkp {
    private final zzhlg zza;
    private final zzhlg zzb;

    public zzcos(zzhlg zzhlg2, zzhlg zzhlg3) {
        this.zza = zzhlg2;
        this.zzb = zzhlg3;
    }

    public final zzcor zza() {
        Map map2 = ((zzhkt)this.zza).zzd();
        Map map3 = ((zzhkt)this.zzb).zzd();
        zzcor zzcor2 = new zzcor(map2, map3);
        return zzcor2;
    }
}

