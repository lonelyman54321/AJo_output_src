/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.hash;

import com.google.common.base.Preconditions;
import com.google.common.hash.AbstractNonStreamingHashFunction;
import com.google.common.hash.HashCode;
import com.google.common.hash.HashFunction;
import com.google.common.hash.LittleEndianByteArray;

final class FarmHashFingerprint64
extends AbstractNonStreamingHashFunction {
    static final HashFunction FARMHASH_FINGERPRINT_64;
    private static final long K0 = -4348849565147123417L;
    private static final long K1 = -5435081209227447693L;
    private static final long K2 = -7286425919675154353L;

    static {
        FarmHashFingerprint64 farmHashFingerprint64 = new FarmHashFingerprint64();
        FARMHASH_FINGERPRINT_64 = farmHashFingerprint64;
    }

    public static long fingerprint(byte[] byArray, int n3, int n4) {
        int n7 = 32;
        if (n4 <= n7) {
            n7 = 16;
            if (n4 <= n7) {
                return FarmHashFingerprint64.hashLength0to16(byArray, n3, n4);
            }
            return FarmHashFingerprint64.hashLength17to32(byArray, n3, n4);
        }
        n7 = 64;
        if (n4 <= n7) {
            return FarmHashFingerprint64.hashLength33To64(byArray, n3, n4);
        }
        return FarmHashFingerprint64.hashLength65Plus(byArray, n3, n4);
    }

    private static long hashLength0to16(byte[] byArray, int n3, int n4) {
        long l2 = -7286425919675154353L;
        int n7 = 8;
        if (n4 >= n7) {
            long l3 = (long)n4 * (long)2 + l2;
            long l4 = LittleEndianByteArray.load64(byArray, n3) + l2;
            n3 = n3 + n4 - n7;
            long l7 = LittleEndianByteArray.load64(byArray, n3);
            long l8 = Long.rotateRight(l7, 37) * l3 + l4;
            long l12 = (Long.rotateRight(l4, 25) + l7) * l3;
            return FarmHashFingerprint64.hashLength16(l8, l12, l3);
        }
        int n8 = 4;
        if (n4 >= n8) {
            long l14 = (long)(n4 * 2) + l2;
            l2 = LittleEndianByteArray.load32(byArray, n3);
            long l15 = 0xFFFFFFFFL;
            l2 &= l15;
            long l16 = n4;
            n3 = n3 + n4 - n8;
            long l17 = (long)LittleEndianByteArray.load32(byArray, n3) & l15;
            return FarmHashFingerprint64.hashLength16(l16 += (l2 <<= 3), l17, l14);
        }
        if (n4 > 0) {
            n8 = byArray[n3];
            int n10 = (n4 >> 1) + n3;
            n10 = byArray[n10];
            int n14 = n4 + -1 + n3;
            int n15 = byArray[n14];
            n3 = n8 & 0xFF;
            n7 = (n10 & 0xFF) << 8;
            n15 = (n15 & 0xFF) << 2;
            long l18 = (long)(n3 += n7) * l2;
            long l19 = (long)(n4 += n15) * -4348849565147123417L;
            return FarmHashFingerprint64.shiftMix(l18 ^ l19) * l2;
        }
        return l2;
    }

    private static long hashLength16(long l2, long l3, long l4) {
        l2 = (l2 ^ l3) * l4;
        int n3 = 47;
        long l7 = l2 >>> n3;
        l2 = (l2 ^ l7 ^ l3) * l4;
        l3 = l2 >>> n3;
        return (l2 ^ l3) * l4;
    }

    private static long hashLength17to32(byte[] byArray, int n3, int n4) {
        int n7 = n4;
        long l2 = (long)n4 * (long)2;
        long l3 = -7286425919675154353L;
        long l4 = l2 + l3;
        l2 = LittleEndianByteArray.load64(byArray, n3) * -5435081209227447693L;
        int n8 = n3 + 8;
        long l7 = LittleEndianByteArray.load64(byArray, n8);
        n7 = n3 + n4;
        int n10 = n7 + -8;
        long l8 = LittleEndianByteArray.load64(byArray, n10) * l4;
        long l12 = LittleEndianByteArray.load64(byArray, n7 += -16) * l3;
        long l14 = Long.rotateRight(l2 + l7, 43);
        long l15 = Long.rotateRight(l8, 30) + l14;
        l3 = Long.rotateRight(l7 + l3, 18) + l2;
        l7 = l12 += l15;
        return FarmHashFingerprint64.hashLength16(l12, l8 += l3, l4);
    }

    private static long hashLength33To64(byte[] byArray, int n3, int n4) {
        int n7 = n4;
        long l2 = (long)n4 * (long)2;
        long l3 = -7286425919675154353L;
        l2 += l3;
        long l4 = LittleEndianByteArray.load64(byArray, n3) * l3;
        int n8 = n3 + 8;
        long l7 = LittleEndianByteArray.load64(byArray, n8);
        n7 = n3 + n4;
        int n10 = n7 + -8;
        long l8 = LittleEndianByteArray.load64(byArray, n10) * l2;
        int n14 = n7 + -16;
        long l12 = LittleEndianByteArray.load64(byArray, n14) * l3;
        long l14 = l4 + l7;
        int n15 = 43;
        l14 = Long.rotateRight(l14, n15);
        int n16 = 30;
        long l15 = Long.rotateRight(l8, n16) + l14 + l12;
        l7 = Long.rotateRight(l7 + -7286425919675154353L, 18) + l4;
        l8 += l7;
        l7 = l15;
        l12 = l2;
        l7 = FarmHashFingerprint64.hashLength16(l15, l8, l2);
        n10 = n3 + 16;
        l8 = LittleEndianByteArray.load64(byArray, n10) * l2;
        n14 = n3 + 24;
        l12 = LittleEndianByteArray.load64(byArray, n14);
        int n17 = n7 + -32;
        long l16 = LittleEndianByteArray.load64(byArray, n17);
        l14 = (l15 + l16) * l2;
        long l17 = LittleEndianByteArray.load64(byArray, n7 += -24);
        l7 = (l7 + l17) * l2;
        l17 = Long.rotateRight(l8 + l12, n15);
        l3 = Long.rotateRight(l14, n16) + l17;
        l8 = Long.rotateRight(l12 + l4, 18) + l8 + l14;
        l12 = l2;
        return FarmHashFingerprint64.hashLength16(l7 += l3, l8, l2);
    }

    private static long hashLength65Plus(byte[] byArray, int n3, int n4) {
        byte[] byArray2 = byArray;
        int n7 = 81;
        long l2 = n7;
        long l3 = -5435081209227447693L;
        long l4 = l2 * l3;
        long l7 = 113;
        long l8 = -7286425919675154353L;
        long l12 = (l4 += l7) * l8 + l7;
        l7 = FarmHashFingerprint64.shiftMix(l12) * l8;
        int n8 = 2;
        long[] lArray = new long[n8];
        long[] lArray2 = new long[n8];
        l2 *= l8;
        l8 = LittleEndianByteArray.load64(byArray, n3);
        l2 += l8;
        int n10 = 1;
        n8 = n4 + -1;
        int n14 = n8 / 64 * 64 + n3;
        int n15 = n8 & 0x3F;
        int n16 = n14 + n15;
        int n17 = n16 + -63;
        int n18 = n3;
        while (true) {
            l2 += l4;
            long l14 = lArray[0];
            l2 += l14;
            n8 = n18 + 8;
            l14 = LittleEndianByteArray.load64(byArray2, n8);
            l2 = Long.rotateRight(l2 + l14, 37) * l3;
            l14 = lArray[n10];
            l4 += l14;
            n8 = n18 + 48;
            l14 = LittleEndianByteArray.load64(byArray2, n8);
            l4 = Long.rotateRight(l4 + l14, 42) * l3;
            l14 = lArray2[n10];
            l14 = l2 ^ l14;
            l2 = lArray[0];
            n8 = n18 + 40;
            long l15 = LittleEndianByteArray.load64(byArray2, n8);
            l15 = l2 + l15 + l4;
            l2 = lArray2[0];
            n8 = 33;
            long l16 = Long.rotateRight(l7 += l2, n8) * l3;
            l4 = lArray[n10] * l3;
            l2 = lArray2[0];
            l7 = l14 + l2;
            int n19 = n18;
            FarmHashFingerprint64.weakHashLength32WithSeeds(byArray, n18, l4, l7, lArray);
            n19 = n18 + 32;
            l4 = lArray2[n10];
            l4 = l16 + l4;
            n7 = n18 + 16;
            l7 = LittleEndianByteArray.load64(byArray2, n7);
            l7 = l15 + l7;
            FarmHashFingerprint64.weakHashLength32WithSeeds(byArray, n19, l4, l7, lArray2);
            n7 = n18 + 64;
            if (n7 == n14) {
                l2 = (l14 & 0xFFL) << n10;
                l3 += l2;
                l2 = lArray2[0];
                l4 = n15;
                lArray2[0] = l2 += l4;
                lArray[0] = l4 = lArray[0] + l2;
                lArray2[0] = l2 = lArray2[0] + l4;
                l16 += l15;
                l2 = lArray[0];
                l16 += l2;
                n7 = n16 + -55;
                l2 = LittleEndianByteArray.load64(byArray2, n7);
                l2 = Long.rotateRight(l16 + l2, 37) * l3;
                l4 = lArray[n10];
                l15 += l4;
                int n20 = n16 + -15;
                l4 = LittleEndianByteArray.load64(byArray2, n20);
                l4 = Long.rotateRight(l15 + l4, 42) * l3;
                l7 = lArray2[n10];
                l15 = 9;
                l16 = l2 ^ (l7 *= l15);
                l2 = lArray[0] * l15;
                int n21 = n16 + -23;
                l7 = LittleEndianByteArray.load64(byArray2, n21);
                l15 = l2 + l7 + l4;
                l2 = lArray2[0];
                l14 = Long.rotateRight(l14 + l2, 33) * l3;
                l4 = lArray[n10] * l3;
                l2 = lArray2[0];
                l7 = l16 + l2;
                n19 = n17;
                FarmHashFingerprint64.weakHashLength32WithSeeds(byArray, n17, l4, l7, lArray);
                n19 = n16 + -31;
                l4 = lArray2[n10];
                l4 = l14 + l4;
                l7 = LittleEndianByteArray.load64(byArray2, n16 += -47);
                l7 = l15 + l7;
                FarmHashFingerprint64.weakHashLength32WithSeeds(byArray, n19, l4, l7, lArray2);
                l4 = lArray[0];
                l7 = lArray2[0];
                l2 = FarmHashFingerprint64.hashLength16(l4, l7, l3);
                l2 = FarmHashFingerprint64.shiftMix(l15) * -4348849565147123417L + l2 + l16;
                l4 = lArray[n10];
                l7 = lArray2[n10];
                l7 = FarmHashFingerprint64.hashLength16(l4, l7, l3) + l14;
                l4 = l2;
                return FarmHashFingerprint64.hashLength16(l2, l7, l3);
            }
            n18 = n7;
            l7 = l14;
            l4 = l15;
            l2 = l16;
        }
    }

    private static long shiftMix(long l2) {
        long l3 = l2 >>> 47;
        return l2 ^ l3;
    }

    private static void weakHashLength32WithSeeds(byte[] byArray, int n3, long l2, long l3, long[] lArray) {
        long l4 = LittleEndianByteArray.load64(byArray, n3);
        int n4 = n3 + 8;
        long l7 = LittleEndianByteArray.load64(byArray, n4);
        int n7 = n3 + 16;
        long l8 = LittleEndianByteArray.load64(byArray, n7);
        long l12 = LittleEndianByteArray.load64(byArray, n3 += 24);
        l3 = Long.rotateRight(l3 + (l2 += l4) + l12, 21);
        l7 = l7 + l2 + l8;
        l4 = Long.rotateRight(l7, 44) + l3;
        lArray[0] = l7 += l12;
        lArray[1] = l4 += l2;
    }

    public int bits() {
        return 64;
    }

    public HashCode hashBytes(byte[] byArray, int n3, int n4) {
        int n7 = n3 + n4;
        int n8 = byArray.length;
        Preconditions.checkPositionIndexes(n3, n7, n8);
        return HashCode.fromLong(FarmHashFingerprint64.fingerprint(byArray, n3, n4));
    }

    public String toString() {
        return "Hashing.farmHashFingerprint64()";
    }
}

