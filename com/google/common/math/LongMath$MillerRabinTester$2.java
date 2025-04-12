/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.math;

import com.google.common.math.LongMath$MillerRabinTester;
import com.google.common.primitives.UnsignedLongs;

final class LongMath$MillerRabinTester$2
extends LongMath$MillerRabinTester {
    private long plusMod(long l2, long l3, long l4) {
        long l7 = l4 - l3;
        long l8 = l2 == l7 ? 0 : (l2 < l7 ? -1 : 1);
        l2 += l3;
        if (l8 >= 0) {
            l2 -= l4;
        }
        return l2;
    }

    private long times2ToThe32Mod(long l2, long l3) {
        int n3;
        int n4 = 32;
        do {
            n3 = Long.numberOfLeadingZeros(l2);
            n3 = Math.min(n4, n3);
            l2 = UnsignedLongs.remainder(l2 << n3, l3);
        } while ((n4 -= n3) > 0);
        return l2;
    }

    public long mulMod(long l2, long l3, long l4) {
        long l7 = l4;
        int n3 = 32;
        long l8 = l2 >>> n3;
        long l12 = l3 >>> n3;
        long l14 = 0xFFFFFFFFL;
        long l15 = l2 & l14;
        l14 = l3 & l14;
        long l16 = l8 * l12;
        l16 = this.times2ToThe32Mod(l16, l4);
        long l17 = (l8 = l8 * l14 + l16) - (l16 = 0L);
        n3 = (int)(l17 == 0L ? 0 : (l17 < 0L ? -1 : 1));
        if (n3 < 0) {
            l8 = UnsignedLongs.remainder(l8, l4);
        }
        Long.signum(l15);
        l12 = l12 * l15 + l8;
        l8 = this.times2ToThe32Mod(l12, l7);
        l12 = UnsignedLongs.remainder(l15 * l14, l7);
        l7 = l4;
        return this.plusMod(l8, l12, l4);
    }

    public long squareMod(long l2, long l3) {
        int n3 = 32;
        long l4 = l2 >>> n3;
        long l7 = l4 * l4;
        l7 = this.times2ToThe32Mod(l7, l3);
        long l8 = 0L;
        long l12 = (l4 = l4 * (l2 &= 0xFFFFFFFFL) * (long)2) - l8;
        Object object = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
        if (object < 0) {
            l4 = UnsignedLongs.remainder(l4, l3);
        }
        long l14 = this.times2ToThe32Mod(l7 += l4, l3);
        long l15 = UnsignedLongs.remainder(l2 * l2, l3);
        return this.plusMod(l14, l15, l3);
    }
}

