/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbdm;
import com.google.android.gms.internal.ads.zzduf;
import com.google.android.gms.internal.ads.zzhkp;
import com.google.android.gms.internal.ads.zzhkt;
import com.google.android.gms.internal.ads.zzhlg;
import java.util.Map;

public final class zzdug
implements zzhkp {
    private final zzhlg zza;
    private final zzhlg zzb;

    public zzdug(zzhlg zzhlg2, zzhlg zzhlg3) {
        this.zza = zzhlg2;
        this.zzb = zzhlg3;
    }

    public final zzduf zza() {
        zzbdm zzbdm2 = (zzbdm)this.zza.zzb();
        Map map2 = ((zzhkt)this.zzb).zzd();
        zzduf zzduf2 = new zzduf(zzbdm2, map2);
        return zzduf2;
    }
}

