/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzgf$zzj;
import com.google.android.gms.measurement.internal.zzlu;
import com.google.android.gms.measurement.internal.zzpi;
import java.util.Map;

final class zzph {
    private long zza;
    private zzgf$zzj zzb;
    private String zzc;
    private Map zzd;
    private zzlu zze;
    private long zzf;
    private long zzg;

    public final zzph zza(long l2) {
        this.zzg = l2;
        return this;
    }

    public final zzph zza(zzgf$zzj zzgf$zzj) {
        this.zzb = zzgf$zzj;
        return this;
    }

    public final zzph zza(zzlu zzlu2) {
        this.zze = zzlu2;
        return this;
    }

    public final zzph zza(String string2) {
        this.zzc = string2;
        return this;
    }

    public final zzph zza(Map map2) {
        this.zzd = map2;
        return this;
    }

    public final zzpi zza() {
        long l2 = this.zza;
        zzgf$zzj zzgf$zzj = this.zzb;
        String string2 = this.zzc;
        Map map2 = this.zzd;
        zzlu zzlu2 = this.zze;
        long l3 = this.zzf;
        long l4 = this.zzg;
        zzpi zzpi2 = new zzpi(l2, zzgf$zzj, string2, map2, zzlu2, l3, l4, null);
        return zzpi2;
    }

    public final zzph zzb(long l2) {
        this.zzf = l2;
        return this;
    }

    public final zzph zzc(long l2) {
        this.zza = l2;
        return this;
    }
}

