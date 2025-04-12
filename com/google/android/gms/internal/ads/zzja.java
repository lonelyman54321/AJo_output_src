/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.SystemClock
 */
package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import com.google.android.gms.internal.ads.zzbk;
import com.google.android.gms.internal.ads.zzgd;
import com.google.android.gms.internal.ads.zziz;

public final class zzja {
    private final long zza;
    private final long zzb;
    private long zzc;
    private long zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private long zzh;
    private float zzi;
    private float zzj;
    private float zzk;
    private long zzl;
    private long zzm;
    private long zzn;

    public /* synthetic */ zzja(float f5, float f6, long l2, float f7, long l3, long l4, float f8, zziz zziz2) {
        long l7;
        this.zza = l3;
        this.zzb = l4;
        this.zzc = l7 = -9223372036854775807L;
        this.zzd = l7;
        this.zzf = l7;
        this.zzg = l7;
        this.zzj = 0.97f;
        this.zzi = 1.03f;
        this.zzk = 1.0f;
        this.zzl = l7;
        this.zze = l7;
        this.zzh = l7;
        this.zzm = l7;
        this.zzn = l7;
    }

    private static long zzf(long l2, long l3, float f5) {
        float f6 = l2;
        float f7 = l3;
        return (long)(f7 * 9.999871E-4f + (f6 *= 0.999f));
    }

    private final void zzg() {
        long l2;
        Object object;
        long l3;
        long l4 = this.zzc;
        long l7 = -9223372036854775807L;
        long l8 = l4 - l7;
        Object object2 = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
        if (object2 != false) {
            l3 = this.zzd;
            long l12 = l3 - l7;
            object = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
            if (object == false) {
                long l14;
                l3 = this.zzf;
                long l15 = l3 - l7;
                object = l15 == 0L ? 0 : (l15 < 0L ? -1 : 1);
                if (object != false && (object = l4 == l3 ? 0 : (l4 < l3 ? -1 : 1)) < 0) {
                    l4 = l3;
                }
                if ((object = (l14 = (l3 = this.zzg) - l7) == 0L ? 0 : (l14 < 0L ? -1 : 1)) == false || (object = l4 == l3 ? 0 : (l4 < l3 ? -1 : 1)) <= 0) {
                    l3 = l4;
                }
            }
        } else {
            l3 = l7;
        }
        if ((object = (l2 = (l4 = this.zze) - l3) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) {
            return;
        }
        this.zze = l3;
        this.zzh = l3;
        this.zzm = l7;
        this.zzn = l7;
        this.zzl = l7;
    }

    public final float zza(long l2, long l3) {
        zzja zzja2 = this;
        int n3 = 0;
        float f5 = 0.0f;
        int n4 = 3;
        float f6 = 4.2E-45f;
        int n7 = 1;
        float f7 = Float.MIN_VALUE;
        long l4 = this.zzc;
        float f8 = 1.0f;
        long l7 = -9223372036854775807L;
        long l8 = l4 - l7;
        Object object = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
        if (object != false) {
            long l12;
            long l14;
            Object object2;
            long l15;
            l4 = l2 - l3;
            long l16 = this.zzm;
            long l17 = l16 - l7;
            Object object3 = l17 == 0L ? 0 : (l17 < 0L ? -1 : 1);
            if (object3 == false) {
                this.zzm = l4;
                this.zzn = l4 = 0L;
            } else {
                object3 = 1065336439;
                float f11 = 0.999f;
                l16 = zzja.zzf(l16, l4, f11);
                this.zzm = l16 = Math.max(l4, l16);
                l4 = Math.abs(l4 - l16);
                l16 = this.zzn;
                this.zzn = l4 = zzja.zzf(l16, l4, f11);
            }
            l4 = zzja2.zzl;
            l16 = 1000L;
            object3 = l4 == l7 ? 0 : (l4 < l7 ? -1 : 1);
            if (object3 != false) {
                l4 = SystemClock.elapsedRealtime();
                l15 = zzja2.zzl;
                long l18 = (l4 -= l15) - l16;
                object3 = l18 == 0L ? 0 : (l18 < 0L ? -1 : 1);
                if (object3 < 0) {
                    return zzja2.zzk;
                }
            }
            zzja2.zzl = l4 = SystemClock.elapsedRealtime();
            l4 = zzja2.zzm;
            l15 = zzja2.zzn;
            long l19 = 3;
            l15 = l15 * l19 + l4;
            l4 = zzja2.zzh;
            float f12 = 1.0E-7f;
            float f14 = -1.0f;
            Object object4 = l4 == l15 ? 0 : (l4 < l15 ? -1 : 1);
            if (object4 > 0) {
                l4 = zzgd.zzr(l16);
                float f15 = zzja2.zzk + f14;
                float f16 = zzja2.zzi + f14;
                l16 = zzja2.zze;
                long l20 = zzja2.zzh;
                float f17 = l4;
                l4 = (long)(f15 *= f17);
                l7 = (long)(f16 *= f17);
                long[] lArray = new long[n4];
                lArray[0] = l15;
                lArray[n7] = l16;
                object2 = 2;
                lArray[object2] = l20 -= (l4 += l7);
                l7 = lArray[0];
                f5 = Float.MIN_VALUE;
                for (n3 = 1; n3 < n4; n3 += n7) {
                    l16 = lArray[n3];
                    long l21 = l16 - l7;
                    object2 = l21 == 0L ? 0 : (l21 < 0L ? -1 : 1);
                    if (object2 <= 0) continue;
                    l7 = l16;
                }
                zzja2.zzh = l7;
            } else {
                f5 = zzja2.zzk + f14;
                n4 = 0;
                f6 = 0.0f;
                f5 = Math.max(0.0f, f5) / f12;
                l14 = (long)f5;
                l14 = l2 - l14;
                l12 = zzja2.zzh;
                l14 = Math.min(l14, l15);
                zzja2.zzh = l14 = Math.max(l12, l14);
                l12 = zzja2.zzg;
                long l22 = l12 - l7;
                object2 = l22 == 0L ? 0 : (l22 < 0L ? -1 : 1);
                if (object2 != false && (object2 = l14 == l12 ? 0 : (l14 < l12 ? -1 : 1)) > 0) {
                    zzja2.zzh = l12;
                    l7 = l12;
                } else {
                    l7 = l14;
                }
            }
            l14 = l2 - l7;
            l12 = zzja2.zza;
            l7 = Math.abs(l14);
            object2 = l7 == l12 ? 0 : (l7 < l12 ? -1 : 1);
            if (object2 < 0) {
                zzja2.zzk = f8;
            } else {
                f5 = (float)l14 * f12 + f8;
                f6 = zzja2.zzj;
                f7 = zzja2.zzi;
                f5 = Math.min(f5, f7);
                zzja2.zzk = f8 = Math.max(f6, f5);
            }
        }
        return f8;
    }

    public final long zzb() {
        return this.zzh;
    }

    public final void zzc() {
        long l2 = this.zzh;
        long l3 = -9223372036854775807L;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object == false) {
            return;
        }
        long l7 = this.zzb;
        this.zzh = l2 += l7;
        l7 = this.zzg;
        long l8 = l7 - l3;
        Object object2 = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
        if (object2 != false && (object2 = l2 == l7 ? 0 : (l2 < l7 ? -1 : 1)) > 0) {
            this.zzh = l7;
        }
        this.zzl = l3;
    }

    public final void zzd(zzbk zzbk2) {
        long l2;
        long l3 = zzbk2.zzc;
        l3 = -9223372036854775807L;
        this.zzc = l2 = zzgd.zzr(l3);
        this.zzf = l2 = zzgd.zzr(l3);
        this.zzg = l3 = zzgd.zzr(l3);
        this.zzj = 0.97f;
        this.zzi = 1.03f;
        this.zzg();
    }

    public final void zze(long l2) {
        this.zzd = l2;
        this.zzg();
    }
}

