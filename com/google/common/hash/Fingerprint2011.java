/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.hash;

import com.google.common.base.Preconditions;
import com.google.common.hash.AbstractNonStreamingHashFunction;
import com.google.common.hash.HashCode;
import com.google.common.hash.HashFunction;
import com.google.common.hash.LittleEndianByteArray;

final class Fingerprint2011
extends AbstractNonStreamingHashFunction {
    static final HashFunction FINGERPRINT_2011;
    private static final long K0 = -6505348102511208375L;
    private static final long K1 = -8261664234251669945L;
    private static final long K2 = -4288712594273399085L;
    private static final long K3 = -4132994306676758123L;

    static {
        Fingerprint2011 fingerprint2011 = new Fingerprint2011();
        FINGERPRINT_2011 = fingerprint2011;
    }

    public static long fingerprint(byte[] byArray, int n3, int n4) {
        long l2;
        long l3;
        long l4;
        int n7 = 32;
        long l7 = n4 <= n7 ? Fingerprint2011.murmurHash64WithSeed(byArray, n3, n4, -1397348546323613475L) : (n4 <= (n7 = 64) ? Fingerprint2011.hashLength33To64(byArray, n3, n4) : Fingerprint2011.fullFingerprint(byArray, n3, n4));
        long l8 = -6505348102511208375L;
        int n8 = 8;
        long l12 = n4 >= n8 ? LittleEndianByteArray.load64(byArray, n3) : l8;
        int n10 = 9;
        if (n4 >= n10) {
            n3 = n3 + n4 - n8;
            l8 = LittleEndianByteArray.load64(byArray, n3);
        }
        if ((n4 = (int)((l4 = (l3 = Fingerprint2011.hash128to64(l7 + l8, l12)) - (l7 = 0L)) == 0L ? 0 : (l4 < 0L ? -1 : 1))) == 0 || (n4 = (int)((l2 = l3 - (l7 = 1L)) == 0L ? 0 : (l2 < 0L ? -1 : 1))) == 0) {
            l7 = -2;
            l3 += l7;
        }
        return l3;
    }

    private static long fullFingerprint(byte[] byArray, int n3, int n4) {
        byte[] byArray2 = byArray;
        int n7 = n4;
        long l2 = LittleEndianByteArray.load64(byArray, n3);
        int n8 = n3 + n4;
        int n10 = n8 + -16;
        long l3 = LittleEndianByteArray.load64(byArray, n10);
        long l4 = -8261664234251669945L;
        long l7 = l3 ^ l4;
        n10 = n8 + -56;
        long l8 = LittleEndianByteArray.load64(byArray, n10) ^ 0xA5B85C5E198ED849L;
        n10 = 2;
        long[] lArray = new long[n10];
        long[] lArray2 = new long[n10];
        int n14 = n8 + -64;
        long l12 = n4;
        long[] lArray3 = lArray2;
        long l14 = l7;
        long[] lArray4 = lArray;
        Fingerprint2011.weakHashLength32WithSeeds(byArray, n14, l12, l7, lArray);
        n14 = n8 + -32;
        lArray = lArray2;
        Fingerprint2011.weakHashLength32WithSeeds(byArray, n14, l12 *= l4, -6505348102511208375L, lArray2);
        n8 = 1;
        l3 = Fingerprint2011.shiftMix(lArray4[n8]) * l4 + l8;
        int n15 = 39;
        l12 = Long.rotateRight(l2 += l3, n15) * l4;
        int n16 = 33;
        l14 = Long.rotateRight(l7, n16) * l4;
        int n17 = n4 + -1 & 0xFFFFFFC0;
        n7 = n3;
        int n18 = n17;
        while (true) {
            l12 += l14;
            long l15 = lArray4[0];
            l12 += l15;
            n17 = n7 + 16;
            l15 = LittleEndianByteArray.load64(byArray2, n17);
            l12 = Long.rotateRight(l12 + l15, 37) * l4;
            l15 = lArray4[n8];
            l14 += l15;
            n17 = n7 + 48;
            l15 = LittleEndianByteArray.load64(byArray2, n17);
            l14 += l15;
            n17 = 42;
            l14 = Long.rotateRight(l14, n17) * l4;
            l15 = lArray3[n8] ^ l12;
            l12 = lArray4[0];
            long l16 = l14 ^ l12;
            l12 = lArray3[0];
            long l17 = Long.rotateRight(l3 ^ l12, n16);
            l12 = lArray4[n8] * l4;
            l3 = lArray3[0];
            l14 = l15 + l3;
            n14 = n7;
            lArray = lArray4;
            Fingerprint2011.weakHashLength32WithSeeds(byArray, n7, l12, l14, lArray4);
            n14 = n7 + 32;
            l12 = lArray3[n8];
            l12 = l17 + l12;
            l14 = l16;
            lArray = lArray3;
            Fingerprint2011.weakHashLength32WithSeeds(byArray, n14, l12, l16, lArray3);
            n7 += 64;
            if ((n18 += -64) == 0) {
                l3 = lArray4[0];
                l12 = lArray3[0];
                l3 = Fingerprint2011.hash128to64(l3, l12);
                l12 = Fingerprint2011.shiftMix(l16) * l4 + l3 + l15;
                l3 = lArray4[n8];
                l14 = lArray3[n8];
                l3 = Fingerprint2011.hash128to64(l3, l14) + l17;
                return Fingerprint2011.hash128to64(l12, l3);
            }
            l3 = l15;
            l12 = l17;
        }
    }

    public static long hash128to64(long l2, long l3) {
        l3 ^= l2;
        long l4 = -4132994306676758123L;
        int n3 = 47;
        long l7 = (l3 *= l4) >>> n3;
        l2 = (l2 ^ (l3 ^= l7)) * l4;
        l3 = l2 >>> n3;
        return (l2 ^ l3) * l4;
    }

    private static long hashLength33To64(byte[] byArray, int n3, int n4) {
        int n7 = n4;
        int n8 = n3 + 24;
        long l2 = LittleEndianByteArray.load64(byArray, n8);
        long l3 = LittleEndianByteArray.load64(byArray, n3);
        long l4 = n4;
        n7 = n3 + n4;
        int n10 = n7 + -16;
        long l7 = LittleEndianByteArray.load64(byArray, n10);
        l4 = (l4 + l7) * -6505348102511208375L + l3;
        l3 = l4 + l2;
        int n14 = 52;
        l3 = Long.rotateRight(l3, n14);
        int n15 = 37;
        long l8 = Long.rotateRight(l4, n15);
        int n16 = n3 + 8;
        long l12 = LittleEndianByteArray.load64(byArray, n16);
        n16 = 7;
        long l14 = Long.rotateRight(l4 += l12, n16) + l8;
        int n17 = n3 + 16;
        long l15 = LittleEndianByteArray.load64(byArray, n17);
        l2 += (l4 += l15);
        int n18 = 31;
        l4 = Long.rotateRight(l4, n18) + l3 + l14;
        l3 = LittleEndianByteArray.load64(byArray, n17);
        n17 = n7 + -32;
        l14 = LittleEndianByteArray.load64(byArray, n17);
        l3 += l14;
        n17 = n7 + -8;
        l14 = LittleEndianByteArray.load64(byArray, n17);
        l7 = Long.rotateRight(l3 + l14, n14);
        long l16 = Long.rotateRight(l3, n15);
        long l17 = LittleEndianByteArray.load64(byArray, n7 += -24);
        l3 += l17;
        l17 = Long.rotateRight(l3, n16) + l16;
        long l18 = LittleEndianByteArray.load64(byArray, n10);
        l14 = (l3 += l18) + l14;
        l18 = Long.rotateRight(l3, n18) + l7 + l17 + l2;
        l2 = -4288712594273399085L;
        l3 = -6505348102511208375L;
        return Fingerprint2011.shiftMix(Fingerprint2011.shiftMix((l14 += l4) * l3 + (l18 *= l2)) * l3 + l4) * l2;
    }

    public static long murmurHash64WithSeed(byte[] byArray, int n3, int n4, long l2) {
        int n7 = n4 & 0xFFFFFFF8;
        int n8 = n4 & 7;
        long l3 = n4;
        long l4 = -4132994306676758123L;
        long l7 = l2 ^ (l3 *= l4);
        for (int i3 = 0; i3 < n7; i3 += 8) {
            int n10 = n3 + i3;
            l3 = Fingerprint2011.shiftMix(LittleEndianByteArray.load64(byArray, n10) * l4) * l4;
            l7 = (l7 ^ l3) * l4;
        }
        if (n8 != 0) {
            long l8 = LittleEndianByteArray.load64Safely(byArray, n3 += n7, n8) ^ l7;
            l7 = l8 * l4;
        }
        return Fingerprint2011.shiftMix(Fingerprint2011.shiftMix(l7) * l4);
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
        l3 = Long.rotateRight(l3 + (l2 += l4) + l12, 51);
        l7 = l7 + l2 + l8;
        l4 = Long.rotateRight(l7, 23) + l3;
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
        return HashCode.fromLong(Fingerprint2011.fingerprint(byArray, n3, n4));
    }

    public String toString() {
        return "Hashing.fingerprint2011()";
    }
}

