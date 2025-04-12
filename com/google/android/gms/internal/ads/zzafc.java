/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzeq;

public final class zzafc {
    private final byte[] zza;
    private final int zzb;
    private int zzc;
    private int zzd;

    public zzafc(byte[] byArray) {
        int n3;
        this.zza = byArray;
        this.zzb = n3 = byArray.length;
    }

    public final int zza() {
        int n3 = this.zzc * 8;
        int n4 = this.zzd;
        return n3 + n4;
    }

    public final int zzb(int n3) {
        int n4 = this.zzc;
        int n7 = this.zzd;
        n7 = 8 - n7;
        int n8 = n4 + 1;
        byte[] byArray = this.zza;
        n4 = byArray[n4];
        int n10 = 255;
        n4 &= n10;
        int n14 = this.zzd;
        n4 >>= n14;
        n14 = 8 - n7;
        n14 = n10 >> n14;
        n4 &= n14;
        for (n7 = Math.min(n3, n7); n7 < n3; n7 += 8) {
            byte[] byArray2 = this.zza;
            int n15 = n8 + 1;
            n8 = (byArray2[n8] & n10) << n7;
            n4 |= n8;
            n8 = n15;
        }
        n7 = 32 - n3;
        n7 = -1 >>> n7;
        this.zzc(n3);
        return n4 &= n7;
    }

    public final void zzc(int n3) {
        int n4 = this.zzc;
        int n7 = n3 / 8;
        n4 += n7;
        this.zzc = n4++;
        int n8 = this.zzd;
        this.zzd = n3 = n3 - (n7 *= 8) + n8;
        n7 = 7;
        if (n3 > n7) {
            this.zzc = n4;
            this.zzd = n3 += -8;
        }
        n7 = 0;
        if (n4 >= 0 && (n4 < (n8 = this.zzb) || n4 == n8 && n3 == 0)) {
            n7 = 1;
        }
        zzeq.zzf(n7 != 0);
    }

    public final boolean zzd() {
        byte[] byArray = this.zza;
        int n3 = this.zzc;
        int n4 = byArray[n3] & 0xFF;
        n3 = this.zzd;
        n4 >>= n3;
        n3 = 1;
        this.zzc(n3);
        if (n3 != (n4 &= n3)) {
            return false;
        }
        return n3 != 0;
    }
}

