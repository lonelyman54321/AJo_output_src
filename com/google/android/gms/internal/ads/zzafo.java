/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzafj;
import com.google.android.gms.internal.ads.zzfu;

final class zzafo
implements zzafj {
    public final int zza;
    public final int zzb;
    public final int zzc;

    private zzafo(int n3, int n4, int n7, int n8) {
        this.zza = n3;
        this.zzb = n4;
        this.zzc = n7;
    }

    public static zzafo zzb(zzfu object) {
        int n3 = ((zzfu)object).zzi();
        ((zzfu)object).zzL(8);
        int n4 = ((zzfu)object).zzi();
        int n7 = ((zzfu)object).zzi();
        ((zzfu)object).zzL(4);
        int n8 = ((zzfu)object).zzi();
        ((zzfu)object).zzL(12);
        object = new zzafo(n3, n4, n7, n8);
        return object;
    }

    public final int zza() {
        return 1751742049;
    }
}

