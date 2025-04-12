/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

public final class zzada {
    private final long zza;
    private final long zzb;
    private final long zzc;
    private long zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private long zzh;

    public zzada(long l2, long l3, long l4, long l7, long l8, long l12, long l14) {
        long l15;
        long l16 = l2;
        this.zza = l2;
        l16 = l3;
        this.zzb = l3;
        this.zzd = l15 = 0L;
        this.zze = l7;
        this.zzf = l8;
        this.zzg = l12;
        this.zzc = l14;
        this.zzh = l16 = zzada.zzf(l3, l15, l7, l8, l12, l14);
    }

    public static /* synthetic */ long zza(zzada zzada2) {
        return zzada2.zzg;
    }

    public static /* synthetic */ long zzb(zzada zzada2) {
        return zzada2.zzf;
    }

    public static /* synthetic */ long zzc(zzada zzada2) {
        return zzada2.zzh;
    }

    public static /* synthetic */ long zzd(zzada zzada2) {
        return zzada2.zza;
    }

    public static /* synthetic */ long zze(zzada zzada2) {
        return zzada2.zzb;
    }

    public static long zzf(long l2, long l3, long l4, long l7, long l8, long l12) {
        long l14;
        long l15;
        long l16 = l7;
        long l17 = 1L;
        long l18 = l7 + l17;
        long l19 = l18 - l8;
        Object object = l19 == 0L ? 0 : (l19 < 0L ? -1 : 1);
        if (object < 0 && (l15 = (l14 = (l17 += l3) - l4) == 0L ? 0 : (l14 < 0L ? -1 : 1)) < 0) {
            l17 = l2 - l3;
            l18 = l8 - l7;
            long l20 = l4 - l3;
            float f5 = l17;
            float f6 = l18;
            float f7 = l20;
            f6 = f6 / f7 * f5;
            l17 = (long)f6;
            l18 = l7 + l17 - l12;
            l20 = l8 + (long)-1;
            long l21 = 20;
            l17 = Math.min(l18 -= (l17 /= l21), l20);
            l16 = Math.max(l7, l17);
        }
        return l16;
    }

    public static /* bridge */ /* synthetic */ void zzg(zzada zzada2, long l2, long l3) {
        zzada2.zze = l2;
        zzada2.zzg = l3;
        zzada2.zzi();
    }

    public static /* bridge */ /* synthetic */ void zzh(zzada zzada2, long l2, long l3) {
        zzada2.zzd = l2;
        zzada2.zzf = l3;
        zzada2.zzi();
    }

    private final void zzi() {
        long l2 = this.zzb;
        long l3 = this.zzd;
        long l4 = this.zze;
        long l7 = this.zzf;
        long l8 = this.zzg;
        long l12 = this.zzc;
        this.zzh = l2 = zzada.zzf(l2, l3, l4, l7, l8, l12);
    }
}

