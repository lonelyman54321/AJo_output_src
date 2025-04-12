/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzajn;
import com.google.android.gms.internal.ads.zzajr;
import com.google.android.gms.internal.ads.zzfu;

final class zzaju
implements zzajr {
    private final zzfu zza;
    private final int zzb;
    private final int zzc;
    private int zzd;
    private int zze;

    public zzaju(zzajn object) {
        int n3;
        int n4;
        this.zza = object = ((zzajn)object).zza;
        ((zzfu)object).zzK(12);
        this.zzc = n4 = ((zzfu)object).zzp() & 0xFF;
        this.zzb = n3 = ((zzfu)object).zzp();
    }

    public final int zza() {
        return -1;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final int zzc() {
        int n3 = this.zzc;
        int n4 = 8;
        if (n3 == n4) {
            return this.zza.zzm();
        }
        n4 = 16;
        if (n3 == n4) {
            return this.zza.zzq();
        }
        n3 = this.zzd;
        this.zzd = n4 = n3 + 1;
        if ((n3 %= 2) == 0) {
            this.zze = n3 = this.zza.zzm();
            return (n3 & 0xF0) >> 4;
        }
        return this.zze & 0xF;
    }
}

