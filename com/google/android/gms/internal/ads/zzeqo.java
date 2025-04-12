/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcci;
import com.google.android.gms.internal.ads.zzczc;
import com.google.android.gms.internal.ads.zzeqm;
import com.google.android.gms.internal.ads.zzfho;
import com.google.android.gms.internal.ads.zzfid;
import com.google.android.gms.internal.ads.zzgge;
import com.google.android.gms.internal.ads.zzhkp;
import com.google.android.gms.internal.ads.zzhkx;
import com.google.android.gms.internal.ads.zzhlg;

public final class zzeqo
implements zzhkp {
    private final zzhlg zza;
    private final zzhlg zzb;
    private final zzhlg zzc;

    public zzeqo(zzhlg zzhlg2, zzhlg zzhlg3, zzhlg zzhlg4) {
        this.zza = zzhlg2;
        this.zzb = zzhlg3;
        this.zzc = zzhlg4;
    }

    public final zzeqm zza() {
        zzgge zzgge2 = zzcci.zza;
        zzhkx.zzb(zzgge2);
        zzfho zzfho2 = ((zzczc)this.zzb).zza();
        zzfid zzfid2 = (zzfid)this.zzc.zzb();
        zzeqm zzeqm2 = new zzeqm(zzgge2, zzfho2, zzfid2);
        return zzeqm2;
    }
}

