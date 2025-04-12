/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcci;
import com.google.android.gms.internal.ads.zzczc;
import com.google.android.gms.internal.ads.zzdsy;
import com.google.android.gms.internal.ads.zzeta;
import com.google.android.gms.internal.ads.zzfho;
import com.google.android.gms.internal.ads.zzgge;
import com.google.android.gms.internal.ads.zzhkp;
import com.google.android.gms.internal.ads.zzhkx;
import com.google.android.gms.internal.ads.zzhlg;

public final class zzetc
implements zzhkp {
    private final zzhlg zza;
    private final zzhlg zzb;
    private final zzhlg zzc;
    private final zzhlg zzd;

    public zzetc(zzhlg zzhlg2, zzhlg zzhlg3, zzhlg zzhlg4, zzhlg zzhlg5) {
        this.zza = zzhlg2;
        this.zzb = zzhlg3;
        this.zzc = zzhlg4;
        this.zzd = zzhlg5;
    }

    public final zzeta zza() {
        zzgge zzgge2 = zzcci.zza;
        zzhkx.zzb(zzgge2);
        zzdsy zzdsy2 = (zzdsy)this.zzb.zzb();
        zzfho zzfho2 = ((zzczc)this.zzc).zza();
        String string2 = (String)this.zzd.zzb();
        zzeta zzeta2 = new zzeta(zzgge2, zzdsy2, zzfho2, string2);
        return zzeta2;
    }
}

