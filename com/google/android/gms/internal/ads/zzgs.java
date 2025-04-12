/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzeq;

public final class zzgs {
    private byte[] zza;
    private int zzb;
    private int zzc;
    private int zzd;

    public zzgs(byte[] byArray, int n3, int n4) {
        this.zza = byArray;
        this.zzc = n3;
        this.zzb = n4;
        this.zzd = 0;
        this.zzh();
    }

    private final int zzg() {
        int n3;
        int n4 = 0;
        int n7 = 0;
        while ((n3 = this.zzf()) == 0) {
            ++n7;
        }
        n3 = 1 << n7;
        if (n7 > 0) {
            n4 = this.zza(n7);
        }
        return n3 + -1 + n4;
    }

    private final void zzh() {
        int n3;
        int n4 = this.zzc;
        boolean bl2 = false;
        if (n4 >= 0 && (n4 < (n3 = this.zzb) || n4 == n3 && (n4 = this.zzd) == 0)) {
            bl2 = true;
        }
        zzeq.zzf(bl2);
    }

    private final boolean zzi(int n3) {
        int n4;
        byte[] byArray;
        int n7;
        int n8 = 2;
        if (n3 >= n8 && n3 < (n8 = this.zzb) && (n7 = (byArray = this.zza)[n3]) == (n4 = 3)) {
            n7 = n3 + -2;
            if ((n7 = byArray[n7]) == 0) {
                n3 += -1;
                if ((n3 = byArray[n3]) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int zza(int n3) {
        int n4;
        int n7;
        int n8;
        int n10;
        int n14;
        int n15;
        this.zzd = n15 = this.zzd + n3;
        n15 = 0;
        int n16 = 0;
        while (true) {
            n14 = this.zzd;
            n10 = 2;
            n8 = 8;
            n7 = 1;
            if (n14 <= n8) break;
            this.zzd = n14 += -8;
            byte[] byArray = this.zza;
            n4 = this.zzc;
            n8 = byArray[n4] & 0xFF;
            n14 = n8 << n14;
            n16 |= n14;
            n14 = n4 + 1;
            if (n7 != (n14 = (int)(this.zzi(n14) ? 1 : 0))) {
                n10 = 1;
            }
            this.zzc = n4 += n10;
        }
        byte[] byArray = this.zza;
        int n17 = this.zzc;
        n4 = byArray[n17] & 0xFF;
        int n18 = 8 - n14;
        n16 |= (n4 >>= n18);
        n3 = 32 - n3;
        if (n14 == n8) {
            this.zzd = 0;
            n15 = n17 + 1;
            if (n7 != (n15 = (int)(this.zzi(n15) ? 1 : 0))) {
                n10 = 1;
            }
            this.zzc = n17 += n10;
        }
        n3 = -1 >>> n3 & n16;
        this.zzh();
        return n3;
    }

    public final int zzb() {
        int n3 = this.zzg();
        int n4 = n3 % 2;
        int n7 = 1;
        n3 += n7;
        if (n4 == 0) {
            n7 = -1;
        }
        return n3 / 2 * n7;
    }

    public final int zzc() {
        return this.zzg();
    }

    public final void zzd() {
        int n3 = this.zzd;
        int n4 = 1;
        this.zzd = n3 += n4;
        int n7 = 8;
        if (n3 == n7) {
            this.zzd = 0;
            n3 = this.zzc;
            n7 = n3 + 1;
            if (n4 == (n7 = (int)(this.zzi(n7) ? 1 : 0))) {
                n4 = 2;
            }
            this.zzc = n3 += n4;
        }
        this.zzh();
    }

    public final void zze(int n3) {
        int n4 = this.zzc;
        int n7 = n3 / 8;
        int n8 = n4 + n7;
        this.zzc = n8++;
        int n10 = this.zzd;
        this.zzd = n3 = n3 - (n7 *= 8) + n10;
        n7 = 7;
        if (n3 > n7) {
            this.zzc = n8;
            this.zzd = n3 += -8;
        }
        while (++n4 <= (n3 = this.zzc)) {
            n3 = (int)(this.zzi(n4) ? 1 : 0);
            if (n3 == 0) continue;
            this.zzc = n3 = this.zzc + 1;
            n4 += 2;
        }
        this.zzh();
    }

    public final boolean zzf() {
        byte[] byArray = this.zza;
        int n3 = this.zzc;
        int n4 = byArray[n3];
        int n7 = this.zzd;
        n3 = 128 >> n7;
        this.zzd();
        return (n4 &= n3) != 0;
    }
}

