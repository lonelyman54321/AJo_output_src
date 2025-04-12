/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzeq;
import com.google.android.gms.internal.ads.zzfu;
import com.google.android.gms.internal.ads.zzgd;

public final class zzft {
    public byte[] zza;
    private int zzb;
    private int zzc;
    private int zzd;

    public zzft() {
        byte[] byArray = zzgd.zzf;
        this.zza = byArray;
    }

    public zzft(byte[] byArray, int n3) {
        this.zza = byArray;
        this.zzd = n3;
    }

    private final void zzp() {
        int n3;
        int n4 = this.zzb;
        boolean bl2 = false;
        if (n4 >= 0 && (n4 < (n3 = this.zzd) || n4 == n3 && (n4 = this.zzc) == 0)) {
            bl2 = true;
        }
        zzeq.zzf(bl2);
    }

    public final int zza() {
        int n3 = this.zzd;
        int n4 = this.zzb;
        n3 = (n3 - n4) * 8;
        n4 = this.zzc;
        return n3 - n4;
    }

    public final int zzb() {
        int n3 = this.zzc;
        n3 = n3 == 0 ? 1 : 0;
        zzeq.zzf(n3 != 0);
        return this.zzb;
    }

    public final int zzc() {
        int n3 = this.zzb * 8;
        int n4 = this.zzc;
        return n3 + n4;
    }

    public final int zzd(int n3) {
        int n4;
        int n7;
        int n8;
        int n10;
        int n14;
        if (n3 == 0) {
            return 0;
        }
        this.zzc = n14 = this.zzc + n3;
        n14 = 0;
        while ((n10 = this.zzc) > (n8 = 8)) {
            this.zzc = n10 += -8;
            byte[] byArray = this.zza;
            n7 = this.zzb;
            this.zzb = n4 = n7 + 1;
            n8 = byArray[n7] & 0xFF;
            n10 = n8 << n10;
            n14 |= n10;
        }
        byte[] byArray = this.zza;
        n4 = this.zzb;
        n7 = byArray[n4] & 0xFF;
        int n15 = 8 - n10;
        n14 |= (n7 >>= n15);
        n3 = 32 - n3;
        if (n10 == n8) {
            this.zzc = 0;
            this.zzb = ++n4;
        }
        n3 = -1 >>> n3 & n14;
        this.zzp();
        return n3;
    }

    public final void zze() {
        int n3 = this.zzc;
        if (n3 == 0) {
            return;
        }
        this.zzc = 0;
        this.zzb = n3 = this.zzb + 1;
        this.zzp();
    }

    public final void zzf(int n3, int n4) {
        byte[] byArray;
        n4 = this.zzc;
        int n7 = 8;
        n4 = 8 - n4;
        int n8 = 14;
        n4 = Math.min(n4, n8);
        int n10 = this.zzc;
        int n14 = 8 - n10 - n4;
        int n15 = 65280;
        n10 = n15 >> n10;
        byte[] byArray2 = this.zza;
        int n16 = this.zzb;
        int n17 = byArray2[n16];
        int n18 = 1;
        int n19 = (n18 << n14) + -1;
        byArray2[n16] = n10 = (int)((byte)((n10 | n19) & n17));
        n4 = 14 - n4;
        n17 = (n3 &= 0x3FFF) >>> n4;
        n14 = n17 << n14;
        byArray2[n16] = n10 = (int)((byte)(n10 | n14));
        n16 += n18;
        while (n4 > n7) {
            byArray = this.zza;
            n14 = n16 + 1;
            byArray[n16] = n15 = (int)((byte)(n3 >>> (n4 += -8)));
            n16 = n14;
        }
        n7 = 8 - n4;
        byArray = this.zza;
        n14 = byArray[n16];
        n15 = (n18 << n7) + -1;
        byArray[n16] = n14 = (int)((byte)(n14 & n15));
        n4 = (n18 << n4) + -1;
        byArray[n16] = n3 = (int)((byte)((n3 & n4) << n7 | n14));
        this.zzm(n8);
        this.zzp();
    }

    public final void zzg(byte[] byArray, int n3, int n4) {
        byte[] byArray2;
        int n7;
        int n8;
        int n10;
        int n14;
        int n15;
        int n16;
        int n17 = 0;
        while (true) {
            n16 = n4 >> 3;
            n15 = 255;
            n14 = 8;
            if (n17 >= n16) break;
            byte[] byArray3 = this.zza;
            n10 = this.zzb;
            this.zzb = n8 = n10 + 1;
            n10 = byArray3[n10];
            n7 = this.zzc;
            byArray[n17] = n10 = (int)((byte)(n10 << n7));
            n16 = byArray3[n8] & n15;
            byArray[n17] = n16 = (int)((byte)(n16 >> (n14 -= n7) | n10));
            ++n17;
        }
        if ((n4 &= 7) == 0) {
            return;
        }
        n17 = byArray[n16];
        n10 = n15 >> n4;
        byArray[n16] = n17 = (int)((byte)(n17 & n10));
        n10 = this.zzc;
        n8 = n10 + n4;
        if (n8 > n14) {
            int n18;
            byArray2 = this.zza;
            n7 = this.zzb;
            this.zzb = n18 = n7 + 1;
            n8 = (byArray2[n7] & n15) << n10;
            byArray[n16] = n17 = (int)((byte)(n17 | n8));
            n10 += -8;
        }
        this.zzc = n10 += n4;
        byArray2 = this.zza;
        n7 = this.zzb;
        n8 = byArray2[n7];
        n15 &= n8;
        n8 = 8 - n10;
        n4 = 8 - n4;
        byArray[n16] = n4 = (int)((byte)((byte)((n15 >>= n8) << n4) | n17));
        if (n10 == n14) {
            this.zzc = 0;
            this.zzb = ++n7;
        }
        this.zzp();
    }

    public final void zzh(byte[] byArray, int n3, int n4) {
        int n7;
        byte[] byArray2;
        n3 = this.zzc;
        if (n3 == 0) {
            n3 = 1;
        } else {
            n3 = 0;
            byArray2 = null;
        }
        zzeq.zzf(n3 != 0);
        byArray2 = this.zza;
        int n8 = this.zzb;
        System.arraycopy(byArray2, n8, byArray, 0, n4);
        this.zzb = n7 = this.zzb + n4;
        this.zzp();
    }

    public final void zzi(zzfu zzfu2) {
        byte[] byArray = zzfu2.zzM();
        int n3 = zzfu2.zze();
        this.zzj(byArray, n3);
        int n4 = zzfu2.zzd() * 8;
        this.zzk(n4);
    }

    public final void zzj(byte[] byArray, int n3) {
        this.zza = byArray;
        this.zzb = 0;
        this.zzc = 0;
        this.zzd = n3;
    }

    public final void zzk(int n3) {
        int n4;
        this.zzb = n4 = n3 / 8;
        this.zzc = n3 -= (n4 *= 8);
        this.zzp();
    }

    public final void zzl() {
        int n3;
        this.zzc = n3 = this.zzc + 1;
        int n4 = 8;
        if (n3 == n4) {
            this.zzc = 0;
            this.zzb = n3 = this.zzb + 1;
        }
        this.zzp();
    }

    public final void zzm(int n3) {
        int n4 = this.zzb;
        int n7 = n3 / 8;
        n4 += n7;
        this.zzb = n4++;
        int n8 = this.zzc;
        this.zzc = n3 = n3 - (n7 *= 8) + n8;
        n7 = 7;
        if (n3 > n7) {
            this.zzb = n4;
            this.zzc = n3 += -8;
        }
        this.zzp();
    }

    public final void zzn(int n3) {
        int n4 = this.zzc;
        n4 = n4 == 0 ? 1 : 0;
        zzeq.zzf(n4 != 0);
        this.zzb = n4 = this.zzb + n3;
        this.zzp();
    }

    public final boolean zzo() {
        byte[] byArray = this.zza;
        int n3 = this.zzb;
        int n4 = byArray[n3];
        int n7 = this.zzc;
        n3 = 128 >> n7;
        this.zzl();
        return (n4 &= n3) != 0;
    }
}

