/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbmo;
import com.google.android.gms.internal.ads.zzdwh;
import com.google.android.gms.internal.ads.zzhkp;
import com.google.android.gms.internal.ads.zzhlg;

public final class zzdwi
implements zzhkp {
    private final zzhlg zza;

    public zzdwi(zzhlg zzhlg2) {
        this.zza = zzhlg2;
    }

    public static zzdwh zzc(zzbmo zzbmo2) {
        zzdwh zzdwh2 = new zzdwh(zzbmo2);
        return zzdwh2;
    }

    public final zzdwh zza() {
        zzbmo zzbmo2 = (zzbmo)this.zza.zzb();
        zzdwh zzdwh2 = new zzdwh(zzbmo2);
        return zzdwh2;
    }
}

