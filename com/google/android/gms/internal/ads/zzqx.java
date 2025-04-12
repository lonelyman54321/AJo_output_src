/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.AudioTrack
 */
package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import com.google.android.gms.internal.ads.zzqw;

final class zzqx {
    private final zzqw zza;
    private int zzb;
    private long zzc;
    private long zzd;
    private long zze;
    private long zzf;

    public zzqx(AudioTrack audioTrack) {
        zzqw zzqw2;
        this.zza = zzqw2 = new zzqw(audioTrack);
        this.zzh(0);
    }

    /*
     * Enabled aggressive block sorting
     */
    private final void zzh(int n3) {
        this.zzb = n3;
        long l2 = 10000L;
        if (n3 != 0) {
            int n4 = 1;
            if (n3 == n4) {
                this.zzd = l2;
                return;
            }
            int n7 = 2;
            l2 = n3 != n7 && n3 != (n7 = 3) ? 500000L : 10000000L;
        } else {
            this.zze = 0L;
            this.zzf = -1;
            long l3 = System.nanoTime();
            long l4 = 1000L;
            this.zzc = l3 /= l4;
        }
        this.zzd = l2;
    }

    public final long zza() {
        return this.zza.zza();
    }

    public final long zzb() {
        return this.zza.zzb();
    }

    public final void zzc() {
        int n3 = this.zzb;
        int n4 = 4;
        if (n3 == n4) {
            n3 = 0;
            this.zzh(0);
        }
    }

    public final void zzd() {
        this.zzh(4);
    }

    public final void zze() {
        this.zzh(0);
    }

    public final boolean zzf() {
        int n3 = this.zzb;
        int n4 = 2;
        return n3 == n4;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final boolean zzg(long l2) {
        long l3 = this.zze;
        l3 = l2 - l3;
        long l4 = this.zzd;
        boolean bl2 = false;
        Object object = l3 == l4 ? 0 : (l3 < l4 ? -1 : 1);
        if (object < 0) {
            return false;
        }
        this.zze = l2;
        zzqw zzqw2 = this.zza;
        boolean bl3 = zzqw2.zzc();
        boolean bl4 = this.zzb;
        boolean bl5 = 3 != 0;
        boolean bl6 = true;
        if (bl4) {
            long l7;
            boolean bl7 = 2 != 0;
            if (bl4 != bl6) {
                if (bl4 != bl7) {
                    if (bl4 != bl5) {
                        return bl3;
                    }
                    if (!bl3) {
                        return bl2;
                    }
                    this.zzh(0);
                    return bl6;
                }
                if (bl3) return true;
                this.zzh(0);
                return false;
            }
            if (!bl3) {
                this.zzh(0);
                return bl2;
            }
            zzqw zzqw3 = this.zza;
            l3 = zzqw3.zza();
            long l8 = l3 - (l7 = this.zzf);
            Object object2 = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
            if (object2 <= 0) return true;
            this.zzh((int)(bl7 ? 1 : 0));
            return bl6;
        }
        if (bl3) {
            zzqw zzqw4 = this.zza;
            l2 = zzqw4.zzb();
            long l12 = l2 - (l3 = this.zzc);
            Object object3 = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
            if (object3 < 0) {
                return bl2;
            }
            this.zzf = l2 = this.zza.zza();
            this.zzh((int)(bl6 ? 1 : 0));
            return bl6;
        }
        l3 = this.zzc;
        long l14 = (l2 -= l3) - (l3 = 500000L);
        bl6 = (boolean)(l14 == 0L ? 0 : (l14 < 0L ? -1 : 1));
        if (bl6 <= false) {
            return bl2;
        }
        this.zzh((int)(bl5 ? 1 : 0));
        return false;
    }
}

