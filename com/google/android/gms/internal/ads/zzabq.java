/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.SystemClock
 *  android.view.Surface
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.SystemClock;
import android.view.Surface;
import com.google.android.gms.internal.ads.zzabj;
import com.google.android.gms.internal.ads.zzabo;
import com.google.android.gms.internal.ads.zzabp;
import com.google.android.gms.internal.ads.zzabu;
import com.google.android.gms.internal.ads.zzer;
import com.google.android.gms.internal.ads.zzgd;

public final class zzabq {
    private final zzabp zza;
    private final zzabu zzb;
    private boolean zzc;
    private int zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private long zzh;
    private boolean zzi;
    private float zzj;
    private zzer zzk;

    public zzabq(Context object, zzabp object2, long l2) {
        long l3;
        this.zza = object2;
        this.zzb = object2 = new zzabu((Context)object);
        this.zzd = 0;
        this.zze = l3 = -9223372036854775807L;
        this.zzg = l3;
        this.zzh = l3;
        this.zzj = 1.0f;
        object = zzer.zza;
        this.zzk = object;
    }

    private final void zzq(int n3) {
        this.zzd = n3 = Math.min(this.zzd, n3);
    }

    public final int zza(long l2, long l3, long l4, long l7, boolean bl2, zzabo zzabo2) {
        long l8;
        Object object;
        long l12;
        int n3;
        boolean bl3;
        int n4;
        long l14;
        long l15;
        long l16;
        zzabo zzabo3;
        long l17;
        zzabq zzabq2;
        block13: {
            block15: {
                block14: {
                    block16: {
                        block17: {
                            int n7;
                            long l18;
                            zzabq2 = this;
                            long l19 = l2;
                            l17 = l3;
                            zzabo3 = zzabo2;
                            zzabo.zzg(zzabo2);
                            l16 = this.zze;
                            l15 = -9223372036854775807L;
                            long l20 = l16 == l15 ? 0 : (l16 < l15 ? -1 : 1);
                            if (l20 == false) {
                                this.zze = l3;
                            }
                            if ((l20 = (l18 = (l16 = zzabq2.zzg) - l19) == 0L ? 0 : (l18 < 0L ? -1 : 1)) != false) {
                                zzabu zzabu2 = zzabq2.zzb;
                                zzabu2.zzd(l19);
                                zzabq2.zzg = l19;
                            }
                            float f5 = zzabq2.zzj;
                            double d2 = f5;
                            l20 = (long)zzabq2.zzc;
                            double d5 = (double)(l19 -= l17) / d2;
                            l19 = (long)d5;
                            if (l20 != false) {
                                l16 = zzgd.zzr(SystemClock.elapsedRealtime()) - l4;
                                l19 -= l16;
                            }
                            zzabo.zze(zzabo3, l19);
                            l19 = zzabo.zza(zzabo2);
                            l16 = zzabq2.zzh;
                            l14 = -30000L;
                            n4 = 3;
                            int n8 = 2;
                            bl3 = false;
                            n3 = 1;
                            long l21 = l16 == l15 ? 0 : (l16 < l15 ? -1 : 1);
                            if (l21 != false && (n7 = zzabq2.zzi) == 0) break block13;
                            n7 = zzabq2.zzd;
                            if (n7 == 0) break block14;
                            if (n7 == n3) break block15;
                            if (n7 == n8) break block16;
                            if (n7 != n4) break block17;
                            l16 = zzgd.zzr(SystemClock.elapsedRealtime());
                            l12 = zzabq2.zzf;
                            l16 -= l12;
                            n4 = (int)(zzabq2.zzc ? 1 : 0);
                            if (n4 == 0 || (n4 = (int)(l19 == l14 ? 0 : (l19 < l14 ? -1 : 1))) >= 0) break block13;
                            l19 = 100000L;
                            d5 = 4.94066E-319;
                            n4 = (int)(l16 == l19 ? 0 : (l16 < l19 ? -1 : 1));
                            if (n4 <= 0) break block13;
                            break block15;
                        }
                        IllegalStateException illegalStateException = new IllegalStateException();
                        throw illegalStateException;
                    }
                    object = l17 == l7 ? 0 : (l17 < l7 ? -1 : 1);
                    if (object < 0) break block13;
                    break block15;
                }
                object = zzabq2.zzc;
                if (object == 0) break block13;
            }
            return 0;
        }
        object = zzabq2.zzc;
        int n10 = 5;
        if (object != 0 && (object = (Object)((l8 = l17 - (l16 = zzabq2.zze)) == 0L ? 0 : (l8 < 0L ? -1 : 1))) != 0) {
            long l22;
            Object object2 = zzabq2.zzb;
            l16 = System.nanoTime();
            l12 = zzabo.zza(zzabo2);
            long l23 = 1000L;
            l12 = l12 * l23 + l16;
            l12 = ((zzabu)object2).zza(l12);
            zzabo.zzf(zzabo3, l12);
            l12 = (zzabo.zzb(zzabo2) - l16) / l23;
            zzabo.zze(zzabo3, l12);
            l16 = zzabq2.zzh;
            object = l16 == l15 ? 0 : (l16 < l15 ? -1 : 1);
            if (object != 0 && (object = (Object)zzabq2.zzi) == 0) {
                bl3 = true;
            }
            object2 = zzabq2.zza;
            l16 = zzabo.zza(zzabo2);
            long l24 = l16 - (l15 = 4294467296L);
            n4 = (int)(l24 == 0L ? 0 : (l24 < 0L ? -1 : 1));
            if (n4 < 0 && !bl2 && (object = (Object)((zzabj)(object2 = (zzabj)object2)).zzaP(l17, bl3)) != 0) {
                return 4;
            }
            l17 = zzabo.zza(zzabo2);
            long l25 = l17 - l14;
            object = l25 == 0L ? 0 : (l25 < 0L ? -1 : 1);
            if (object < 0 && !bl2) {
                if (bl3) {
                    return 3;
                }
                return 2;
            }
            l17 = zzabo.zza(zzabo2);
            long l26 = l17 - (l22 = 50000L);
            object = l26 == 0L ? 0 : (l26 < 0L ? -1 : 1);
            if (object > 0) {
                return n10;
            }
            return n3;
        }
        return n10;
    }

    public final void zzb() {
        int n3 = this.zzd;
        if (n3 == 0) {
            this.zzd = n3 = 1;
        }
    }

    public final void zzc(boolean bl2) {
        this.zzi = bl2;
        this.zzh = -9223372036854775807L;
    }

    public final void zzd() {
        this.zzq(0);
    }

    public final void zze(boolean bl2) {
        this.zzd = (int)(bl2 ? 1 : 0);
    }

    public final void zzf() {
        this.zzq(2);
    }

    public final void zzg() {
        long l2;
        this.zzc = true;
        this.zzf = l2 = zzgd.zzr(SystemClock.elapsedRealtime());
        this.zzb.zzg();
    }

    public final void zzh() {
        this.zzc = false;
        this.zzh = -9223372036854775807L;
        this.zzb.zzh();
    }

    public final void zzi() {
        long l2;
        this.zzb.zzf();
        this.zzg = l2 = -9223372036854775807L;
        this.zze = l2;
        this.zzq(1);
        this.zzh = l2;
    }

    public final void zzj(int n3) {
        this.zzb.zzj(n3);
    }

    public final void zzk(zzer zzer2) {
        this.zzk = zzer2;
    }

    public final void zzl(float f5) {
        this.zzb.zzc(f5);
    }

    public final void zzm(Surface surface) {
        this.zzb.zzi(surface);
        this.zzq(1);
    }

    public final void zzn(float f5) {
        this.zzj = f5;
        this.zzb.zze(f5);
    }

    public final boolean zzo(boolean n3) {
        block3: {
            boolean bl2;
            block4: {
                long l2;
                block2: {
                    long l3;
                    int n4;
                    l2 = -9223372036854775807L;
                    bl2 = true;
                    if (n3 != 0 && (n3 = this.zzd) == (n4 = 3)) break block2;
                    long l4 = this.zzh;
                    n3 = 0;
                    Object object = l4 == l2 ? 0 : (l4 < l2 ? -1 : 1);
                    if (object == false) break block3;
                    l4 = SystemClock.elapsedRealtime();
                    long l7 = l4 - (l3 = this.zzh);
                    Object object2 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
                    if (object2 < 0) break block4;
                    bl2 = false;
                }
                this.zzh = l2;
            }
            return bl2;
        }
        return false;
    }

    public final boolean zzp() {
        long l2;
        int n3;
        int n4 = this.zzd;
        this.zzd = n3 = 3;
        this.zzf = l2 = zzgd.zzr(SystemClock.elapsedRealtime());
        return n4 != n3;
    }
}

