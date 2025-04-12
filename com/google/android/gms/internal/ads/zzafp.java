/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzafj;
import com.google.android.gms.internal.ads.zzfu;

final class zzafp
implements zzafj {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;

    private zzafp(int n3, int n4, int n7, int n8, int n10, int n14) {
        this.zza = n3;
        this.zzb = n7;
        this.zzc = n8;
        this.zzd = n10;
        this.zze = n14;
    }

    public static zzafp zzb(zzfu object) {
        int n3 = ((zzfu)object).zzi();
        ((zzfu)object).zzL(12);
        int n4 = ((zzfu)object).zzi();
        int n7 = ((zzfu)object).zzi();
        int n8 = ((zzfu)object).zzi();
        ((zzfu)object).zzL(4);
        int n10 = ((zzfu)object).zzi();
        int n14 = ((zzfu)object).zzi();
        ((zzfu)object).zzL(8);
        object = new zzafp(n3, n4, n7, n8, n10, n14);
        return object;
    }

    public final int zza() {
        return 1752331379;
    }
}

