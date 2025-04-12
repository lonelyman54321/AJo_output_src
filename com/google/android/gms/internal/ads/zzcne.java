/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nonagon.signalgeneration.zzao;
import com.google.android.gms.ads.nonagon.signalgeneration.zzq;
import com.google.android.gms.ads.nonagon.signalgeneration.zzr;
import com.google.android.gms.internal.ads.zzcla;
import com.google.android.gms.internal.ads.zzcnd;
import com.google.android.gms.internal.ads.zzcng;
import com.google.android.gms.internal.ads.zzcvz;
import com.google.android.gms.internal.ads.zzcxy;
import com.google.android.gms.internal.ads.zzcyv;
import com.google.android.gms.internal.ads.zzdvq;
import com.google.android.gms.internal.ads.zzhkx;

final class zzcne
implements zzq {
    private final zzcla zza;
    private zzcyv zzb;
    private zzao zzc;

    public /* synthetic */ zzcne(zzcla zzcla2, zzcnd zzcnd2) {
        this.zza = zzcla2;
    }

    public final /* synthetic */ zzq zza(zzcyv zzcyv2) {
        this.zzb = zzcyv2;
        return this;
    }

    public final /* synthetic */ zzq zzb(zzao zzao2) {
        this.zzc = zzao2;
        return this;
    }

    public final zzr zzc() {
        zzhkx.zzc(this.zzb, zzcyv.class);
        zzhkx.zzc(this.zzc, zzao.class);
        zzao zzao2 = this.zzc;
        zzcvz zzcvz2 = new zzcvz();
        zzcxy zzcxy2 = new zzcxy();
        zzdvq zzdvq2 = new zzdvq();
        zzcyv zzcyv2 = this.zzb;
        zzcla zzcla2 = this.zza;
        zzcng zzcng2 = new zzcng(zzcla2, zzao2, zzcvz2, zzcxy2, zzdvq2, zzcyv2, null, null, null);
        return zzcng2;
    }
}

