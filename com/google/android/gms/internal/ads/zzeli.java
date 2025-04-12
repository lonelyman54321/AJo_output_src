/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdsq;
import com.google.android.gms.internal.ads.zzdvc;
import com.google.android.gms.internal.ads.zzelh;
import com.google.android.gms.internal.ads.zzfig;
import com.google.android.gms.internal.ads.zzhkp;
import com.google.android.gms.internal.ads.zzhlg;

public final class zzeli
implements zzhkp {
    private final zzhlg zza;
    private final zzhlg zzb;
    private final zzhlg zzc;

    public zzeli(zzhlg zzhlg2, zzhlg zzhlg3, zzhlg zzhlg4) {
        this.zza = zzhlg2;
        this.zzb = zzhlg3;
        this.zzc = zzhlg4;
    }

    public final zzelh zza() {
        zzfig zzfig2 = (zzfig)this.zza.zzb();
        zzdsq zzdsq2 = (zzdsq)this.zzb.zzb();
        zzdvc zzdvc2 = (zzdvc)this.zzc.zzb();
        zzelh zzelh2 = new zzelh(zzfig2, zzdsq2, zzdvc2);
        return zzelh2;
    }
}

