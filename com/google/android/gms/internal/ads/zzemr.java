/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdst;
import com.google.android.gms.internal.ads.zzemq;
import com.google.android.gms.internal.ads.zzenu;
import com.google.android.gms.internal.ads.zzhkp;
import com.google.android.gms.internal.ads.zzhlg;

public final class zzemr
implements zzhkp {
    private final zzhlg zza;
    private final zzhlg zzb;

    public zzemr(zzhlg zzhlg2, zzhlg zzhlg3) {
        this.zza = zzhlg2;
        this.zzb = zzhlg3;
    }

    public final zzemq zza() {
        zzenu zzenu2 = (zzenu)this.zza.zzb();
        zzdst zzdst2 = (zzdst)this.zzb.zzb();
        zzemq zzemq2 = new zzemq(zzenu2, zzdst2);
        return zzemq2;
    }
}

