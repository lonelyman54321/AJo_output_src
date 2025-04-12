/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfu;

public final class zzapq {
    public static int zza(byte[] byArray, int n3, int n4) {
        byte by2;
        byte by4;
        while (n3 < n4 && (by4 = byArray[n3]) != (by2 = 71)) {
            ++n3;
        }
        return n3;
    }

    public static long zzb(zzfu zzfu2, int n3, int n4) {
        zzfu2.zzK(n3);
        n3 = zzfu2.zzb();
        int n7 = 5;
        if (n3 >= n7 && (n7 = 0x800000 & (n3 = zzfu2.zzg())) == 0 && (n7 = n3 >> 8 & 0x1FFF) == n4 && (n3 &= 0x20) != 0 && (n3 = zzfu2.zzm()) >= (n4 = 7) && (n3 = zzfu2.zzb()) >= n4) {
            n3 = zzfu2.zzm();
            n7 = 16;
            if ((n3 &= n7) == n7) {
                n3 = 6;
                byte[] byArray = new byte[n3];
                zzfu2.zzG(byArray, 0, n3);
                long l2 = byArray[0];
                long l3 = byArray[1];
                long l4 = byArray[2];
                long l7 = byArray[3];
                long l8 = byArray[4];
                long l12 = 255L;
                l8 = (l8 & l12) >> n4;
                l2 &= l12;
                long l14 = l3 & l12;
                long l15 = l4 & l12;
                long l16 = l7 & l12;
                l2 <<= 25;
                l2 |= (l14 <<= 17);
                l14 = l15 << 9;
                l16 += l16;
                return (l2 |= l14) | l16 | l8;
            }
        }
        return -9223372036854775807L;
    }
}

