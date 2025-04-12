/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzfjz;

final class zzfka {
    private final long zza;
    private final zzfjz zzb;
    private long zzc;
    private int zzd;
    private int zze;
    private int zzf;

    public zzfka() {
        long l2;
        zzfjz zzfjz2;
        this.zzb = zzfjz2 = new zzfjz();
        this.zzd = 0;
        this.zze = 0;
        this.zzf = 0;
        this.zza = l2 = zzu.zzB().currentTimeMillis();
        this.zzc = l2;
    }

    public final int zza() {
        return this.zzd;
    }

    public final long zzb() {
        return this.zza;
    }

    public final long zzc() {
        return this.zzc;
    }

    public final zzfjz zzd() {
        zzfjz zzfjz2 = this.zzb;
        zzfjz zzfjz3 = zzfjz2.zza();
        zzfjz2.zza = false;
        zzfjz2.zzb = 0;
        return zzfjz3;
    }

    public final String zze() {
        StringBuilder stringBuilder = new StringBuilder("Created: ");
        long l2 = this.zza;
        stringBuilder.append(l2);
        stringBuilder.append(" Last accessed: ");
        l2 = this.zzc;
        stringBuilder.append(l2);
        stringBuilder.append(" Accesses: ");
        int n3 = this.zzd;
        stringBuilder.append(n3);
        stringBuilder.append("\nEntries retrieved: Valid: ");
        n3 = this.zze;
        stringBuilder.append(n3);
        stringBuilder.append(" Stale: ");
        n3 = this.zzf;
        stringBuilder.append(n3);
        return stringBuilder.toString();
    }

    public final void zzf() {
        int n3;
        long l2;
        this.zzc = l2 = zzu.zzB().currentTimeMillis();
        this.zzd = n3 = this.zzd + 1;
    }

    public final void zzg() {
        int n3;
        int n4;
        this.zzf = n4 = this.zzf + 1;
        zzfjz zzfjz2 = this.zzb;
        zzfjz2.zzb = n3 = zzfjz2.zzb + 1;
    }

    public final void zzh() {
        int n3 = this.zze;
        int n4 = 1;
        this.zze = n3 += n4;
        this.zzb.zza = n4;
    }
}

