/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.clearcut;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public final class zzk {
    private static int zza(byte[] byArray, int n3) {
        int n4 = byArray[n3] & 0xFF;
        int n7 = n3 + 1;
        n7 = (byArray[n7] & 0xFF) << 8;
        n4 |= n7;
        n7 = n3 + 2;
        n7 = (byArray[n7] & 0xFF) << 16;
        return (byArray[n3 += 3] & 0xFF) << 24 | (n4 |= n7);
    }

    private static long zza(long l2, long l3, long l4) {
        l2 = (l2 ^ l3) * l4;
        int n3 = 47;
        long l7 = l2 >>> n3;
        l2 = (l2 ^ l7 ^ l3) * l4;
        l3 = l2 >>> n3;
        return (l2 ^ l3) * l4;
    }

    public static long zza(byte[] byArray) {
        int n3;
        Object[] objectArray = byArray;
        int n4 = byArray.length;
        if (n4 >= 0 && n4 <= (n3 = byArray.length)) {
            long l2 = -4348849565147123417L;
            int n7 = 30;
            int n8 = 43;
            int n10 = 47;
            int n14 = 2;
            int n15 = 37;
            int n16 = 32;
            int n17 = 16;
            long l3 = -5435081209227447693L;
            int n18 = 8;
            long l4 = -7286425919675154353L;
            n3 = 0;
            Object var18_15 = null;
            if (n4 <= n16) {
                if (n4 <= n17) {
                    if (n4 >= n18) {
                        l2 = (long)(n4 << 1) + l4;
                        long l7 = zzk.zzb(byArray, 0) + l4;
                        long l8 = zzk.zzb(byArray, n4 -= n18);
                        long l12 = Long.rotateRight(l8, n15) * l2 + l7;
                        long l14 = (Long.rotateRight(l7, 25) + l8) * l2;
                        long l15 = l12;
                        long l16 = l14;
                        return zzk.zza(l12, l14, l2);
                    }
                    n7 = 4;
                    if (n4 >= n7) {
                        long l17 = (long)(n4 << 1) + l4;
                        long l18 = zzk.zza(byArray, 0);
                        long l19 = 0xFFFFFFFFL;
                        l18 &= l19;
                        long l20 = n4;
                        l18 = (l18 << 3) + l20;
                        long l21 = (long)zzk.zza(byArray, n4 -= n7) & l19;
                        l19 = l18;
                        return zzk.zza(l18, l21, l17);
                    }
                    if (n4 > 0) {
                        n3 = byArray[0];
                        n7 = n4 >> 1;
                        n7 = byArray[n7];
                        n8 = n4 + -1;
                        n8 = byArray[n8];
                        n3 &= 0xFF;
                        n7 = (n7 & 0xFF) << n18;
                        n3 += n7;
                        n7 = (n8 & 0xFF) << n14;
                        long l22 = (long)n3 * l4;
                        long l23 = (long)(n4 += n7) * l2;
                        long l24 = l22 ^ l23;
                        long l25 = l24 >>> n10;
                        return (l24 ^ l25) * l4;
                    }
                    return l4;
                }
                long l26 = (long)(n4 << 1) + l4;
                long l27 = zzk.zzb(byArray, 0) * l3;
                l2 = zzk.zzb(byArray, n18);
                n3 = n4 + -8;
                long l28 = zzk.zzb(byArray, n3) * l26;
                long l29 = zzk.zzb(byArray, n4 -= n17) * l4;
                long l30 = Long.rotateRight(l27 + l2, n8);
                long l31 = Long.rotateRight(l28, n7) + l30 + l29;
                long l34 = Long.rotateRight(l2 + l4, 18) + l27 + l28;
                return zzk.zza(l31, l34, l26);
            }
            n16 = 64;
            if (n4 <= n16) {
                long l35 = (long)(n4 << 1) + l4;
                long l36 = zzk.zzb(byArray, 0) * l4;
                l2 = zzk.zzb(byArray, n18);
                n3 = n4 + -8;
                long l37 = zzk.zzb(byArray, n3) * l35;
                n3 = n4 + -16;
                l3 = zzk.zzb(byArray, n3) * l4;
                long l38 = Long.rotateRight(l36 + l2, n8);
                long l39 = Long.rotateRight(l37, n7) + l38 + l3;
                l38 = Long.rotateRight(l2 + l4, 18) + l36;
                l37 += l38;
                l2 = l39;
                l3 = l35;
                l38 = zzk.zza(l39, l37, l35);
                byte[] byArray2 = byArray;
                l2 = zzk.zzb(byArray, 16) * l35;
                n3 = 24;
                l37 = zzk.zzb(byArray, n3);
                int n19 = n4 + -32;
                l3 = zzk.zzb(byArray, n19);
                l3 = (l39 + l3) * l35;
                long l41 = zzk.zzb(byArray, n4 -= n3);
                l38 = (l38 + l41) * l35;
                l41 = Long.rotateRight(l2 + l37, n8);
                l41 = Long.rotateRight(l3, n7) + l41 + l38;
                long l42 = Long.rotateRight(l37 + l36, 18) + l2 + l3;
                long l43 = l41;
                long l44 = l35;
                return zzk.zza(l41, l42, l35);
            }
            byte[] byArray3 = byArray;
            objectArray = new long[n14];
            long[] lArray = new long[n14];
            long l45 = zzk.zzb(byArray, 0) + 95310865018149119L;
            int n20 = 1;
            n7 = (n4 += -1) / 64;
            n17 = n7 << 6;
            n14 = n4 & 0x3F;
            int n21 = n17 + n14;
            int n22 = n21 + -63;
            long l46 = 2480279821605975764L;
            long l47 = 1390051526045402406L;
            int n24 = 0;
            while (true) {
                l45 += l46;
                byte by2 = objectArray[0];
                l45 += by2;
                n4 = n24 + 8;
                by2 = (byte)zzk.zzb(byArray3, n4);
                int n25 = n17;
                long l48 = Long.rotateRight(l45 + by2, n15) * l3;
                l45 = objectArray[n20];
                l46 += l45;
                n4 = n24 + 48;
                l45 = zzk.zzb(byArray3, n4);
                l46 = Long.rotateRight(l46 + l45, 42) * l3;
                l45 = lArray[n20];
                l45 = l48 ^ l45;
                l48 = objectArray[0];
                n4 = n24 + 40;
                long l49 = zzk.zzb(byArray3, n4);
                l48 += l49;
                l49 = l48 + l46;
                l46 = lArray[0];
                l46 = l47 + l46;
                n17 = 33;
                l47 = Long.rotateRight(l46, n17) * l3;
                l46 = objectArray[n20] * l3;
                long l50 = lArray[0];
                l50 = l45 + l50;
                n16 = 42;
                byte[] byArray4 = byArray;
                n3 = n24;
                int n26 = 42;
                long l51 = l50;
                n10 = n25;
                zzk.zza(byArray, n24, l46, l50, objectArray);
                n3 = n24 + 32;
                l46 = lArray[n20];
                l46 = l47 + l46;
                n4 = n24 + 16;
                l51 = zzk.zzb(byArray3, n4);
                l51 = l49 + l51;
                zzk.zza(byArray, n3, l46, l51, lArray);
                n4 = n24 + 64;
                if (n4 == n25) {
                    long l52 = (l45 & 0xFFL) << n20;
                    l3 += l52;
                    l52 = lArray[0];
                    l46 = n14;
                    lArray[0] = l52 += l46;
                    l46 = objectArray[0] + l52;
                    objectArray[0] = (byte)l46;
                    lArray[0] = l52 = lArray[0] + l46;
                    l47 += l49;
                    l52 = objectArray[0];
                    l47 += l52;
                    n4 = n21 + -55;
                    l52 = zzk.zzb(byArray3, n4);
                    l52 = Long.rotateRight(l47 + l52, n15) * l3;
                    l46 = objectArray[n20];
                    l49 += l46;
                    n7 = n21 + -15;
                    l46 = zzk.zzb(byArray3, n7);
                    l46 = Long.rotateRight(l49 + l46, n26) * l3;
                    l51 = lArray[n20] * (long)9;
                    l2 = l52 ^ l51;
                    l52 = objectArray[0] * (long)9;
                    n14 = n21 + -23;
                    l51 = zzk.zzb(byArray3, n14);
                    long l54 = l52 + l51 + l46;
                    l52 = lArray[0];
                    l45 = Long.rotateRight(l45 + l52, 33) * l3;
                    l46 = objectArray[n20] * l3;
                    l52 = lArray[0];
                    l51 = l2 + l52;
                    n3 = n22;
                    zzk.zza(byArray, n22, l46, l51, objectArray);
                    n3 = n21 + -31;
                    l46 = lArray[n20];
                    l46 = l45 + l46;
                    n14 = n21 + -47;
                    l51 = zzk.zzb(byArray3, n14) + l54;
                    zzk.zza(byArray, n3, l46, l51, lArray);
                    byte by4 = objectArray[0];
                    long l55 = lArray[0];
                    l52 = zzk.zza(by4, l55, l3);
                    l52 = (l54 >>> 47 ^ l54) * -4348849565147123417L + l52 + l2;
                    by4 = objectArray[n20];
                    l55 = lArray[n20];
                    l55 = zzk.zza(by4, l55, l3) + l45;
                    by4 = (byte)l52;
                    return zzk.zza(l52, l55, l3);
                }
                n24 = n4;
                n17 = n25;
                l46 = l49;
                n3 = 0;
                var18_15 = null;
                n16 = 64;
                l2 = -4348849565147123417L;
                n10 = 47;
                long l56 = l45;
                l45 = l47;
                l47 = l56;
            }
        }
        String string2 = tk3_2.a(67, n4, "Out of bound index with offput: 0 and length: ");
        IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException(string2);
        throw indexOutOfBoundsException;
    }

    private static void zza(byte[] byArray, int n3, long l2, long l3, long[] lArray) {
        long l4 = zzk.zzb(byArray, n3);
        int n4 = n3 + 8;
        long l7 = zzk.zzb(byArray, n4);
        int n7 = n3 + 16;
        long l8 = zzk.zzb(byArray, n7);
        long l12 = zzk.zzb(byArray, n3 += 24);
        l3 = Long.rotateRight(l3 + (l2 += l4) + l12, 21);
        l7 = l7 + l2 + l8;
        l4 = Long.rotateRight(l7, 44) + l3;
        lArray[0] = l7 += l12;
        lArray[1] = l4 += l2;
    }

    private static long zzb(byte[] object, int n3) {
        object = ByteBuffer.wrap((byte[])object, n3, 8);
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        ((ByteBuffer)object).order(byteOrder);
        return ((ByteBuffer)object).getLong();
    }
}

