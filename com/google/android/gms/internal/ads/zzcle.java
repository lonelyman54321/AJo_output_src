/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcla;
import com.google.android.gms.internal.ads.zzcld;
import com.google.android.gms.internal.ads.zzclg;
import com.google.android.gms.internal.ads.zzcrs;
import com.google.android.gms.internal.ads.zzcrt;
import com.google.android.gms.internal.ads.zzcvz;
import com.google.android.gms.internal.ads.zzcxy;
import com.google.android.gms.internal.ads.zzcyr;
import com.google.android.gms.internal.ads.zzcyv;
import com.google.android.gms.internal.ads.zzdfc;
import com.google.android.gms.internal.ads.zzdvq;
import com.google.android.gms.internal.ads.zzelo;
import com.google.android.gms.internal.ads.zzelq;
import com.google.android.gms.internal.ads.zzfdr;
import com.google.android.gms.internal.ads.zzfeo;
import com.google.android.gms.internal.ads.zzfiu;
import com.google.android.gms.internal.ads.zzhkx;

final class zzcle
implements zzcrs {
    private final zzcla zza;
    private zzfeo zzb;
    private zzfdr zzc;
    private zzdfc zzd;
    private zzcyv zze;

    public /* synthetic */ zzcle(zzcla zzcla2, zzcld zzcld2) {
        this.zza = zzcla2;
    }

    public final /* synthetic */ zzcyr zza(zzfdr zzfdr2) {
        this.zzc = zzfdr2;
        return this;
    }

    public final /* synthetic */ zzcyr zzb(zzfeo zzfeo2) {
        this.zzb = zzfeo2;
        return this;
    }

    public final /* synthetic */ zzcrs zzc(zzdfc zzdfc2) {
        this.zzd = zzdfc2;
        return this;
    }

    public final /* synthetic */ zzcrs zzd(zzcyv zzcyv2) {
        this.zze = zzcyv2;
        return this;
    }

    public final zzcrt zze() {
        zzhkx.zzc(this.zzd, zzdfc.class);
        zzhkx.zzc(this.zze, zzcyv.class);
        zzcvz zzcvz2 = new zzcvz();
        zzfiu zzfiu2 = new zzfiu();
        zzcxy zzcxy2 = new zzcxy();
        zzdvq zzdvq2 = new zzdvq();
        zzdfc zzdfc2 = this.zzd;
        zzcyv zzcyv2 = this.zze;
        zzelo zzelo2 = zzelq.zza();
        zzfeo zzfeo2 = this.zzb;
        zzfdr zzfdr2 = this.zzc;
        zzcla zzcla2 = this.zza;
        zzclg zzclg2 = new zzclg(zzcla2, zzcvz2, zzfiu2, zzcxy2, zzdvq2, zzdfc2, zzcyv2, zzelo2, null, zzfeo2, zzfdr2, null);
        return zzclg2;
    }
}

