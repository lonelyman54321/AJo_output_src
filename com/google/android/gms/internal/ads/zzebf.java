/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcci;
import com.google.android.gms.internal.ads.zzdce;
import com.google.android.gms.internal.ads.zzdcf;
import com.google.android.gms.internal.ads.zzebe;
import com.google.android.gms.internal.ads.zzgge;
import com.google.android.gms.internal.ads.zzhkp;
import com.google.android.gms.internal.ads.zzhkw;
import com.google.android.gms.internal.ads.zzhkx;
import com.google.android.gms.internal.ads.zzhlg;
import java.util.Map;

public final class zzebf
implements zzhkp {
    private final zzhlg zza;
    private final zzhlg zzb;
    private final zzhlg zzc;

    public zzebf(zzhlg zzhlg2, zzhlg zzhlg3, zzhlg zzhlg4) {
        this.zza = zzhlg2;
        this.zzb = zzhlg3;
        this.zzc = zzhlg4;
    }

    public final zzebe zza() {
        Map map2 = ((zzhkw)this.zza).zzd();
        zzgge zzgge2 = zzcci.zza;
        zzhkx.zzb(zzgge2);
        zzdce zzdce2 = ((zzdcf)this.zzc).zza();
        zzebe zzebe2 = new zzebe(map2, zzgge2, zzdce2);
        return zzebe2;
    }
}

