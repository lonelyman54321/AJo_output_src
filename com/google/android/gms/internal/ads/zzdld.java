/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdlc;
import com.google.android.gms.internal.ads.zzdlt;
import com.google.android.gms.internal.ads.zzdmm;
import com.google.android.gms.internal.ads.zzhkp;
import com.google.android.gms.internal.ads.zzhlg;

public final class zzdld
implements zzhkp {
    private final zzhlg zza;

    public zzdld(zzhlg zzhlg2) {
        this.zza = zzhlg2;
    }

    public final zzdlc zza() {
        zzdlt zzdlt2 = ((zzdmm)this.zza).zza();
        zzdlc zzdlc2 = new zzdlc(zzdlt2);
        return zzdlc2;
    }
}

