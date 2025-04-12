/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbit;
import com.google.android.gms.internal.ads.zzbiw;
import com.google.android.gms.internal.ads.zzbiz;
import com.google.android.gms.internal.ads.zzbjc;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzbjj;
import com.google.android.gms.internal.ads.zzboi;
import com.google.android.gms.internal.ads.zzdme;

public final class zzdmc {
    zzbiw zza;
    zzbit zzb;
    zzbjj zzc;
    zzbjg zzd;
    zzboi zze;
    final a53 zzf;
    final a53 zzg;

    public zzdmc() {
        a53 a532;
        this.zzf = a532 = new a53();
        this.zzg = a532 = new a53();
    }

    public final zzdmc zza(zzbit zzbit2) {
        this.zzb = zzbit2;
        return this;
    }

    public final zzdmc zzb(zzbiw zzbiw2) {
        this.zza = zzbiw2;
        return this;
    }

    public final zzdmc zzc(String string2, zzbjc object, zzbiz zzbiz2) {
        a53 a532 = this.zzf;
        a532.put(string2, object);
        if (zzbiz2 != null) {
            object = this.zzg;
            ((a53)object).put(string2, zzbiz2);
        }
        return this;
    }

    public final zzdmc zzd(zzboi zzboi2) {
        this.zze = zzboi2;
        return this;
    }

    public final zzdmc zze(zzbjg zzbjg2) {
        this.zzd = zzbjg2;
        return this;
    }

    public final zzdmc zzf(zzbjj zzbjj2) {
        this.zzc = zzbjj2;
        return this;
    }

    public final zzdme zzg() {
        zzdme zzdme2 = new zzdme(this, null);
        return zzdme2;
    }
}

