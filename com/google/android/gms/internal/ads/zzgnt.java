/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class zzgnt {
    public static byte[] zza(byte[] byArray, byte[] byArray2) {
        long l2;
        int n3;
        long l3;
        long l4;
        long l7;
        byte[] byArray3 = byArray;
        byte[] byArray4 = byArray2;
        long l8 = zzgnt.zzb(byArray, 0, 0);
        int n4 = 3;
        int n7 = 2;
        long l12 = zzgnt.zzb(byArray, n4, n7);
        long l14 = 0x3FFFF03L;
        l12 &= l14;
        int n8 = 6;
        long l15 = zzgnt.zzb(byArray, n8, 4);
        long l16 = 67092735L;
        l15 &= l16;
        long l17 = zzgnt.zzb(byArray, 9, n8);
        long l18 = 0x3F03FFFL;
        l17 &= l18;
        int n10 = 12;
        long l19 = zzgnt.zzb(byArray, n10, 8);
        long l20 = 1048575L;
        l19 &= l20;
        n8 = 17;
        byte[] byArray5 = new byte[n8];
        long l21 = l7 = 0L;
        long l22 = l7;
        long l23 = l7;
        long l24 = l7;
        int n14 = 0;
        while (true) {
            byte by2;
            n4 = byArray4.length;
            n7 = 16;
            l4 = 5;
            l3 = 0x3FFFFFFL;
            n3 = 26;
            if (n14 >= n4) break;
            n4 -= n14;
            n4 = Math.min(n7, n4);
            System.arraycopy(byArray4, n14, byArray5, 0, n4);
            byArray5[n4] = by2 = 1;
            if (n4 != n7) {
                Arrays.fill(byArray5, ++n4, n8, (byte)0);
            }
            long l25 = l19 * l4;
            long l26 = l17 * l4;
            long l27 = l15 * l4;
            long l28 = l12 * l4;
            long l29 = zzgnt.zzb(byArray5, 0, 0);
            l24 += l29;
            l29 = zzgnt.zzb(byArray5, 3, 2);
            l21 += l29;
            n4 = 6;
            long l30 = zzgnt.zzb(byArray5, n4, 4);
            l7 += l30;
            l30 = zzgnt.zzb(byArray5, 9, n4);
            l22 += l30;
            l30 = zzgnt.zzb(byArray5, 12, 8);
            n4 = byArray5[n7] << 24;
            l2 = n4;
            l2 = l30 | l2;
            l23 += l2;
            l2 = l24 * l8;
            l30 = l24 * l12;
            long l31 = l21 * l8;
            long l34 = l24 * l15;
            long l35 = l21 * l12;
            long l36 = l7 * l8;
            long l37 = l24 * l17;
            long l38 = l21 * l15;
            long l39 = l7 * l12;
            long l41 = l22 * l8;
            l24 *= l19;
            long l42 = l21 * l17;
            long l43 = l7 * l15;
            long l44 = l22 * l12;
            long l45 = l23 * l8;
            l21 = l21 * l25 + l2;
            l2 = l7 * l26 + l21;
            l21 = l22 * l27 + l2;
            l28 = l28 * l23 + l21;
            l2 = l28 >> n3;
            l21 = l28 & l3;
            l7 = l7 * l25 + (l30 += l31);
            l28 = l22 * l26 + l7;
            l27 = l27 * l23 + l28 + l2;
            l2 = l27 >> n3;
            l7 = l27 & l3;
            l34 = l34 + l35 + l36;
            l22 = l22 * l25 + l34;
            l26 = l26 * l23 + l22 + l2;
            l2 = l26 >> n3;
            l22 = l26 & l3;
            l37 = l37 + l38 + l39 + l41;
            l23 = l23 * l25 + l37 + l2;
            l2 = l23 >> n3;
            l23 &= l3;
            l24 = l24 + l42 + l43 + l44 + l45 + l2;
            l2 = l24 >> n3;
            l24 &= l3;
            l2 = l2 * l4 + l21;
            l21 = l2 >> n3;
            l2 &= l3;
            l21 = l7 + l21;
            n14 += 16;
            l7 = l22;
            l22 = l23;
            l23 = l24;
            n8 = 17;
            l24 = l2;
            n7 = 2;
        }
        l8 = l21 >> n3;
        l12 = l21 & l3;
        l7 += l8;
        l8 = l7 >> n3;
        l14 = l7 & l3;
        l22 += l8;
        l8 = l22 >> n3;
        l15 = l22 & l3;
        l23 += l8;
        l8 = l23 >> n3;
        l16 = l23 & l3;
        l8 = l8 * l4 + l24;
        long l46 = l8 >> n3;
        l4 = (l8 &= l3) + l4;
        l19 = l4 >> n3;
        l7 = l4 & l3;
        l19 = (l12 += l46) + l19;
        l46 = l19 >> n3;
        l19 &= l3;
        l21 = (l46 += l14) >> n3;
        l46 &= l3;
        l21 = l15 + l21;
        l22 = l21 >> n3;
        l21 &= l3;
        l22 = l16 + l22 + 0xFC000000L;
        l23 = l8;
        long l47 = l22 >> 63;
        l12 &= l47;
        l2 = l47 ^ (long)-1;
        l19 = (l12 |= (l19 &= l2)) << n3;
        l12 >>= 6;
        l14 &= l47;
        l46 = (l14 |= (l46 &= l2)) >> 12;
        l15 &= l47;
        l16 &= l47;
        l21 = l22 & l2;
        l16 |= l21;
        l21 = (l15 |= (l21 &= l2)) >> 18;
        l16 <<= 8;
        l47 = l8 & l47;
        long l48 = l7 & l2;
        l47 = l47 | l48 | l19;
        l48 = 0xFFFFFFFFL;
        l47 &= l48;
        long l49 = zzgnt.zzc(byArray3, 16);
        l47 += l49;
        n7 = 20;
        l12 = (l12 | (l14 <<= n7)) & l48;
        l14 = zzgnt.zzc(byArray3, n7);
        l12 += l14;
        l14 = (l15 << 14 | l46) & l48;
        l15 = zzgnt.zzc(byArray3, 24);
        l14 += l15;
        l15 = (l21 | l16) & l48;
        l16 = zzgnt.zzc(byArray3, 28);
        l15 += l16;
        byArray3 = new byte[16];
        l16 = l47 & l48;
        zzgnt.zzd(byArray3, l16, 0);
        int n15 = 32;
        l47 = (l12 += (l47 >>= n15)) & l48;
        zzgnt.zzd(byArray3, l47, 4);
        l47 = l12 >> n15;
        l14 += l47;
        l47 = l14 & l48;
        zzgnt.zzd(byArray3, l47, 8);
        long l50 = l14 >> n15;
        l50 = l15 + l50 & l48;
        zzgnt.zzd(byArray3, l50, 12);
        return byArray3;
    }

    private static long zzb(byte[] byArray, int n3, int n4) {
        return zzgnt.zzc(byArray, n3) >> n4 & 0x3FFFFFFL;
    }

    private static long zzc(byte[] byArray, int n3) {
        int n4 = byArray[n3] & 0xFF;
        int n7 = n3 + 1;
        n7 = byArray[n7] & 0xFF;
        int n8 = n3 + 2;
        n8 = byArray[n8] & 0xFF;
        int n10 = byArray[n3 += 3] & 0xFF;
        n3 = n7 << 8 | n4;
        n4 = n8 << 16;
        return (long)(n10 << 24 | (n3 |= n4)) & 0xFFFFFFFFL;
    }

    private static void zzd(byte[] byArray, long l2, int n3) {
        int n4;
        for (int i3 = 0; i3 < (n4 = 4); ++i3) {
            byte by2;
            n4 = n3 + i3;
            long l3 = 0xFFL & l2;
            int n7 = (int)l3;
            byArray[n4] = by2 = (byte)n7;
            n4 = 8;
            l2 >>= n4;
        }
    }
}

