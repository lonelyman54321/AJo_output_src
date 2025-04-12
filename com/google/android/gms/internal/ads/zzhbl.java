/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzhbc;
import com.google.android.gms.internal.ads.zzhbi;
import com.google.android.gms.internal.ads.zzhbo;
import com.google.android.gms.internal.ads.zzhbt;
import com.google.android.gms.internal.ads.zzhdd;
import com.google.android.gms.internal.ads.zzhde;
import com.google.android.gms.internal.ads.zzhdj;
import com.google.android.gms.internal.ads.zzhfg;
import com.google.android.gms.internal.ads.zzhfh;

final class zzhbl
implements zzhbc {
    final zzhbt zza;
    final int zzb;
    final zzhfg zzc;
    final boolean zzd;
    final boolean zze;

    public zzhbl(zzhbt zzhbt2, int n3, zzhfg zzhfg2, boolean bl2, boolean bl3) {
        this.zza = zzhbt2;
        this.zzb = n3;
        this.zzc = zzhfg2;
        this.zzd = bl2;
        this.zze = bl3;
    }

    public final /* synthetic */ int compareTo(Object object) {
        int n3 = ((zzhbl)object).zzb;
        return this.zzb - n3;
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzhdd zzb(zzhdd zzhdd2, zzhde zzhde2) {
        zzhde2 = (zzhbo)zzhde2;
        ((zzhbi)zzhdd2).zzbj((zzhbo)zzhde2);
        return zzhdd2;
    }

    public final zzhdj zzc(zzhdj object, zzhdj zzhdj2) {
        object = new UnsupportedOperationException();
        throw object;
    }

    public final zzhfg zzd() {
        return this.zzc;
    }

    public final zzhfh zze() {
        return this.zzc.zza();
    }

    public final boolean zzf() {
        return this.zze;
    }

    public final boolean zzg() {
        return this.zzd;
    }
}

