/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcci;
import com.google.android.gms.internal.ads.zzdst;
import com.google.android.gms.internal.ads.zzdxf;
import com.google.android.gms.internal.ads.zzere;
import com.google.android.gms.internal.ads.zzerg;
import com.google.android.gms.internal.ads.zzgge;
import com.google.android.gms.internal.ads.zzhkp;
import com.google.android.gms.internal.ads.zzhkx;
import com.google.android.gms.internal.ads.zzhlg;

public final class zzerj
implements zzhkp {
    private final zzhlg zza;
    private final zzhlg zzb;
    private final zzhlg zzc;
    private final zzhlg zzd;

    public zzerj(zzhlg zzhlg2, zzhlg zzhlg3, zzhlg zzhlg4, zzhlg zzhlg5) {
        this.zza = zzhlg2;
        this.zzb = zzhlg3;
        this.zzc = zzhlg4;
        this.zzd = zzhlg5;
    }

    public final zzere zza() {
        zzgge zzgge2 = zzcci.zza;
        zzhkx.zzb(zzgge2);
        zzdst zzdst2 = (zzdst)this.zzb.zzb();
        zzdxf zzdxf2 = (zzdxf)this.zzc.zzb();
        zzerg zzerg2 = (zzerg)this.zzd.zzb();
        zzere zzere2 = new zzere(zzgge2, zzdst2, zzdxf2, zzerg2);
        return zzere2;
    }
}

