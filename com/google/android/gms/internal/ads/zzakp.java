/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzakq;
import com.google.android.gms.internal.ads.zzan;

public final class zzakp {
    public final int zza;
    public final int zzb;
    public final long zzc;
    public final long zzd;
    public final long zze;
    public final zzan zzf;
    public final int zzg;
    public final long[] zzh;
    public final long[] zzi;
    public final int zzj;
    private final zzakq[] zzk;

    public zzakp(int n3, int n4, long l2, long l3, long l4, zzan zzan2, int n7, zzakq[] zzakqArray, int n8, long[] lArray, long[] lArray2) {
        this.zza = n3;
        this.zzb = n4;
        this.zzc = l2;
        this.zzd = l3;
        this.zze = l4;
        this.zzf = zzan2;
        this.zzg = n7;
        this.zzk = zzakqArray;
        this.zzj = n8;
        this.zzh = lArray;
        this.zzi = lArray2;
    }

    public final zzakq zza(int n3) {
        return this.zzk[n3];
    }
}

